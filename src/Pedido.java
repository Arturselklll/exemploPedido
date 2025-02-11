import java.util.ArrayList;
import java.util.List;

public class Pedido {

    public int numeroPedido;
    public int codigoCliente;
    public double valor;

    public List<ItemPedido> itemPedido;

    public void criarPedido(){

        this.numeroPedido = 1;
        this.valor = 0;
        this.itemPedido = new ArrayList<>();

    }

    public void adicionarItem(int codigo, int quantidade, double valor){
        ItemPedido item = new ItemPedido();
        item.sequenciaItem = this.itemPedido.size() + 1;
        item.codigoItem = codigo;
        item.quantidade = quantidade;
        item.valor = valor;

        //adiciona o valor total do item no pedido
        this.valor += item.quantidade * item.valor;

        this.itemPedido.add(item);

    }


}

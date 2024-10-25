import java.util.Date;

public class Pedido {
    private Integer id;
    private Date data;
    private StatusPedido status;

    public Pedido(Integer id, Date data, StatusPedido status) {
        this.id = id;
        this.data = data;
        this.status = status;
    }

    // Getters e Setters
    public StatusPedido getStatus() {
        return status;
    }

    public void setStatus(StatusPedido status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Pedido ID: " + id + ", Data: " + data + ", Status: " + status;
    }
}

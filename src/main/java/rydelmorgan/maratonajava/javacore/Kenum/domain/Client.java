package rydelmorgan.maratonajava.javacore.Kenum.domain;

public class Client {

    private String name;
    private TipoClient tipoClient;
    private TipoPagamento tipoPagamento;

    public Client(String name, TipoClient tipoClient, TipoPagamento tipoPagamento) {
        this.name = name;
        this.tipoClient = tipoClient;
        this.tipoPagamento = tipoPagamento;
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", tipoClient=" + tipoClient +
                ", tipoClientInt=" + tipoClient.getValor() +
                ", tipoPagamento=" + tipoPagamento +
                '}';
    }
}

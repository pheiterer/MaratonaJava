package rydelmorgan.maratonajava.javacore.Kenum.domain;

public class Client {
    private String name;
    private TipoClient tipoClient;

    public Client(String name, TipoClient tipoClient) {
        this.name = name;
        this.tipoClient = tipoClient;
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", tipoClient=" + tipoClient +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TipoClient getTipoClient() {
        return tipoClient;
    }

    public void setTipoClient(TipoClient tipoClient) {
        this.tipoClient = tipoClient;
    }
}

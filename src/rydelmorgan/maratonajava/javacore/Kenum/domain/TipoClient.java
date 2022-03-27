package rydelmorgan.maratonajava.javacore.Kenum.domain;

public enum TipoClient {
    PESSO_FISICA(1, "Pessoa Física"),
    PESSOA_JURIDICA(2, "Pessoa Juridica");

    protected int valor;
    private String nomeRelatorio;
    TipoClient(int valor, String nomeRelatorio){
        this.valor = valor;
        this.nomeRelatorio = nomeRelatorio;
    }

    public static TipoClient tipoClientePorNomeRelatorio(String nomeRelatorio){
        for (TipoClient tipoClient : values()) {
            if(tipoClient.getNomeRelatorio().equals(nomeRelatorio)){
                return tipoClient;
            }
        }
        return null;

    }

    TipoClient(int valor) {
        this.valor = valor;
    }

    public String getNomeRelatorio() {
        return nomeRelatorio;
    }

    public int getValor() {
        return valor;
    }
}



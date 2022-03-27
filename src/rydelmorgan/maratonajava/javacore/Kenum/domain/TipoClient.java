package rydelmorgan.maratonajava.javacore.Kenum.domain;

public enum TipoClient {
    PESSO_FISICA(1),
    PESSOA_JURIDICA(2);

    protected final int VALOR;

    TipoClient(int valor) {
        this.VALOR = valor;
    }

}



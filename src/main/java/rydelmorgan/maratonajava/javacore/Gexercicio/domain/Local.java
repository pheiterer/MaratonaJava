package rydelmorgan.maratonajava.javacore.Gexercicio.domain;

public class Local {
    private String endereco;
    private Seminary[] localSeminaries;

    public Local(String endereco) {
        this.endereco = endereco;
    }

    public Local(String endereco, Seminary[] localSeminaries) {
        this.endereco = endereco;
        this.localSeminaries = localSeminaries;
    }

    public void print() {
        System.out.println(endereco);
        for (Seminary LocS : localSeminaries) {
            System.out.println(LocS.getTitulo());
        }
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Seminary[] getLocalSeminaries() {
        return localSeminaries;
    }

    public void setLocalSeminaries(Seminary[] localSeminaries) {
        this.localSeminaries = localSeminaries;
    }
}

package rydelmorgan.maratonajava.javacore.Fmodificadoresestatios.dominio;

public class Carro {
    private String nome;
    private double velocidadeMax;
    private static double velocidadeMin = 250;

    public Carro(String nome, double velocidadeMax) {
        this.nome = nome;
        this.velocidadeMax = velocidadeMax;
    }

    public void print(){
        System.out.println("---------------");
        System.out.println("Nome"+ this.nome);
        System.out.println("Velocidade Max "+this.velocidadeMax );
        System.out.println("Velocidade Min: "+ this.velocidadeMin);
    }
    public static void setSpeedLimit(double velocidadeMin){
        Carro.velocidadeMin = velocidadeMin;
    }

    public static double getVelocidadeMin(){
        return Carro.velocidadeMin;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVelocidadeMax() {
        return velocidadeMax;
    }

    public void setVelocidadeMax(double velocidadeMax) {
        this.velocidadeMax = velocidadeMax;
    }

}

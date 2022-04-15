package rydelmorgan.maratonajava.javacore.Qstring.test;

public class StringPerformaceTest {
    public static void main(String[] args) {
        long inicio = System.currentTimeMillis();
        concaString(30_000);
        long fim = System.currentTimeMillis();
        System.out.println("Tempo gasto para String " + (fim-inicio) + "ms");

        inicio = System.currentTimeMillis();
        concaStringBuilder(100_000);
        fim = System.currentTimeMillis();
        System.out.println("Tempo gasto para StringBuilder " + (fim-inicio) + "ms");

        inicio = System.currentTimeMillis();
        concaStringBuffer(100_000);
        fim = System.currentTimeMillis();
        System.out.println("Tempo gasto para StringBuffer " + (fim-inicio) + "ms");
    }

    private static void concaString(int tamanho){
        String texto = "";
        for (int i = 0; i < tamanho; i++) {
            texto +=i;

        }
    }

    private static void concaStringBuilder(int tamanho) {
        StringBuilder sb = new StringBuilder(tamanho);
        for (int i = 0; i < tamanho; i++) {
            sb.append(i);
        }
    }

    private static void concaStringBuffer(int tamanho) {
        StringBuffer sbf = new StringBuffer(tamanho);
        for (int i = 0; i < tamanho; i++) {
            sbf.append(i);
        }
    }
}

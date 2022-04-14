package rydelmorgan.maratonajava.javacore.Oexception.runtime;

public class test01 {
    public static void main(String[] args) {
        divide(1,0);
    }

    /**
     *
     * @param a
     * @param b não pode ser 0
     * @return
     * @throws IllegalArgumentException caso b seja zero
     */
    private static int divide(int a, int b){
        if(b == 0){
            throw new IllegalArgumentException("Argumento ilegal");
        }
            return a/b;
    }
}

package rydelmorgan.maratonajava.javacore.Kenum.test;

import rydelmorgan.maratonajava.javacore.Kenum.domain.Client;
import rydelmorgan.maratonajava.javacore.Kenum.domain.TipoClient;

public class ClientTest01 {
    public static void main(String[] args) {
        Client cliente = new Client("Paulo", TipoClient.PESSO_FISICA);
        Client cliente2 = new Client("Paulo", TipoClient.PESSOA_JURIDICA);
        Client cliente3 = new Client("Paulo", TipoClient.PESSO_FISICA);
        Client cliente4 = new Client("Paulo", TipoClient.PESSOA_JURIDICA);
        System.out.println(cliente);
        System.out.println(cliente2);
        System.out.println(cliente3);
        System.out.println(cliente4);
    }
}

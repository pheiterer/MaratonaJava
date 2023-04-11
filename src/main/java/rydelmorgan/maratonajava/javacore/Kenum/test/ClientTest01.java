package rydelmorgan.maratonajava.javacore.Kenum.test;

import rydelmorgan.maratonajava.javacore.Kenum.domain.Client;
import rydelmorgan.maratonajava.javacore.Kenum.domain.TipoClient;
import rydelmorgan.maratonajava.javacore.Kenum.domain.TipoPagamento;

public class ClientTest01 {
    public static void main(String[] args) {
        Client cliente = new Client("Paulo", TipoClient.PESSO_FISICA, TipoPagamento.CREDITO);
        Client cliente2 = new Client("Paulo", TipoClient.PESSOA_JURIDICA, TipoPagamento.DEBITO);

        System.out.println(cliente);
        System.out.println(cliente2);
        System.out.println(TipoPagamento.DEBITO.calcularDesconto(100));
        System.out.println(TipoPagamento.CREDITO.calcularDesconto(100));
        TipoClient tipoClient = TipoClient.valueOf("PESSO_FISICA");
        System.out.println(tipoClient.getNomeRelatorio());

    }
}

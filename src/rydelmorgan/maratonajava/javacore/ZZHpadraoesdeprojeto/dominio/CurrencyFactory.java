package rydelmorgan.maratonajava.javacore.ZZHpadraoesdeprojeto.dominio;

public class CurrencyFactory {
    public static Currency newCurrency(Country country){
        return switch (country) {
            case USA -> new Dolar();
            case BRAZIL -> new Real();
        };
    }
}

package rydelmorgan.maratonajava.javacore.ZZBcomportamento.inteface;

import rydelmorgan.maratonajava.javacore.ZZBcomportamento.domain.Car;

@FunctionalInterface
public interface CarPredicate {
    // classe anonimas, funções, conciso
    boolean test(Car car);
    //parametro -> <Expressão>
}

package rydelmorgan.maratonajava.javacore.Oexception.runtime;

import java.nio.file.FileAlreadyExistsException;
import java.sql.SQLException;

public class test02 {
    public static void main(String[] args) {
        try{
            throw new IndexOutOfBoundsException();
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Dentro do ArrayIndexOutOfException");
        }catch (IndexOutOfBoundsException e) {
            System.out.println("Dentro do IndexOutOfBoundsException");
        }catch (IllegalArgumentException e){
            System.out.println("Dentro do IllegalArgumentException");
        }catch (ArithmeticException e){
            System.out.println("Dentro do ArithmeticException");
        }catch (RuntimeException e){
            System.out.println("Dentro do RuntimeException");
        }

        talvezLanceException();
    }
    private static void talvezLanceException() throws SQLException, FileAlreadyExistsException{

    }
}


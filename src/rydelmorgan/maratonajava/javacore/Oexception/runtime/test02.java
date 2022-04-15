package rydelmorgan.maratonajava.javacore.Oexception.runtime;

import java.io.FileNotFoundException;
import java.nio.file.FileAlreadyExistsException;
import java.sql.SQLException;

public class test02 {
    public static void main(String[] args) {
        try{
            throw new RuntimeException();
        }catch (ArrayIndexOutOfBoundsException | IllegalArgumentException | ArithmeticException e){
            System.out.println("Dentro do ArrayIndexOutOfBoundsException | IndexOutOfBoundsException | ArithmeticException");
        }catch (RuntimeException e){
            System.out.println("Dentro do RuntimeException");
        }

         try {
             talvezLanceException();
         }catch (SQLException e){
             e.printStackTrace();
         }catch (FileNotFoundException e){
             e.printStackTrace();
         }
    }
    private static void talvezLanceException() throws SQLException, FileNotFoundException{

    }
}


package rydelmorgan.maratonajava.javacore.ZZJCRUD.test;

import org.apache.logging.log4j.core.util.JsonUtils;
import rydelmorgan.maratonajava.javacore.ZZJCRUD.service.ProducerService;

import java.util.Scanner;

public class crudTest01 {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int op;
        while(true){
            menu();
            op = Integer.parseInt(scanner.nextLine());
            if (op==0) break;
            ProducerService.buildMenu(op);
        }
    }

    private static void menu(){
        System.out.println("Type the number of your operation");
        System.out.println("1. Search for producer");
        System.out.println("0. Exit");
    }
}

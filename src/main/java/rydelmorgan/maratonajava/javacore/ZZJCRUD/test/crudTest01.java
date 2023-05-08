package rydelmorgan.maratonajava.javacore.ZZJCRUD.test;

import rydelmorgan.maratonajava.javacore.ZZJCRUD.service.ProducerService;

import java.util.Scanner;

public class crudTest01 {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        int op;
        while(true){
            menu();
            op = Integer.parseInt(SCANNER.nextLine());
            if (op==0) break;
            ProducerService.buildMenu(op);
        }
    }

    private static void menu(){
        System.out.println("Type the number of your operation");
        System.out.println("1. Search for producer");
        System.out.println("2. Delete for producer");
        System.out.println("0. Exit");
    }


}

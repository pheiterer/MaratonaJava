package rydelmorgan.maratonajava.javacore.ZZJCRUD.test;

import rydelmorgan.maratonajava.javacore.ZZJCRUD.service.AnimeService;
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
            switch (op){
                case 1 -> {
                    producerMenu();
                    op = Integer.parseInt(SCANNER.nextLine());
                    ProducerService.buildMenu(op);
                }
                case 2 -> {
                    animeMenu();
                    op = Integer.parseInt(SCANNER.nextLine());
                    AnimeService.buildMenu(op);
                }
            }
        }
    }

    private static void menu(){
        System.out.println("Type the number of your operation");
        System.out.println("1. Producer");
        System.out.println("2. Anime");
        System.out.println("0. Exit");
    }

    private static void producerMenu(){
        System.out.println("Type the number of your operation");
        System.out.println("1. Search for producer");
        System.out.println("2. Delete a producer");
        System.out.println("3. Save a producer");
        System.out.println("4. Update producer");
        System.out.println("9. Go Back");
    }

    private static void animeMenu(){
        System.out.println("Type the number of your operation");
        System.out.println("1. Search for anime");
        System.out.println("2. Delete a anime");
        System.out.println("3. Save a anime");
        System.out.println("4. Update anime");
        System.out.println("9. Go Back");
    }


}

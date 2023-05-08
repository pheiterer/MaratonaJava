package rydelmorgan.maratonajava.javacore.ZZJCRUD.service;

import rydelmorgan.maratonajava.javacore.ZZJCRUD.domain.Producer;
import rydelmorgan.maratonajava.javacore.ZZJCRUD.repository.ProducerRepository;

import java.util.List;
import java.util.Scanner;

public class ProducerService {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void buildMenu(int op) {
        switch (op) {
            case 1:
                find();
                break;
            case 2:
                delete();
                break;
            default:
                throw new IllegalArgumentException("Not a valid option");
        }
    }

    private static void find() {
        System.out.println("Type the name or empty to all");
        String name = SCANNER.nextLine();
        List<Producer> producers = ProducerRepository.findByName(name);
        for (int i = 0; i < producers.size(); i++) {
            Producer producer = producers.get(i);
            System.out.printf("[%d] - ID: %d | %s%n", i, producer.getId(), producer.getName());
        }
    }

    private static void delete() {
        System.out.println("Type the id of the producer you want to delete");
        int id = Integer.parseInt(SCANNER.nextLine());
        System.out.println("Are you sure? S/N");
        String choice = SCANNER.nextLine();
        if (choice.equalsIgnoreCase("s")) {
            ProducerRepository.delete(id);
        }
    }
}

package rydelmorgan.maratonajava.javacore.ZZEStream.test;

import rydelmorgan.maratonajava.javacore.ZZEStream.domain.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest11 {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(new LightNovel("Tensei Shittara", 8.99), new LightNovel("Overlord", 5.99), new LightNovel("Violet Evergarden", 3.99), new LightNovel("No Game no Life", 2.99), new LightNovel("Sword Art Online", 15.99), new LightNovel("Fullmetal Alchemist", 5.99), new LightNovel("Kumo desuga", 1.99), new LightNovel("Kumo desuga", 1.99), new LightNovel("Monogatari", 4)));

    public static void main(String[] args) {
        System.out.println(lightNovels.size());
        System.out.println(lightNovels.stream().collect(Collectors.counting()));

        lightNovels.stream().max(Comparator.comparing(LightNovel::getPrice)).ifPresent(System.out::println);
        lightNovels.stream().collect(Collectors.maxBy(Comparator.comparing(LightNovel::getPrice))).ifPresent(System.out::println);

        lightNovels.stream().mapToDouble(LightNovel::getPrice).sum();
        lightNovels.stream().collect(Collectors.summingDouble(LightNovel::getPrice));


        lightNovels.stream().mapToDouble(LightNovel::getPrice).average().ifPresent(System.out::println);
        lightNovels.stream().collect(Collectors.averagingDouble(LightNovel::getPrice));

        lightNovels.stream().collect(Collectors.summarizingDouble(LightNovel::getPrice));

        String collect = lightNovels.stream().map(LightNovel::getTitle).collect(Collectors.joining(", "));
        System.out.println(collect);

    }
}

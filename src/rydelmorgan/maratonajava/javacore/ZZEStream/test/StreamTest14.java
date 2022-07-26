package rydelmorgan.maratonajava.javacore.ZZEStream.test;

import rydelmorgan.maratonajava.javacore.ZZEStream.domain.Category;
import rydelmorgan.maratonajava.javacore.ZZEStream.domain.LightNovel;
import rydelmorgan.maratonajava.javacore.ZZEStream.domain.Promotion;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;

public class StreamTest14 {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(new LightNovel("Tensei Shittara", 8.99, Category.FANTASY), new LightNovel("Overlord", 5.99, Category.FANTASY), new LightNovel("Violet Evergarden", 3.99, Category.DRAMA), new LightNovel("No Game no Life", 2.99, Category.FANTASY), new LightNovel("Sword Art Online", 15.99, Category.ROMANCE), new LightNovel("Fullmetal Alchemist", 5.99, Category.FANTASY), new LightNovel("Kumo desuga", 1.99, Category.FANTASY), new LightNovel("Kumo desuga", 1.99, Category.FANTASY), new LightNovel("Monogatari", 4, Category.ROMANCE)));

    public static void main(String[] args) {
        lightNovels.stream().collect(Collectors.groupingBy(LightNovel::getCategory, Collectors.counting()));

        Map<Category, Optional<LightNovel>> max = lightNovels.stream().collect(groupingBy(LightNovel::getCategory, Collectors.maxBy(Comparator.comparing(LightNovel::getPrice))));
        System.out.println(max);

        Map<Category, LightNovel> categoryLightNovelMap = lightNovels.stream().collect(groupingBy(LightNovel::getCategory, Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(LightNovel::getPrice)), Optional::get)));
        System.out.println(categoryLightNovelMap);

        Map<Category, LightNovel> categoryLightNovel = lightNovels.stream().collect(Collectors.toMap(LightNovel::getCategory, Function.identity(), BinaryOperator.maxBy(Comparator.comparing(LightNovel::getPrice))));
        System.out.println(categoryLightNovel);
    }
}

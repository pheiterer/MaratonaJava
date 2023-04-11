package rydelmorgan.maratonajava.javacore.ZZEStream.test;

import rydelmorgan.maratonajava.javacore.ZZEStream.domain.Category;
import rydelmorgan.maratonajava.javacore.ZZEStream.domain.LightNovel;
import rydelmorgan.maratonajava.javacore.ZZEStream.domain.Promotion;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class StreamTest15 {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(new LightNovel("Tensei Shittara", 8.99, Category.FANTASY), new LightNovel("Overlord", 5.99, Category.FANTASY), new LightNovel("Violet Evergarden", 3.99, Category.DRAMA), new LightNovel("No Game no Life", 2.99, Category.FANTASY), new LightNovel("Sword Art Online", 15.99, Category.ROMANCE), new LightNovel("Fullmetal Alchemist", 5.99, Category.FANTASY), new LightNovel("Kumo desuga", 1.99, Category.FANTASY), new LightNovel("Kumo desuga", 1.99, Category.FANTASY), new LightNovel("Monogatari", 4, Category.ROMANCE)));

    public static void main(String[] args) {
        Map<Category, DoubleSummaryStatistics> collect = lightNovels.stream().collect(groupingBy(LightNovel::getCategory, Collectors.summarizingDouble(LightNovel::getPrice)));
        System.out.println(collect);

        Map<Category, Set<Promotion>> collect1 = lightNovels.stream().collect(groupingBy(LightNovel::getCategory, mapping(StreamTest15::getPromotion, toSet())));
        System.out.println(collect1);

        Map<Category, LinkedHashSet<Promotion>> collect2 = lightNovels.stream().collect(groupingBy(LightNovel::getCategory, mapping(StreamTest15::getPromotion, toCollection(LinkedHashSet::new))));
        System.out.println(collect2);
    }
    private static Promotion getPromotion(LightNovel ln) {
        return ln.getPrice() < 6 ? Promotion.UNDER_PROMOTION : Promotion.NORMAL_PRICE;
    }
}

package rydelmorgan.maratonajava.javacore.ZZEStream.test;

import rydelmorgan.maratonajava.javacore.ZZEStream.domain.Category;
import rydelmorgan.maratonajava.javacore.ZZEStream.domain.LightNovel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamTest12 {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(new LightNovel("Tensei Shittara", 8.99, Category.FANTASY), new LightNovel("Overlord", 5.99, Category.FANTASY), new LightNovel("Violet Evergarden", 3.99, Category.DRAMA), new LightNovel("No Game no Life", 2.99, Category.FANTASY), new LightNovel("Sword Art Online", 15.99, Category.ROMANCE), new LightNovel("Fullmetal Alchemist", 5.99, Category.FANTASY), new LightNovel("Kumo desuga", 1.99, Category.FANTASY), new LightNovel("Kumo desuga", 1.99, Category.FANTASY), new LightNovel("Monogatari", 4, Category.ROMANCE)));

    public static void main(String[] args) {
        Map<Category, List<LightNovel>> collect = lightNovels.stream().collect(Collectors.groupingBy(LightNovel::getCategory));
        System.out.println(collect);


    }
}

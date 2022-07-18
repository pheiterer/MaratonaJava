package rydelmorgan.maratonajava.javacore.ZZEStream.test;

import rydelmorgan.maratonajava.javacore.ZZEStream.domain.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StreamTest01 {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Tensei Shittara", 8.99),
            new LightNovel("Overlord", 5.99),
            new LightNovel("Violet Evergarden", 3.99),
            new LightNovel("No Game no Life", 2.99),
            new LightNovel("Sword Art Online", 15.99),
            new LightNovel("Fullmetal Alchemist", 5.99),
            new LightNovel("Kumo desuga", 1.99),
            new LightNovel("Monogatari", 4)
    ));
    public static void main(String[] args) {
        lightNovels.sort(Comparator.comparing(LightNovel::getTitle));
        List<String> TitlesLessThan4 = new ArrayList<>();
        for (LightNovel lightNovel : lightNovels) {
            if(lightNovel.getPrice()<=4){
                TitlesLessThan4.add(lightNovel.getTitle());
            }
            if(TitlesLessThan4.size()==3){
                break;
            }
        }
        System.out.println(lightNovels);
        System.out.println(TitlesLessThan4);

    }
}

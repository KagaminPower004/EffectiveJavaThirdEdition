package Chapter02.item01;

public class Pure {
    public static void main(String args[]) {
        NutritionFacts fatMan = CalFatFartory.valueOf(1, 15, 800);

        fatMan.outReport();

        NutritionFacts thinMan = CalFatFartory.valueOf(1, 15, 0);

        thinMan.outReport();

        NutritionFacts noramalMan = new NutritionFacts
                .Builder(1, 1)
                .calories(200)
                .carbohydrate(0)
                .fat(20).sodium(5)
                .build();

        noramalMan.outReport();
    }
}
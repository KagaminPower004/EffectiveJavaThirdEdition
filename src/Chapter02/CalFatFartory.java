package Chapter02;

public interface CalFatFartory {

    static NutritionFacts valueOf(int servingSize, int servings, int fat) {
        return new NutritionFacts.Builder(servingSize, servings).fat(fat).build();
    }
}
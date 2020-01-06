/**
 * ParameterBuilder
 */
// Builder Pattern
public class Builder {

    public static void main(String[] args) {
        NutritionFacts product = new NutritionFacts.Builder(240, 8).calories(100).fat(50).build();
        System.out.println(product.toString());
    }

}

class NutritionFacts {
    private int servingSize;
    private int servings;
    private int fat;
    private int calories;

    public static class Builder {
        // Required parameters
        private int servingSize;
        private int servings;

        // Optional parameters - initialized to default values
        private int fat = 0;
        private int calories = 0;

        public Builder(int servingSize, int servings) {
            this.servingSize = servingSize;
            this.servings = servings;
        }

        public Builder calories(int val) {
            calories = val;
            return this;
        }

        public Builder fat(int val) {
            fat = val;
            return this;
        }

        public NutritionFacts build() {
            return new NutritionFacts(this);
        }
    }

    private NutritionFacts(Builder builder) {
        servingSize = builder.servingSize;
        servings = builder.servings;
        fat = builder.fat;
        calories = builder.calories;
    }

    @Override
    public String toString() {
        return "NutritionFacts [calories=" + calories + ", fat=" + fat + ", servingSize=" + servingSize + ", servings="
                + servings + "]";
    }

}

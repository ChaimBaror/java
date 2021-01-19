import java.util.ArrayList;

public class Recipe {
    ArrayList<Ingrediet> listMenu = new ArrayList<>();
    String[] listInstructions;
    String meatMilkyFur;
    String category;
    int stars;
    int level;

    public Recipe(ArrayList<Ingrediet> listMenu, String [] listInstructions, int level, String meatMilkyFur, String category, int stars) {
        this.listMenu = listMenu;
        this.listInstructions = listInstructions;
        this.level = level;
        this.meatMilkyFur = meatMilkyFur;
        this.category = category;
        this.stars = stars;
    }

    public Recipe(ArrayList<Ingrediet> ingrediets, String strings, int level, String d, String a, int stars) {
    }

    public int getLevel() {
        return level;
    }

    public int getStars() {
        return stars;
    }

    @Override
    public String toString() {
        return "Recipe{" +'\n' +
                "listMenu =" + listMenu + '\n' +
                "listInstructions ='" + listInstructions + '\n' +
                "meatMilkyFur ='" + meatMilkyFur + '\n' +
                "category ='" + category + '\n' +
                "stars =" + stars + '\n' +
                "level =" + level + '\n' +
                '}';
    }
}


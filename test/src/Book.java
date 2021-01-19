import java.util.ArrayList;

public class Book {
    private String author;
    private String title;
    private String succinct;

    ArrayList<Recipe> list = new ArrayList<>();

    public Book() {
        this.author = author;
        this.title = title;
        this.succinct = succinct;

    }

    public Book(String author, String title, String succinct, ArrayList<Recipe> list) {
        this.author = author;
        this.title = title;
        this.succinct = succinct;
        this.list = list;
    }
    public Book(String author, String title, String succinct) {
        this.author = author;
        this.title = title;
        this.succinct = succinct;

    }


    public void Book (Book book) {
        this.title = book.title;
        this.author = book.author;
        this.succinct = book.succinct;
    }

    void add(Recipe recipe) {
        list.add(recipe);
    }
//
//    void getArgs(String... gat2) {
//        for (int i = 0; i < gat2.length; i++) {
//            String something = gat2[i];
//
//            for (int j = 0; j < list.size(); j++) {
//                Recipe rec = list.get(j);
////                for (int k = 0; k < gat2.length; k++) {
////
//                if (rec.listInstructions[i].contains(gat2[i])) {
//                    System.out.println("is found " + gat2[i]);
//                } else
//                    System.out.println("This item was notfound " + gat2[i]);
//            }
//
//        }
//    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSuccinct() {
        return succinct;
    }

    public void setSuccinct(String succinct) {
        this.succinct = succinct;
    }

    public ArrayList<Recipe> getList() {
        return list;
    }

    public void setList(ArrayList<Recipe> list) {
        this.list = list;
    }

    void print() {
        for (int i = 0; i < list.size(); i++) {
            Recipe recipe = list.get(i);
            System.out.println("category " + recipe.category);

            for (int i1 = 0; i1 < recipe.listMenu.size(); i1++)
                System.out.println(recipe.listMenu.get(i1).name + " amount " + recipe.listMenu.get(i1).amount);
        }
    }

    void printAll() {
        for (int i = 0; i < list.size(); i++) {
            Recipe recipe = list.get(i);
            System.out.println(recipe.toString());
            System.out.println(recipe.listMenu.get(i));

            for (int j = 0; j < recipe.listMenu.size(); j++) {
                System.out.println(recipe.listMenu.get(j).name);
            }
        }
    }

    @Override
    public String toString() {
        return "Book " + '\n' +
                "Author = " + author + '\n' +
                "Title = " + title + '\n' +
                "Succinct = " + succinct + '\n' +
                "list = " + list.toString() +
                '}' + '\n';
    }
}


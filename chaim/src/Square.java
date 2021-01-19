public class Square extends Shaep {

    protected int The_length_of_the_square_rib;



    public Square(int Framethickness, String color, int the_length_of_the_square_rib) {
        super(Framethickness, color);
        The_length_of_the_square_rib = the_length_of_the_square_rib;
    }

    public int getThe_length_of_the_square_rib() {
        return The_length_of_the_square_rib;
    }

    public void setThe_length_of_the_square_rib(int the_length_of_the_square_rib) {
        The_length_of_the_square_rib = the_length_of_the_square_rib;
    }

    public  void draw(int The_length_of_the_square_rib) {
        for (int i = 0; i < The_length_of_the_square_rib; i++) {
            for (int j = 0; j < The_length_of_the_square_rib; j++) {
                System.out.print(" * ");

            }
            System.out.println();
        }

    }
        public void getArea(){
            System.out.println(The_length_of_the_square_rib*The_length_of_the_square_rib);

        }

        public  void getPerimeter(){
            System.out.println(The_length_of_the_square_rib*4);
        }





    @Override
    public String toString() {
        return "Square{" +
                "The_length_of_the_square_rib=" + The_length_of_the_square_rib +
                ", Framethickness=" + Framethickness +
                ", color='" + color + '\'' +
                '}';
    }
}

import java.util.Scanner;

public class Trivia {
    static Scanner scan = new Scanner(System.in);
    String question;
    String[] answers;
    int ansIdx;

    public  Trivia(String question,String answer1,String answer2,String answer3,String answer4,int ansIdx){
        this.question = question;
        this.answers = new String[] {answer1,answer2,answer3,answer4};
        this.ansIdx = ansIdx;
    }
    public void corectAnswerOrNo(){
        System.out.println("what is your answer?");
        int answer = scan.nextInt();
        if(answer == this.ansIdx)
            System.out.println("the answer is corect");
        else
            System.out.println("the answer is not corect");

    }
    public  void printQuestion(){
        System.out.println(this.question);
    }
    public void optionalAnswers(){
        for (int i = 0; i <4 ; i++) {
            System.out.println(i+ " answer: " +this.answers[i]);
        }
    }

}
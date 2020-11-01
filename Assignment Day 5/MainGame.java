import java.util.Scanner;
public class MainGame {

    public static void main(String[] args) {
	// Quiz application
        Game game=new Game();
        game.initGame();
        game.play();

    }
}

//Player 
class Player {
    Scanner sc=new Scanner(System.in);
    String name;
    int score=0;

    public void getDetails(){

        System.out.println("Enter player name");
        name=sc.next();

    }

}

//game
class Game {

    Question[] questions=new Question[3];
    Player player=new Player();

    String[] questionsdata={"Who is the Leader of BTS","What is the name of BTS fan?","Which song topped bilboard hot100 for 2 consecutive weeks?"};
    String[] options1={"Namjoon","Blinks","Fake Love"};
    String[] options2={"Jhope","CARAT","Boy with luv"};
    String[] options3={"Jungkook","MOA","Dynamite"};
    String[] options4={"Suga","Army","ON"};
    int[] answers={1,4,3};


    public void initGame()
    {
//        created three objects
        for(int i=0;i<3;i++){
            questions[i]=new Question();
        }

        for(int i=0;i<3;i++)
        {

            questions[i].question=questionsdata[i];
        questions[i].option1=options1[i];
        questions[i].option2=options2[i];
        questions[i].option3=options3[i];
        questions[i].option4=options4[i];
        questions[i].correctAnswer=answers[i];
        }


    }
    public void play()
    {

          player.getDetails();
          for(int i=0;i<3;i++)
          {
              boolean status=questions[i].askQuestion();
              if(status==true)
              {
                  System.out.println("Chukhahaeyo!!(Congrats)");
                  player.score=player.score+5;
              }
              else{
                  System.out.println("Pabo!(stupid)");
                  player.score=player.score-5;
              }
          }

        System.out.println(player.name+" your score is "+player.score);

    }

}
//Question
class Question {
    Scanner sc=new Scanner(System.in);
    String question,option1,option2,option3,option4;
    int correctAnswer,userAnswer;

    public boolean askQuestion()
    {
        System.out.println(question);
        System.out.println("1. "+option1);
        System.out.println("2. "+option2);
        System.out.println("3. "+option3);
        System.out.println("4. "+option4);
        System.out.println("Choose the correct option");
        userAnswer=sc.nextInt();
        if(userAnswer==correctAnswer){
            return true;
        }
       return false;
    }

}



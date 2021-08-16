package JavaLearning;

public class Main {

    public static void main(String[] args) {
        int a = 100;
        System.out.println(a);

        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Venu Madhav",highScorePosition);

        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("Giri",highScorePosition);

        highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("Arun",highScorePosition);

        highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("Sukumar",highScorePosition);
    }
    public static void displayHighScorePosition(String playerName,int highScorePosition){
        System.out.println(playerName + " managed to get into position " + highScorePosition +
                " on the high score table.");
    }
    public static int calculateHighScorePosition(int playerScore){

//      if(playerScore > 1000){
//             return 1;
//        } else if(playerScore > 500 && playerScore < 1000){
//             return 2;
//        } else if(playerScore > 100 && playerScore < 500){
//             return 3;
//        } else{
//            return 4;
        int position = 4;
        if(playerScore >= 1000){
            position = 1;
        } else if(playerScore >= 500){
            position = 2;
        }else if(playerScore >= 100){
            position = 3;
        }
        return position;
    }
}

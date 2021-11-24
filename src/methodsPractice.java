public class methodsPractice {
    public static void main(String[]args){
        int highScore=calculatehighScorePosition(1050);
        displayHighScorePosition("kollu",highScore);
          highScore=calculatehighScorePosition(900);
        displayHighScorePosition("thiru",highScore);
         highScore=calculatehighScorePosition(400);
        displayHighScorePosition("kollu",highScore);
          highScore=calculatehighScorePosition(50);
        displayHighScorePosition("reddy",highScore);
    }  public static void displayHighScorePosition(String playerName,int highScore){
      System.out.println(playerName+" managed to get into position "+highScore+" on the high score table");
  }
  public static int calculatehighScorePosition(int playerScore) {
if(playerScore>1000){
return 1;
  }
else if(playerScore >500 && playerScore <1000){
return 2;
}
else if(playerScore >100 && playerScore <500){
return 3;
}
else {
return 4;
}
}
}





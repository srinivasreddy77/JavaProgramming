public class MethodOverloading {
    public static void main(String[]args){
        int newScore=calculateScore("kollu",100);
        System.out.println("NewScore is "+newScore);
        calculateScore(50);
        calculateScore(50,"thiru");
    }
    public static int calculateScore(String playerName,int score){
        System.out.println("player "+ playerName+" scored "+score+" points");
        return score*50;
    }
    public static void calculateScore(int score){
        System.out.println("unnamed player scored "+score+" points");

    }
    public static void calculateScore(int score ,String playerName){
        System.out.println("scored "+score+" points by player "+playerName);

    }
}

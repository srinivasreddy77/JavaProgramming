public class CodingExercise1 {
    public static void main(String[] args) {
        chekNumber(0);
    }
    public static void chekNumber(int number){
            if (number > 0) {
                System.out.println("positive");
            } else if (number < 0) {
                System.out.println("negative");
            } else {
                System.out.println("zero");
            }
        }
    }

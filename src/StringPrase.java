public class StringPrase {
    public static void main(String[] args){
        String numberAsString="2018";
        String numberAsString1="120.235";
        System.out.println("numberAsString= "+numberAsString);
        int number=Integer.parseInt(numberAsString);
        double number1=Double.parseDouble(numberAsString1);
        System.out.println("number= "+number);
        System.out.println("double number ="+number1);
        numberAsString +=1;
        number +=1;
        System.out.println("numberAsString ="+numberAsString);
        System.out.println("number ="+number);
    }
}

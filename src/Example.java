import java.io.IOException;

public class Example{

    public  Example(int num)throws IOException, ClassNotFoundException{
        if(num==1)
            throw new IOException("IOException Occurred");
        else
            throw new ClassNotFoundException("ClassNotFoundException");
    }
    public static void main(String args[]){
        int num;
        try{
            Example obj=new Example(1);
        }catch(Exception ex){
            System.out.println(ex);
        }
    }
}
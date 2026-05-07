import java.util.Random;

public class MegaSena{
    public static void main(String[] args){
        Random generation = new Random();
    int i = 0;
        while(i < 6 ){

            int number = generation.nextInt(60);
            System.out.println(number);
            i++;





    }
    }
}
//            (for) é um jeito mais antigo, mas funciona, e é importante saber
//        for (int i = 0;i < 6; i++){
//
//            int number = generation.nextInt(60);
//            System.out.println(number);
import java.util.Scanner;

public class PowerOf2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(findIfPowerOf2(scanner.nextInt()));
    }

    private static boolean findIfPowerOf2(int number){

        if((number & (number-1) )==0){
            return true;
        }
        return false;
    }
}

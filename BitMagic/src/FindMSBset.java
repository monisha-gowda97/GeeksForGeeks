import java.util.Scanner;

public class FindMSBset {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(findMSBset(scanner.nextInt()));
    }
    private static int findMSBset(int number){
        return (int) Math.pow(2,LogBase2.findLog(number));
    }
}

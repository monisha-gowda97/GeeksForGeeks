import java.util.Scanner;

public class LogBase2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(findLog(scanner.nextInt()));
    }

    private static int findLog(int number){
        int answer=0;
        // right shift by 1 till number becomes 0
        while((number>>=1)!=0){
            // count number of shifts
            answer++;
        }
        return answer;
    }
}
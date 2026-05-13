import java.util.Scanner;

public class ex1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        int num = input.nextInt();

        if(num<=0){
            System.err.print("Số nhập vào không hợp lệ");
            return;
        }
        int sum =0;
        for(int i=1;i<=num;i++){
            sum+=i;
        }
        System.out.printf("Tổng các số từ 1 đến %d là: %d",num,sum);
    }
}

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập một số nguyên: ");
        int num = input.nextInt();
        if(num<0){
            num = -num;
        }
        int sum =0;
        do{
            sum += (num%10);
            num/=10;
        } while(num!=0);
        System.out.printf("Tổng các chữ số là: %d",sum);
    }
}

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập một số nguyên từ 1 tới 12: ");
        int n = input.nextInt();

        switch(n){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.printf("Tháng %d có 31 ngày.",n);
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.printf("Tháng %d có 30 ngày.",n);
                break;
            case 2:
                System.out.print("Tháng 2 có 28 hoặc 29 ngày.");
                break;
            default:
                System.out.print("Tháng không hợp lệ.");
        }
    }
}

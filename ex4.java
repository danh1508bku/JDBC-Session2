import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập cạnh 1: ");
        int n1 = input.nextInt();
        System.out.print("Nhập cạnh 2: ");
        int n2 = input.nextInt();
        System.out.print("Nhập cạnh 3: ");
        int n3 = input.nextInt();
        if(n1<=0 || n2<=0 || n3<=0){
            System.out.print("Ba cạnh không tạo thành tam giác.");
            return;
        }
        if(n1+n2>n3 && n1+n3>n2 && n2+n3>n1){
            if(n1==n2 && n1==n3){
                System.out.print("Đây là tam giác đều.");
            }
            else if(n1==n2 || n1==n3 || n2==n3){
                System.out.print("Đây là tam giác cân.");
            }
            else if(n1*n1+n2*n2==n3*n3 || n1*n1+n3*n3==n2*n2 || n2*n2+n3*n3==n1*n1){
                System.out.print("Đây là tam giác vuông.");
            }
            else{
                System.out.print("Đây là tam giác thường.");
            }
        }
        else{
            System.out.print("Ba cạnh không tạo thành tam giác.");
        }
    }
}

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       int a;
       System.out.println("Podaj a: ");
        Scanner input=new Scanner(System.in);
        a=input.nextInt();
        pierwiastek(a);
    }
    public static void pierwiastek(int a){
        System.out.println(Math.sqrt(a));
    }
    public static int getInt(){
        return new Scanner(System.in).nextInt();
    }
}
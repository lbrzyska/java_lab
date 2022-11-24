import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int a;
        System.out.println("Podaj liczbe: ");
        Scanner input=new Scanner(System.in);
        a=input.nextInt();
        System.out.println(doPotegiTrzeciej(a));
    }
    public static int doPotegiTrzeciej(int a){
        return (a*a*a);
    }
    public static int getInt(){
        return new Scanner(System.in).nextInt();
    }
}
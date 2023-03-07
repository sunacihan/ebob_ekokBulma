import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.print("N1 sayısını giriniz:");
        int n1=scan.nextInt();
        System.out.print("N2 sayısını giriniz:");
        int n2=scan.nextInt();
        int sayi=n1;
        if (n2<n1)
            sayi=n2;
        int i=1, ebob=1;
        while (i<=sayi){
            if (n1%i==0 && n2%i==0){
                ebob=i;
            }
            i++;
        }
       // System.out.println(ebob);
       // int ekok=(n1*n2)/ebob;
       // System.out.println(ekok);
        int ekok=sayi;
        int j=sayi;
        while(j<=n1*n2){
            if(j%n1==0 && j%n2==0)
                ekok=j;

            j+=sayi;
        }
        System.out.println(ekok);
    }
}
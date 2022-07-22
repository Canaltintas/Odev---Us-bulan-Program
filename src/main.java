import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        int num,us,sonuc=1;
        Scanner input =new Scanner(System.in);

        System.out.print("Bir Sayı Giriniz :");
        num=input.nextInt();
        System.out.print("Üs Olacak Sayıyı Giriniz :");
        us=input.nextInt();

        for (int i=1;i<=us;i++){
            sonuc *=num;
        }
        System.out.println(sonuc);
    }
}

import java.util.Scanner;
public class Kombinasyon {
    public static void main(String[] args) {
        long n, r, bolen = 1, bolunen = 1, bolunen_2 = 1;
        double sonuc;
        Scanner input = new Scanner(System.in);
        System.out.print("Kümenin eleman sayısını giriniz: ");
        n = input.nextInt();
        System.out.print("Oluşturulacak kümelerin eleman sayısını giriniz: ");
        r = input.nextInt();

        for(int i = 1; i <= n; i++){
            bolen *= i;
        }

        for(int j = 1; j <= r; j++){
            bolunen *= j;
        }

        for(int k = 1; k <= (n-r); k++){
            bolunen_2 *= k;
        }

        sonuc = bolen / (bolunen*bolunen_2);
        System.out.println(n +"'in " + r +"'li kombinasyonu: " + sonuc);
    }
}

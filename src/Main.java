import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Yıl Giriniz :");
        /*int yil = inp.nextInt();
        int kalan3 = yil % 100, kalan2 = yil % 400, kalan1 = yil % 4;
        */int yil = scan.nextInt();

        if(((yil % 4 == 0) && (yil % 100 != 0)) || (yil % 400 == 0)){
            System.out.println(yil + " artık yıldır.");
        }else {
            System.out.println(yil + " artık yıl değildir.");
        }
 /*       if (kalan1 == 0) {
            if (kalan3 != 0) {
                System.out.println(yil + "bir artık yıldır!");

            } else if (kalan2 == 0) {
                System.out.println(yil + "bir artık yıldır!");
            } else {
                System.out.println(yil + "bir artık yıl değildir !");
            }

       }
  */
    }


}
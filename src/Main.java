import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // HIPOTENUS BULMA
        float kenar1, kenar2,hipotenus;
        Scanner yazici = new Scanner(System.in);

        System.out.println("Lutfen birinci kenari giriniz: ");
        kenar1=yazici.nextFloat();

        System.out.println("Lutfen ikinci alani giriniz: ");
        kenar2=yazici.nextFloat();

        hipotenus= (float) Math.sqrt((kenar1*kenar1)+(kenar2*kenar2));
        System.out.println("Ucgenin hipotenusu : "+hipotenus);

        //ALAN BULMA
        float cevre, u,alan;

        cevre=kenar1+kenar2+hipotenus;
        u=cevre/2;

        alan= (float) Math.sqrt(u*(u-kenar1)*(u-kenar2)*(u-hipotenus));
        System.out.println("Ucgenin alani: "+alan);


    }


}

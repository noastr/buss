import java.util.Scanner;
public class Main {
    public static String [] bussschema = new String [21];
    public static int x =0;
    public static void main(String[] args) {
        boolean test = true;
        while(test=true) {

            Scanner text = new Scanner(System.in);

            Busskarta();
            Meny();

            int menyval = text.nextInt();


            if (menyval == 1) {
                Boka();
            } else if (menyval == 2) {
                Lediga();
            } else if (menyval == 3) {
                Vinst();
            } else if (menyval == 4) {
                Avsluta();
            } else {
                System.out.println("Välj något av ärendena nedan 1-4!!!");
            }
        }
    }

    static void Meny() {
        System.out.println("Välkommen till playa-buss! Välj något av ärendena här nedan:");
        System.out.println("1 - Boka sittplats");
        System.out.println("2 - Se antal lediga sittplatser");
        System.out.println("3 - Beräkna vinst");
        System.out.println("4 - Avsluta");
    }

    static void Busskarta(){
        bussschema[0]="0";
        bussschema[1]="0";
        bussschema[2]="0";
        bussschema[3]="0";
        bussschema[4]="0";
        bussschema[5]="0";
        bussschema[6]="0";
        bussschema[7]="0";
        bussschema[8]="0";
        bussschema[9]="0";
        bussschema[10]="0";
        bussschema[11]="0";
        bussschema[12]="0";
        bussschema[13]="0";
        bussschema[14]="0";
        bussschema[15]="0";
        bussschema[16]="0";
        bussschema[17]="0";
        bussschema[18]="0";
        bussschema[19]="0";
        bussschema[20]="0";
    }

    static void Boka(){
        Scanner text = new Scanner(System.in);
        int checked = 0;
        if (x<21) {
            while (checked == 0) {
                System.out.println("skriv ditt personnummer YYYY/MM/DD");
                bussschema[x] = text.nextLine();
                if (bussschema[x].contains("[a-zA-Z]+") == true || bussschema[x].length() != 8) {
                    System.out.println("Skriv bara siffror och följ mallen");
                } else if (bussschema[x].matches("[0-9]+") || bussschema[x].length() == 8) {
                    checked = 1;
                    System.out.println("Perfekt!");
                } else {
                    System.out.println("Skriv bara siffror och följ mallen");
                }
            }
            int plats = x + 1;
            System.out.println("Du har sittplats " + plats + " och ditt id är: " + bussschema[x]);
            x++;
        }
        else{
            System.out.println("Fullbokat! Vänligen vänta tills fler biljetter släpps");
        }
    }

    static void Lediga(){
        int lediga = 21 -x;
        System.out.println("Det finns " +lediga+ " platser kvar att boka");
    }

    static void Vinst() {
        System.out.println("Vinsten är "+x*299 +" kr");
    }

    static void Avsluta(){
        System.out.println("Hejdå! Tack för att du vlade oss på Playa-buss");
        System.exit(0);
    }
}

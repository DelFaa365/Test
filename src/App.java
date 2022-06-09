import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        char [][] znaky = {
            {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
            {'+', '-', '=', '/', '_', '.', ',', ' '},
            {'A', 'B', 'C', 'a', 'b', 'c', ' ', ' '},
            {'D', 'E', 'F', 'd', 'e', 'f', ' ', ' '},
            {'G', 'H', 'I', 'g', 'h', 'i', ' ', ' '},
            {'J', 'K', 'L', 'j', 'k', 'l', ' ', ' '},
            {'M', 'N', 'O', 'm', 'n', 'o', ' ', ' '},
            {'P', 'Q', 'R', 'S', 'p', 'q', 'r', 's'},
            {'T', 'U', 'V', 't', 'u', 'v', ',', ' '},
            {'W', 'X', 'Y', 'Z', 'w', 'x', 'y', 'z'},
        };

        System.out.println("Zadej jméno");
        String veta = sc.nextLine();
        char [] slovicka = veta.toCharArray();
        String vysledek = "";
        int kolikPricist= 0;
        int chybneZnaky= slovicka.length;
        if(slovicka.length < 9){
            kolikPricist = 9-slovicka.length;
        }

        for (int i = 0; i < slovicka.length; i++) {
            
            for (int j = 0; j < znaky.length; j++) {
                for (int j2 = 0; j2 < 8; j2++) {
                    if(slovicka[i] == znaky[j][j2]){
                        vysledek+=j;
                        if(i==2 || i==5){
                            vysledek+=" ";
                        }
                        chybneZnaky--;
                    }
                }
            }
        }

        if(chybneZnaky != 0){
            System.out.println("Zadal jsi chybné znaky");
            return;
        }

        while(kolikPricist > 0){
            vysledek+="0";
            if(kolikPricist == 4 || kolikPricist == 5){
                vysledek+=" ";
            }
            kolikPricist--;
        }

        System.out.print(vysledek);
    }
}

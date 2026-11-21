package temp;

import java.util.Scanner;

class main{
    public static void main(String[] args) {
        Scanner scanner = new  Scanner(System.in);
        temperature temp = new temperature();


        double[] temperatura = new double[7];
        int c = 0;


        for(int i = 0; i < 7; i++){    // FOR PER CARICARE LE TEMPERATURE IN SEQUENZA


            do{      // CONTROLLA CHE LE TEMPERATURE NON SIANO NE TROPPO BASSE NE TROPPO ALTE
                c++;
                System.out.println("\nInserisci il valore della " + c + " temperatura: ");
                temperatura[i] = scanner.nextDouble();


                if(temperatura[i] < -50){
                    System.out.println("\n--TEMPERATURA TROPPO BASSA---");
                } else if(temperatura[i] > 55){
                    System.out.println("\n--TEMPERATURA TROPPO ALTA---");
                }
            }while(temperatura[i] < -50 || temperatura[i] > 55);
        }


        temp.setTemperature0(temperatura);
        temp.setTemperature1(temperatura);
        temp.setTemperature2(temperatura);
        temp.setTemperature3(temperatura);   // SETTERS RICHIAMATI NEL METODO MAIN (CHE RISIEDE NELLA CLASSE MAIN)
        temp.setTemperature4(temperatura);
        temp.setTemperature5(temperatura);
        temp.setTemperature6(temperatura);




        temp.getTemperature0();
        temp.getTemperature1();
        temp.getTemperature2();
        temp.getTemperature3();     // GETTERS RICHIAMATI NEL METODO MAIN (CHE RISIEDE NELLA CLASSE MAIN)
        temp.getTemperature4();
        temp.getTemperature5();
        temp.getTemperature6();


        double max = temperatura[0];
        int giorno = 0, giornata = 0;


        for(int i = 0; i < 7; i++){       // FOR CHE CERCA LA TEMPERATURA MASSIMA
            giorno++;
            if(temperatura[i] > max){
                max = temperatura[i];
                giornata =  giorno;
            }
        }


        System.out.println("\nTemperatura massima: " + max + " °C");  // STAMPA LA TEMPERATURA MASSIMA
        System.out.println("Verificata nel giorno: " + giornata);  // STAMPA IL GIORNO IN CUI C'ERA QUELLA TEMPERATURA
    }
}

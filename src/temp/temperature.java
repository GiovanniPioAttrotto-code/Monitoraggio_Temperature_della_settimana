package temp;

public class temperature {
    private double[] temperature = new double[7];  // VETTORE ATTRIBUTO


    public temperature() {  // COSTRUTTORE SENZA PARAMETRI
        temperature[0] = 0;
        temperature[1] = 0;
        temperature[2] = 0;
        temperature[3] = 0;
        temperature[4] = 0;
        temperature[5] = 0;
        temperature[6] = 0;
    }


    public temperature(double temperature[]) {  // COSTRUTTORE CON PARAMETRI
        this.temperature[0] = temperature[0];
        this.temperature[1] = temperature[1];
        this.temperature[2] = temperature[2];
        this.temperature[3] = temperature[3];
        this.temperature[4] = temperature[4];
        this.temperature[5] = temperature[5];
        this.temperature[6] = temperature[6];
    }


    public double getTemperature0(){     // INIZIO GETTERS
        return temperature[0];
    }


    public double getTemperature1(){
        return temperature[1];
    }


    public double getTemperature2(){
        return temperature[2];
    }


    public double getTemperature3(){
        return temperature[3];
    }


    public double getTemperature4(){
        return temperature[4];
    }


    public double getTemperature5(){
        return temperature[5];
    }


    public double getTemperature6(){     // FINE GETTERS
        return temperature[6];
    }


    public void setTemperature0(double temperature[]){   // INIZIO SETTERS
        this.temperature[0] = temperature[0];
    }


    public void setTemperature1(double temperature[]){
        this.temperature[1] = temperature[1];
    }


    public void setTemperature2(double temperature[]){
        this.temperature[2] = temperature[2];
    }


    public void setTemperature3(double temperature[]){
        this.temperature[3] = temperature[3];
    }


    public void setTemperature4(double temperature[]){
        this.temperature[4] = temperature[4];
    }


    public void setTemperature5(double temperature[]){
        this.temperature[5] = temperature[5];
    }


    public void setTemperature6(double temperature[]){     // FINE SETTERS
        this.temperature[6] = temperature[6];
    }
}


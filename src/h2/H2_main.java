package h2;

public class H2_main {
    public static void main(String[] args){
        int i,j,k,min,max;

        // weise Variablen beliebige int Werte zu
        i = 1000;
        j = 101;
        k = 1;

        min = i;
        max = i;

        // Gehe im folgenden von paarweise verschiedenen Werten i,j,k aus

        // es gilt dann also entweder j > i oder j < i
        if (j > i){
            max = j;
        } else {
            min = j;
        }

        // pruefe abschliessend ob k groesser/kleiner ist als bereits gemerkte min/max Werte
        if(k > max){
            max = k;
        }
        if(k < min){
            min = k;
        }

        // Teste mit Ausgaben

        //System.out.println("min = " + min);
        //System.out.println("max = " + max);


    }
}

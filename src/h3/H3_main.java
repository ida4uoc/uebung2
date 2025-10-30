package h3;

public class H3_main {
    public static void main(String[] args){
        int i,j,k;

        i = 111;
        j = 110;
        k = 0;

        boolean eins = (i > j);
        boolean zwei = (i > 200);
        boolean drei = (j > 100);

        // sichert Ausgabe -10 falls  Bedingungen unten nicht zutreffen;
        k = -10;


        if (eins){
            if(zwei){
                if(drei){
                    k = 3;
                } else{
                    k = 2;
                }
            } else{
                if(!drei){
                    k = 1;
                }
            }
        }

        if(!eins){
            if(!zwei){
                if(!drei){
                    k = 4;
                }
            }
        }

        // Teste mit Ausgabe
       System.out.println(k);
    }
}

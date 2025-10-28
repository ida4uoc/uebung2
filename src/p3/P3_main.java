package p3;

public class P3_main {
    public static void main(String[] args){
        int i,j,k ;
        i = 2;
        j = 8;
        k = 10;

        if (i < j) {
            System.out.println("A");
        }
        if (i < k) {
            System.out.println("B");
        }
        if (j < k) {
            System.out.println("C");
        }

        // moegliche Ausgaben sind
        // (keine Ausgabe) Beispiel: i=j=k
        // A fuer k<i<j oder k=i<j
        // C fuer j<k<i oder j<k=1
        // AB fuer i<k<j oder i<k=j
        // BC fuer i=j<k
        // ABC fuer i<j<k
        //
        // nicht moegliche Ausgaben sind
        // B denn nicht A -> i>j oder i=j aber wenn i<k gilt dann auch j<k -> Ausgabe C
        // AC denn i<j (A) und j<k (C) fuehrt wegen Transitivitaet von "<" zu i<k -> B
    }
}

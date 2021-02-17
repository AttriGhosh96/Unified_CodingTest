import java.io.*;
public class CardOptimized {

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the total number of cards: ");
        int n;
        n = Integer.parseInt(br.readLine());
        int a[] = new int[n];
        int i;
        for (i = 0; i < n; i++) {
            a[i] = i + 1;
        }

        //for displaying
        /*for (i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }*/
        System.out.println("Original Deck - " + n + " cards ");
        int iterations = 1;
        int val;
        while((int)Math.pow(2, iterations) < n )
        {
            iterations++;
        }
        iterations= iterations - 1;
        val = (n - ((int)Math.pow(2, iterations)))* 2;

        System.out.println("Method #2 ___________ Optimized method");
        System.out.println("Remaining Card -  " +val);
        System.out.println("Iterations - " +iterations);

    }
}

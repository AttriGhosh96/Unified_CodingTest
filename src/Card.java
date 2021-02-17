import java.io.*;
public class Card {

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the total number of cards: ");
        int n;
        n = Integer.parseInt(br.readLine());
        int a[] = new int[n];
        int i;
        int iterations = 0;
        for (i = 0; i < n; i++) {
            a[i] = i + 1;
        }
        //for displaying
        /*for (i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }*/
        System.out.println("Original Deck - " + n + " cards ");
        while (n > 1) {
            int top_after_del = a[1];  //not considering the 1st element
            for (i = 0; i < n - 2; i++) //size reduces, shifting done for all except last element
            {
                a[i] = a[i + 2];
            }
            a[n - 2] = top_after_del;
            n = n - 1;
            iterations++;
        }


        System.out.println("Method #1 ___________ Brute force method");
        System.out.println("Last Remaining Card -  " + a[0]);
        System.out.println("Iterations -  " + iterations);


    }
}

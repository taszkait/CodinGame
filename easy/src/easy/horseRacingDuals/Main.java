package easy.horseRacingDuals;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter count horses: ");
        int N = sc.nextInt();
        while (N<1 || 100000<N){
            System.out.println("Your input is invalid. Enter other number: ");
            N=sc.nextInt();
        }

        int[] horseArray = new int[N];
        for (int i=1; i<=N; i++){
            System.out.println("Enter the strenght "+i+" horse:");
            int pi = sc.nextInt();
            while (pi<0 || 10000000<pi){
                System.out.println("Your input is invalid. Enter other number: ");
                pi=sc.nextInt();
            }
            horseArray[i]=pi;
        }

        Arrays.sort(horseArray);
        int minDifference = Integer.MAX_VALUE;

        for (int i=0; i<N; i++){
            int helperDifference = Math.abs(horseArray[i]-horseArray[i+1]);
            if (helperDifference<minDifference) minDifference=helperDifference;
        }
        System.out.println(minDifference);
        sc.close();
    }
}

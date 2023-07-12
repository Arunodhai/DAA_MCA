package openlab3;

import java.util.Scanner;

public class LowAndHigh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of N : ");
        int N = sc.nextInt();
        int arr[] = new int[N];
        System.out.println("Enter the elements of array : ");
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        int[] low = new int[arr.length];
        int[] high = new int[arr.length];
        int lowIndx = 0;
        int highIndx = 0;

        for (int i = 0; i < N; i++) {
            if (arr[i] < arr[0]) {
                low[lowIndx] = arr[i];
                lowIndx++;
            } else {
                high[highIndx] = arr[i];
                highIndx++;
            }
        }

        System.out.println("Low array:");
        for (int i = 0; i < lowIndx; i++) {
            System.out.print(low[i] + " ");
        }
        System.out.println();

        System.out.println("High array:");
        for (int i = 0; i < highIndx; i++) {
            System.out.print(high[i] + " ");
        }
        System.out.println();


        }
    }

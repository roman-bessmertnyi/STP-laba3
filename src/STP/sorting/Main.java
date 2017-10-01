package STP.sorting;

import java.util.Random;
import java.lang.Integer;
public class Main {
    private final static int size=1500;
    private static Integer[] generateArray(int n){
        Integer[] array = new Integer[n];
        Random rand = new Random();
        for(int i =0;i<n;i++)
            array[i]=rand.nextInt(50000)-25000;
        return array;
    }
    private static void showArray(Integer[] arr){
        for(Integer var:arr)
            System.out.print(var+" ");
        System.out.println();
    }


    public static void main(String[] args) {
        
	    SortLibrary<Integer> sorter = new SortLibrary<Integer>();
	    Integer[] arr = generateArray(size);
        long startClock=0;
        long endClock=0;
	    showArray(arr);
        startClock=System.nanoTime();
        sorter.OddEvenSort(arr.clone());
        endClock=System.nanoTime();
        System.out.println("Odd Even Sort :" + String.format("%,12d",(endClock-startClock)/1000000) + " ms");

        startClock=System.nanoTime();
        sorter.QuickSort(arr.clone());
        endClock=System.nanoTime();
        System.out.println("Quick Sort :" + String.format("%,12d",(endClock-startClock)/1000000) + " ms");

        startClock=System.nanoTime();
	    sorter.DefaultSort(arr.clone());
        endClock=System.nanoTime();
        System.out.println("Default JAVA(timsort) Sort :" + String.format("%,12d",(endClock-startClock)/1000000) + " ms");

        startClock=System.nanoTime();
        sorter.BubbleSort(arr.clone());
        endClock=System.nanoTime();
        System.out.println("Bubble Sort :" + String.format("%,12d",(endClock-startClock)/1000000) + " ms");

        startClock=System.nanoTime();
        sorter.SelectionSort(arr.clone());
        endClock=System.nanoTime();
        System.out.println("Selection Sort :" + String.format("%,12d",(endClock-startClock)/1000000) + " ms");

        startClock=System.nanoTime();
	    sorter.MergeSort(arr.clone());
        endClock=System.nanoTime();
        System.out.println("Merge Sort :" + String.format("%,12d",(endClock-startClock)/1000000) + " ms");


        startClock=System.nanoTime();
        sorter.ShellSort(arr.clone());
        endClock=System.nanoTime();
        System.out.println("Shell Sort :" + String.format("%,12d",(endClock-startClock)/1000000) + " ms");

    }
}

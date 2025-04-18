import org.w3c.dom.ls.LSException;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class arrayexample {
    public static void main(String[] args) {
// assigning value to an array

//        int[] numbers = new int[5];
//        int[] values ={1, 2, 3, 4, 5};
//        System.out.println(values[0]);

//        updating index value

//        int[] arr={1,2,3,34,5};
//        System.out.println(arr[1]);
//        arr[1]=100;  // index value change to 100
//        System.out.println(arr[1]);

//        looping in arrays
//        int[] arr={1,2,3,34,5};
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println("Element at index " + i +" " + arr[i] );
//        }

//        for each loop(enchanced for loop)
//        int[] arr={1,2,3,34,5};
//        for(int num: arr){
//            System.out.println(num);
//        }

//        String[] names={"alice","singh",};
//        for(String name:names){
//            System.out.println("hello " + name);
//        }


//        multiply every element with 2
//        int[] arr={1,2,3,4,5};
//        for (int i = 0; i < arr.length; i++) {
//            arr[i]=arr[i]*2;
//            System.out.print(arr[i] + " ");
//
//        }


//        revering the elements
//        int[] arr={1,2,3,4,5};
//        for (int i = arr.length-1; i >=0; i--) {
//
//            System.out.print(arr[i] + " ");
//        }

//        total sum of elements in array
//        int[] arr={1,2,3,4,5};
//        int sum=0;
//        for (int i = 0; i < arr.length; i++) {
//            sum=sum+arr[i];
//
//        }
//        System.out.println("total sum is " + sum);


// using for each loop
//        int[] arr={1,2,3,4,5};
//        int sum =0;
//        for(int num:arr){
//            sum=num-sum;
//        }
//        System.out.println("total sum  " + sum);

//        String[] names = {"alice","singh"};
//        System.out.println(Arrays.toString(names));

//        -----------------------------------------------------------------------------------------------------------------------------------------------------

//        2D ARRAYS
//        int [][] matrix=new int[3][3];
//        int[][]values={{1,2},{3,4},{5,6}};
//        for(int[] arr2d :values){
//            System.out.println(Arrays.toString(arr2d));
//        }

//        using for loop
//        int[][]values={{1,2},{3,4},{5,6}};
//        for (int i = 0; i <values.length ; i++) {
//            for (int j = 0; j < values[i].length; j++) {
//                System.out.print(values[i][j]+ " ");
//
//            }
//            System.out.println();
//        }

//
//        int[][]values={{1,2},{3,4},{5,6}};
//        System.out.println(Arrays.deepToString(values));

//        ---------------------------------------------------------------------------------------------------------------------------------------------------
//        ARRAYLIST

//        ArrayList<Integer>List=new ArrayList<>();
//        List.add(10);
//        List.add(20);
//        List.add(10);
//        List.add(40);
//        List.add(50);
//
//        System.out.println(List);
//        List.remove(2);
//        System.out.println(List);
//        List.set(1,99);
//        System.out.println(List);
        int[] arr = {5, 10, 15, 20};
        System.out.println(arr[arr.length - 1]);
        ArrayList<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        System.out.println(names.size());


    }

}
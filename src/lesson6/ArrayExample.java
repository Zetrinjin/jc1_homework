package lesson6;

import java.util.Arrays;

public class ArrayExample {
    public static void main(String[] args) {
        int[] arr1;
        //int arr2[];//not recommended

        arr1 =new int[5];// we know size

        //arr2 = {1,2,3,4,5} так делать нельзя тк выделятся память
        int[] arr2 ={5,2,3,1,4};

        for (int i = 0; i< arr1.length;i++){
            System.out.println(arr1[i]);
        }
        for (int i = 0; i< arr2.length;i++){
            System.out.print(arr2[i] + " ");
        }

        System.out.println();
        Arrays.sort(arr2);
        for (int elementArr2 : arr2){//хотим пройти по итераци столько раз сколько в массиве элементов
            System.out.println(elementArr2 + "");
        }
    }
}

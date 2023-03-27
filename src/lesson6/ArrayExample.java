package lesson6;

public class ArrayExample {
    public static void main(String[] args) {
        int[] arr1;
        //int arr2[];//not recommended

        arr1 =new int[5];// we know size

        //arr2 = {1,2,3,4,5} так делать нельзя тк выделятся память
        int[] arr2 ={1,2,3,4,5};

        for (int i = 0; i< arr1.length;i++){
            System.out.println(arr1[i]);
        }
        for (int i = 0; i< arr2.length;i++){
            System.out.println(arr2[i]);
        }
    }
}

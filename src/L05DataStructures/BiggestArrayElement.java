package L05DataStructures;

public class BiggestArrayElement {
    public static void main(String[] args) {


        int arr[]= {30,50,21,44,26,70,20,35,99,25,11,25};

        int biggest= arr[0];
        for (int i=0;i<arr.length;i++){
            if(arr[i]>biggest)
                biggest = arr[i];
        }
        System.out.println("The largest element in the array is "+biggest);
    }
}
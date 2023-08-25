package Sort;

public class SelectionSort {
    public static void main(String[] args) {
    selectionSort(new int[]{4,2,6,1,3});
    }

    public  static  void selectionSort(int [] array){
        for ( int  i = 0 ; i < array.length ; i ++){

            int minIndex =  i;

            for ( int j = i +1 ; j < array.length; j++){
                if(array[j] < array[minIndex]){
                    minIndex = j;
                }
            }
            int temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }
    }
}

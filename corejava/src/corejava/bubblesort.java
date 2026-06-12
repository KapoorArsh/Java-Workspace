package corejava;
public class bubblesort{
    public static void main(String[] args) {
        int[] arr = {5,3,8,7,10,420,100,29};
        int temp;

        System.out.print("Original Array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < arr.length - 1; i++) {	
            for (int j = 0; j < arr.length-1-i; j++) {
                if(arr[j] >= arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            System.out.println("Pass " + (i+1) + " = ");
            for (int j2 = 0; j2 < arr.length; j2++) {
				System.out.println(arr[j2]);
			}
        }

        System.out.print("Sorted array in ascending order: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        // int[] arrdec = new int[arr.length];
        // for (int i = 0; i < arr.length; i++) {
        //     arrdec[i] = arr[arr.length - 1 - i];
        // }
        System.out.println();
        System.out.print("Sorted array in descending order: ");
        // for (int i = 0; i < arrdec.length; i++) {
        //     System.out.print(arrdec[i] + " ");
        // }

        for (int i = arr.length - 1; i >=0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
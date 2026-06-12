package Collection;
import java.io.*;
import java.util.*;
public class Linkedlist {
    @SuppressWarnings({ "unchecked", "rawtypes", "resource" })
	public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
		LinkedList hell = new LinkedList();
        hell.add("yo");
        hell.add(5);
        hell.add(2);
        hell.add(true);
        hell.add(5.5);
        System.out.println(hell);
        LinkedList <Integer> list = new LinkedList<>();
        list.add(1);
        list.addFirst(5);
        list.add(3);
        list.addLast(10);
        System.out.println(list);
        System.out.println(list.get(0));
        System.out.println(list.size());
        System.out.println(list.contains(7));
        list.set(0, 8);
        Collections.sort(list);
        System.out.println(list);

        LinkedList <String> abj = new LinkedList<>();
        System.out.println("Enter your name: ");
        String a = sc.next();
        abj.add(a);
        abj.addFirst("Amarnoor");
        abj.add("Palak");
        abj.add("Dishita");
        abj.add("Akshit");
        abj.addLast("Arpita");
        System.out.println(abj);
        Collections.sort(abj);
        System.out.println(abj);

        LinkedList <String[]> demo = new LinkedList<>();
        System.out.println("Enter the number of elements you want in array: ");
        int b = sc.nextInt();
        if (b == 0) {
            System.out.println("No elements to add.");
        } else {
            String[] arr = new String[b];
            String[] arr1 = new String[b];
            System.out.println("Enter the elements of array: ");
            for (int i = 0; i < b; i++) {
                System.out.print("Element for first array " + (i + 1) + ": ");
                arr[i] = sc.next();
            }
            System.out.println("Enter the elements of array: ");
            for (int i = 0; i < b; i++) {
                System.out.print("Element for second array " + (i + 1) + ": ");
                arr1[i] = sc.next();
            }
            demo.add(arr);
            demo.add(arr1);
            System.out.println("Contents of array: ");
            System.out.println(demo);
            for (String[] array : demo) {
                for (String value : array) {
                    System.out.print(value + " ");
                }
                System.out.println();
            }
        }

        LinkedList<Double> demo2 = new LinkedList<>();
        System.out.println("Enter number of double values you want to enter in LinkedList (or 0 to exit): ");
        int e = sc.nextInt();
        if (e == 0) {
            System.out.println("No double values to add.");
        } else {
            double value;
            for (int i = 0; i < e; i++) {
                System.out.print("Enter a double value: ");
                value = sc.nextDouble();
                demo2.add(value);
            }
            System.out.println("Contents of the LinkedList: ");
            for (Double d : demo2) {
                System.out.println(d);
            }
            Collections.sort(demo2);
            System.out.println("Contents of the Double LinkedList(sorted): ");
            for (Double d : demo2) {
                System.out.println(d);
            }
        }

        LinkedList<Character> charList = new LinkedList<>();

        System.out.println("Enter the number of char values you want to enter in LinkedList (or 0 to exit):");
        int numChars = sc.nextInt();

        if (numChars == 0) {
            System.out.println("No values to add.");
        } else {
            for (int i = 0; i < numChars; i++) {
                System.out.print("Enter a character value: ");
                String input = sc.next();
                char ch = input.charAt(0);
                charList.add(ch);}
            }

            System.out.println("Contents of the char LinkedList:");
            for (char c : charList) {
                System.out.println(c);
            }
            Collections.sort(charList);
            System.out.println("Contents of the char LinkedList(sorted):");
            for (char c : charList) {
                System.out.println(c);
            }
    FileWriter nf = new FileWriter("C:\\Users\\arshk\\OneDrive\\Desktop\\File.txt");
	PrintWriter pw = new PrintWriter(nf);
    pw.println(charList);
    nf.close();
    int i;
	FileInputStream fin = new FileInputStream("C:\\Users\\arshk\\OneDrive\\Desktop\\File.txt");
	System.out.println("This is content stored in File.");
	do {
		i = fin.read();
		if(i!=-1) {
			System.out.print((char)i);
		}
	}while(i!=-1);
	fin.close();
    }
}




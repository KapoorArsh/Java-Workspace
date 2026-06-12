package Collection;

public class freqarr {
	public static void main(String [] args) {
		int [] a = {10,20,70,70,50,70,10,10,90};
		for (int i = 0; i < a.length; i++) {
			int x = a[i];
			int count = 0;
			if(x==-1)continue;
			for(int j = 0; j < a.length; j++) {
				if(a[j] == x) {
					++count;
					a[j] = -1;
				}
			}
		System.out.println("Frequency of " + x + " is " + count);
		}
	}
}

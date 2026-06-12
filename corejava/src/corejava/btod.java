package corejava;

public class btod {
	public static void main(String[] args) {
		int n = 1001;
		int ans = 0;
		int pw = 1;
		while(n>0) {
			int a = n%10;
			ans+=pw*a;
			n/=10;
			pw*=2;
		}
		System.out.println(ans);
	}
}

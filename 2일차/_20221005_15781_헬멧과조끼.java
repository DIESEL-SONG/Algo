package _1주차;

import java.util.Scanner;

public class _20221005_15781_헬멧과조끼 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int[] narr = new int[n];
		int[] marr = new int[m];
		
		for(int i = 0; i < n; i++) {
			narr[i] = sc.nextInt();
		}
		
		for(int i = 0; i < m; i++) {
			marr[i] = sc.nextInt();
		}
		
		int nmax = 0;
		int mmax = 0;
		
		for(int i = 0; i < n; i++) {
			if(narr[i] > nmax) {
				nmax = narr[i];
			}
		}
		
		for(int i = 0; i < m; i++) {
			if(marr[i] > mmax) {
				mmax = marr[i];
			}
		}
		
		System.out.println(nmax + mmax);
	
		
	}
}

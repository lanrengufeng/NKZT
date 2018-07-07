package ITXiaoZhaoJune;

import java.util.Scanner;

/**
 * 
 * @author kafka
 *
 */
public class Main4 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[][] stars = new int[n][2];
		int[][] data = new int[1001][1001];
		for(int i=0;i<n;i++){
			stars[i][0] = in.nextInt();
			stars[i][1] = in.nextInt();
			data[stars[i][0]][stars[i][1]] = 1;
		}
		
		for(int i=1;i<data.length;i++){
			for(int j=1;j<data.length;j++){
				data[i][j]+=data[i][j-1];
			}
		}
				
		int m = in.nextInt();
		
		for(int i=0;i<m;i++){
			int a1 = in.nextInt();
			int b1 = in.nextInt();
			int a2 = in.nextInt();
			int b2 = in.nextInt();
			int sum=0;			
			for(int j=a1;j<=a2;j++){
				sum+=data[j][b2]-data[j][b1-1];
			}
			System.out.println(sum);
		}
		
		in.close();
	}
}




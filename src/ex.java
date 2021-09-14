
public class ex {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in); 
		int n = in.nextInt();
		int r = in.nextInt();
		int c = in.nextInt();
		
		
		in.close(); 
		
		int[][] array = new int[n][n]; 
		
		int count = 1; 
		
		int x = 0; 
		int y = 0; 
		
		array[x][y] = count++; 
		
		while(count <= n*n) { 
			
			if(y + 1 < n) { 
				y++; 
			} else { 
				x++; 
			} 
			
			array[x][y] = count++; 
			
			while(y - 1 > -1 && x + 1 < n) { 
				array[++x][--y] = count++; 
			} if(x + 1 < n) { 
				x++; 
				} else { 
					y++; 
				}
			
			array[x][y] = count++; 
			
			while(x - 1 > -1 && y + 1 < n) {
				array[--x][++y] = count++; 
				} 
			} 
		
		System.out.println(array[r-1][c-1]);
	}
}


public class Array90Rotation {
	public static void main(String args[])
	{
		System.out.println("Testing");
		int [][] givenArray = {{1,2,3},{4,5,6},{7,8,9}};
		printArray(givenArray);
		rotate90Logic(givenArray,3);
		
		
	}
	
	public static void rotate90(int[][] gArray, int mat)
	{
		int[][] newArray = {{0,0,0},{0,0,0},{0,0,0}};
		/* 0,0 -- 0,2 ;
		 * 0,1 -- 1,2;
		 * 0,2 -- 2,2
		 * 
		 * 1,0 -- 0,1
		 * 1,1 -- 1,1
		 * 1,2 -- 2,1
		 * 
		 * 2,0 -- 0,0
		 * 2,1 -- 1,0
		 * 2,2 -- 2,0
		 * 
		*/
		
		for ( int r=0;r<mat;r++)
		{
			for(int c=0;c<mat;c++)
			{
				newArray[c][mat-r-1]=gArray[r][c];
			}
		}
		
		System.out.println();
		printArray(newArray);
	}
	
	public static void rotate90Logic(int[][] gArray, int mat)
	{
		int[] temp = {-1,-1,-1,-1};
		int curr_i,curr_j;
		System.out.println((Math.ceil(mat/2)));

		System.out.println((Math.floor(mat/2)));
		System.out.println("\n from function");
		for ( int r=0;r<mat / 2 + mat % 2;r++)
		{
			System.out.println(temp[0]);
			for(int c=0;c<mat/2;c++)
			{
				curr_i=r;
				curr_j=c;
				for(int k=0;k<3;k++)
				{
					temp[k]=gArray[curr_i][curr_j];
					curr_i=c;
					curr_j=(int)(mat)-r-1;
				}
				//newArray[c][mat-r-1]=gArray[r][c];
				System.out.println(temp);
			}
		}
		System.out.println(temp[0]);
		System.out.println();
	//	printArray(newArray);
	}
	
	
	public static void printArray(int[][] gArray)
	{
		for(int[] a: gArray)
		{
			System.out.println("");
			for(int az:a)
			{
				System.out.print(az);
				System.out.print("  ");
			}
		}
	}

}

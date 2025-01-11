
public class multiarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[][]= {{2,4,5},{3,6,7},{3,4,5,6}};
		
		
		for (int i=0;i<a.length;i++)
		{
			for(int j =0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+ "\t");
			}
		System.out.println("\n");
		}
}
}
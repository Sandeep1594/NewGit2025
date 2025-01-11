
public class reverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "madam";
		String t = "";
		char[] array_char = s.toCharArray();
		int len = array_char.length;
		for(int i=len;i>0;i--)
		{
			 t += array_char[i-1];
			 
		}
		System.out.println(t);
		if (t==s)
		{
			System.out.println("Palindrome!!");
		}
		else
		{
			System.out.println("Not a palindrome!!");
		}
		
	}

}

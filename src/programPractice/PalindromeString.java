package programPractice;

public class PalindromeString {

	public static void main(String[]args) {
		String s = "ABcMYM";
		String rvs=" ";
		
		char[] a=s.toCharArray();
		int lenght=s.length();
		System.out.println(lenght);
		for(int i=lenght-1;i>=0;i--) {
			rvs=rvs+a[i];
		}
		System.out.println(rvs);
		if(s.equals(rvs)) {
			System.out.println("Given String is palindrome");
		}else {
			System.out.println("not palindrome");
		}
		String s1=new String("ravi");
		String s2=new String("ravi");
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		
	int i=2;
	int j=2;
	System.out.println(i==j);
	
	}
		
	}


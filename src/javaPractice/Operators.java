package javaPractice;

public class Operators {

	public static void main(String[] args) {
		
		int r=10;
		int s=5;
		int t=3;
		boolean p=true;
		boolean q=false;
		
		System.out.println(++r);//11
		System.out.println(--r);//10
		System.out.println(r++);//11
		System.out.println(r--);//11
		System.out.println(+r);//10
		System.out.println(-r);//-10
		System.out.println("----------------------------------------");

//----------------------------------------//
		System.out.println(r+s);
		System.out.println(r-s);
		System.out.println(r*s);
		System.out.println(r/s);
		System.out.println(r%s);
		System.out.println(r/t);
		System.out.println(r%t);
		System.out.println("-------------------------------------------");
//------------------------------------------//
		System.out.println(r<<s);
		System.out.println(10<<2);
		System.out.println(3<<2);
		System.out.println(r>>s);
		System.out.println(120>>2);
		System.out.println("-----------------------------------------");

//--------------------------------------------//
		System.out.println(r<s&&r>s);//false&&True
		System.out.println(r>s&&s>t);//true&&true
		System.out.println(r<s&&t>s);//false&&false
		System.out.println(t<s&&t>s);//true&&false
		System.out.println("-----------------------------------------");

//---------------------------------------------------//
		System.out.println(r<s&r>s);//false&&True
		System.out.println(r>s&s>t);//true&&true
		System.out.println(r<s&t>s);//false&&false
		System.out.println(t<s&t>s);//true&&false
		System.out.println("-----------------------------------------");
//-----------------------------------------------------//
		System.out.println(r<s||r>s);//false&&True
		System.out.println(r>s||s>t);//true&&true
		System.out.println(r<s||t>s);//false&&false
		System.out.println(t<s||t>s);//true&&false
		System.out.println("-----------------------------------------");
//-------------------------------------------------------//
		System.out.println(r<s|r>s);//false&&True
		System.out.println(r>s|s>t);//true&&true
		System.out.println(r<s|t>s);//false&&false
		System.out.println(t<s|t>s);//true&&false
		System.out.println("-----------------------------------------");
//-------------------------------------------------------//
		System.out.println(~r);
		System.out.println(~s);
		System.out.println(!p);
		System.out.println(!q);
		


//------------------------------------------//

	}
}

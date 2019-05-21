import java.util.Scanner;

class CeaserKey
{
	Scanner s = new Scanner(System.in);
	public String userkey = "";
	public String secondarykey = "";
	char[] finalkey = new char[200];
	int i ,k, j;
	String name;
	String new_string = "";
	char ch = ' ';
	int digit= 0;
	char[] str =new char[200];
	
	CeaserKey()
	{
		System.out.print("Enter a Key of Encryption -->> ");
		userkey = s.nextLine();
		System.out.println("The Orignal User Key is --> "+userkey);
		for(i=0; i<userkey.length();i++)
		{
			char ch = userkey.charAt(i);
			if(ch!=' ')
				secondarykey += ch;									//new_string=new_string+ch;
			userkey = userkey.replace(ch,' ');
		}
		for(char c='a'; c<='z'; c++)
		{
			secondarykey = secondarykey+""+c;
		}
		System.out.println("The Secondary Key is --> "+secondarykey);
		
		for(i=0; i<secondarykey.length();i++)
		{
			char ch = secondarykey.charAt(i);
			if(ch!=' ')
				finalkey[i] += ch;									//new_string=new_string+ch;
			secondarykey = secondarykey.replace(ch,' ');
		}
		System.out.println("The Final Key is --> "+finalkey);
	}
}

class Encryption extends CeaserKey
{
	public Encryption()
	{
		System.out.print("\nEnter a String to convert into Encryption form -->> ");
		name = s.nextLine();
		str = name.toCharArray();
	}
	
	public void getEncrypt()
	{
		for(i=0; i<name.length(); i++)
		{
			for(j=0; j<finalkey.length; j++)
			{
				if(str[i]==finalkey[j])
				{
					ch = finalkey[j+1];
					break;
				}					
			}
			new_string = new_string+""+ch;
		}
		System.out.println(new_string);
		for(i=0;i<new_string.length();i++)
		{
			ch = new_string.charAt(i);
			digit= (ch-'a'+1);
			System.out.print(String.format("%02d-", digit));
		}
		
	}
		
}

/*class Decryption extends CeaserKey
{
	public Decryption()
	{
		System.out.print("Enter a Numbers to convert into Decreption form -->> ");
		name = s.nextLine();
		str = name.toCharArray();
	}
	
	public void getDecrypt()
	{
		
		for(i=0;i<str.length;i++)
		{
			ch = new_string.charAt(i);
			digit= (ch-'a'+1);
			System.out.print(String.format("%02d-", digit));
		}
		
		System.out.println(new_string);
		for(i=0;i<new_string.length();i++)
		{
			ch = new_string.charAt(i);
			digit= (ch-'a'+1);
			System.out.print(String.format("%02d-", digit));
		}
	}

}*/

public class CeaserEncryption
{
	public static void main(String args[])
	{
		Encryption e =new Encryption();
		e.getEncrypt();
		//Decryption d =new Decryption();
	}
}


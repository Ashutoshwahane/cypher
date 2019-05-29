import java.util.Scanner;

public class CeaserEncryption
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
			char[][] algo = {
							{'w','i','l','s','k'},
							{'h','a','f','d','r'},
							{'c','y','e','n','p'},
							{'t','o','b','g','j'},
							{'m','q','u','v','x'}
							};

		/*		for(int i=0; i<5; i++)
					{
						for(int j=0; j<5; j++)
							{														//**********printing the char array*********
								System.out.print(algo[i][j]);
							}
					}												*/
	
	
			System.out.print("Enter a String to convert into Encryption form -->> ");
			String name = s.nextLine();
			char[] str = name.toCharArray();
			char[] new_string = new char[200];
			int i ,k, j,f;
			char ch = ' ';
			for(k=0; k<str.length; k++)
			{
				for(i=0; i<5; i++)
				{
					for(j=0; j<5; j++)
					{
						if(str[k]==algo[i][j])
						{
							if(j==4)
							{
								j = 0;
								ch = algo[i+1][j];
								//System.out.print(ch);
								break;
							}
							else
								ch =  algo[i][j+1];
							//System.out.print(ch);
						}
						
					}
					
				}
				switch(ch)
				{
				case 'a' :
						System.out.print("01-");break;
				case 'b' :
					System.out.print("02-");break;
				case 'c' :
					System.out.print("03-");break;
				case 'd' :
					System.out.print("04-");break;
				case 'e' :
					System.out.print("05-");break;
				case 'f' :
					System.out.print("06-");break;
				case 'g' :
					System.out.print("07-");break;
				case 'h' :
					System.out.print("08-");break;
				case 'i' :
					System.out.print("09-");break;
				case 'j' :
					System.out.print("10-");break;
				case 'k' :
					System.out.print("11-");break;
				case 'l' :
					System.out.print("12-");break;
				case 'm' :
					System.out.print("13-");break;
				case 'n' :
					System.out.print("14-");break;
				case 'o' :
					System.out.print("15-");break;
				case 'p' :
					System.out.print("16-");break;
				case 'q' :
					System.out.print("17-");break;
				case 'r' :
					System.out.print("18-");break;
				case 's' :
					System.out.print("19-");break;
				case 't' :
					System.out.print("20-");break;
				case 'u' :
					System.out.print("21-");break;
				case 'v' :
					System.out.print("22-");break;
				case 'w' :
					System.out.print("23-");break;
				case 'x' :
					System.out.print("24-");break;
				case 'y' :
					System.out.print("25-");break;
				case 'z' :
					System.out.print("26-");break;
					
				}
			}
			
			
	}
}

			
			
		
			
	/*		System.out.println("The orignal String is --> "+name);
			for(i=0; i<name.length();i++)
			{
				char ch = name.charAt(i);
				if(ch!=' ')
					new_string += ch;									//new_string=new_string+ch;
				name = name.replace(ch,' ');
			}
			System.out.print("The New  String is --> "+new_string);			*/
					
			
	/*		for(int i=0; i<ch.length; i++)
			{											//***printing char by char*******
				System.out.print(ch[i]);
			}
	*/
		
		
		
	
	


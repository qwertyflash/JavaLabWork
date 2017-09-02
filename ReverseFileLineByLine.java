package FileHandling;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;
import java.util.Stack;


public class ReverseFileLineByLine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String fna,line="";
		Scanner scan=new Scanner(System.in);
		System.out.println("\nEnter file name: ");
		fna=scan.next();
		Stack <String> st=new Stack<String>();
		File f=new File("src//"+fna);
		try
		{
			BufferedReader br=new BufferedReader(new FileReader(f));
			while(line !=null)
			{
				line=br.readLine();
				st.push(line);
				
			}
			br.close();
			FileWriter fw=new FileWriter("src//"+fna);
			line=" ";
			while(!st.empty())
			{
				line=line+st.pop()+"\n";
				
			}
			fw.write(line);
			fw.close();
			
			
		}
		catch (Exception e){}
		scan.close();
		
	}

}

package FileHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class MiddleTenLinePrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try
		{
			String fna,sna;
			Scanner scan=new Scanner(System.in);
			
			System.out.println("\nenter file to read middle line: ");
			fna=scan.next();
			
			System.out.println("\nenter new file name : ");
			sna=scan.next();
			
			File f=new File("src//"+fna);
			BufferedReader br =new BufferedReader(new FileReader(f) );
			FileWriter fw=new FileWriter("src//"+sna);
			
			
			int count=0;
			String len="  ";
			while(len!=null)
			{
				len=br.readLine();
				count++;
			}
			System.out.println("\total no of line in : "+fna+" is"+count);
			len=" ";
			int i=0;
			while(len!=null)
			{
				i++;
				len=br.readLine();
				if(i>=(count/2)-5 && i<=(count/2)+5)
				{
					fw.write(len+"\n");
				}
			}
			//-------------not working properly----------------
		//-------------file sna is still empty...................	
			System.out.print("\nline printed sucessfully");
			br.close();
			fw.close();
			scan.close();
			
		}
		catch(Exception e){
			System.out.print("\nerror: "+e.getMessage());
		}
		
		
	}

}

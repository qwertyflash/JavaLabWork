package FileHandling;

import java.io.BufferedReader;
import java.io.File;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class LineByLinePrint {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		String fna ,sna;
		Scanner scan=new Scanner(System.in);
		System.out.print("\nenter file name to read: ");
		fna=scan.next();
		System.out.print("\nenter file name to write: ");
		sna=scan.next();
		File f=new File("src//"+fna);
		if(!f.exists())
		{
			System.out.print("\nfile doesnot exist ");
			
		}
		else
		{
			try{
				
					BufferedReader br =new BufferedReader(new FileReader(f));
					FileWriter fw=new FileWriter("src//"+sna);
					String data="";
					while (data!=null)
					{
						data=br.readLine();
						if(data!=null)
						{
							System.out.print("\n"+data);
							fw.write(data+"\n");
						}
					}
					fw.close();
					br.close();
			
			}
			catch (Exception e){
				System.out.print("\nfile error"+e.getMessage());
			}
			
			
		}
		scan.close();
		
		
	}

}

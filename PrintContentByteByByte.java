package FileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class PrintContentByteByByte {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fna,sna;
		Scanner scan =new Scanner (System.in);
		System.out.println("\nenter file to read: ");
		fna=scan.next();
		System.out.println("\nenter new file name : ");
		sna=scan.next();
		File f=new File("src//"+fna);
		System.out.println("\nfile path : "+f.getAbsolutePath());
		try
		{
			
//  ----------- completed------------------------------------------------------
			if(!f.exists())
			{
				System.out.print("\nfile not exist00");
				
			}
			else
			{
				FileInputStream fis=new FileInputStream(f);
				FileOutputStream fos=new FileOutputStream("src//"+sna);
				int n=0;
				while (n!=-1)
				{
					n=fis.read();
					fos.write(n);
				}
				fis.close();
				fos.close();
				}
						
			
			
		}
		catch(Exception e)
		{
			System.out.print(" ERROR\n"+e.getMessage());
			
		}
		
		
		
	}

}

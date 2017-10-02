package FileHandling;

import java.io.File;
import java.util.Scanner;

	


public class FileSearchFromDirectory {

	static String search(String fna,String sna)
	{
		 File f=new File(fna);
			String []flist=f.list();
		for(int i=0;i<flist.length;i++)
		{
			File ff=new File(f,flist[i]);
			if(ff.isFile())
			{
				if(sna.equals(flist[i]))
					break;
			}
			else if(ff.isDirectory())
			{
				search(flist[i],sna);
			}
		}
		return fna;
	}
	
	 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

///------------------------not working properly----------------------------------------------------------------------------------------
		try{
			
			String fna,sna;
			Scanner scan =new Scanner(System.in);
			System.out.print("\nenter folder name: ");
			fna=scan.next();
			System.out.print("\nenter file name to search: ");
			sna=scan.next();
			
				
			
			System.out.print("\nfil path: "+search(fna, sna));
		
			
			scan.close();
		}
		catch(Exception e)
		{
			System.out.print("\n"+e.getMessage());
		}
	}

}

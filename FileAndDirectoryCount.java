package FileHandling;

import java.io.File;
import java.util.Scanner;

public class FileAndDirectoryCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try{
			
			String fna;
			Scanner scan =new Scanner(System.in);
			System.out.print("\nenter folder name: ");
			fna=scan.next();
			File f=new File(fna);
			String []flist=f.list();
			int fi=0,fo=0;
		//	for(int i=0;i<flist.length;i++)
			//{
				//File ff=new File(flist[i]);
				//if(ff.isFile())
					//fi++;
				//else if(ff.isDirectory())
					//fo++;
			//}
			
			for(int i=0;i<flist.length;i++)
				{
					File ff=new File(f,flist[i]);
					if(ff.isFile())
						fi++;
					else if(ff.isDirectory())
						fo++;
				}
			
			System.out.print("\nfile count: "+fi);
			System.out.print("\nfolder count: "+fo);
			
			scan.close();
		}
		catch(Exception e)
		{
			System.out.print("\n"+e.getMessage());
		}
	}

}

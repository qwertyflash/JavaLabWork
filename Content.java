package FileHandling;

import java.io.File;
import java.util.Scanner;

public class Content {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =new Scanner(System.in);
		String fna =scan.next();
		
		File f=new File(fna);
		String flist[]=f.list();
		for(int i=0;i<flist.length;i++)
		{
			if(flist[i].endsWith(""))
				System.out.print("\n "+flist[i]);
		}
		scan.close();
	}

}

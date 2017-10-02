package FileHandling;
import java.io.File;
import java.util.Scanner;


public class FileListWithExtention {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	try{
		String fna,exe;
		Scanner scan=new Scanner(System.in);
		System.out.print("\nenter folder name: ");
		fna=scan.next();
		System.out.print("\nenter file extension ");
		exe=scan.next();
		File f=new File(fna);
		String []flist=f.list();
		for(int i=0;i<flist.length;i++)
		{
			if(flist[i].endsWith(exe))
				System.out.println("\n"+flist[i]);
		}
		
		scan.close();
	}
	catch (Exception e){
		System.out.println(" "+e.getMessage());
	}
		
		
		
	}

}

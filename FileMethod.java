package FileHandling;

import java.io.File;
import java.util.Scanner;

public class FileMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			String fna;
			Scanner scan=new Scanner(System.in);
			System.out.println("enter file name: ");
			fna=scan.next();
			File f=new File("src//"+fna);
			System.out.println("\nlocation: "+f.getPath());
			System.out.println("\nexist: "+f.exists());
			System.out.println("\nparent: "+f.getParent());
			System.out.println("\npath: "+f.getAbsolutePath());
			System.out.println("\nname: "+f.getName());
			System.out.println("\ncan read: "+f.canRead());
			System.out.println("\nis file: "+f.isFile());
			scan.close();
	}

}


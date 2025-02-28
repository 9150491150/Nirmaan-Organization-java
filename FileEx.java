package FileHandling;

import java.io.File;
import java.io.IOException;

public class FileEx {
	public static void main(String[]args) {
		File file=new File("C:\\Users\\sandh\\OneDrive\\Desktop");
		/*if(file.exists()==false) {
			try {
				file.createNewFile();
				System.out.println("created");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}else {
		
		System.out.println("not created");
		
		
	}*/
		/*File fileRename=new File("C:\\Users\\sandh\\OneDrive\\Desktop\\pavi\\python.html");
		file.renameTo(fileRename);
		System.out.println("Renamed");*/
		for(File f:file.listFiles()) {
			f.isDirectory();
			System.out.println(f);
			
			
			
		}

	}
}

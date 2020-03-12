import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class FileExample {

	public static void main(String[] args) throws IOException {
		File file = new File("E:\\abc\\bcd");
		
		if(!file.isDirectory()) {
			if(file.mkdirs()) {
				File file1 = new File("E:\\abc\\bcd\\abc.txt");
				if(!file1.exists()) {
					file1.createNewFile();
				}
				if(file1.canWrite()) {
					String write = "Hello World";
					Path path = Paths.get(file1.getPath());
					Files.write(path,write.getBytes(),StandardOpenOption.APPEND);
				}
				
			}
		}else {
			String [] fileNames = file.list();
			for(int i=0;i<fileNames.length;i++) {
				System.out.println(fileNames[i]);
			}
			
			File[] files = file.listFiles();
			if(files[0].canWrite()) {
				FileWriter fw = new FileWriter(files[0].getPath());
				fw.write("File Writer Example");
				fw.close();
			}
		}
	}

}

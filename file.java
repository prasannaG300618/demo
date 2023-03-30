import java.util.*;
import java.io.*;
class file{
	public static void main(String args[]){
		try{
			Scanner a= new Scanner(System.in);
			System.out.println("enter file name with .txt : ");
			String b = a.nextLine();
			File f= new File(b);
			if(f.createNewFile()){
				System.out.println("new file created :) ");
			}
			else{
				System.out.println("file already exits :( ");
			}
			FileWriter f1 = new FileWriter(b);
			System.out.println("enter content:");
			String c = a.nextLine();
			f1.write(c);
			f1.close();
			System.out.println("content wriiten successfully :)");
			System.out.println("**************************************** entered content is ************************************");
			Scanner f2 = new Scanner(f);
			while(f2.hasNextLine()){
				String filee = f2.nextLine();
				System.out.println(filee);
			}
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}
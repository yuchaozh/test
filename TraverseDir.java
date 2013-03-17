import java.nio.file.FileVisitResult;  
import java.nio.file.Files;  
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;  
import java.io.PrintWriter;
import java.nio.file.Path;  
import java.nio.file.Paths;  
import java.nio.file.SimpleFileVisitor;  
import java.nio.file.attribute.BasicFileAttributes;  
import java.util.ArrayList;
  
/*public class Traverse
{
	public static void main(String args[]) throws IOException
	{
		//Path startPath = Paths.get("c:/"); 
		Path startPath = Paths.get("c:/test_file2");
		TraverseDir walk = new TraverseDir();
		try 
		{  
	        Files.walkFileTree(startPath, walk);  
	    } 
		catch (IOException e) 
	    {  
	        System.err.println(e);  
	    }
		System.out.println("dircount: "+TraverseDir.dircount);
		System.out.println("~~~~~~~~~~~~~~~~~ ");
		System.out.println("DirPath Count: "+TraverseDir.dirpath.size());
		//����txt�ĵ����ļ��е�·��
		FileWriter fw = new FileWriter("C:/log.txt");
		for(int i = 0; i < TraverseDir.dirpath.size(); i++)
		{
			fw.write(TraverseDir.dirpath.get(i)+ "\r\n");
		}
		//�ر�txt
		fw.close();
	}
}*/


class TraverseDir extends SimpleFileVisitor<Path>
{
	//public static int filecount = 0;
	//�ļ��е���Ŀ
	public static int dircount = 0;
	//�洢�ļ���·���ķ�������
	public static ArrayList<Path> dirpath;
	
	public TraverseDir()
	{
		dirpath = new ArrayList<Path>();
	}
	
	//��preVisitDirectory�ͻ����
	public FileVisitResult postVisitDirectory(Path dir, IOException exc) 
    {  
        //System.out.println(">>>>Dir : " + dir);  
        dirpath.add(dir);
        dircount++;
        return FileVisitResult.CONTINUE;  
    }  
	
    public FileVisitResult visitFileFailed(Path file, IOException exc) 
    {  
        System.out.println(exc);  
        return FileVisitResult.CONTINUE;
    }

}
import java.io.*;
public class RunMe{
   static void deleteFolder(File P){
      for (File subFile : P.listFiles()) {
         if(subFile.isDirectory()) {
            deleteFolder(subFile);
         } else {
            subFile.delete();
         }
      }
      P.delete();
   }
   public static void main(String args[]) {
      String filePath = "C:\\Users\\Pranto\\Desktop\\Java My Code(Delete Folder)\\P";
      //Creating the File object
      File file = new File(filePath);
      deleteFolder(file);
      System.out.println("Files deleted........");
   }
}
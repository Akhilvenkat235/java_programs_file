import java.io.*;  
class Ser1{  
 public static void main(String args[])throws Exception{  
  Student3 s1 =new Student3(211,"ravi",22); 
   
  FileOutputStream f=new FileOutputStream("fs.txt");  
  ObjectOutputStream out=new ObjectOutputStream(f);  
  out.writeObject(s1);  
  out.flush();  
  
  out.close();  
  f.close();  
  System.out.println("success");  
 }  
}  
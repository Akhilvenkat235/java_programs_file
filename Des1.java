import java.io.*;  
class Des1{  
 public static void main(String args[]){  
  try{  
 
  ObjectInputStream in=new ObjectInputStream(new FileInputStream("fs.txt"));  
  Student3 s=(Student3)in.readObject();  
   
  System.out.println(s.id+" "+s.name);  
    
  in.close();  
  }catch(Exception e){System.out.println(e);}  
 }  
}  
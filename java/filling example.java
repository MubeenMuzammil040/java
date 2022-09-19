import java.io.File;
import java.io.IOException;
class Example{

public static void main(String[] args){
    try{
    File fobj=new File("filename.txt"); //specify the file name
   if( fobj.createNewFile()){  //this method actual create the file
System.out.println("file is created"+fobj.getName());
    }
    else{
        System.out.println("file is already exist");
    }
}
    catch(IOException e){
        System.out.println("an error occured");
        e.printStackTrace();
    }
    
}
}
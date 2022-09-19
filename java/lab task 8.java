class Mythread1 extends thread{
    public void run(){
        for (int i=0;i<=30;i++){
            System.out.println("Inside the thread class i:"+i);
            if(i%2==0)
            try{
                thread.sleep(5);
            }
            catch(Exception e){
                System.out.println(e);
            }
        
            }
        }
    }
public class ThreadDemo{
    public static void main(String[] args){
        Mythread mt=new Mythread();
        mt.start();
        System.out.println("Existing main thread");
    }
}

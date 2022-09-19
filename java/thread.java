public class MyThread extends Thread{
    public void run(){
        for(int i=0;i<=30;i++)
        {
            System.out.pritnln("Inside my thread class:"+i);
            if(i%2==0)
            try{
                Thread.sleep(5);

            }
            catch(InterruptedException e){
                System.out.println(e);
            }
        }
    }
}
public class thread{
    public static void main(String[] args){
MYThread mt=new MYThread ();
mt.start();
}
}
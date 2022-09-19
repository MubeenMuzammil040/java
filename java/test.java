class A{
    int a;
A(int a){
this.a=a;}
public int geta(){
    return a;
}
}
class B{
    int b;
B(int a){
this.b=b;}
public int getb(){
    return b;
}
}
class C extends A{
    int c;
C(int a,int c){
super(a);
this.c=c;
}
public int getc(){
    return c;
}
} 
class test{
    public static void main(String[] args){
         //B b1=new B();
         C c1=new C(5,9);
         //b1.get();
         c1.getc();
        // System.out.println(b1.get());
         System.out.println(c1.getc());
System.out.println(c1.geta());
    }
    }
    



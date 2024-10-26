public class Main {
    public static void main(String[] args) throws InterruptedException {

        //creating just two processes
        proccess p1=new proccess();
        proccess p2=new proccess();
        p1.count();
        p2.count();

        //creating about 6 processes
        /*
        for(int i=0;i<=5;i++) {
            System.out.println("process number:"+(i+1));
            proccess p=new proccess();
            p.count();

        }
        */
    }
}
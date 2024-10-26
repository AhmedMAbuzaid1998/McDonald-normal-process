public class proccess {

    public void count() throws InterruptedException {
        String [] arr={"Mince the meat","Spicing","Grill","Toast the Buns","Sauces",
                "Assemble and serve"};
        for(int i = 0; i <=5 ; i++){
            System.out.println(arr[i]);
            Thread.sleep(1000);
        }

    }
}

package jav.Task_2;

public class Letters {
    public static void main(String[] args) {
         boolean oneMore=false;
         do{
            Scan scan = new Scan();
            CanPut canPut = new CanPut(scan.getA(), scan.getB(), scan.getC(), scan.getD());
            oneMore = scan.toContinue();
        }while(oneMore);

    }
}


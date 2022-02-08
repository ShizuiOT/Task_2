package task_2;
import java.util.Scanner;

public class Mnoj {
    public Mnoj() {
    }

    void slozh(){
        float v;
        Scanner in = new Scanner(System.in);
        System.out.print("input a number: ");
        v=in.nextFloat();
        in.close();
        if (v%1!=0){
            System.out.println("ERROR");
        }else{
            v=(int) v;
            for(int i=1; i<=v; i++){
                if(v%i==0)
                    System.out.println(i+";");
            }
        }
    }
}

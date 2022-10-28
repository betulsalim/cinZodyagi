import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        int yil,a;

        Scanner input = new Scanner(System.in);

        System.out.println("Doğum yılınızı giriniz: ");
        yil = input.nextInt();
        a= yil%12;
        if(a==0){
            System.out.println("Maymun");
        }
        else if(a==1){
            System.out.println("Horoz");
        }
        else if(a==2){
            System.out.println("Köpek");
        }
        else if (a==3) {
            System.out.println("Domuz");
        }
        else if(a==4){
            System.out.println("Fare");
        }
        else if(a==5){
            System.out.println("Öküz");
        }
        else if(a==6){
            System.out.println("Kaplan");
        }
        else if(a==7){
            System.out.println("Tavşan");
        }
        else if(a==8){
            System.out.println("Ejderha");
        }
        else if(a==9){
            System.out.println("Yılan");
        }
        else if(a==10){
            System.out.println("At");
        }
        else{
            System.out.println("Koyun");
        }

    }
}

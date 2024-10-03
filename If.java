import java.util.Scanner;


public class If {
    
    public static void main (String[] args) {

        Scanner scn = new Scanner (System.in);

        System.out.println("Cade a hora??");

        int horaDoDia = scn.nextInt();

        if (horaDoDia >= 6 && horaDoDia < 12){

            System.out.println("Manhã");
        }
            else if(horaDoDia >= 12 && horaDoDia < 18){

                System.out.println("Tarde");
            }
            else if(horaDoDia >= 18){
                System.out.println("Noite");

            }
            else{
                System.out.println("Madruga");
            }

        //Switch#######################################//#endregion


            


scn.close();

    }

}
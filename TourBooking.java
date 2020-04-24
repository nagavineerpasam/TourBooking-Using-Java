import java.util.*;
import java.io.*;
class Derive{

    public void Packages(){

        System.out.println();
        System.out.println("------------------->AVAILABLE PACKAGES ARE<-------------------");
        System.out.println();
        System.out.println(" Location           Nights n Days    Hotel category     Price ");
        System.out.println();
        System.out.println("1. Manali           3 Nights/4 days  4 seater A/C      Rs 2999");
        System.out.println();
        System.out.println("2. Goa              4 Nights/5 days  4 seater A/C      Rs 4999");
        System.out.println();
        System.out.println("3. Dharmashala      2 Nights/3 days  3 seater A/C      Rs 1999");
        System.out.println();
        System.out.println();
        System.out.println();
    
    }
    public void Clocation(){

        System.out.println("                Choose Location You Want To Travel             ");
        System.out.println();
        System.out.println("                        Press 1 for Manali                     ");
        System.out.println();
        System.out.println("                        Press 2 for Goa                     ");
        System.out.println();
        System.out.println("                        Press 3 for Dharmashala                     ");
        System.out.println();
        Scanner sc = new Scanner(System.in);
        int sel=sc.nextInt();
        if(sel==1){
            int m=2999;
            System.out.println("             You Have Selected the Location Manali             ");
            System.out.println();
            System.out.println("                  Manali Package details are                     ");
            System.out.println();
            System.out.println("1. Manali       3 Nights/4 days  4 seater A/C       Rs 2999");
            System.out.println();
            System.out.println("              Do You Want to Customize The Package ?             ");
            System.out.println();
            System.out.println("                 Press 1 for YES || 0 for NO                         ");
            System.out.println();
            int s1=sc.nextInt();
            if(s1==0){
                System.out.println("          Your Selected Package Details are                     ");
                System.out.println();
                System.out.println("1. Manali       3 Nights/4 days  4 seater A/C       Rs 2999");
                System.out.println();
                System.out.println("-------------------->HAPPY JOURNEY<---------------------");
                System.out.println();


            }
            else{
                System.out.println(" USERS CAN CUSTOMIZE THEIR PACKAGE, THE DETAILS ARE GIVEN BELOW");
                System.out.println();
                System.out.println("              Hotel Packages As Follows                    ");
                System.out.println();
                System.out.println("           Option:1  4seater :- RS 400/night       ");
                System.out.println();
                System.out.println("           Option:2  3seater :- RS 800/night       ");
                System.out.println();
                System.out.println("           Option:3  2seater :- RS 1000/night       ");
                System.out.println();
                System.out.println("    Choose the Option Number You Want To Select From Above   ");
                System.out.println();
                int h1=sc.nextInt();
                if(h1==1){
                    System.out.println("       How many Nights You want to Add More (RS1000/night)(Press Your Choice Number)    ");
                    System.out.println();
                    int nn1=sc.nextInt();
                   
                   System.out.println("        The Details Of The Selected Packages Are     ");
                   System.out.println();
                   int f1=(1000*nn1)+400+m;
                   
                    System.out.println("1. Manali     "+  (nn1+3) + " Nights /4 days  4 seater A/C     " +"RS "+ f1+" ");
                    System.out.println();
                     System.out.println("-------------------->HAPPY JOURNEY<---------------------");
                     System.out.println();


                }
                else if(h1==2){
                    System.out.println("       How many Nights You want to Add More (RS1000/night)(Press Your Choice Number)    ");
                    System.out.println();
                    int nn2=sc.nextInt();
                   
                   System.out.println("        The Details Of The Selected Packages Are     ");
                   System.out.println();
                   int f2=(1000*nn2)+800+m;
                   
                    System.out.println("1. Manali     "+  (nn2+3) + " Nights /4 days  3 seater A/C     " +"RS "+ f2+" ");
                    System.out.println();
                   System.out.println("-------------------->HAPPY JOURNEY<---------------------");
                   System.out.println();
                }
                else if(h1==3){
                    System.out.println("       How many Nights You want to Add More (RS1000/night)(Press Your Choice Number)    ");
                    System.out.println();
                    int nn3=sc.nextInt();
                   
                   System.out.println("        The Details Of The Selected Packages Are     ");
                   System.out.println();
                   int f3=(1000*nn3)+1000+m;
                   
                    System.out.println("1. Manali     "+  (nn3+3) + " Nights /4 days  2 seater A/C     " +"RS "+ f3+" ");
                    System.out.println();
                   System.out.println("-------------------->HAPPY JOURNEY<---------------------");
                System.out.println();
                    
                }
                

                

            }
        }
        else if(sel==2){
            int m=4999;
            System.out.println("             You Have Selected the Location Goa             ");
            System.out.println();
            System.out.println("                  Goa Package details are                     ");
            System.out.println();
            System.out.println("2. Goa              4 Nights/5 days  4 seater A/C      Rs 4999  ");
            System.out.println();
            System.out.println("              Do You Want to Customize The Package ?             ");
            System.out.println();
            System.out.println("                 Press 1 for YES || 0 for NO                         ");
            System.out.println();
            int s2=sc.nextInt();
            if(s2==0){
                System.out.println("          Your Selected Package Details are                     ");
                System.out.println();
                System.out.println("2. Goa              4 Nights/5 days  4 seater A/C      Rs 4999");
                System.out.println();
                System.out.println("-------------------->HAPPY JOURNEY<---------------------");
                System.out.println();


            }
            else{
                System.out.println(" USERS CAN CUSTOMIZE THEIR PACKAGE, THE DETAILS ARE GIVEN BELOW");
                System.out.println();
                System.out.println("              Hotel Packages As Follows                    ");
                System.out.println();
                System.out.println("           Option:1  4seater :- RS 400/night       ");
                System.out.println();
                System.out.println("           Option:2  3seater :- RS 800/night       ");
                System.out.println();
                System.out.println("           Option:3  2seater :- RS 1000/night       ");
                System.out.println();
                System.out.println("    Choose the Option Number You Want To Select From Above   ");
                System.out.println();
                int h2=sc.nextInt();
                if(h2==1){
                    System.out.println("       How many Nights You want to Add More (RS1000/night)(Press Your Choice Number)    ");
                    System.out.println();
                    int nn21=sc.nextInt();
                   
                   System.out.println("        The Details Of The Selected Packages Are     ");
                   System.out.println();
                   int f21=(1000*nn21)+400+m;
                   
                    System.out.println("1. Goa     "+  (nn21+4) + " Nights /5 days  4 seater A/C     " +"RS "+ f21+" ");
                    System.out.println();
                    System.out.println("-------------------->HAPPY JOURNEY<---------------------");


                }
                else if(h2==2){
                    System.out.println("       How many Nights You want to Add More (RS1000/night)(Press Your Choice Number)    ");
                    System.out.println();
                    int nn22=sc.nextInt();
                   
                   System.out.println("        The Details Of The Selected Packages Are     ");
                   System.out.println();
                   int f22=(1000*nn22)+800+m;
                   
                    System.out.println("1. Goa     "+  (nn22+4) + " Nights /5 days  3 seater A/C     " +"RS "+ f22+" ");
                    System.out.println();
                    System.out.println("-------------------->HAPPY JOURNEY<---------------------");
                }
                else if(h2==3){
                    System.out.println("       How many Nights You want to Add More (RS1000/night)(Press Your Choice Number)    ");
                    System.out.println();
                    int nn23=sc.nextInt();
                   
                   System.out.println("        The Details Of The Selected Packages Are     ");
                   System.out.println();
                   int f23=(1000*nn23)+1000+m;
                   
                    System.out.println("1. Goa     "+  (nn23+4) + " Nights /5 days  2 seater A/C     " +"RS "+ f23+" ");
                    System.out.println();
                    System.out.println("--------------------->HAPPY JOURNEY<------------------------");

                }
                

                

            
            }
        }
        else if(sel==3){
            int m=1999;
            System.out.println("             You Have Selected the Location Dharmashala             ");
            System.out.println();
            System.out.println("                  Dharmashala Package details are                     ");
            System.out.println();
            System.out.println("3. Dharmashala      2 Nights/3 days  3 seater A/C      Rs 1999");
            System.out.println();
            System.out.println("              Do You Want to Customize The Package ?             ");
            System.out.println();
            System.out.println("                 Press 1 for YES || 0 for NO                         ");
            System.out.println();
            int s3=sc.nextInt();
            if(s3==0){
                System.out.println("          Your Selected Package Details are                     ");
                System.out.println();
                System.out.println("3. Dharmashala      2 Nights/3 days  3 seater A/C      Rs 1999");
                System.out.println();
                System.out.println("-------------------->HAPPY JOURNEY<---------------------");
                System.out.println();


            }
            else{
                System.out.println(" USERS CAN CUSTOMIZE THEIR PACKAGE, THE DETAILS ARE GIVEN BELOW");
                System.out.println();
                System.out.println("              Hotel Packages As Follows                    ");
                System.out.println();
                System.out.println("           Option:1  4seater :- RS 400/night       ");
                System.out.println();
                System.out.println("           Option:2  3seater :- RS 800/night       ");
                System.out.println();
                System.out.println("           Option:3  2seater :- RS 1000/night       ");
                System.out.println();
                System.out.println("    Choose the Option Number You Want To Select From Above   ");
                System.out.println();
                int h3=sc.nextInt();
                if(h3==1){
                    System.out.println("       How many Nights You want to Add More (RS1000/night)(Press Your Choice Number)    ");
                    System.out.println();
                    int nn31=sc.nextInt();
                   
                   System.out.println("        The Details Of The Selected Packages Are     ");
                   System.out.println();
                   int f31=(1000*nn31)+400+m;
                   
                    System.out.println("1. Dharmashala     "+  (nn31+2) + " Nights /3 days  4 seater A/C     " +"RS "+ f31+" ");
                    System.out.println();
                     System.out.println("-------------------->HAPPY JOURNEY<---------------------");


                }
                else if(h3==2){
                    System.out.println("       How many Nights You want to Add More (RS1000/night)(Press Your Choice Number)    ");
                    System.out.println();
                    int nn32=sc.nextInt();
                   
                   System.out.println("        The Details Of The Selected Packages Are     ");
                   System.out.println();
                   int f32=(1000*nn32)+800+m;
                   
                    System.out.println("1. Dharmashala     "+  (nn32+2) + " Nights /3 days  3 seater A/C     " +"RS "+ f32+" ");
                    System.out.println();
                    System.out.println("-------------------->HAPPY JOURNEY<---------------------");
                }
                else if(h3==3){
                    System.out.println("       How many Nights You want to Add More (RS1000/night)(Press Your Choice Number)    ");
                    System.out.println();
                    int nn33=sc.nextInt();
                   
                   System.out.println("        The Details Of The Selected Packages Are     ");
                   System.out.println();
                   int f33=(1000*nn33)+1000+m;
                   
                    System.out.println("1. Dharmashala     "+  (nn33+2) + " Nights /3 days  2 seater A/C     " +"RS "+ f33+" ");
                    System.out.println();
                    System.out.println("--------------------->HAPPY JOURNEY<------------------------");

                }
                

                

            }
       
        }
 

    }

}


class TnTagency
{
    public static void main(String[] args){
        Derive ob = new Derive();
        ob.Packages();
        ob.Clocation();
    
    }
}
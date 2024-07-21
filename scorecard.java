import java.util.Scanner;
class ShraddhaJADVANI{
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        int Ta=0;
        int Tb=0;
        for(int i=1;i<11;i++){
            System.out.println("");
            System.err.println("------> adding team ["+i+"]'s DATA <------ ");
            System.out.println("");
            System.err.println("Enter team A's score :\t");
            int TeamA=r.nextInt();
            System.out.println("Enter team B's score :\t");
            int TEamB=r.nextInt();
            System.out.println("");
            if(TeamA > TEamB){
                System.out.println("TEAM A won");
                Ta+=2;
                System.out.println("TEAM A :"+Ta);
                System.out.println("TEAM B :"+Tb);
            }else{
                System.out.println("TEAM B won");
                Tb+=2;
                System.out.println("TEAM A :"+Ta);
                System.out.println("TEAM B :"+Tb);
            }
        }
   }
}

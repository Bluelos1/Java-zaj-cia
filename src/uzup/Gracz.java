package uzup;



import java.util.Scanner;

public class Gracz {
    private int HP;
    private int Def;
    private int of;

    public Gracz(){
        setupPlayer();
       HP=99;

    }
    Scanner scan=new Scanner(System.in);

    public void setupPlayer(){
        System.out.println("wybierz bron , 1 lub 2 lub 3");
        int bron = scan.nextInt();
        if(bron == 1){
            of = 10;
        }
        else if(bron ==2){
            of = 30;
        }
        else if(bron ==3){
            of = 50;
        }
        System.out.println("wybierz zbroja 1 , 2, 3");
        int zbroja = scan.nextInt();
        if(zbroja == 1){
            Def = 1;
        }
        else if(zbroja ==2){
            Def = 2;
        }
        else if(zbroja ==3){
            Def = 3;
        }
    }



    public boolean walka(Przeciwnik przeciwnik){
        while (przeciwnik.getHP()>0){
            System.out.println("enter aby zaatakowac");
            try {
                System.in.read();
            }
            catch(Exception e){
                System.out.println("eror");
            }
            przeciwnik.setHP(przeciwnik.getHP()-(of - przeciwnik.getDef()));

            HP-=przeciwnik.getOf() - Def;
            System.out.println(HP);
            System.out.println(przeciwnik.getHP());
            if (HP<0){

                return false;
            }
        }
        return true;
    }



}

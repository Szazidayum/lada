package ladarendezes;

import java.util.ArrayList;
import java.util.Random;

public class LadaRendezes {

   static ArrayList<Integer> szamok;
    static int random;
   
    public static void main(String[] args) {
        ArrayList szamok = new ArrayList();
        
        feltolt(szamok);
        
    }
    
    public static void feltolt(ArrayList szamok){
        Random rand = new Random();
        for (int i = 0; i < 10; i++) { 
            random = rand.nextInt(1, 15);
        while(szamok.contains(random)==true){
            random = rand.nextInt(1, 15);  
        }
        szamok.add(random);
        }
        System.out.println("Rendezetlen tömb:");
for (int i = 0; i < szamok.size(); i++) {
            System.out.print(szamok.get(i)+", ");
        }
        ArrayList ujtomb = new ArrayList();
        rendez(szamok, ujtomb);
    }

    public static void rendez(ArrayList szamok, ArrayList ujtomb){
        ArrayList ujabb = new ArrayList();
        for (int i = 0; i < szamok.size(); i++) {
            ujabb.add(0);
        }
        
        for (int i = 0; i < szamok.size(); i++) {
            ujtomb.add(0);
        }
        
        for (int i = 0; i < szamok.size(); i++) {
            for (int j = 0; j < ujtomb.size(); j++) {
                if((int)szamok.get(i) == j){
                    ujtomb.set(j, 1);
                }
            }
        }   

             int l = 0;
            for (int i = 0; i < ujtomb.size(); i++) {
                  if((int)ujtomb.get(i) == 1){
                      ujabb.set(l, i);
                      l++;

            }
        
               
                }
            
        
        
            
        
        
        System.out.println("Rendezett tömb:");
        for (int i = 0; i < ujabb.size(); i++) {
            System.out.print(ujabb.get(i)+", ");
        }
    }
    
}





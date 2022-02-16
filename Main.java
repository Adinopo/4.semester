/*
        Colekcie ->
        Interface -> rozhranie; definuje rozhranie, s ktorým môže niekto rátať
                  -> zoznam X metod, ktoré sa dajú zavolať, niečo vracajú (proste sa dajú používať)
        Generické typy
 */

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Graduate absolvent = new Graduate("Ing.","Tomas","Kovacik");
        System.out.println(absolvent);


        LinkedList<Znamy> zoznam = new LinkedList<Znamy>();                                // Linked-List
        zoznam.add(new NoZnamy());
        zoznam.add(new Graduate("Ing.","Andrej","Povala"));
        zoznam.add(1, new NoZnamy());
        System.out.println(zoznam.size());
        //zoznam.remove(1);
        //zoznam.remove();                            // odstranim a ziskam prvý prvok (ako fronta)   ->[||||]->
        //zoznam.push();                              // ako fronta
        //zoznam.pop();

        for (int i = 0; i < zoznam.size(); i++) {
            System.out.println(zoznam.get(i).getZnamy());
        }

        for (Znamy prvok : zoznam){
            System.out.println(prvok.getZnamy());
        }

        int i = 0;
        Iterator<Znamy> iterator = zoznam.iterator();
        while (iterator.hasNext()) {
            Iterator<Znamy> prvok = (Iterator<Znamy>) iterator.next();          // vrati nasledujuci prvok a posunie sa dalej
            if (i < 1) {
                System.out.println(prvok.getZnamy());       // neviem čo tu je zle
            } else {
                iterator.remove();
            }
            i++;
        }


        ArrayList zoznam2 = new ArrayList<Znamy>();             // beriem omnoho menej pamäte ako Linked-List a asi aj ako Array

        List<String> cisla = Arrays.asList(new String[] {"One","Two","Three"});      // tu vymenujem prvky, neviem potom doňho pridavať veci
        List<String> cislaMutable = new ArrayList<>(cisla);                         // tu viem aj pridávať prvky
        cislaMutable.add(("Four"));
    }
}

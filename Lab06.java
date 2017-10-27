/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab06;

/**
 *
 * @author t203
 */
public class Lab06 {    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         PositionalList <String> lista = new LinkedPositionalList();
                  Position <String> p0, p1, p2, p3, p4, p5,p6;
                  p0 = lista.addFirst("g");
                  p1 =  lista.addAfter(p0, "f");
                  p2 = lista.addAfter(p1, "b");
                  p4 = lista.addAfter(p2, "c");
                  p5 = lista.addAfter(p2, "d");
                  p3=p2;
                  p6=lista.addAfter(p5, "e");
                  System.out.println("-----LABORATORIO 06-----");  
                   System.out.println(p0.getElement());
                   System.out.println(p1.getElement());
                   System.out.println(p2.getElement());
                   System.out.println(p4.getElement());
                   System.out.println(p5.getElement());
                   System.out.println(p6.getElement());
             String p = null;
             do{
                 try{
                     Position<String> temp = lista.first();
                     p = lista.remove(temp);
                     System.out.println(p);
                     
                   }catch(Exception e){
                     System.out.println ("Fin");
                     p = null;
                     break;
                   }
               } while ( p != null);
     }
}

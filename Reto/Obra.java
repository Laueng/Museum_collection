
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author laura
 */
public class Obra {
    public static ArrayList<Integer> clases(ArrayList<Integer> entrada){
    ArrayList<Integer> salida = new ArrayList<>();    
    for (Integer i: entrada){
        if (!salida.contains(i)){
            salida.add(i);
        }
    } return salida;
 }
  public static ArrayList<Integer> meFaltanDeLaClase(ArrayList<Integer> obrasFalta, ArrayList<Integer>listaCategorias, int categoria){
   
   ArrayList<Integer> salida = new ArrayList<>();
   ArrayList<Integer> nueva = new ArrayList<>();
   for (int i=0; i<listaCategorias.size();i++){
       if(categoria ==listaCategorias.get(i)){
           nueva.add(i);
           
       }
   } 
   for(Integer i:obrasFalta){
       if (nueva.contains(i)){
           salida.add(i);
       }
   }
   return salida;
  } 
  public static ArrayList<Integer> noTengo(ArrayList<Integer> obrasA, ArrayList<Integer> obrasB){
      ArrayList<Integer> salida = new ArrayList<>();
      for (Integer i : obrasA) {
          if (!obrasB.contains(i)){
          salida.add(i);
      }
      }
      return salida;
  }
 public static Integer puedoCambiar(ArrayList<Integer> dupliA, ArrayList<Integer> dupliB){
     int contador = 0;
     if (dupliA.size()>dupliB.size()){
         for (Integer i: dupliB){
             if (!dupliA.contains(i)){
                 contador++;
             }
         }
     }else {
         for (Integer i: dupliA){
             if(!dupliB.contains(i)){
                 contador++;
             }
         }
     }return contador;    
 }     
}
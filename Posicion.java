import java.util.*;
public class Posicion
{
    public static void main (String [] args){
    
        Scanner x=new Scanner (System.in);
        String y;
        int z;
        System.out.println ("Ingrese la cantidad");
        y=x.nextLine();
        char [] array= y.toCharArray();
        
        System.out.println ("Ingrese la posicion de la cifra del cual quiera conocer su valor de izquierda a derecha");
        z= x.nextInt();
        
        
        for (int i=(array.length-z+1);i<array.length;i++){
        array [i]='0';
        }
        
        System.out.println ("El valor de la cifra en la posicion indicada es la siguiente");
        for (int i=(array.length-z);i<array.length;i++){
        System.out.print (array[i]);
        }
    }
    }


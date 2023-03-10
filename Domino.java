package DominoConcentration;

import java.util.*;

/**
 * Crea el dominó que se estará utilizando en el juego Domino Concentration y 
 * contiene las funcionar para generar las fichas, moverlas al azar e
 * imprimirlas en pantalla
 *
 * @author Gael Pastrana
 */
public class Domino
{
    ArrayList <Ficha> lasFichas;
    
    public Domino(){
        lasFichas = new ArrayList<>();
        generarFichas();   
    }
    
    private void generarFichas(){
        for (int i=0; i<=6; i++){
            for (int j=i; j<=6; j++){
                lasFichas.add(new Ficha(i,j));
            }
        }
    }
    
    private void revolverFichas(){
        Collections.shuffle(lasFichas);
    }
    
    public ArrayList getLasFichas(){
        return lasFichas;
    }
    
    @Override
    public String toString(){
        return "Dominó{" + lasFichas + "}";
    }
}
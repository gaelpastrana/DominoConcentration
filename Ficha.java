package DominoConcentration;

/**
 * Clase para modelar una ficha de dominó.
 *
 * @author Gael Pastrana Huizar
 * @version 1
 */
public class Ficha
{
    private int caraSuperior;
    private int caraInferior;
    
    public Ficha(){
        caraSuperior = 0;
        caraInferior = 0;
    }
    
    public Ficha(int caraSuperior, int caraInferior){
        this.caraSuperior = caraSuperior;
        this.caraInferior = caraInferior;
    }
    
    public int sumarPuntos(){
        return caraSuperior + caraInferior;
    }
    
    @Override
    public String toString(){
        return "[" + caraSuperior + "|" + caraInferior + "]";
    }
}

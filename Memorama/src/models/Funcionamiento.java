package models;

import java.util.Random;

/**
 *
 * @author Chico
 */
public class Funcionamiento {
    
    public int[] desordenar() {
        
        int[] numeros = new int[16];
        int count = 0;
        
        while(count < 16) {
            Random rand = new Random();
            int numRand = rand.nextInt(8) + 1;
            int numRepetido = 0;
            
            for (int i = 0; i < 16; i++) {
                if(numeros[i] == numRand) {
                    numRepetido++;
                }
            }
            if(numRepetido < 2) {
                numeros[count] = numRand;
                count++;
            }
        }
        return numeros;
    }
}

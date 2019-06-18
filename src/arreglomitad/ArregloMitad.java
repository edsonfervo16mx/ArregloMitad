/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglomitad;

import java.text.DecimalFormat;

/**
 *
 * @author Fernando
 */
public class ArregloMitad {
    public int[] vector =  new int[5];
    public double[] vector2 = new double[5];
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] vector = {1,2,3,4,5};
        double[] vector2 = {0,0,0,0,0};
        for(int i = 0;i < vector.length;i++){
            vector2[i] = vector[i];
            System.out.println(vector2[i]/2);
        }
    }
    
}

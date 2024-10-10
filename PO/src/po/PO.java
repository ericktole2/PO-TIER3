/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package po;

import java.util.Scanner;

/**
 *
 * @author utpl
 */
public class PO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        bandera = true;
        while (bandera) {
            System.out.println("Ingrese un numero ");
            int n = entrada.nextInt();
            if (n > 0) {
                n = +n;
                
            } else {
                System.out.println("este valor es negativo no se puede sumar");
                
            }
        }
    }
}
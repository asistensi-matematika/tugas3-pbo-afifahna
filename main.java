package tugas3;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author AFIFAH NADHIRAH
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner cie = new Scanner(System.in);
        System.out.println("Input");
        int a = cie.nextInt();
        int b = cie.nextInt();
        double c = cie.nextDouble();
        double d = cie.nextDouble();
        double e = cie.nextDouble();
        double f = cie.nextDouble();
        
        LinearEquation g = new LinearEquation(a, b, c, d, e, f);
        g.perantara();
        g.persamaanE(a, b, e);
        g.persamaanF(c, d, f);
        g.hasilnya();
        g.CekSolusi();
        }
    
}

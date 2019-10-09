package tugas3;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AFIFAH NADHIRAH
 */
public class LinearEquation {
    private int a;
    private int b;
    private double c;
    private double d;
    private double e;
    private double f;
    
    public LinearEquation(){
        a=0;
        b=0;
        c=0;
        d=0;
        e=0;
        f=0;
    }
    public LinearEquation(int a, int b, double c, double d, double e, double f){
        this.a=a;
        this.b=b;
        this.c=c;
        this.d=d;
        this.e=e;
        this.f=f;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getD() {
        return d;
    }

    public void setD(double d) {
        this.d = d;
    }

    public double getE() {
        return e;
    }

    public void setE(double e) {
        this.e = e;
    }

    public double getF() {
        return f;
    }

    public void setF(double f) {
        this.f = f;
    }
 
    public double getX(){
        return ((( e* d) - (b * f)) / ((a * d) - (b * c)));
        }
    
    public double getY(){
        return (((a * f) - (e * c)) / ((a * d) - (b * c)));
    }
    
    public void perantara(){
            System.out.println();
            System.out.println("Output  :");
            System.out.println("Sistem Persamaannya :");
}
    public void persamaanE(int a, int b,double e){
        if(b<0){
            System.out.println(+getA()+"x"+getB()+"y ="+getE());
        }else if(b>=0){
            System.out.println(+getA()+"x+"+getB()+"y ="+getE());
        }
    }
    public void persamaanF(double c, double d, double f){
        if(d<0){
            System.out.println(+getC()+"x"+getD()+"y ="+getF());
        }else if(d>=0){
            System.out.println(+getC()+"x+"+getD()+"y ="+getF());
        }
    }
        public void hasilnya(){
            System.out.println();
            System.out.println("Hasilnya :");
            }
        public void CekSolusi(){
            if ((getA()*getD())-(getB()*getC())==0){
                System.out.println("Sistem tidak memiliki penyelesaian.");
            }else{
                System.out.printf("x ="+"%.2f",getX());
                System.out.printf(", y ="+"%.2f",getY());
            }
    }
}
            
    
    

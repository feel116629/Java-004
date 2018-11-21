package fenshu;

import java.util.Scanner;   //·ÖÊý

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        Fraction a = new Fraction(in.nextInt(), in.nextInt());
        Fraction b = new Fraction(in.nextInt(),in.nextInt());
        a.print();
        b.print();
        a.plus(b).print();
        a.multiply(b).plus(new Fraction(5,6)).print();
        a.print();
        b.print();
        in.close();
	}

}
class Fraction
{
    private int fenzi=0;
    private int fenmu=0;
    public Fraction(int a,int b)
    {
        this.fenzi= a;
        this.fenmu= b; 
    }
    public double toDouble()
    {
        return fenzi*1.0/fenmu;
    }
    public Fraction plus(Fraction r)
    {
        Fraction m=new Fraction(0,1);
        m.fenmu=r.fenmu*fenmu;
        m.fenzi=r.fenzi*fenmu+fenzi*r.fenmu;
        return m;
    }
    public Fraction multiply(Fraction r)
    {
        Fraction m=new Fraction(0,1);
        m.fenmu=r.fenmu*fenmu;
        m.fenzi=r.fenzi*fenzi;
        return m;
    }
    public void print()
    {
        if(fenzi==fenmu)
        {
            System.out.println(1);
        }
        int x=fenzi/gcd(fenzi,fenmu);
        int y=fenmu/gcd(fenzi,fenmu);
        System.out.println(x+"/"+y);
    }
    public static int gcd(int m, int n) 
    {
         while (true) 
        {
         if ((m = m % n) == 0)
         {
             return n;
         }
         if ((n = n % m) == 0)
         {    
             return m;
         }
    } 
    }
}

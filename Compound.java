package cleancode;

import java.util.*;
import java.math.*;
class SimpleInterestProg
{
	int amount,rate,time;
	SimpleInterestProg(int p,int r,int t)
	{
		amount=p;
		rate=r;
		time=t;
	}
	void calculateSimple()
	{
		System.out.println("Simple Interest:"+(amount*rate*time)/100);
	}
}
class CompoundInterestProg
{
	int amount,rate,time,c=0;
	CompoundInterestProg(int p,int r,int t)
	{
		amount=p;
		rate=r;
		time=t;
	}
	void calculateCompound()
	{
		System.out.println("Compound Interest:"+amount*(Math.pow((1 + rate / 100), time)));
	}
}
public class Compound
{
	static
	{
		int p,r,t;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter amount");
		p=sc.nextInt();
		System.out.println("enter rate of interest");
		r=sc.nextInt();
		System.out.println("enter time");
		t=sc.nextInt();
		SimpleInterestProg s=new SimpleInterestProg(p,r,t);
		s.calculateSimple();
		CompoundInterestProg ci=new CompoundInterestProg(p,r,t);
		ci.calculateCompound();
	}
	public static void main(String arg[])
	{
		
	}
}
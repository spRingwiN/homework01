import java.util.Scanner;
public class Fraction{
	private int a;
	private int b;
	public Fraction(int a,int b){
	this.a=a;
	this.b=b;
 }
	public void simple(){
	int k=1;
	for(int i=1;i<=a&&i<=b;i++){
   	if(a%i==b%i){
	k=i;	
    }
	this.a=this.a/k;
	this.b=this.b/k;
   }	
 }

	public double toDouble(){
 	return (double)(a)/b;
 }
	public Fraction plus(Fraction r){
 	int j=a*r.b+r.a*b;
	int k=b*r.b;
	return new Fraction(j,k);
 }
	public Fraction multiply(Fraction r){
	int j=a*r.a;
	int k=b*r.b;
	return new Fraction(j,k);
 }
	public void print(){
	this.simple();
	if(a==b){
	System.out.println("1");
	 }
	else{
	System.out.println(a+"/"+b);
	}
 }
	public static void main(String []args){
	Scanner in =new Scanner(System.in);
	Fraction a =new Fraction(in.nextInt(),in.nextInt());
	Fraction b =new Fraction(in.nextInt(),in.nextInt());
	a.print();
	b.print();
	a.puls(b).print();
	a.multiply(b).plus(new Fraction(5,6)).print();
	a.print();
	b.print();
	in.close();
 }
}

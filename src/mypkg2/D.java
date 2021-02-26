package mypkg2;
import mypkg.B;
public class D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		E e=new E();
		e.disp();
		
	}

}
class E extends B{
	public  void disp() {
		System.out.println(number);
	}
}

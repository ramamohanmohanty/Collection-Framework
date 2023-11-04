interface A {
	void call();
	void fun();
	}
interface B extends A {
	void show();
	}
public class Text1 implements B {
	@Override
	public void call() {
		System.out.println("Hello Ram");
		}
	@Override
	public void fun() {
		System.out.println("I Am Ram");
		}
	@Override
	public void show() {
		System.out.println("I Like Java Technocrat");
		}
	public static void main(String args[]){
		Text1 tt = new Text1();
		tt.call();
		tt.fun();
		tt.show();
		}
	}
package basicprogrm;
	class A{
		void eat() {
			System.out.println("eating");
		}
	}
	class B extends A{
		void sleep() {
			System.out.println("sleeping");
		}
	}
		class C extends A {
			void run() {
				System.out.println("running");
			}
	}
	interface X{
		void show();
	}
	interface Z{
		void dance();
	}
	class D extends C implements X,Z{
		 public void show() {
			System.out.println("Showing");	
		}
		 public void dance() {
			System.out.println("dancing");
		}
	}
	public class Programs1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B o = new B();
		o.sleep();
		o.eat();
         C o1 = new C();
          o1.run();
		 D o2 = new D();
		 o2.show();
		 o2.dance();
	}
}

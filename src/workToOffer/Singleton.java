package workToOffer;

public class Singleton {
	static Singleton single=new Singleton();
	private Singleton()
	{
		System.out.println("这是一个私有构造方法");  
		//创建实例对象并把它赋给静态类型的对象变量single
	}
	public static Singleton getInsances()
	{             //返回类型，为类
		return single;
	}
	 /*Singleton是该方法的返回类型.创建这个方法的目的:
	  * 让main类中用Singleton类名来访问,以此让main类得到Singleton类的实例对象,
	  * 在main类中虽然不能创建Singleton类的实例对象,
	  * 原因是:Singleton对象一运行,Singleton类的构造方法也会随之运行,
	  * 而Singleton类的构造方法是私有的(private),不能被main类访问,
	  * 所以我们把Singleton类定义成静态的,静态之间调用可以直接用类名.
	  * 总之,只要在一个类里声明有private构造方法,
	  * 在别的类中无法对这个类进行实例.这也叫单态模式.
	  * getInsances方法必须为static型,因为它要被main方法访问,
	  * 而main方法考虑到Singleton类中有私有构造方法,不能对Singleton类进行实例化.
	  * 所以main方法只能通过getInsances方法的类名调用getInsances方法.
	  * 但,这前提必须是getInsances是静态型的.*/  
	public String recover() {
		return "收到了！";
	}

	public static void main(String[] args) {
		Singleton sin=new Singleton().getInsances();
		String s=sin.recover();
		System.out.println("s="+s);  
		Singleton sin1=new Singleton().getInsances();
		String s1=sin1.recover();
		System.out.println("s="+s1);  
		
		if (sin==sin1)
		{
			 System.out.println("sin和sin1的内存位置没变,接受的值也没变化");  
        }  
        else  
        {  
            System.out.println("sin和sin1的内存位置有变化!"); 
        }
		
	}
}




//第一种形式: 定义一个类，它的构造函数为private 的，它有一个static的private的该类变量，
//在类初始化时实例话，
//通过一个public的getInstance方法获取对它的引用,继而调用其中的方法。
//public class Singleton {
//private Singleton(){}
////在自己内部定义自己一个实例，是不是很奇怪？
////注意这是private 只供内部调用
//private static Singleton instance = new Singleton();
////这里提供了一个供外部访问本class 的静态方法，可以直接访问
//public static Singleton getInstance() {
//return instance;
//}
//}
//第二种形式:
//public class Singleton {
//private static Singleton instance = null;
//public static synchronized Singleton getInstance() {
////这个方法比上面有所改进，不用每次都进行生成对象，只是第一次
////使用时生成实例，提高了效率！
//if (instance==null)
//instance＝new Singleton();
//return instance;
//}
//}
//其他形式:定义一个类，它的构造函数为private的，所有方法为static的。
//一般认为第一种形式要更加安全些
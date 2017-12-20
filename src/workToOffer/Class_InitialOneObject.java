package workToOffer;

public class Class_InitialOneObject { //Singleton  简单实现单例模式
	private static Class_InitialOneObject singleton=new Class_InitialOneObject();
	//类在建立的时候已经初始化了对象。
	private Class_InitialOneObject() {}   //构造函数私有化
	//故无法随意构建该类的实例，只能通过公共的getInstance方法来获得该类的实例，
	//该方法返回的是静态的成员变量singleton
	//静态成员变量在内存中是仅有一份的，或者说是被共享的，从而保证了该类仅有一个实例。
	//即对于该类的任意两个引用Singleton s1; Singleton s2; 
	//只要不为null， s1==s2必定为true。
	public static Class_InitialOneObject getInstance()   
	{
		System.out.println("singleton");
		return singleton;
	}
	
	public static void main(String []args)
	{
		new Class_InitialOneObject();//类初始化
		Class_InitialOneObject b;
		Class_InitialOneObject a;
//		Class_InitialOneObject b=new Class_InitialOneObject();
		a=Class_InitialOneObject.getInstance();
//		Class_InitialOneObject a=new Class_InitialOneObject();
		b=Class_InitialOneObject.getInstance();
		if (a.equals(b))
		{
			System.out.println("singleton success!");
		}
		else {
			System.out.println("singleton failed!");
		}
	}

}

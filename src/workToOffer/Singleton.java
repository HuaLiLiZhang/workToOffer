package workToOffer;

public class Singleton {
	static Singleton single=new Singleton();
	private Singleton()
	{
		System.out.println("����һ��˽�й��췽��");  
		//����ʵ�����󲢰���������̬���͵Ķ������single
	}
	public static Singleton getInsances()
	{             //�������ͣ�Ϊ��
		return single;
	}
	 /*Singleton�Ǹ÷����ķ�������.�������������Ŀ��:
	  * ��main������Singleton����������,�Դ���main��õ�Singleton���ʵ������,
	  * ��main������Ȼ���ܴ���Singleton���ʵ������,
	  * ԭ����:Singleton����һ����,Singleton��Ĺ��췽��Ҳ����֮����,
	  * ��Singleton��Ĺ��췽����˽�е�(private),���ܱ�main�����,
	  * �������ǰ�Singleton�ඨ��ɾ�̬��,��̬֮����ÿ���ֱ��������.
	  * ��֮,ֻҪ��һ������������private���췽��,
	  * �ڱ�������޷�����������ʵ��.��Ҳ�е�̬ģʽ.
	  * getInsances��������Ϊstatic��,��Ϊ��Ҫ��main��������,
	  * ��main�������ǵ�Singleton������˽�й��췽��,���ܶ�Singleton�����ʵ����.
	  * ����main����ֻ��ͨ��getInsances��������������getInsances����.
	  * ��,��ǰ�������getInsances�Ǿ�̬�͵�.*/  
	public String recover() {
		return "�յ��ˣ�";
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
			 System.out.println("sin��sin1���ڴ�λ��û��,���ܵ�ֵҲû�仯");  
        }  
        else  
        {  
            System.out.println("sin��sin1���ڴ�λ���б仯!"); 
        }
		
	}
}




//��һ����ʽ: ����һ���࣬���Ĺ��캯��Ϊprivate �ģ�����һ��static��private�ĸ��������
//�����ʼ��ʱʵ������
//ͨ��һ��public��getInstance������ȡ����������,�̶��������еķ�����
//public class Singleton {
//private Singleton(){}
////���Լ��ڲ������Լ�һ��ʵ�����ǲ��Ǻ���֣�
////ע������private ֻ���ڲ�����
//private static Singleton instance = new Singleton();
////�����ṩ��һ�����ⲿ���ʱ�class �ľ�̬����������ֱ�ӷ���
//public static Singleton getInstance() {
//return instance;
//}
//}
//�ڶ�����ʽ:
//public class Singleton {
//private static Singleton instance = null;
//public static synchronized Singleton getInstance() {
////������������������Ľ�������ÿ�ζ��������ɶ���ֻ�ǵ�һ��
////ʹ��ʱ����ʵ���������Ч�ʣ�
//if (instance==null)
//instance��new Singleton();
//return instance;
//}
//}
//������ʽ:����һ���࣬���Ĺ��캯��Ϊprivate�ģ����з���Ϊstatic�ġ�
//һ����Ϊ��һ����ʽҪ���Ӱ�ȫЩ
package workToOffer;

public class Class_InitialOneObject { //Singleton  ��ʵ�ֵ���ģʽ
	private static Class_InitialOneObject singleton=new Class_InitialOneObject();
	//���ڽ�����ʱ���Ѿ���ʼ���˶���
	private Class_InitialOneObject() {}   //���캯��˽�л�
	//���޷����⹹�������ʵ����ֻ��ͨ��������getInstance��������ø����ʵ����
	//�÷������ص��Ǿ�̬�ĳ�Ա����singleton
	//��̬��Ա�������ڴ����ǽ���һ�ݵģ�����˵�Ǳ�����ģ��Ӷ���֤�˸������һ��ʵ����
	//�����ڸ����������������Singleton s1; Singleton s2; 
	//ֻҪ��Ϊnull�� s1==s2�ض�Ϊtrue��
	public static Class_InitialOneObject getInstance()   
	{
		System.out.println("singleton");
		return singleton;
	}
	
	public static void main(String []args)
	{
		new Class_InitialOneObject();//���ʼ��
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

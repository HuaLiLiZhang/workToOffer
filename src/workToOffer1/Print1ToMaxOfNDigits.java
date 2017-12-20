package workToOffer1;
/** 
* Created by zhanghuali on 2017Äê11ÔÂ30ÈÕ. 
*/
public class Print1ToMaxOfNDigits {
	public static void main(String[] args) {
        int n = 2;
        char[] chs = new char[n];
        print ( n,chs,0);
        System.out.println ();
    }

    private static void print(int n,char[] chs,int index){
        if (index == n){
            int i;
            for (i=0;i<index;i++){
                if (chs[i] != '0')
                    break;
            }
            for (;i < index;i++)
                System.out.print (chs[i]);
            System.out.print (" ");
            return;
        }

        for (int i=0;i<=9;i++){
            chs[index] = (char) ('0' + i);
            print ( n,chs,index+1 );
        }
    }

}

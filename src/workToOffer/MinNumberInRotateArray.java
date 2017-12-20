package workToOffer;
/** 
* Created by zhanghuali on 2017年11月27日. 
*/
public class MinNumberInRotateArray {
//	public int minNumberInRotateArray(int [] array) {
//    	if(array==null||array.length==0)
//        {
//            System.out.println("blank array");
//            return -1111;
//        }
//        for(int i=0;i<array.length-1;i++)
//        {
//            if(array[i]>array[i+1])
//            {
//                return array[i+1];
//            }
//        }
//        return array[0];
//    }
	
	
	//second method 二分法
	public int minNumberInRotateArray(int [] array) {
        if(array==null||array.length == 0)
            return 0;

        int pointer1 = 0,pointer2=array.length -1;
        int midPointer = pointer1;

        while (array[pointer1] >= array[pointer2]){
            if(pointer2-pointer1 ==1){
                midPointer = pointer2;
                break;
            }

            midPointer = (pointer1+pointer2)/2;
            if (array[midPointer] == array[pointer1] && array[midPointer] == array[pointer2]) {
               
                return seqSearch(array,pointer1,pointer2);
            }

            if(array[midPointer] >= array[pointer1]){
                pointer1 = midPointer;
            } else {

                pointer2 = midPointer;
            }
        }

        return array[midPointer];
    }

    public int seqSearch(int[] array,int pointer1,int pointer2){
//        System.out.println ("comming here");
        int result = array[pointer1];
        while (pointer1 < pointer2){
            if(result > array[pointer1]){
                result = array[pointer1];
            }
            pointer1++;
        }
        return result;
    }
	
    public static void main(String[]args){
      int[]arr={4,5,6,7,8,0,2,3};
//    	int[]arr={5,5,6,7,8,8};
//    	int []arr= {1,8};
//      int[]arr= {4,4,5,6,7,7,1,1,2,2,3,3};
//    	int[]arr= {1,0,1,1,1};
//    	int []arr= {3,3,3,3};
//    	int []arr= {2,1};
//    	int []arr= {};
//    	int []arr=null;
        int minnumber=new MinNumberInRotateArray().minNumberInRotateArray(arr);
        System.out.println("the min number:"+minnumber);
    }

}

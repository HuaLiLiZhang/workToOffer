package workToOffer;

import java.util.Arrays;

public class TwoDimensionalArraySearch {
	public boolean Find(int target, int [][] array) {
        boolean find=false;
        int rows=array.length;
        int columns=array[0].length;
        int row=0;
        int column=columns-1;
        if(array.length==0)
        {
            return false;
        }
        if (array!=null&&row>=0&&column>=0)
        {
            while(row<rows&&column>=0)
            {
                if(array[row][column]==target)
                {
                    find=true;
                    break;
                }else if(array[row][column]>target){
                    column--;
                }
                else{
                    row++;
                }
            }

        }
                    return find;

    }
    public static void main(String []args)
    {
        int [][] a={{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}};
        System.out.println("a:"+Arrays.deepToString(a));
        //int [][]a={};
        TwoDimensionalArraySearch su=new TwoDimensionalArraySearch();
        boolean result =su.Find(18,a);
        System.out.println("result:"+result);
    }
	
	
	
	
	
//	public boolean Find(int [][] array,int rows ,int columns,int number)
//	{
//		if(array.length==0) {
//			return false;
//		}
//		boolean find=false;
//		if (array!=null&&rows>0&&columns>0)
//		{
////			int row=0;
////			int column=columns-1;
////			while(row<rows&&column>=0)   //从右上角开始查找
////			{
////				if((array[row][column])==number)
////				{
////					find=true;
////					break;
////				}
////			
////			else if (array[row][column]>number) {
////				column--;
////			}
////			else {
////				++row;
////			}
////		}
//			int row=rows-1;
//			int column=0;
//			while(row>=0&&column<columns)  //从左上角开始查找
//			{
//				if (array[row][column]==number) {
//					find=true;
//					if (find==true)
//					{
//						System.out.println("row:"+(row+1)+" column:"+(column+1));
//					}
//					return find;
//				}
//				else if(array[row][column]<number) {
//					column++;
//					
//				}
//				else {
//					row--;
//				}
//			}	
//	}
//			return find; 
//}
//	
//public static void main(String[] args) {
//		int [][] a= {{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}};
//		System.out.println("a:"+Arrays.deepToString(a));//用来打印二维数组
////		System.out.println("a:"+Arrays.toString(a));//只能用来打印一维数组
////		int [][] a ={};
//		TwoDimensionalArraySearch oArraySearch=new TwoDimensionalArraySearch();
//		boolean result= oArraySearch.Find(a, 4, 4, 15);
//		System.out.print("result:"+result);
//		
//	}
	

}

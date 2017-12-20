package workToOffer;
/** 
* Created by zhanghuali on 2017Äê12ÔÂ3ÈÕ. 
*/

import java.util.*;

public class PrintMatrix {
	public ArrayList<Integer> printMatrix(int [][]matrix)
	{
		if(matrix==null)
			return null;
		int rows=matrix.length;
		int columns=matrix[0].length;
//		if(rows<=0||columns<=0)
//			return
		int start=0;
		ArrayList<Integer> mArrayList=new ArrayList<Integer>();
		while(columns>start*2&&rows>start*2)
		{
			printMatrixInCircle(matrix,columns,rows,start,mArrayList);
			++start;
		}
		return mArrayList;
	}
	
	public void printMatrixInCircle(int[][]matrix,int columns,int rows,int start,ArrayList<Integer> arr)
	{
		int endX=columns-1-start;
		int endY=rows-1-start;
		for(int i=start;i<=endX;++i)
		{
			int matri=matrix[start][i];
//			System.out.println(matri);
			arr.add(matri);
		}
		
		if(start<endY)
		{
			for(int  i=start+1;i<=endY;++i)
			{
				int matri=matrix[i][endX];
//				System.out.println(matri);
				arr.add(matri);
			}
		}
		if(start<endX&&start<endY)
		{
			for(int i=endX-1;i>=start;--i)
			{
				int matri=matrix[endY][i];
//				System.out.println(matri);
				arr.add(matri);
			}
		}
		if(start<endX&&start<endY-1)
		{
			for(int i=endY-1;i>=start+1;--i)
			{
				int matri=matrix[i][start];
//				System.out.println(matri);
				arr.add(matri);
			}
			
		}

	}
	public static void main(String[] args) {
		int matrix[][]= {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
//		int matrix[][]= {{1}};
//		int matrix[][]=null;
//		int matrix[][]= {{1,2,3,4}};
//		int matrix[][]= {{1},{2},{3},{4}};
		PrintMatrix p=new PrintMatrix();
		ArrayList<Integer> list=p.printMatrix(matrix);
		if(list==null)
		{
			System.out.println("the null matrix");
		}
		else {
			for(int i=0;i<list.size();i++)
			{
				System.out.print(list.get(i)+"¡¢");
			}
		}
		
	}

}

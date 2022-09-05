//练习一：获取arr数组中所有元素的和。
package com.atguigu.exer;

public class ArrayExer1 {
	public static void main(String[] args) {
		int[][] arr=new int[][]{{3,5,8},{12,9},{7,0,6,4}};
		
		int sum=0;//记录总和
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				sum+=arr[i][j];
			}
		}
		System.out.println("总和为："+sum);
	}

}


/*练习二：
 * 声明：int[] x,y[]; 在给x,y变量赋值以后，
 * x:int型的一维数组，y：int型的二维数组
 * 以下选项允许通过编译的是：
a ) x[0] = y; no
b) y[0] = x; yes
c) y[0][0] = x; no
d) x[0][0] = y; no
e) y[0][0] = x[0]; yes
f) x = y; no
提示：
一维数组：int[] x 或者int x[] 
二维数组：int[][] y 或者 int[] y[] 或者 int y[][]*/


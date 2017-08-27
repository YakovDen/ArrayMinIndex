import java.util.Random;
import java.util.Scanner;

public class ArrayMinIndex {
	
	static int Min(int[] a) {
		int min = a[0];
		int index = 0;
		for (int i = 0; i < a.length; ++i){
			if (a[i] < min){
				min = a[i];
				index = i;
			}
		}
		System.out.println("Минимальное число в массиве Min value = "+min);
		System.out.println("Индекс минимального члена массива MinIndex ="+index);
		return min;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);		
		System.out.println("Введите количество членов массива");
		int n = sc.nextInt();
		int[] mas = new int[n];		
		Random rand = new Random(100);		
		System.out.println("\nРезультирующий массив:");
		for (int i = 0; i < n; i++) {
			mas[i] = rand.nextInt(100);
			System.out.println("mas[" + i + "]=" + mas[i]);
		}
		
		Min(mas);
		System.out.println("\nНаконец-то!");

	}

}

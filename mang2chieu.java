import java.util.Scanner;

public class mang2chieu {
	public static void main(String[] args) {
// khai báo số dòng và số cột cho mảng
		int soDong, soCot;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập vào số dòng của mảng: ");
		soDong = scanner.nextInt();
		System.out.println("Nhập vào số cột của mảng: ");
		soCot = scanner.nextInt();
// khai báo và cấp phát bộ nhớ cho mảng
		int[][] A = new int[soDong][soCot];
		int[] B = new int[soDong];
// Để nhập giá trị các phần tử cho mảng
// chúng ta sẽ sử dụng 2 vòng lặp for
// vòng lặp for bên ngoài sẽ duyệt i từ 0 đến soDong - 1
// và vòng lặp for bên trong sẽ duyệt j từ 0 đến soCot - 1
// mỗi lần như vậy thì sẽ nhập vào phần tử tại vị trí i, j
		for (int i = 0; i < soDong; i++) {
			for (int j = 0; j < soCot; j++) {
				System.out.print("Nhập phần tử thứ [" + i + ", " + j + "]: ");
				A[i][j] = scanner.nextInt();
			}
		}
// hiển thị các phần tử trong mảng vừa nhập
// chúng ta cũng sử dụng 2 vòng lặp for như khi nhập
		System.out.println("Mảng vừa nhập: ");
		for (int i = 0; i < soDong; i++) {
			for (int j = 0; j < soCot; j++) {
				System.out.print(A[i][j] + "\t");
			}
// sau khi viết xong 1 dòng thi xuống hàng
			System.out.println("\n");
		}
//a. Tìm phần tử max, min của ma trận (mảng 2 chiều A)
		int max, min, i, j;
		max = A[0][0];
		min = A[0][0];
		for (i = 0; i < soDong; i++)
			for (j = 0; j < soCot; j++) {
				if (max < A[i][j])
					max = A[i][j];
				if (min > A[i][j])
					min = A[i][j];
			}
		System.out.println("Phần tử max của ma trận là: " + max);
		System.out.println("Phần tử min của ma trận là: " + min);
//b. Đếm xem trong ma trận có bao nhiêu số nguyên tố
		boolean kt;
		int demnt = 0;
		for (i = 0; i < soDong; i++)
			for (j = 0; j < soCot; j++) {
				kt = false;
				for (int k = 2; k <= A[i][j] / 2; k++)
					if (A[i][j] % k == 0) {
						kt = true;
						break;
					}
				if (kt == false) {
					demnt = demnt + 1;
					System.out.print("\t" + A[i][j]);
				}
			}
		System.out.println("\nSố lượng các số nguyên tố trong mảng A là: " + demnt);
//c. Sắp xếp các phần tử trên từng hàng theo thứ tự tăng dần
		int tg, k;
		for (i = 0; i < soDong; i++) {
//Sap xep cac phan tu tren tung hang theo TT tang dan
			for (j = 0; j < soCot - 1; j++)
				for (k = j + 1; k < soCot; k++)
					if (A[i][j] > A[i][k]) {
						tg = A[i][j];
						A[i][j] = A[i][k];
						A[i][k] = tg;
					}
		}
		System.out.println("Mảng sau khi sắp xếp tăng dần trên từng hàng: ");
		for (i = 0; i < soDong; i++) {
			for (j = 0; j < soCot; j++) {
				System.out.print(A[i][j] + "\t");
			}
// sau khi viết xong 1 dòng thi xuống hàng
			System.out.println("\n");

		}

		// d. Tìm phần tử max trên từng cột
		int Max = A[0][0];
		for (i = 0; i < soDong; ++i) {
			for (j = 0; j < soCot; ++j) {

				if (A[i][j] > Max) {
					Max = A[i][j];
				}

			}
		
			System.out.println(" Max la: " + Max);
		}

		// e. Nếu A là ma trận vuông thì tính tổng các phần tử thuộc đường chéo chính, tích các phần tử thuộc đường chéo phụ
		
				if (soDong == soCot) {
					System.out.println("C la ma tran vuong");
				
				int subdcp = 1;// tong duong cheo phu
				int subdcc = 1;//tong duong cheo chinh 
				for(i = 0; i < soDong; i++) {
					for(j = 0; j < soCot; j++) {
						if(j == i - soDong - 1) {
							subdcp *= A[i][j];
						}
					}
				}
				for(i = 0; i < soDong; i++) {
					for(j = 0; j < soCot; j++) {
						subdcc = subdcc * A[i][j];
					}
				}
				System.out.println("Tich duong cheo chinh la: " + subdcc);
				System.out.println("Tich duong cheo phu la: " + subdcp);
			}
			else {
				System.out.println("A khong la ma tran vuong");
			}
					
					
		// f. Tìm phần tử max lẻ, chẵn min của A
					int mAx = 0;
					int mIn = 0;
					for (i = 0; i < soDong; i++)
						for (j = 0; j < soCot; j++) {
							if (mAx < A[i][j] && A[i][j] % 2 == 0)
								mAx = A[i][j];
							if (mIn > A[i][j] && A[i][j] % 2 != 0)
								mIn = A[i][j];
						}
					System.out.println("Phần tử max của ma trận là: " + mAx);
					System.out.println("Phần tử min của ma trận là: " + mIn);
				
		

	}// of void main
}// of class
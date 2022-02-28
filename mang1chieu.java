import java.util.Iterator;
import java.util.Scanner;

public class mang1chieu {
	public static void main(String[] args) {
		int size; // kích thước của mảng
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập vào số phần tử của mảng: ");
		size = scanner.nextInt();
// khai báo và cấp phát bộ nhớ cho mảng
// mảng này có tên là array và kích thước = size
		int[] array = new int[size];
// array.length: trả về kích thước của mảng
// vòng lặp này sẽ duyệt i từ 0 đến chiều dài của mảng - 1
		for (int i = 0; i < size; i++) {
			System.out.println("Nhập vào phần tử thứ " + i + ": ");
			array[i] = scanner.nextInt(); // nhập giá trị cho phần tử
		}
// hiển thị giá trị các phần tử trong mảng
		for (int i = 0; i < size; i++) {
			System.out.println("Phần tử thứ " + i + ": " + array[i]);
		}
		System.out.print("Mảng đã nhập là: ");
		for (int i = 0; i < size; i++) {
			System.out.print("\t" + array[i]);
		}
//a. Tinh tong cac so chan và chia het cho 3
		int tonga = 0;
		int i, j;
		for (i = 0; i < array.length; i++) {
			if (array[i] % 2 == 0 && array[i] % 3 == 0)
				tonga = tonga + array[i];
		}
		System.out.print("\nTong cac so chan va chia het cho 3 la: " + tonga);
//b. Dem xem trong mang co bao nhieu so chinh phuong
		int demb = 0;
		for (i = 0; i < size; i++) {
			if (array[i] == Math.sqrt((double) array[i]) * Math.sqrt((double) array[i])) {
				demb = demb + 1;
				System.out.println(array[i]);
			}

		}
		System.out.println("So luong cac so CP trong mang la: " + demb);
//C. Sap xep cac phan tu cua mang theo thu tu tang dan
		for(i = 0; i < size - 1; i++) {
			for(j = i + 1; j < size; j++) {
				if(array[i] > array[j]) {
					int tmp = array[i];
					array[i] = array[j];
					array[j] = tmp;
				}
			}
		}
		for(i = 0; i < size;i++) {
			System.out.print("\t" + array[i]);
		}
		System.out.print("\n");
		
//d. Tim phan tu max, min
		int max = array[0];//Tim max
		for(i = 0; i < size; i++) {
			if(array[i] > max ) {
				max = array[i];
			}
		}
		System.out.println("max la: " + max);
		int min = array[0];//Tim min
		for(i = 0; i < size; i++) {
			if(array[i] < min) {
				min = array[i];
			}
		}
		System.out.println("min la: " + min);
	//e. Tim phan tu max chan va min le
		int Max = array[0];//Tim max chan
		for(i = 0; i < size; i++) {
			if(array[i] > Max && array[i] % 2 == 0) {
				Max = array[i];
			}
		}
		System.out.println("max chan la: " + Max);
		int Min = array[0];//Tim min le
		for(i = 0; i < size; i++) {
			if(array[i] < Min && array[i] % 2 != 0) {
				Min = array[i];
			}
		}
		System.out.println("min le la: " + Min);
	//f. Kiem tra xem mang ban dau co doi xung khong
		int kt = 1;
		for (i = 0; i < size / 2; i++) {
	        if (array[i] != array [size - i - 1]) {
	            kt = 0;
	            break;
	        }
	    }
	         
	    if (kt == 0) {
	        System.out.println("Mảng một chiều vừa nhập không là mảng đối xứng");
	    } else {
	        System.out.println("Mảng một chiều vừa nhập là mảng đối xứng");
	    }
	
	//g. Tinh trung binh cong cac so nguyen to trong mang
		float demTBC = 0;
		float tinhTBC = 0;
		boolean point;
		for(i = 0; i < array.length; i++) {
			point = false;
			for(j = 2; j <= array.length / 2; j++) {
				if(array[i] % j == 0) {
					point = true;
					break;
				}
				if(point == false) {
					demTBC = demTBC + 1;
					System.out.print("\t" + array[i]);
				}
			}
		}
		System.out.println("\nSố lượng các số nguyên tố trong mảng A là: " + demTBC);
		for(i = 0; i < array.length; i++) {
			tinhTBC = (tinhTBC + array[i]) / demTBC;
		}
		System.out.println("TBC cac so nguyen to co trong mang la: " + tinhTBC);
			
	}//of void main
}//of class
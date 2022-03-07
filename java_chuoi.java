import java.lang.invoke.StringConcatFactory;
import java.util.Scanner;
public class java_chuoi {
	public static void main(String[] args) {
		String ho[] = new String[5];
		String ten[] = new String[5];
		int i, j, n;
		String tg;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap n: ");
		n=scanner.nextInt();
		Scanner scanner1 = new Scanner(System.in);
		for(i=0;i<n;i++)
		{
			System.out.print("Ho sinh vien thu " + i + ": ");
			ho[i] = scanner1.nextLine();
			System.out.print("Ten sinh vien thu " + i + ": ");
			ten[i] = scanner1.nextLine();
		}System.out.println("Danh sách sinh viên vừa nhập: ");for(i=0;i<n;i++)
		{
			System.out.println(ho[i] + " " + ten[i]);
		}for(i=0;i<n-1;i++)for(j=i+1;j<n;j++)
		{
			if (ten[i].compareTo(ten[j]) > 0) {
				tg = ho[i];
				ho[i] = ho[j];
				ho[j] = tg;
				tg = ten[i];
				ten[i] = ten[j];
				ten[j] = tg;
			}
		}
		// Nếu trùng tên -> so sánh họ (tự làm ở nhà)

		System.out.println("Danh sách sinh viên sau khi sắp xêp tăng dần theo tên: ");for(i=0;i<n;i++)
		{
			System.out.println(ho[i] + " " + ten[i]);
		}
		// 2. In ra man hinh danh sach sinh vien co ten la "Phuong"
		System.out.println("Danh sách sinh viên có tên là Phuong: ");for(i=0;i<n;i++)
		{
			// if(ten[i].equalsIgnoreCase("Phuong"))
			if (ten[i].compareTo("Phuong") == 0)
				System.out.println(ho[i] + " " + ten[i]);
		}
		// 3. In ra man hinh danh sach sinh vien trung ho va ten
		System.out.println("Danh sách sinh viên trùng họ và tên: ");
		boolean kt = false;for(i=0;i<n-1;i++)for(j=i+1;j<n;j++)
		// if (ho[i].concat(" " + ten[i]).compareToIgnoreCase(ho[j].concat(" " +
		// ten[j]))==0)
		if(ho[i].equalsIgnoreCase(ho[j])&&ten[i].equalsIgnoreCase(ten[j]))
		{
			System.out.println(ho[i] + " " + ten[i]);
			System.out.println(ho[j] + " " + ten[j]);
			kt = true;
		}if(!kt)
		{
			System.out.println("Không có sinh viên trùng cả họ và tên!");
		}
		//4. In ra màn hình danh sách sinh viên mà trong họ tên có chứa chữ "Vũ"
		System.out.println("Danh sách sinh viên có chữ Vu trong họ tên: ");
		String tam4;
		for (i=0; i<n; i++)
		{
		tam4 = ho[i].concat(" "+ten[i]);
		if (tam4.contains("Vu")==true)
		System.out.println(ho[i] + " " + ten[i]);
		}


		//5. Chuẩn hóa họ và tên: Xóa bỏ dấu cách thừa ở đầu, cuối họ tên; Giữa các từ trong họ tên chỉ cách nhau bởi 1 dấu cách
		// Viết hoa chữ cái đầu của mỗi từ
		String hoTen[] = new String[5];

		for(i = 0; i < n; i++) {
			hoTen[i] = ho[i] + " " + ten[i];
			
			String UpFirst = hoTen[i];
			String[] ars = UpFirst.split(" ");
			String Upfirst1 = "";
			for(String k: ars) {
				Upfirst1 = Upfirst1 +(k.substring(0, 1).toUpperCase() + k.substring(1));
				Upfirst1 = Upfirst1 + " ";
			}
			System.out.println(Upfirst1);
		}
	}
	
	
}

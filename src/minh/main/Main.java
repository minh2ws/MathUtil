/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minh.main;

import static minh.util.MathUtil.computeFactorial;

/**
 *
 * @author minh2ws
 */
public class Main {

    public static void main(String[] args) {
	System.out.println("5!= " + computeFactorial(5));

	System.out.println("5!= " + computeFactorial(5));
	//expected hàm ơi, tao hi vọng mày ói về 120 khi đưa 5 cho mày

	System.out.println("6!= " + computeFactorial(6));
	//expected hàm ơi, tao hi vọng mày ói về 720 khi đưa 6 cho mày

	System.out.println("0!= " + computeFactorial(0));
	//expected hàm ơi, tao hi vọng mày ói về 0 khi đưa 1 cho mày

	System.out.println("1!= " + computeFactorial(1));
	//expected hàm ơi, tao hi vọng mày ói về 1 khi đưa 1 cho mày

	System.out.println("-5!= " + computeFactorial(-5));
	//expected hàm ơi, tao hi vọng mày ói về NGOẠI LỆ khi đưa -5 cho mày

	//phần code của hàm main() ta đang viết kiểu này gọi là test app
	//xem thử cái hàm cF() tính giai thừa chạy có đúng không
	//1. Chuẩn bị data ví dụ 5, 6, 7, 0, 1, 2
	//2. Tính toán trước bằng tay xem 51 là mấy, 61 là mấy, 0! là mấy
	//ví dụ tính trước đc rằng 6! là 720, 720 gọi là giá trị kì vọng
	//					EXPECTED VALUE
	//3. Gọi lệnh, gọi app, gọi hàm chạy thử với data đã chuẩn bị
	//coi xem hàm trả về số mấy kết quả mấy,
	//ví dụ khi chjay hàm cF(6) mà nó trả về 120, thì giá trị trả về
	//khi chạy hàm gọi là ACTUAL VALUE
	//4. Cái hồi, mình phải so sánh xem EXPECTED và ACTUAL có trùng nhau
	//hay không
	//nếu trùng tức là hàm xử lý ra kết quả như mình dự kiến -> hàm chạy
	//							    đúng
	//nếu không trùng: chết mẹ, mình tính sai, hay hàm tính sai, nói chung là sai
	//TEST: BẢN CHẤT LÀ CHẠY THỬ APP/HÀM, SO SÁNH KẾT QUẢ KÌ VỌNG CÓ TRƯỚC
	//VỚI KẾT QUẢ HÀM THỰC SỰ XỬ LÍ VÀ THẢ VỀ
	
	
	//Cách test này đơn giản, nhưng chưa hay
	//vì: mình pahir nhìn kết quả bằng mắt, tự so sánh giữa giá trị trả về của hàm
	//và kì vọng
	//thêm nữa nó không cấm mình disable nút Clean & Build
	//code sai logic mà vẫn ra file .jar, .war
	//ta cần 1 cách khác để đảm bảo chất lượng code ngay khi viết code
	//ta cần dùng thêm thư viện phụ trợ giúp kiểm soát chất lượng code
	//đó là kĩ thuật TDD KÈM UNIT TESTING
	//xài thư viện JUnit, NUnit, TestNG, xUnit, MSUnit, PHPUnit, CPPUnit,...
	//những thư viện này không bắt mình phải so sánh bằng mắt các ACTUAL VS EXPECTED
	//nó tự só sánh giùm và nó QUĂNG VỀ 2 THỨC: XANH VÀ ĐỎ
	//XANH: CODE ỔN
	//ĐỎ: CODE SAI LOGIC
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdd;

import minh.util.MathUtil;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author minh2ws
 */
public class MathUtilTest {

    @Test
    public void testSuccessfulCases() {
	//hàm này test những tính huống thành công tức là đưa đầu vào tử
	//tế cho hàm cF()
	//Assert.assertEquals(55, 55);
	Assert.assertEquals(1, MathUtil.computeFactorial(0));
	Assert.assertEquals(1, MathUtil.computeFactorial(1));
	Assert.assertEquals(2, MathUtil.computeFactorial(2));
	Assert.assertEquals(6, MathUtil.computeFactorial(3));
	Assert.assertEquals(24, MathUtil.computeFactorial(4));
	Assert.assertEquals(120, MathUtil.computeFactorial(5));

    }

    //mỗi @Test biến hàm thành một hàm main() riêng biệt và Shift+F6
    //cmt @Test phế hàm này thành hàm bth, không được chạy trong lần Shift+F6
    //trò này đc thư viện JUnit nó bày ra,, bày thêm màu sắc XANH ĐỎ nữa
    @Test(expected = IllegalArgumentException.class)
    public void failSuccess() {
	//hàm này test những tình huống cà chớn, tức là đưa đầu vòa cà chớn
	//ví dụ cF(-5) sao mà tính được, cF(20) to quá, tràn số của em mất
	//ngoại lệ là 1 thứ không thể so sánh,
	//Exception là 1 tính huống không dự liệu được, do đó nó không có value
	//do đó không thể so sánh được, do đó không thể xài hàm assertEquals()
	//do hàm này nó so sánh theo value để đưa ra màu sắc
	//vậy ta phải xài chiêu khác khi chơi với ngoại lệ
	//tao kì vọng rằng khi đưa ra cF(-5) thì hàm cF() mày sẽ ném ra cái ngoại lệ
	//thông báo rằng tham số cà chớn
	//câu này viết thế nào cho code để ra đwọc màu xanh hay đỏ
	MathUtil.computeFactorial(-5);
    }

}

//dù code bạn sai logic nhưng bạn vẫn ra được file .jar, .war khi Clena & Build
//nuy hiểm, không tốt tẹo nào
//ta sẽ chơi trò disable cái nút bấm clean and build nếu code còn đang màu đỏ
//tức là sai logic do xử lý không như kì vọng
//chơi với junit thì làm được trò này
//chơi truyền thống sout(), JOptionPane, ghi ra file log môn thầy Khánh, thua
//kiểu này cũng ra đc .jar, .war nếu không sai cú pháp
//hãy nhớ 2 con số: NB 8.2 1005, NB 10 trở lên: 1204
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdd;

import org.junit.Test;
import static org.junit.Assert.*;
import static util.MyToys.cF;  //đây là kĩ thuật viết giống C
                               //ở dưới gọi hàm static mà hok thèm chấm


/**
 *
 * @author giao-lang
 */
public class MyToysTest {
    
    //chỗ này dùng để test các hàm ta viết, đảm bảo chất lượng
    //mỗi hàm ta test ta cần chuẩn bị sẵn data, giá trị kì vọng, và chạy thử hàm
    //và xem kq xử lí, và so sánh xem đúng kì vọng ko, ko đúng kì vọng: sai ở data mẫu
    //hay sai ở code
    //ví dụ tui mún kiểm tra coi 5! có trả về 120 hay ko, khi chạy hàm -> 1 test case
    //1 tình huống test
    //login: case 1 -> đúng user/pass -> ok vào đúng trang
    //       case 2 -> đúng user sai pass -> chửi câu gì, ắt hẳn bạn quên mẹ nó pass phải hem??
    //
    
    //tình huống hàm cF() chạy đúng, bản chất mỗi case phải là một hàm, tôi gộp
    @Test  //biến hàm bất kì đi kèm JUnit thành public static void main()
    public void testSuccessfulLower10Cases() {
        assertEquals(1, cF(0)); //hàm so sánh và in ra màu xanh khớp, đỏ nếu ko khớp
                                //thay vì luận bằng mắt
        assertEquals(2, cF(2));
        assertEquals(6, cF(3));
        assertEquals(24, cF(4));
        assertEquals(120, cF(5));
        assertEquals(720, cF(6));
        
    }
    
     @Test  //biến hàm bất kì đi kèm JUnit thành public static void main()
    public void testSuccessfulUpper10Cases() {       
        assertEquals(3_628_800, cF(10));
        assertEquals(39_916_800, cF(11));
    }    
    //ngoại lệ thì sao, ngoại lệ ko phải là 1 value để so sánh
    //nó là cái bất thường nào đó xảy ra, ko ước lượng đc chính xác nó là giá trị gì
    //do đó ko thể so sánh với 1 cái khác, ko xài hàm assertX() đc
    @Test(expected = Exception.class)
    public void testExceptionNegativeCases() {
        cF(-5);
        cF(-6);
    }
    
    @Test(expected = Exception.class)
    public void testExceptionGreater15Cases() {
        cF(16);
        cF(17);
    }
    
}


//Ant chỉ quan tâm code ko sai cú pháp, ko thiếu thư viện, bố ra .jar, .war, .ear, .apk
//lỗi logic nó ko check đc, cụ thể bài này đang đỏ nè

//hãy dạy cho Ant biết cách: code ko sai cú pháp, ko thiếu thư viện import, màu xanj
//của JUnit mới ra đc .jar

//Ant ko thông minh, chỉ biết làm theo những gì nó đc chỉ để làm ở trong file build.xml
//và file build-impl.xml - kịch bản để compile and build

//độ file này 1 chút, độ ở dòng 1005 NetBeans 8, 1204 NetBeans 11


//giống Má khi đi làm dặn mình trong tờ giấy: 4h rửa nồi, đong gạo vo gạo... căn nước cắm
//điện, ấn nút Cook 


//Cấu hình thiết Jenkins chơi đc với Git lấy code
//                                   Ant để biên dịch và đóng gói
//                                   JDK để nó ...
//                                   Email Google gửi mail (Less secure app - Gmail đừng bm quá)

//Tạo jobs/ lịch trình Build đóng gói App
//Create a Jenkins Item


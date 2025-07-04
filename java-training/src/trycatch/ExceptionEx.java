package trycatch;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionEx {

    //throw và throws
    public static int divide(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Không thể chia cho 0");
        }
        return a / b;
    }

    //try/catch khi gọi hàm có thể gây lỗi
    public static void tryCatchExample() {
        try {
            int result = divide(10, 0);
            System.out.println("Kết quả: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Lỗi chia: " + e.getMessage());
        }
    }

    //try-with-resources đọc file
    public static void tryWithResourcesExample() {
        String filePath = "sample.txt"; 

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line = reader.readLine();
            System.out.println("Dòng đầu tiên trong file: " + line);
        } catch (IOException e) {
            System.out.println("Lỗi khi đọc file: " + e.getMessage());
        }
    }

    // Hàm main chạy tất cả
    public static void main(String[] args) {
        tryCatchExample();
        tryWithResourcesExample();
    }
}

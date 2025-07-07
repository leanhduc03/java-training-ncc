package generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenericEx {
    public static void main(String[] args) {
        // Generic Class
        System.out.println("Generic Class:");
        Box<Integer> intBox = new Box<>(100);
        Box<String> stringBox = new Box<>("Xin chào Generic");
        
        System.out.println("Integer Box: " + intBox.getValue());
        System.out.println("String Box: " + stringBox.getValue());
        
        // Generic Method
        System.out.println("\nGeneric Method:");
        String[] stringArray = {"Java", "Python", "C++", "JavaScript"};
        Integer[] intArray = {1, 2, 3, 4, 5};
        
        printArray(stringArray);
        printArray(intArray);
        
        //Upper Bounded Wildcard (? extends T)
        System.out.println("\nUpper Bounded Wildcard (? extends T):");
        List<Integer> intList = Arrays.asList(1, 2, 3, 4, 5);
        List<Double> doubleList = Arrays.asList(1.1, 2.2, 3.3, 4.4, 5.5);
        System.out.println("Tổng của intList: " + sumOfList(intList));
        System.out.println("Tổng của doubleList: " + sumOfList(doubleList));
        
        //Lower Bounded Wildcard (? super T)
        System.out.println("\nLower Bounded Wildcard (? super T):");
        List<Integer> integers = new ArrayList<>();
        addNumbers(integers);
        System.out.println("Các số trong danh sách: " + integers);
        
        //Unbounded Wildcard (?)
        System.out.println("\nUnbounded Wildcard (?):");
        printList(intList);
        printList(Arrays.asList("Java", "Python", "C++"));
        
        //Generic Interface
        System.out.println("\nGeneric Interface:");
        DataProcessor<String> stringProcessor = new StringProcessor();
        stringProcessor.processData("Xử lý dữ liệu kiểu String");
        
        DataProcessor<Integer> intProcessor = new IntegerProcessor();
        intProcessor.processData(100);
    }
    
    // Generic Method
    public static <T> void printArray(T[] array) {
        System.out.print("Mảng: ");
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
    
    // Upper Bounded Wildcard (? extends Number)
    public static double sumOfList(List<? extends Number> list) {
        double sum = 0.0;
        for (Number number : list) {
            sum += number.doubleValue();
        }
        return sum;
    }
    
    // Lower Bounded Wildcard (? super Integer)
    public static void addNumbers(List<? super Integer> list) {
        for (int i = 1; i <= 5; i++) {
            list.add(i);
        }
    }
    
    // Unbounded Wildcard (?)
    public static void printList(List<?> list) {
        System.out.println("Danh sách: " + list);
    }
}

// Generic Class
class Box<T> {
    private T value;
    
    public Box(T value) {
        this.value = value;
    }
    
    public T getValue() {
        return value;
    }
    
    public void setValue(T value) {
        this.value = value;
    }
}

// Generic Interface
interface DataProcessor<T> {
    void processData(T data);
}

// Triển khai Generic Interface
class StringProcessor implements DataProcessor<String> {
    @Override
    public void processData(String data) {
        System.out.println("Xử lý String: " + data.toUpperCase());
    }
}

class IntegerProcessor implements DataProcessor<Integer> {
    @Override
    public void processData(Integer data) {
        System.out.println("Xử lý Integer: " + (data * 2));
    }
}


package collection;

import java.text.NumberFormat;
import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CollectionEx {

    public static void main(String[] args) {
        //Stream API
        Stream();
        
        //So sánh hiệu suất giữa các collection
        comparePerformance();
        
        //So sánh ArrayList và LinkedList
        compareArrayListAndLinkedList();
    }

    private static void Stream() {
        System.out.println("STREAM API ");
        
        // Tạo ArrayList
        List<Person> people = new ArrayList<>();
        people.add(new Person("Nguyễn Văn A", 30, "Hà Nội"));
        people.add(new Person("Trần Thị B", 25, "Hồ Chí Minh"));
        people.add(new Person("Lê Văn C", 35, "Đà Nẵng"));
        people.add(new Person("Phạm Thị D", 28, "Hà Nội"));
        people.add(new Person("Hoàng Văn E", 40, "Hồ Chí Minh"));
        
        //forEach
        System.out.println("Danh sách người:");
        people.forEach(System.out::println);
        
        // filter 
        System.out.println("\nNgười sống ở Hà Nội:");
        people.stream()
                .filter(p -> p.getCity().equals("Hà Nội"))
                .forEach(System.out::println);
        
        // Map 
        System.out.println("\nDanh sách tên của tất cả mọi người:");
        people.stream()
                .map(Person::getName)
                .forEach(System.out::println);
        
        // Reduce 
        System.out.println("\nTổng tuổi của mọi người:");
        int totalAge = people.stream()
                .map(Person::getAge)
                .reduce(0, Integer::sum);
        System.out.println("Tổng tuổi: " + totalAge);
    }
    
    private static void comparePerformance() {
        System.out.println("\nSO SÁNH HIỆU SUẤT GIỮA CÁC COLLECTION ");
        
        int[] sizes = {100000, 1000000};
        
        for (int size : sizes) {
            System.out.println("\nThời gian thêm số phần tử: " + NumberFormat.getInstance().format(size));
            
            // ArrayList
            List<Integer> arrayList = new ArrayList<>();
            long startTime = System.nanoTime();
            for (int i = 0; i < size; i++) {
                arrayList.add(i);
            }
            long endTime = System.nanoTime();
            System.out.println("ArrayList : " + 
                    TimeUnit.NANOSECONDS.toMillis(endTime - startTime) + " ms");
            
            // LinkedList
            List<Integer> linkedList = new LinkedList<>();
            startTime = System.nanoTime();
            for (int i = 0; i < size; i++) {
                linkedList.add(i);
            }
            endTime = System.nanoTime();
            System.out.println("LinkedList : " + 
                    TimeUnit.NANOSECONDS.toMillis(endTime - startTime) + " ms");
            
            // HashSet
            Set<Integer> hashSet = new HashSet<>();
            startTime = System.nanoTime();
            for (int i = 0; i < size; i++) {
                hashSet.add(i);
            }
            endTime = System.nanoTime();
            System.out.println("HashSet : " + 
                    TimeUnit.NANOSECONDS.toMillis(endTime - startTime) + " ms");
            
            // HashMap
            Map<Integer, Integer> hashMap = new HashMap<>();
            startTime = System.nanoTime();
            for (int i = 0; i < size; i++) {
                hashMap.put(i, i);
            }
            endTime = System.nanoTime();
            System.out.println("HashMap : " + 
                    TimeUnit.NANOSECONDS.toMillis(endTime - startTime) + " ms");
            
            // Đo tốc độ truy cập
            System.out.println("\nĐo tốc độ truy cập:");
            
            // ArrayList truy cập
            startTime = System.nanoTime();
            for (int i = 0; i < 10000; i++) {
                int index = (int) (Math.random() * size);
                Integer value = arrayList.get(index);
            }
            endTime = System.nanoTime();
            System.out.println("ArrayList - Thời gian truy cập: " + 
                    TimeUnit.NANOSECONDS.toMillis(endTime - startTime) + " ms");
            
            // HashSet kiểm tra tồn tại
            startTime = System.nanoTime();
            for (int i = 0; i < 10000; i++) {
                int index = (int) (Math.random() * size);
                boolean exists = hashSet.contains(index);
            }
            endTime = System.nanoTime();
            System.out.println("HashSet - Thời gian kiểm tra: " + 
                    TimeUnit.NANOSECONDS.toMillis(endTime - startTime) + " ms");
            
            // HashMap truy cập
            startTime = System.nanoTime();
            for (int i = 0; i < 10000; i++) {
                int index = (int) (Math.random() * size);
                Integer value = hashMap.get(index);
            }
            endTime = System.nanoTime();
            System.out.println("HashMap - Thời gian truy cập: " + 
                    TimeUnit.NANOSECONDS.toMillis(endTime - startTime) + " ms");
        }
    }
    
    private static void compareArrayListAndLinkedList() {
        System.out.println("\nSO SÁNH ARRAYLIST VÀ LINKEDLIST ");
        
        int size = 100000;
        
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();
        
        // Thêm vào cuối
        System.out.println("\nThêm vào cuối:");
        long startTime = System.nanoTime();
        for (int i = 0; i < size; i++) {
            arrayList.add(i);
        }
        long endTime = System.nanoTime();
        System.out.println("ArrayList: " + 
                TimeUnit.NANOSECONDS.toMillis(endTime - startTime) + " ms");
        
        startTime = System.nanoTime();
        for (int i = 0; i < size; i++) {
            linkedList.add(i);
        }
        endTime = System.nanoTime();
        System.out.println("LinkedList: " + 
                TimeUnit.NANOSECONDS.toMillis(endTime - startTime) + " ms");
        
        // Thêm vào đầu
        System.out.println("\nThêm vào đầu:");
        arrayList.clear();
        linkedList.clear();
        
        startTime = System.nanoTime();
        for (int i = 0; i < size; i++) {
            arrayList.add(0, i);
        }
        endTime = System.nanoTime();
        System.out.println("ArrayList: " + 
                TimeUnit.NANOSECONDS.toMillis(endTime - startTime) + " ms");
        
        startTime = System.nanoTime();
        for (int i = 0; i < size; i++) {
            linkedList.add(0, i);
        }
        endTime = System.nanoTime();
        System.out.println("LinkedList: " + 
                TimeUnit.NANOSECONDS.toMillis(endTime - startTime) + " ms");
        
        // Truy cập ngẫu nhiên
        System.out.println("\nTruy cập ngẫu nhiên:");
        startTime = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            int index = (int) (Math.random() * arrayList.size());
            Integer value = arrayList.get(index);
        }
        endTime = System.nanoTime();
        System.out.println("ArrayList: " + 
                TimeUnit.NANOSECONDS.toMillis(endTime - startTime) + " ms");
        
        startTime = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            int index = (int) (Math.random() * linkedList.size());
            Integer value = linkedList.get(index);
        }
        endTime = System.nanoTime();
        System.out.println("LinkedList: " + 
                TimeUnit.NANOSECONDS.toMillis(endTime - startTime) + " ms");
        
        // Duyệt tuần tự
        System.out.println("\nDuyệt tuần tự:");
        startTime = System.nanoTime();
        for (Integer value : arrayList) {
            // Chỉ duyệt
        }
        endTime = System.nanoTime();
        System.out.println("ArrayList: " + 
                TimeUnit.NANOSECONDS.toMillis(endTime - startTime) + " ms");
        
        startTime = System.nanoTime();
        for (Integer value : linkedList) {
            // Chỉ duyệt
        }
        endTime = System.nanoTime();
        System.out.println("LinkedList: " + 
                TimeUnit.NANOSECONDS.toMillis(endTime - startTime) + " ms");
    }
}

class Person {
    private String name;
    private int age;
    private String city;
    
    public Person(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }
    
    public String getName() { return name; }
    public int getAge() { return age; }
    public String getCity() { return city; }
    
    @Override
    public String toString() {
        return name + " (" + age + " tuổi, " + city + ")";
    }
}

package Collection;

import java.util.*;

public class Bai2 {
    static class Student {
        private String student_code; 
        private String name;       
        
        public Student(String student_code, String name) {
            this.student_code = student_code;
            this.name = name;
        }
        
        public String getStudent_code() {
            return student_code;
        }
        
        public String getName() {
            return name;
        }
        
        @Override
        public String toString() {
            return "Student{" +
                    "student_code='" + student_code + '\'' +
                    ", name='" + name + '\'' +
                    '}';
        }
    }
    
    private static String generateRandomString(int length) {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        
        for (int i = 0; i < length; i++) {
            int index = random.nextInt(characters.length());
            sb.append(characters.charAt(index));
        }
        
        return sb.toString();
    }
    
    public static List<Student> createStudentList() {
        List<Student> students = new ArrayList<>();
        
        for (int i = 0; i < 10000; i++) {
            String studentCode = generateRandomString(16);
            String name = "Sinh viên " + (i + 1);
            students.add(new Student(studentCode, name));
        }
        
        return students;
    }
    
    public static List<Student> findStudentsByIds(List<String> ids, List<Student> allStudents) {
        Map<String, Student> studentMap = new HashMap<>();
        
        for (Student student : allStudents) {
            studentMap.put(student.getStudent_code(), student);
        }
        

        List<Student> result = new ArrayList<>();
        
        for (String id : ids) {
            Student student = studentMap.get(id);
            if (student != null) {
                result.add(student);
            }
        }
        
        return result;
    }
    
    public static void main(String[] args) {
        List<Student> students = createStudentList();
        List<String> sampleIds = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            if (i < students.size()) {
                sampleIds.add(students.get(i).getStudent_code());
            }
        }

        List<Student> foundStudents = findStudentsByIds(sampleIds, students);

        System.out.println("Tìm thấy " + foundStudents.size() + " sinh viên");
        
        for (int i = 0; i < Math.min(3, foundStudents.size()); i++) {
            System.out.println(foundStudents.get(i));
        }
    }
}

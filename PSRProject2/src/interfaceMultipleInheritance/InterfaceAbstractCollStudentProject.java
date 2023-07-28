package interfaceMultipleInheritance;


interface Learnable {
 void learnCoding();
 void learnProgrammingLanguage();
 void contribute();
}

//Abstract class Student implementing from Learnable interface
abstract class Student implements Learnable {
 private String name;

 // Constructor for the Student class
 public Student(String name) {
     this.name = name;
 }

 // Getter method to retrieve the name of the student
 public String getName() {
     return name;
 }

 // Overriding the methods
 @Override
 public void learnCoding() {
     System.out.println(name + " says: Let's make coding a habit with the college");
 }

 @Override
 public void learnProgrammingLanguage() {
     System.out.println(name + " says: Let's master all fundamentals of Java with the help of the college");
 }

 // Default implementation for contribute() method
 @Override
 public void contribute() {
     System.out.println(name + " says: Let's help others by contributing to the college");
 }
}

//College class extending the Student abstract class
class College extends Student {
 public College(String name) {
     super(name);
 }

 // Override the contribute() method for College class
 @Override
 public void contribute() {
     System.out.println(getName() + " says: Now let's help others by contributing in the college");
 }
}


public class InterfaceAbstractCollStudentProject {
 public static void main(String[] args) {
    
     College collegeStudent = new College("John");

     // Calls to the multiple functions
     collegeStudent.learnCoding();
     collegeStudent.learnProgrammingLanguage();
     collegeStudent.contribute();
 }
}

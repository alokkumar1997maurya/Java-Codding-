package Array;


//  TO create an Array of Objects 

class student{
    int rollNumber;
    String name ;
    int age;
    student(int rollNumber, String name , int age){
        this.rollNumber=rollNumber;
        this.name=name;
        this.age=age;
    }
}
public class ArrayofObject {
    public static void main(String[] args) {
        student[] arr = new student[5]; 
        arr[0] = new student(1, "Alok",24);
        arr[1] = new student(2, "Vivek",21);
        arr[2] = new student(3, "Vishal",25);
        arr[3] = new student(4, "Vikas",23);
        arr[4] = new student(4, "Ayush",13);
        
        for(int i= 0 ; i<5 ; i++){
       System.out.println( +arr[i].rollNumber + " " + arr[i].name + " " + arr[i].age);
        }
        
    }
    
}

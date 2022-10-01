package Practice;


    class school{
    String name ;
    int age;
    school(String name, int age){
        this.name=name;
        this.age=age;
    }
}
    public class object { 
    public static void main(String[] args) {
        school arr[] = new school[4];
        arr[0] = new school("Alok", 25);
        arr[1] = new school("Vivek", 21);
        arr[2] = new school("Ayush", 14);
        arr[3] = new school("sakshi", 12);
for(int i=0 ; i<arr.length ;i++){
    System.out.println(arr[i].name + " " + arr[i].age);
}
    }
}

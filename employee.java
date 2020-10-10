public class employee {
     
    String name ; 
    int age ;
    String city ;

    public void display(){
        System.out.println(" The name is " +name);
        System.out.println(" The name is " + age);
        System.out.println(" The name is " + city);

    }

   
    public static void main(String[] args) {
        employee s = new employee();
        s.name = "Antika";
        s.age = 20;
        s.city = "Mumbai";
        s.display();
        employee a = new employee();
        a.name = "jimin";
        a.age = 25;
        a.city = "Busan";
        a.display();
    }

    
    
        


}

    
    
    

    


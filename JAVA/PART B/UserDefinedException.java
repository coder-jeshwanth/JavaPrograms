class NegativeAgeException extends Exception { 
    private int number; 
    
    public NegativeAgeException(int number) { 
        this.number = number; 
    } 
    
    public String toString() { 
        return "Age cannot be negative: " + number; 
    } 
} 

public class UserDefinedException { 
    public static void main(String[] args) { 
        try { 
            int age = getAge(); 
            
            if (age < 0) { 
                throw new NegativeAgeException(age); 
            } 
            
            System.out.println("Age is: " + age); 
        } catch (NegativeAgeException e) { 
            System.out.println(e); 
        } 
    } 
    
    public static int getAge() { 
        return -6; 
    } 
}
 
 
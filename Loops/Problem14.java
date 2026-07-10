//Print all the even numbers between 1 and 100 using continue statements
public class Problem14 {
    public static void main(String[] args) {
       for(int i =1; i<=100; i++){
        if(i%2!=0){
            continue;
        } 
        System.out.print(i+" ");

       }
    }
}

public class Constructor {
    public static void main(String[] args) {
        var h1=new  Human(10,52);
    }
}
class Human{
    Human(int a, int b){
        System.out.println("Sum= "+(a*b));
    }
    Human(int a, int b,int c){
        System.out.println("Sum= "+(a*b+c));
    }
}
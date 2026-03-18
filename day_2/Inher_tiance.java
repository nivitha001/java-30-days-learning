class vehicle{
    int speed=100;
}
class car extends vehicle{
    void display(){
        System.out.println("speed :"+speed);
    }
}
public class Inher_tiance{
    public static void main(String[] args) {
       car s1=new car();
        s1.display();
    }
}
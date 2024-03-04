package SuperKeyword;

public class HomePage2 extends WebPage {


    public HomePage2(int i){
        super();
        System.out.println("HomePage Constructor " + i );
    }

    public HomePage2(){
        System.out.println(" HomePage Default Constructor " );
    }
    public int speed = 10;

    public void calculateTimeout(){
        System.out.println("Webpage Timeout");
    }

}

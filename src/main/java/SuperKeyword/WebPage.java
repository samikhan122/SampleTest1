package SuperKeyword;

public class WebPage {

    public WebPage(int i){
        System.out.println("Webpage Constructor " + i );
    }

    public WebPage(){
        System.out.println("default Constructor " );
    }
    public int speed = 10;

    public void calculateTimeout(){
        System.out.println("Webpage Timeout");
    }
    public final void logo(){
        System.out.println("Webpage Logo");
    }
}

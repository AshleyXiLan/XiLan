package demo;

public class Initail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Telphone tel1= new Cellphone();
      tel1.call();
      tel1.message();
      Telphone tel2 = new Smartphone();
      tel2.call();
      tel2.message();
      
      IPlayGame ip1 = new Smartphone();
      ip1.IPlayGame();
      IPlayGame ip2 = new Psp();
    ip2.IPlayGame();
       
    
    IPlayGame ip3 = new IPlayGame(){
    	public void IPlayGame() {
    		System.out.println("use non name interface to print out");
    	}
    };
    ip3.IPlayGame();
    
    
    new IPlayGame() {
    	public void IPlayGame() {
    		System.out.println("use non name interface2 to print out");
    	}
    }.IPlayGame();
      }

}

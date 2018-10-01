package demo;

public class Smartphone extends Telphone implements IPlayGame{

	@Override
	public void call() {
		// TODO Auto-generated method stub
		System.out.println("Through voice");
	}

	@Override
	public void message() {
		// TODO Auto-generated method stub
		System.out.println("Through voice");
	}

	@Override
	public void IPlayGame() {
		// TODO Auto-generated method stub
		System.out.println("can play game");
	}

}

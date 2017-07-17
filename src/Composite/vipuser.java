package Composite;

public class vipuser implements user {
	private int level;
	
	vipuser(int level){
		this.level = level;
	}
	
	
	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("play level");
	}

}

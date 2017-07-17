package Singleton;

public class Singleton {
	private static Singleton instance = null;
	public Singleton(){}
	protected static Singleton getInstance(){
		if(instance == null){
			synchronized(Singleton.class){
				if (instance == null){
					instance = new Singleton();
				}
			}
		}
		return instance;
	}
}

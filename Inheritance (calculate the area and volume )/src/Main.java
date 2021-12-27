
class Area{
	private int l,w;
	
	void setL(int l) {
		this.l=l;
	}
	
	void setW(int w) {
		this.w=w;
	}
	
	int getL() {
		return l;
	}
	
	int getW() {
		return w;
	}
	
	void setData(int l,int w) {
		this.l=l;
		this.w=w;
	}
	
	int getArea() {
		return l*w;
	}
}

class Volume extends Area{
	private int v;
	
	public void setData(int l,int w,int v) {
		setData(l,w);
		this.v=v;
	}
	
	int getVolume() {
		return getArea()*v;
	}
}
public class Main {
	
	public static void main(String[] args) {
		Volume v = new Volume();
		v.setData(5,5,5);
		System.out.println("Area : "+v.getArea());
		System.out.println("Volume : "+v.getVolume());
		
	}

}

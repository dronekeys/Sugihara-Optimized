import java.util.*;
public class Sensor {
	private int x;
	private int y;
	private int z;
	public Sensor(int seed){
	    Random sensor=new Random(seed);
	    x=sensor.nextInt(101)-50;
	    y=sensor.nextInt(101)-50;
	    z=sensor.nextInt(50)+1;
	}
	public Sensor(int x, int y, int z){
		this.x=x;
		this.y=y;
		this.z=z;
	}
	public int getX(){
		return this.x;
	}
	public int getY(){
		return this.y;
	}
	public int getZ(){
		return this.z;
	}
	public double getDis(Sensor sensor){
		double distance;
		int xaxis=getX()-sensor.getX();
		int yaxis=getY()-sensor.getY();
		int zaxis=getZ()-sensor.getZ();
		distance=Math.sqrt(xaxis*xaxis+yaxis*yaxis+zaxis*zaxis);
		return distance;
	}
	public String toString(){
		return "["+getX()+","+getY()+","+getZ()+"]";
	}
}


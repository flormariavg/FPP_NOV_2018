package w1l5.problem5;

import java.util.Objects;

public class Computer {

	String manufacture;
	String processor;
	private int ramSize;
	private double processorSpeed;

	public Computer(String manufacture, String processor, int ramSize, double processorSpeed) {
		super();
		this.manufacture = manufacture;
		this.processor = processor;
		this.ramSize = ramSize;
		this.processorSpeed = processorSpeed;
	}
	public double computePower() {
		return (double)ramSize*processorSpeed;
	}
	public double getProcessorSpeed() {
		return processorSpeed;
	}
	public int getRamSize() {
		return ramSize;
	}
	
	@Override
	public String toString() {
		
		return "[Manufacture: "+manufacture+", Pocessor: "+processor
				+", Ram Size: "+String.valueOf(ramSize)+ ", Processor Speed: "
				+String.valueOf(getProcessorSpeed())+", Compute Power:"+computePower()+"]";
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj==null) return false;
		if(!this.getClass().equals(obj.getClass())) return false;		
		Computer c = (Computer)obj;
		return (this.ramSize==c.ramSize && this.processorSpeed==c.processorSpeed);
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return Objects.hash(ramSize, processorSpeed);
	}
	

}

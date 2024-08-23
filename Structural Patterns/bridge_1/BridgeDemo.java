package bridge_1;

interface Remote{
	public void power();
	public void upVolume();
	public void upChannel();
	public void downVolume();
	public void downChannel();
}
 
//abstraction layer
//just call the methods in the implementation layer.
class BasicRemote implements Remote{
	Device device;
	
	BasicRemote(Device device){
		this.device = device;
	}
	
	@Override
	public void power() {
		if (device.isEnabled()) {
			device.disable();
		}
		else {
			device.enable();
		}
	}

	@Override
	public void upVolume() {
		device.setVolume(device.getVolume() + 10);
	}

	@Override
	public void upChannel() {
		device.setChannel(device.getChannel() + 1);
		
	}

	@Override
	public void downVolume() {
		device.setVolume(device.getVolume() - 10);
		
	}

	@Override
	public void downChannel() {
		device.setChannel(device.getChannel() - 1);
		
	}
}


interface Device{
	 public boolean isEnabled();
	 public void enable();
	 public void disable();
	 public int getVolume();
	 public void setVolume(int newVol);
	 public int getChannel();
	 public void setChannel(int newChannel);
	 public void display();
}


//actual implementation
//implementation layer
//do the actual work
class TV implements Device{
	int volume = 22;
	int channel = 2;
	boolean Enable = false;
	@Override
	public boolean isEnabled() {
		return  Enable;
	}
	
	@Override
	public void enable() {
		Enable = true;
	}
	
	@Override
	public void disable() {
		Enable = false;
	}
	
	@Override
	public void setVolume(int vol) {
		if (vol >= 100) {
			this.volume = 100;
		}
		else if (vol <= 0) {
			this.volume = 0;
		}
		else {
			this.volume = vol;
		}
	}
	
	@Override
	public void setChannel(int ch) {
		this.channel = ch;
	}
	
	@Override
	public int getVolume() {
		return this.volume;
	}
	
	@Override
	public int getChannel() {
		return this.channel;
	}
	
	@Override
	public void display() {
		System.out.println("ON: "+ Enable+"\n"
						+"Volume: "+ volume+"\n"
						+"Channel: "+channel);
	}
}


//actual implementation
//implementation layer
//do the actual work
class Radio implements Device{
	int volume = 15;
	int channel = 5;
	boolean Enable = false;
	@Override
	public boolean isEnabled() {
		return  Enable;
	}
	
	@Override
	public void enable() {
		Enable = true;
	}
	
	@Override
	public void disable() {
		Enable = false;
	}
	
	@Override
	public void setVolume(int vol) {
		if (vol >= 30) {
			this.volume = 30;
		}
		else if (vol <= 0) {
			this.volume = 0;
		}
		else {
			this.volume = vol;
		}
	}
	
	@Override
	public void setChannel(int ch) {
		this.channel = ch;
	}
	
	@Override
	public int getVolume() {
		return this.volume;
	}
	
	@Override
	public int getChannel() {
		return this.channel;
	}
	
	@Override
	public void display() {
		System.out.println("ON: "+ Enable+"\n"
						+"Volume: "+ volume+"\n"
						+"Channel: "+channel);
	}
}
	
public class BridgeDemo {
	public static void main (String[] args) {
		Device tv = new TV();
		Remote r = new BasicRemote(tv);
		System.out.println("Before using remote.");
		tv.display();
		r.upChannel();
		r.upVolume();
		System.out.println("After using remote.");
		tv.display();
	}
}

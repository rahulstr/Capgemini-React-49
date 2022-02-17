package capgday2;

public class samsung extends Mobile {

	String model;
	int ram;
	int storage;
	int camera;
	String charge;
	
	public samsung(String model,int ram,int storage,int camera,String charge) {
		this.model=model;
		this.ram=ram;
		this.storage=storage;
		this.camera=camera;
		this.charge=charge;
	}
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public int getStorage() {
		return storage;
	}
	public void setStorage(int storage) {
		this.storage = storage;
	}
	public int getCamera() {
		return camera;
	}
	public void setCamera(int camera) {
		this.camera = camera;
	}
	public String getCharge() {
		return charge;
	}
	public void setCharge(String charge) {
		this.charge = charge;
	}
	

}

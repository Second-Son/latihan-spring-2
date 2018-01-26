package latihanSpring2.impl;

import latihanSpring2.service.HitungServices;
import latihanSpring2.service.HitungVolumeServices;

public abstract class HitungVolumeImpl implements HitungVolumeServices{

	private HitungServices lingkaran;
	
	public void setLingkaran(HitungServices lingkaran) {
		this.lingkaran = lingkaran;
	}
	
	public double HitungLuas(int tinggi, int lebar) {
		// TODO Auto-generated method stub
		return lingkaran.hitungLuas(lebar)*tinggi;
	}

}

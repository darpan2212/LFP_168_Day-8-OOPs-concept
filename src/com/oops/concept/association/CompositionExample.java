package com.oops.concept.association;

class Device {
	public String name;
	public String ram;
	public String rom;

	Device(String name, String ram, String rom) {
		this.name = name;
		this.ram = ram;
		this.rom = rom;
	}
}

class MobileStore {
	private final Device[] mobiles;

	MobileStore(Device[] mobiles) {
		this.mobiles = mobiles;
	}

	public Device[] getTotalMobileInStore() {
		return mobiles;
	}
}

public class CompositionExample {
	public static void main(String[] args) {
		Device mob1 = new Device("Realme6", "8GB", "128GB");
		Device mob2 = new Device("SAMSUNG A21S", "4GB", "128");
		Device mob3 = new Device("SAMSUNG M10", "4GB", "64GB");

		Device[] devices = new Device[] { mob1, mob2, mob3 };

		MobileStore store = new MobileStore(devices);
		Device[] mob = store.getTotalMobileInStore();
		for (Device mb : mob) {
			System.out.println("Name : " + mb.name + " RAM :" + mb.ram + " and " + " ROM : " + mb.rom);
		}
		
		store = null;
		mob = store.getTotalMobileInStore();
		for (Device mb : mob) {
			System.out.println("Name : " + mb.name + " RAM :" + mb.ram + " and " + " ROM : " + mb.rom);
		}
	}
}
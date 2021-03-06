package receiver;

import java.util.ArrayList;

import shipment.Shipment;

public abstract class Receiver {
	
	private ArrayList<Shipment> shipments;         //Shipment associated with this receiver
	private int[] preferredDeliveryTime;
	
	
	public Receiver(int[] preferredDeliveryTime) {
		shipments = new ArrayList<Shipment>();
		this.preferredDeliveryTime=preferredDeliveryTime;
	}
	
	public boolean Recieve(Shipment shipment) {
		return true;
	}

	public ArrayList<Shipment> getShipments() {
		return shipments;
	}

	public void addShipment(Shipment shipment) {
		shipments.add(shipment);
	}

	public int[] getPreferredDeliveryTime() {
		return preferredDeliveryTime;
	}

	
	
}




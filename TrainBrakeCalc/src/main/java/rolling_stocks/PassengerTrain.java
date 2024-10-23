package rolling_stocks;

public class PassengerTrain extends Train {
	int numOfVagons;
	int discBrakesVagons;

	public PassengerTrain(int weight, Locomotive locomotive, int numOfVagons, int discBrakesVagons) {
		super((numOfVagons * 4) + locomotive.getAxles(), weight + locomotive.getWeight(), locomotive);
		this.discBrakesVagons = discBrakesVagons;
	}

	@Override
	void form() {
		numOfHandBrakes = (discBrakesVagons * 2) + (numOfVagons - discBrakesVagons) * 4
				+ getLocomotive().getHAND_BRAKE_AXLES();
	}

}

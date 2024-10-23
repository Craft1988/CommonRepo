package rolling_stocks;

public abstract class Train {

	int axles;
	int weight;
	int numOfHandBrakes;
	BreakEffortCoefficient bCoeff;
	Locomotive locomotive;

	public Train(int axles, int weight, Locomotive locomotive) {
		this.axles = axles;
		this.weight = weight;
		this.locomotive = locomotive;
	}

	abstract void form();

	public Locomotive getLocomotive() {
		return locomotive;
	}

	public int getAxles() {
		return axles;
	}

	public int getWeight() {
		return weight;
	}

	public int getNumOfHandBrakes() {
		return numOfHandBrakes;
	}

	public float  getBrakeKoeff() {
		return bCoeff.getCoeff();
	}
}
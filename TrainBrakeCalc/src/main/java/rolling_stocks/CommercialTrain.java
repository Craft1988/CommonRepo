package rolling_stocks;

public class CommercialTrain extends Train {

	private int numOfEmptyVagons;
	

	public CommercialTrain(int axles, int weight, int numOfEmptyVagons, Locomotive locomotive) {
		super(axles, weight, locomotive);
		if (axles < 100) {
			axles += locomotive.getAxles();
			weight += locomotive.getWeight();
		}
		this.numOfEmptyVagons = numOfEmptyVagons;

	}

	@Override
	void form() {
		if ((numOfEmptyVagons * 4 == getAxles()) && getAxles() < 350) {
			bCoeff = BreakEffortCoefficient.EMPTY_FREIGHT;
		}
		if (getAxles() >= 350 && getAxles() <= 400) {
			bCoeff = BreakEffortCoefficient.OVER_350_LENGTH;
		}
		if (getAxles() > 400) {
			bCoeff = BreakEffortCoefficient.LADEN;
		}

	}

}

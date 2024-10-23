package rolling_stocks;

public enum BreakEffortCoefficient {

	PASSENGER(0.60f), EMPTY_FREIGHT(0.55f), OVER_350_LENGTH(0.44f), LADEN(0.33f);

	private float coeff;

	private BreakEffortCoefficient(float coeff) {
		// TODO Auto-generated constructor stub
		this.coeff = coeff;
	}

	public float getCoeff() {
		return coeff;
	}

}

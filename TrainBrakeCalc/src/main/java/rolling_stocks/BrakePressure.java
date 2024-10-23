package rolling_stocks;

public enum BrakePressure {
	_0D25(0.25f), _3D0(3.0f), _3D5(3.5f), _4D5(4.5f), _5D0(5.0f), _5D5(5.5f);

	private float effort;

	private BrakePressure(float effort) {
		this.effort = effort;
	}

	public float getEffort() {
		return effort;
	}
}

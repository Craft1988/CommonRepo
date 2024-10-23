package rolling_stocks;

public enum Locomotive {
	EP_1(135, "ЭП-1", 6, true, true, false, 1020), EP_2_K(135, "ЭП-2-К", 6, true, false, true, 1020),
	_2ES_5K(284, "2ЭС-5К", 8, false, true, false, 1050), _3ES_4K(310, "3ЕС-4К", 12, false, false, true, 1050);

	private final int HAND_BRAKE_AXLES = 2;
	private int weight;
	private String model;
	private int axles;
	private boolean isPassenger;
	private boolean acTracktion;
	private boolean dcTracktion;
	private int airTankVolume;

	private Locomotive(int weight, String model, int axles, boolean isPassenger, boolean acTracktion,
			boolean dcTracktion, int airTankVolume) {
		this.weight = weight;
		this.model = model;
		this.axles = axles;
		this.isPassenger = isPassenger;
		this.acTracktion = acTracktion;
		this.dcTracktion = dcTracktion;
		this.airTankVolume = airTankVolume;
	}
	
	public static String[] getLocoModels() {
		String[] models = new String[Locomotive.values().length];
		int ind = 0;
		for (Locomotive loco : Locomotive.values()) {
			models[ind] = loco.getModel();
			ind++;
		}
		return models;
	}

	public int getWeight() {
		return weight;
	}

	public String getModel() {
		return model;
	}

	public boolean isPassenger() {
		return isPassenger;
	}

	public boolean isAcTracktion() {
		return acTracktion;
	}

	public boolean isDcTracktion() {
		return dcTracktion;
	}

	public int getAxles() {
		return axles;
	}

	public int getHAND_BRAKE_AXLES() {
		return HAND_BRAKE_AXLES;
	}

	public int getAirTankVolume() {
		return airTankVolume;
	}
}

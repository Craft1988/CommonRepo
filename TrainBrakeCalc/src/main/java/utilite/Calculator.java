package utilite;

import rolling_stocks.Train;

class Calculator {
	private static int requiresEffort;
	private static int factEffort;
	private static int requiresHandBrakes;
	private static int emptyAxles;
	private static int ladenAxles;
	private static int factHandBrakes;
	private static Train train;
	
	public Calculator(Train train) {
		Calculator.train = train;
	}
	
	public static void calculate() {
		requiresEffort =  Math.round(train.getWeight() * train.getBrakeKoeff());
		 
	}

}

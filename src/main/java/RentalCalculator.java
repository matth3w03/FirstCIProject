

public class RentalCalculator {

	public static double carRental(String carModel, int duration, boolean firstTimer){
		
		double rentalFees = 0.0;
				
		if (firstTimer){ //first rental
			if (carModel.equals("Honda Fit"))
				rentalFees = 65.0*duration*0.95;
			else
				rentalFees = 80.0*duration*0.95;
		}
		else { //subsequent rental 
			if (carModel.equals("Honda Fit") && (duration >= 3))
				rentalFees = 65.0*duration*0.90;
			else if (carModel.equals("Honda Fit") && (duration <= 3))
				rentalFees = 65.0*duration;
			else if (carModel.equals("Toyota Wish") && (duration >= 3))
				rentalFees = 80.0*duration*0.90;
			else
				rentalFees = 80.0*duration;
		}
			
		return rentalFees;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Honda, firsttime, 1D : " + RentalCalculator.carRental("Honda Fit", 1, true));
		System.out.println("Toyota, firsttime, 1D : " + RentalCalculator.carRental("Toyota Wish", 1, true));
		System.out.println("Honda, subsequent, 5D : " + RentalCalculator.carRental("Honda Fit", 5, false));
		System.out.println("Toyota, subsequent, 5D : " + RentalCalculator.carRental("Toyota Wish", 5, false));
		System.out.println("Honda, subsequent, 3D : " + RentalCalculator.carRental("Honda Fit", 3, false));
		System.out.println("Toyota, subsequent, 3D : " + RentalCalculator.carRental("Toyota Wish", 3, false));
	}
}


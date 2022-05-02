package lesson3.labs.prob4;

public class Admin {
	public static double computeTotalRent(Object[] properties) {
		double totalRent = 0;
		for (Object o : properties) {
			totalRent += ((Shelter) o).computeRent();
		}
		return totalRent;
	}
}
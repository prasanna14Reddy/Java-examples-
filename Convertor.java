public class Convertor {
	
	    // Method to convert kilometers to miles
	    public double convert(double kilometers) {
	        return kilometers * 0.621371;
	    }

	    // Method to convert miles to kilometers
	    public double convert(int miles) {
	        return miles * 1.60934;
	    }
	


	public static void main(String[] args) {
		Convertor converter = new Convertor();

        double miles1 = converter.convert(10.0); // Calls the convert() method with a double parameter
        double kilometers = converter.convert(20); // Calls the convert() method with an int parameter
    
  System.out.println(miles1);
  System.out.println(kilometers);
	}

}

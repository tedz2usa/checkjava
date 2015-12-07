


public class Checkjava {

	public static void main(String args[]) {
		String vendor = System.getProperty("java.vendor");
		String vendorURL = System.getProperty("java.vendor.url");
		String version = System.getProperty("java.version");

		System.out.println();
		System.out.println("java.vendor:      " + vendor);
		System.out.println("java.vendor.url:  " + vendorURL);
		System.out.println("java.version:     " + version);
		System.out.println();
	}


}


package utilitats;
){}

public String readString(String msg) {
	System.out.println(msg);
	String f;
	try {
		f = br.readLine();
		return f;
	} catch (IOException e) {
		e.printStackTrace();
	}
	return null;
}

@SuppressWarnings("null")
public char readChar(String msg) {
	System.out.println(msg);
	char c;
	try {
		c = br.readLine().charAt(0);
		return c;
	} catch (IOException e) {
		e.printStackTrace();
	}
	return ((Character) null);
}

public int readInt(String msg) {
	int n;
	boolean isTrue = false;
	while(!isTrue) {
		try {
			System.out.println(msg);
			n = Integer.parseInt(br.readLine());
			isTrue = true;
			return n;
		} catch (Exception e) {
			System.out.println("Error!");
		} 
	}
	return 0;
}

public double readDouble(String msg) {
	double n;
	boolean isTrue = false;
	while(!isTrue) {
		try {
			System.out.println(msg);
			n = Double.parseDouble(br.readLine());
			isTrue = true;
			return n;
		} catch (Exception e) {
			
		}
			public class prova {

	public static void main(String[] args) {
		Keyboard k = new Keyboard();
		System.out.println(k.readDouble("Read"));
	}
	
}

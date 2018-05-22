public class Stock {
	private String symbol;
	private double price;
	private int shares;
	private char exchange;

	public Stock () {
		symbol = "";
		price = 0.0;
		shares = 0;
		exchange = ' ';
	}

	public Stock (String sy, double p, int s, char e) {
		symbol = sy;
		price = p;
		shares = s;
		exchange = e;
	}

	public void symbol (String sy) {
		symbol = sy;
	}
	public void price (double p) {
		price = p;
	}
	public void shares (int s) {
		shares = s;
	}
	public void symbol (char e) {
		exchange = e;
	}

	public String symbol () {
		return symbol;
	}
	public double price () {
		return price;
	}
	public int shares () {
		return shares;
	}
	public char exchange () {
		return exchange;
	}
}
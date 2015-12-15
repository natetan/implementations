import java.util.ArrayList;
import java.util.List;

public class Nums {

	private int num;

	public Nums(int num) {
		this.num = num;
	}

	public int getMaxDigit(int n) {
		n = Math.abs(n);
		if (n / 10 == 0) {
			return n % 10;
		} else {
			return Math.max(n % 10, getMaxDigit(n / 10));
		}
	}

	public int getMinDigit(int n) {
		n = Math.abs(n);
		if (n / 10 == 0) {
			return n % 10;
		} else {
			return Math.min(n % 10, getMinDigit(n / 10));
		}
	}

	public String createNumSequence(int n) {
		if (n < 1) {
			throw new IllegalArgumentException("Number must be at least 1");
		}
		if (n == 1) {
			return n;
		} else {
			return createNumSequence(n - 1) + ", " + n;
		}
	}

	public boolean isSorted(int n) {
		if (n < 0) {
			n = n * -1;
		}
		if (n / 10 == 0) {
			return true;
		} else {
			if (n % 10 < n / 10 % 10) {
				return false;
			} else {
				return true;
			}
		}
	}

	public int getRunningSum(int n) {
		this.negativeCheck(n);
		if (n / 10 == 0) {
			return n;
		} else {
			return n % 10 + getRunningSum(n / 10);
		}
	}

	public int getCount(int n) {
		this.negativeCheck(n);
		if (n / 10 == 0) {
			return 1;
		} else {
			return 1 + getCount(n / 10);
		}
	}

	public ArrayList<Integer> toArray(int n) {
		
	}

	public int reverse(int n) {

	}

	public int getMode(int n) {

	}

	public int getMedian(int n) {

	}

	public int getAverage(int n) {

	}

	public String toString(int n) {
		return n + "";
	}

	private void negativeCheck(int n) {
		if (n < 0) {
			throw new IllegalArgumentException("Number can't be negative");
		}
	}
}
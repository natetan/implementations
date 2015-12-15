public class YulongList {
	private int data;
	private int[] list;

	public YulongList(String s) {
		this(s, Integer.MAX_VALUE);
	}

	public YulongList(String s, int size) {
		if (size < 0) {
			throw new IllegalArgumentException("Size can't be negative");
		}
		String[] list = new String[size];
	}

	public YulongList(int n) {
		this(n, Integer.MAX_VALUE);
	}

	public YulongList(int n, int size) {
		if (size < 0) {
			throw new IllegalArgumentException("Size can't be negative");
		}
		int[] list = new int[size];
	}

	public YulongList(boolean b) {
		this(b, Integer.MAX_VALUE);
	}

	public YulongList(boolean b, int size) {
		if (size < 0) {
			throw new IllegalArgumentException("Size can't be negative");
		}
		boolean[] list = new boolean[size];
	}

	public void add(String s) {
		
	}
}
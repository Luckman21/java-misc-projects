public class Node {
	public int freq;
	public char value;
	public Node leftNode;
	public Node rightNode;

	public Node(int n) {
		this.freq = n;
	}

	public Node(char a, int n) {
		this.value = a;
		this.freq = n;
	}

	public void setFreq(int n) {
		this.freq = n;
	}

	public void setValue(char a) {
		this.value = a;
	}
}
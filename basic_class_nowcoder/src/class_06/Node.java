package class_06;

import java.util.ArrayList;
/**
 * 
 * 图的节点
 *
 */
public class Node {
	public int value;
	public int in;//入度
	public int out;//出度
	public ArrayList<Node> nexts;//下一级节点
	public ArrayList<Edge> edges;//边

	public Node(int value) {
		this.value = value;
		in = 0;
		out = 0;
		nexts = new ArrayList<>();
		edges = new ArrayList<>();
	}
}

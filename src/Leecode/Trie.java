package Leecode;

/**
 * @ Author     ：赵棱泉.
 * @ Date       ：Created in 16:07 2022/2/27
 * @ Description：前缀树
 */
public class Trie {

	class TreeNode {
		TreeNode[] index = new TreeNode[26];
		boolean end;
	}
	TreeNode node;
	public Trie() {
		node = new TreeNode();
	}

	public static void main(String[] args) {
		new Trie().insert("abcd");
		System.out.println(new Trie().startsWith("abcd"));
	}
	public void insert(String word) {
		TreeNode node2=node;
		if (word == null) {
			return;
		}
		char[] word2 = word.toCharArray();
		int index = 0;
		for (int i = 0; i < word2.length; i++) {
			index = word2[i] - 'a';
			if (node2.index[index] == null) {
				node2.index[index] = new TreeNode();
			}
			node2 = node2.index[index];
		}
		node2.end=true;
	}

	public boolean search(String word) {
		TreeNode node2=node;
		char[] chars = word.toCharArray();
		for (int i = 0; i < chars.length; i++) {
			int index = chars[i] - 'a';
			if (node2.index[index] == null) {
				return  false;
			}
			node2 = node2.index[index];
		}
		return node2.end;
	}

	public boolean startsWith(String prefix) {
		TreeNode node2=node;
		char[] chars = prefix.toCharArray();
		for (int i = 0; i < chars.length; i++) {
			int index = chars[i] - 'a';
			if (node2.index[index] == null) {
				return  false;
			}
			node2 = node2.index[index];
		}
		return true;
	}
}

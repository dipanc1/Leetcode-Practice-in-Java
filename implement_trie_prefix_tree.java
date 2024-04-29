import java.util.HashMap;
import java.util.Stack;

class Node1 {
    char data;
    boolean isTerminal;
    HashMap<Character, Node1> hp;

    Node1(char data, boolean isTerminal, HashMap<Character, Node1> hp) {
        this.data = data;
        this.isTerminal = isTerminal;
        this.hp = hp;
    }
}

class Trie {
    static Node1 root;

    public Trie() {
        root = new Node1('.', false, new HashMap<>());
    }

    public void insert(String word) {
        int n = word.length();
        Node1 curr = root;
        for (int i = 0; i < n; i++) {
            char ch = word.charAt(i);
            HashMap<Character, Node1> hp = curr.hp;
            if (hp.containsKey(ch)) curr = hp.get(ch);
            else {
                Node1 x = new Node1(ch, (i == n - 1), new HashMap<>());
                hp.put(ch, x);
                curr = x;
            }
        }
        curr.isTerminal = true;
    }

    public boolean search(String word) {
        Node1 curr = root;
        int n = word.length();
        for (int i = 0; i < n; i++) {
            char ch = word.charAt(i);
            HashMap<Character, Node1> hp = curr.hp;
            if (hp.containsKey(ch)) curr = hp.get(ch);
            else return false;
        }
        return curr.isTerminal;
    }

    public boolean startsWith(String prefix) {
        Node1 curr = root;
        int n = prefix.length();
        for (int i = 0; i < n; i++) {
            char ch = prefix.charAt(i);
            HashMap<Character, Node1> hp = curr.hp;
            if (hp.containsKey(ch)) curr = hp.get(ch);
            else return false;
        }
        return true;
    }
}

public class implement_trie_prefix_tree {
    public static void main(String[] args) {
        Trie obj = new Trie();
        String word = "apple";
        String prefix = "app";
        obj.insert(word);
        boolean param_2 = obj.search(word);
        boolean param_3 = obj.startsWith(prefix);

        System.out.println(param_2 + " " + param_3);
    }
}

package com.company;

public class Main {

    public static void main(String[] args) {
        Tree<Character> tree = new Tree<>();
        System.out.println("Inserting the following values: ");
        char[] data = {'F', 'E', 'H', 'D', 'G', 'C', 'B', 'H', 'K', 'J'};
        for (int i = 1; i <= data.length; i++) {
            char value = data[i - 1];
            System.out.printf("%s ", value);
            tree.insertNode(value);
        }

        System.out.printf("%n%nPreorder traversal%n");
        tree.preorderTraversal();
        System.out.printf("%n%nInorder traversal%n");
        tree.inorderTraversal();
        System.out.printf("%n%nPostorder traversal%n");
        tree.postorderTraversal();
        System.out.println();
    }
}

package com.nonlinear.tree;

class TreeNode {
	int value;
	TreeNode left;
	TreeNode right;

	TreeNode(int value) {
		this.value = value;
	}

}

public class BinaryTreeTraversal {
	// inorder traversal

	public void inorderTraversal(TreeNode root) {
		if (root == null)
			return;

		inorderTraversal(root.left);
		System.out.print(root.value + " "); // 4\
		inorderTraversal(root.right);
	}

	public void preorderTraversal(TreeNode root) {
		if (root == null)
			return;
		System.out.print(root.value + " ");
		preorderTraversal(root.left);
		preorderTraversal(root.right);
	}

	public void postorderTraversal(TreeNode root) {
		if (root == null)
			return;
		postorderTraversal(root.left);
		postorderTraversal(root.right);
		System.out.print(root.value + " ");

	}

	public static void main(String[] args) {

		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);
		root.right.left = new TreeNode(6);
		root.right.right = new TreeNode(7);

		BinaryTreeTraversal bt = new BinaryTreeTraversal();
		System.out.print("Inorder traversal:");
		bt.inorderTraversal(root);
		System.out.println();
		
		System.out.print("Postorder traversal: ");
		bt.postorderTraversal(root);
		System.out.println();
		
		System.out.print("Preorder traversal: ");
		bt.preorderTraversal(root);
		System.out.println();

	}

}

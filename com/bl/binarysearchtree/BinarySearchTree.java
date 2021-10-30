package com.bl.binarysearchtree;

public class BinarySearchTree {

	public static void main(String[] args) {

		BstOperations operation = new BstOperations();
		operation.insert(56);
		operation.insert(30);
		operation.insert(70);
		System.out.println(operation.root.data);
		System.out.println(operation.root.left.data);
		System.out.println(operation.root.right.data);

	}

}

package com.personects.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {

	public static void main(String[] args) {

		ChainValidator chainValidator = new ChainValidator();

		List integers1 = Arrays.asList(36, 6, 24, 4, 47, 2, 3, 27);
		List integers2 = Arrays.asList(4, 6, 24, 65, 3, 5, 100, 1, 0, 35);

		List strs1 = Arrays.asList("abc", "casa", "s", "sapo", "o", "a", "b", "c");
		List strs2 = Arrays.asList("abc", "casa", "b", "r", "i", "s", "n", "h", "sapo", "abobrinha", "p", "o", "a", "b",
				"c");

		List<Node> nodesInteger1 = new ArrayList<>(integers1);
		List<Node> nodesInteger2 = new ArrayList<>(integers2);

		List<Node> nodesStrs1 = new ArrayList<>(strs1);
		List<Node> nodesStrs2 = new ArrayList<>(strs2);

		System.out.println(chainValidator.validate(nodesInteger1));
		System.out.println(chainValidator.validate(nodesInteger2));
		System.out.println(chainValidator.validate(nodesStrs1));
		System.out.println(chainValidator.validate(nodesStrs2));

	}

}

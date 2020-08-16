package principal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Solucoes s = new Solucoes();
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		s.solution(n);
		input.close();
	}
	
}
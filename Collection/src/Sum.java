import java.util.*;
public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 100, sum = 0, i = 1;
        while (i <= n) {
            sum = sum + i;
            i++;
        }
        System.out.println("Sum of natural numbers using while loop is:"+ " " + sum);
	}

}

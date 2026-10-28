/* Ques 8- Problem Description

You are given an integer A in decimal (base 10).
Return a string denoting the binary (base 2) form of the integer A.



Problem Constraints

1 <= A <= 10^9



Input Format

The first line of input contains the integer T, denoting the number of test cases.
Next T lines contain a single integer A, denoting the integer for that test case.



Output Format

Print T lines. In each line, print the string denoting the binary representation of A.



Example Input

Input 1:

 1
 10
Input 2:

 2
 10
 11


Example Output

Output 1:

 1010
Output 2:

 1010
 1011
 */
public class Ques8 {

static String conversion(int A) {
    int i = A;
    String binary = "";

    while (i > 0) {
        binary = (i % 2) + binary;
        i = i / 2;
    }

    return binary;
}

    
}

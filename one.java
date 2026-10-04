import java.util.Scanner;

public class one {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter lower bound of range: ");
int start = sc.hasNextInt() ? sc.nextInt() : 1;
System.out.print("Enter upper bound of range: ");
int end = sc.hasNextInt() ? sc.nextInt() : 500;
System.out.println("Armstrong numbers between " + start + " and " + end + ":");
for (int i = start; i <= end; i++) {
if (isArmstrong(i)) {
System.out.print(i + " ");
}
}
System.out.println();
sc.close();
}

public static boolean isArmstrong(int num) {
int temp = num;
int digits = 0;
while (temp > 0) {
digits++;
temp /= 10;
}
temp = num;
int sum = 0;
while (temp > 0) {
int r = temp % 10;
sum += Math.pow(r, digits);
temp /= 10;
}
return sum == num;
}
}

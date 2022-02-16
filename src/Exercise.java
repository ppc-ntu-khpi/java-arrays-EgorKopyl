//package domain;
import java.io.*; 
public class Exercise {
  
public static void main(String[] args) throws IOException
{
BufferedReader br= new BufferedReader(new InputStreamReader(System.in));//считывание символов 
System.out.println("Enter a number");
int num = Integer.parseInt(br.readLine());//Присваиваем num значение строки которую переобразовали в число 
int number, digit, sum = 0;
number = num;

while (number != 0)
{
digit = number % 10;
sum = sum + digit*digit*digit;
number /= 10;
}

if(sum == num)
System.out.println(num + " is an Armstrong number");

else
System.out.println(num + " is not an Armstrong number");

}
}
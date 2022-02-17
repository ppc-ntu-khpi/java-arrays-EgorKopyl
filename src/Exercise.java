//package domain;
import java.io.*; 
public class Exercise {
  
public static int Armstrong(int num, int number,int digit, int sum)
{

while (number != 0)
{
digit = number % 10;
sum = sum + digit*digit*digit;
number /= 10;
}
}
}
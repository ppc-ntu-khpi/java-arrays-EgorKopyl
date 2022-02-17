import java.io.*; 
public class TestResults {
  
public static void main(String[] args) throws IOException
{
BufferedReader br= new BufferedReader(new InputStreamReader(System.in));//считывание символов 
System.out.println("Enter a number");
int num = Integer.parseInt(br.readLine());//Присваиваем num значение строки которую переобразовали в число 
int number, digit, sum = 0;
number = num;

Exercise.Armstrong(num,number,digit,sum);
if(sum == num)

System.out.println(num + " is an Armstrong number");

else
System.out.println(num + " is not an Armstrong number");

}
}
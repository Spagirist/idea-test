import java.util.*;
public class Main {
    public static void main(String[] args)throws Exception
    {
        Scanner in = new Scanner(System.in);
        System.out.println("How many characters are there in the message?");
        int n = in.nextInt();
        System.out.println("Please input the message.");
        char[] ch = new char[n+1];
        int[] m = new int[n+1];
        for (int i = 0; i <= n; i++){
           ch[i] = (char)System.in.read();             //输入信息
            m[i] = (int)ch[i];                         //获得密码的ASCII码
        }
        int x;
        for (x = 1; x < 26; x++)
        {
            System.out.printf("If the key is to turn %d", x);
            System.out.println(", the answer is");
            for(int i = 0;(m[i] >= 65 && m[i] <= 90)||(m[i] >= 97 && m[i] <= 122);i++)          //除非它是字母我们才理它
            {
                System.out.printf("%c\n", (ch[i]-'A'+x)%26+'A');                          //输出答案
            }
        }
    }
}

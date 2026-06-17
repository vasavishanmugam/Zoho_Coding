import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s=sc.next();
        printLowercaseLetter(s);
    }
    
    
private static void printLowercaseLetter(String s)
    {
        int count=0;
        char c='a';
        char[] charArray = s.toCharArray();
        for(int i=0;i<charArray.length;i++)
        {
            if (charArray[i] >='a' && charArray[i] <='z')
            {
                c=charArray[i];
            }
            else if( isNumber(charArray[i]))
            {
                count =count * 10 + (charArray[i] - '0');
                if (i+1 != charArray.length && isNumber(charArray[i+1]))
                {
                  count =count * 10 + (charArray[i+1] - '0');
                  i++;
                }

                for(int j=0;j<count;j++)
                {
                    System.out.print(c);
                }

                count=0;
            }
        }
    }
    
    private static boolean isNumber(char c)
    {
        if (c >= '0' && c<='9')
        {
            return true;
        }
        
        return false;
    }
}

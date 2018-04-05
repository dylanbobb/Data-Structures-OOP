package querystring;

import java.util.Scanner;

public class QueryString
{
    public static void main(String[] args)
    {
        String query = "first=Mikelast=Jonesid=mike1password=hello";
        Scanner parse = new Scanner(query);
        parse.useDelimiter("&");
        
        while(parse.hasNext())
        {
            System.out.println(parse.next().replace("=",": "));
            System.out.println();
        }
    }
}
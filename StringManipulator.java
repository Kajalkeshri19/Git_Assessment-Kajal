import java.util.*;
public class StringManipulator {
    public String reverseString(String input)
    {
        String reversedStr="";

        for (int i = input.length() - 1; i >= 0; i--)
        {
            reversedStr = reversedStr + input.charAt(i);
        }
        return reversedStr;
    }


    public ArrayList findDuplicates(int arr[])
    {
        ArrayList<Integer> a = new ArrayList<Integer>();

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {

                    if (a.contains(arr[i])) {
                        break;
                    }

                    else {
                        a.add(arr[i]);
                    }
                }
            }
        }

        return a;
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        StringManipulator manipulator = new StringManipulator();
        String input = sc.nextLine();
        String reversedString = manipulator.reverseString(input);
        System.out.println("Original: " + input);
        System.out.println("Reversed: " + reversedString);
        int arr[] = { 10, 11, 9, 12, 10, 6, 9, 12, 11 };
        ArrayList<Integer> a=manipulator.findDuplicates(arr);
        System.out.println(a);
        sc.close();
    }
}

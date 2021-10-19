public class ZMX {
    public static void main(String[] args){
        //Replacing the element
        String str1 = "ABCDERdFGHIJdKLMNOPQRSTdWXYZ";
        String str2 = str1.replace('d', 'X');
        System.out.println(str1);
        System.out.println(str2);
        //Founding the index in a string
        String str3 = "   This is a full stack developement course   ";
        String str4 = "ManUTD";
        //For Spliting the String
        String[] strArr=str3.split(" ");
        for(int f=0;f<strArr.length;f++){
            System.out.println(strArr[f]);
        }
        //Joining The String
        String str5=String.join(" ", "boy","is","coming","here");
        //For Telling the index of an element
        int i=str3.indexOf('f');
        //For telling the element on inputted index
        int output=str4.charAt(2);
        //For telling if the Element is present in the string
        boolean j=str3.contains("full");
        //For removing spaces on both the end
        str3=str3.trim();
        //Output
        System.out.println(i);
        System.out.println(j);
        System.out.println(output);
        System.out.println(str3);
        System.out.println(str5);
    }
}

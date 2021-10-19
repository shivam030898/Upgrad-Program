public class CM {
    public static void main(String[] args){
       String str = "I am a java coder and I like coding in java";
       int maxCount=0;
        char maxChar=' ';
        int count=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!=' '){
                count=0;
                for(int j=0;i<str.length();j++){
                    if(str.charAt(i) == str.charAt(j)){
                        count++;
                        if(count>maxCount){
                            maxCount=count;
                            maxChar = str.charAt(i);
                        }
                    }
                }
            }
        }
        System.out.println("Max Count: "+maxCount);
        System.out.println("Max Count: "+maxChar);
    }
}

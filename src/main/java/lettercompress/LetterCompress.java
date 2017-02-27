package lettercompress;

import java.util.HashMap;
import java.util.Map;

/**
 * Hello world!
 *
 */
public class LetterCompress

{
    Map<String,Integer> strMap = new HashMap<String,Integer>(); ;

    public String compress(String str){
        for(char theChar : str.toCharArray()){
            String myChar = String.valueOf(theChar);
            if(strMap.containsKey(myChar)){
                strMap.put(myChar,strMap.get(myChar)+1);
            }else{
                strMap.put(myChar,1);
            }
        }

        String returnStr="";
        for (Map.Entry<String, Integer> entry : strMap.entrySet())
        {
            returnStr = returnStr+entry.getKey() + entry.getValue();
        }
        return returnStr;
    }

}

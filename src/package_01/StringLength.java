package package_01;

public class StringLength {
    public String shortAndLongWord(String [] strArr){
        String shortWord=strArr[0]; String longWord=strArr[0];
        for (int i = 0; i < strArr.length ; i++) {
            if (strArr[i].length()<shortWord.length()) {
                shortWord=strArr[i];
            }
            if (strArr[i].length()>longWord.length()) {
                longWord=strArr[i];
            }
        }
        return "Short: "+ shortWord+ " Long: "+longWord;
    }
}

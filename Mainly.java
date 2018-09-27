import javax.swing.*;
import java.util.Vector;

public class Mainly {
    private Translator translator = new Translator();
    //   private Vector<Token> token = new Vector<>();
    private String input = "";


    public boolean isNumber(char ch) {
        if (ch >= '0' && ch <= '9')
            return true;
        else return false;
    }


    public boolean isCharSet(char ch) {
        if (ch == '-' || ch == '(' || ch == ')' || ch == '[' || ch == ']' || ch == '{' || ch =='"'
                || ch == '_' || ch == '}' || ch == '+' || ch == '*' || ch == '/' || ch == '%' ||
                ch == '!' || ch == '&' || ch == '|' || ch == '~' || ch == '^' || ch == '-' ||
                ch == '<' || ch == '=' || ch == '>' || ch == ',' || ch == '.' || ch == ':' ||
                ch == ';' || ch == '$' || ch == '?' || ch == '#')
            return true;
        return false;

    }

    public boolean isWord(char ch) {
        // check if ch is a letter
        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))
            return true;
        else return false;
    }

    public boolean isWordFa(char ch) {
        // check if ch is a letter
        if ((ch >='ا' && ch <= 'ی')) {
            return true;
        } else return false;
    }

    public String checkWord_engToFa(String instr) throws Exception {

        String input_word_translate = translator.translate("en", "fa", instr);

        try {
            switch (instr) {
                //keyboards first
                case "abstract":
                    return "انتزاعی";
                case "assert":
                    return " تاکید";
                case "boolean":
                    return "بولی";
                case "break":
                    return "بشکن";
                case "byte":
                    return "بایت";
                case "case":
                    return "مورد";
                case "catch":
                    return "بگیر";
                case "char":
                    return "کاراکتر";
                case "class":
                    return "کلاس";
                case "const":
                    return "ثابت";
                case "continue":
                    return "ادامه_بده";
                case "default":
                    return "پیشفرض";
                case "do":
                    return "انجام_بده";
                case "double":
                    return "اعشاری_بلند";
                case "else":
                    return "وگرنه";
                case "enum":
                    return "قابل_شمارش";
                case "extends":
                    return "گسترش_میدهد";
                case "final":
                    return "نهایی";
                case "finally":
                    return "بالاخره";
                case "float":
                    return "اعشاری";
                case "for":
                    return "برای";
                case "goto":
                    return "برو_به";
                case "if":
                    return "اگر";
                case "implements":
                    return "پیاده_میکند";
                case "import":
                    return "وارد_کن";
                case "instanceof":
                    return "نمونه_از";
                case "int":
                    return "صحیح";
                case "interface":
                    return "اتصال";
                case "native":
                    return "محلی";
                case "new":
                    return "جدید";
                case "package":
                    return "بسته";
                case "private":
                    return "خصوصی";
                case "protected":
                    return "حفاظتی";
                case "public":
                    return "عمومی";
                case "return":
                    return "برگردان";
                case "short":
                    return "کوتاه";
                case "static":
                    return "ایستا";
                case "strictfp":
                    return "نمننننننن";
                case "super":
                    return "مافوق";
                case "switch":
                    return "چابه_جاکن";
                case "synchronized":
                    return "همزمان";
                case "this":
                    return "همین";
                case "throw":
                    return "بینداز";
                case "throws":
                    return "می_انذازد";
                case "transient":
                    return "گذرا";
                case "try":
                    return "امتحان_کن";
                case "void":
                    return "خالی";
                case "volatile":
                    return "فرار";
                case "while":
                    return "وقتی";
                //numbers
                case "println":
                    return "چاپ_کن";


                case"out":
                    return "بده_بیرون" ;
                case "System":
                    return "سیستم" ;
                case "io":
                    return "io";
                case "Scanner":
                   return "اسکن_کننده";
                case"args":
                    return "المان_ها";
                case " String":
                    return "رشته" ;
                default:
                    return input_word_translate;
            }
        } catch (Exception e) {
            return "متغیر_تصادفی";
        }

    }


    //translate to English
    public String checkWord_faToEng(String instr) throws Exception {
        String in1 = instr;

        String input_word_translate = translator.translate("fa", "en", in1);
try {
    switch (in1) {
        //keyboards first
        case "انتزاعی":
            return "abstract";
        case " تاکید":
            return "assert";
        case "بولی":
            return "boolean";
        case "بشکن":
            return "break";
        case "بایت":
            return "byte";
        case "مورد":
            return "case";
        case "بگیر":
            return "catch";
        case "کاراکتر":
            return "char";
        case "کلاس":
            return "class";
        case "ثابت":
            return "const";
        case "ادامه_بده":
            return "continue";
        case "پیشفرض":
            return "default";
        case "انجام_بده":
            return "do";
        case "اعشاری_بلند":
            return "double";
        case "وگرنه":
            return "else";
        case "قابل_شمارش":
            return "enum";
        case "گسترش_میدهد":
            return "extends";
        case "نهایی":
            return "final";
        case "بالاخره":
            return "finally";
        case "اعشاری":
            return "float";
        case "برای":
            return "for";
        case "برو_به":
            return "goto";
        case "اگر":
            return "if";
        case "پیاده_میکند":
            return "implements";
        case "وارد_کن":
            return "import";
        case "نمونه_از":
            return "instanceof";
        case "صحیح":
            return "int";
        case "اتصال":
            return "interface";
        case "محلی":
            return "native";
        case "جدید":
            return "new";
        case "بسته":
            return "package";
        case "خصوصی":
            return "private";
        case "حفاظتی":
            return "protected";
        case "عمومی":
            return "public";
        case "برگردان":
            return "return";
        case "کوتاه":
            return "short";
        case "ایستا":
            return "static";
        //case "strictfp":
        //  return "نمننننننن";
        case "مافوق":
            return "super";
        case "جابه_جاکن":
            return "switch";
        case "همزمان":
            return "synchronized";
        case "همین":
            return "this";
        case "بینداز":
            return "throw";
        case "می_اندازد":
            return "throws";
        case "گذرا":
            return "transient";
        case "امتحان_کن":
            return "try";
        case "خالی":
            return "void";
        case "فرار":
            return "volatile";
        //numbers
        case "وقتی":

            return "while";
        case "چاپ_کن":
            return "println";
        case "المان_ها":
            return "args";
        case"بده_بیرون":
            return "out" ;
        case "سیستم":
            return "System" ;
        case "io":
            return "io";
        case "اسکن_کننده":
            return "Scanner";
        case "رشته" :
            return "String";
        default:

            return input_word_translate;

    }
}catch(Exception e){
    return "variable_x";
}

    }


    public static void main(String[] args) throws Exception {


        gui Gui = new gui();
        Gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Gui.setSize(850, 400);
        Gui.setVisible(true);
    }


    public String lexer(String string) throws Exception {
        int len = string.length();
      //  int i = 0;
        String curr = "";
        String x = "";
        for( int i=0 ; i<string.length() ;  ){

            while((string.charAt(i) != ' ' && string.charAt(i) != '\n' && string.charAt(i) != '\t')){

                if(isWord(string.charAt(i))){
                    curr+=string.charAt(i);
                    i++;
                }
                if(isWordFa(string.charAt(i))){
                    curr+=string.charAt(i);
                    i++;
                }
                else if(isNumber(string.charAt(i))|| isCharSet(string.charAt(i))){
                    x += checkWord_engToFa(curr);
                    x +=string.charAt(i);
                    curr="";
                   i++;
                }
            }

            x+=checkWord_engToFa(curr);
            x+=string.charAt(i);
            curr ="";
            i++;

        }
        return x;
    }



    public String lexerFa(String string) throws Exception {
        int len = string.length();
        //  int i = 0;
        String curr = "";
        String x = "";
        for( int i=0 ; i<string.length() ;  ){

            while((string.charAt(i) != ' ' && string.charAt(i) != '\n' && string.charAt(i) != '\t')){
                if(isWordFa(string.charAt(i))){
                    curr+=string.charAt(i);
                    i++;
                }
                else if(isWord(string.charAt(i))){
                    curr+=string.charAt(i);
                    i++;
                }
                else if(string.charAt(i) == '_'){
                    curr+='_';
                    i++;
                }
                else if(isNumber(string.charAt(i))|| isCharSet(string.charAt(i))){
                    if(!curr.isEmpty()) {
                        x += checkWord_faToEng(curr);

                        curr = "";
                        curr += string.charAt(i);
                        x += curr;
                        curr = "";
                        i++;
                    } else if(curr.isEmpty())
                   {
                        curr += string.charAt(i);
                        x += curr;
                        curr = "";
                        i++;

                    }
                    }

                }

            x+=checkWord_faToEng(curr);
            x+=string.charAt(i);
            i++;

         //  System.out.print((string.charAt(i-1)));
            curr ="";


        }
        return x;
    }

}
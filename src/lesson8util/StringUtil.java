package lesson8util;

public final class StringUtil {
        private StringUtil(){}

    static {//будет выполнено один раз в MathExample,тк является статическим
        System.out.println("alibaba");
    }
        public static String multiplyString(String s,int n){//сигнатура метода(в литературе)
            StringBuffer stringBuffer = new StringBuffer();
            for(int i=0;i<n;i++){
                stringBuffer.append(s);
            }
            return stringBuffer.toString();
        }
}

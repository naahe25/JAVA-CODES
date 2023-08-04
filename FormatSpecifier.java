public class FormatSpecifier {
    
        public static void main(String[] args) {
    
            boolean b = true;
            char c = 'a';
            short s = 32677; //Dynamic Initialization 
            int i = 126587; 
            float f = 20.2f; /*We have To Use f in last for float or else there will be an error */
            double d = 10.2; /*No need To give f in double Because in java decimal number is given in double type in JAVA */
    
    
            System.out.printf("Boolean = %b\n",b);  /**We Use Format Specifier %b, %c, %d, %f, %lf */
            System.out.printf("Char = %c\n",c);
            System.out.printf("Short = %d\n",s);
            System.out.printf("Int = %d\n",i);
            System.out.printf("Float = %.2f\n",f);
            System.out.printf("Double = %f\n",d);
    
    
    
        }
}


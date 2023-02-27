import javax.sound.sampled.SourceDataLine;

public class FirstSteps {
    char letra = 'A';
    /*Variables in "char" are just one letter
    */
    byte small = 10;
    /*Variables in "byte" have a range of -128 to 127. 
     *Only goes for integer numbers.
     */
     short medium = 10000;
    /*Variables in "short" have a range of -32768 to 32767 
     * and also only goes for integer numbers.
     */
    int big = 1000000000;
    /*Variables in "int" have a range of -2 billions to 2 billions.
     * Only integer numbers. 
     */
    long bigger = 10000000000000L;
    /*Variables in "long" have a range of -9 quadrillions to 9 quadrillions
     * Only integer numbers.
     */
    float evenBigger = 10000000000000.5f;
    /*Variables in "float" have a range of 1.4 E-45 to more than 3.4 E+38
     * In "float" we can use floating-point numbers like 1,5.
      */
    double biggest = 1.1;
    /*Variables in "double" have the biggest range and also accepts floating points numbers.
    */    
    boolean trueAndFalse = true;
    /*Variables in boolean are only true and false.
    */
    String nome = "50, Willian";
    /*Variables in "String" can be any character, is basically a text, also the S from String must be in capital.
    */
    String[] armario = {"Willian", "Nascimento", "Silva"};
    /*Array works like a cabinet that can be accessed by the position where it is, starting with 0.
    */
    private String readArray(int index){
        System.out.println("element: " + this.armario[index]);
        return this.armario[index];    
    }
    
    public String readArrayWithValidation(int index){
        if(index >= 0 && index <= (this.armario.length -1)){
            return this.readArray(index);
        };
        return "Não existe";
    }
    
}

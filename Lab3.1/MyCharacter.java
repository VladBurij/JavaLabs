public class MyCharacter {
    private char value;
    
    public MyCharacter() {
        value = ' ';
    }
    public MyCharacter(char val) {
        value = val;
    }
    public char charValue() {
        return value;
    }
    
    public int compareTo(MyCharacter another) {
        if ((this == another) || (this.value == another.value)) {
            return 0;
        }
        else {
            return this.value - another.value;
        }
    }
    
    public boolean equals(Object another) {
        if (this == another) {
            return true;
        }
        else if (!(this instanceof MyCharacter)) {
            return false;
        }
        else if (this.value == ((MyCharacter) another).value) {
            return true;
        }
        else {
            return false;
        }
    }
    
    public boolean isDigit() {
        if (value >= '0' && value <= '9') {
            return true;
        }
        else {
            return false;
        }
    }
    
    public static boolean isDigit(MyCharacter ch) {
        return ch.isDigit();
    }
    public static boolean isLetter(MyCharacter ch) {
        if ((ch.value >= 'a' && ch.value <= 'z') || (ch.value >= 'A' && ch.value <= 'Z')) {
            return true;
        }
        else {
            return false;
        }
    }
    public static boolean isDigitOrLetter(MyCharacter ch) {
        return ch.isDigit() || MyCharacter.isLetter(ch);
    }
}
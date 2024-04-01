import java.math.BigDecimal;
import java.util.Comparator;

public class Arithmetic implements Comparator<Number> {
    Number num1;
    Number num2;
    Class<?> num1Class;
    Class<?> num2Class;

    public Arithmetic(Number x, Number y){
        num1 = x;
        num2 = y;
        num1Class = x.getClass();
        num2Class = y.getClass();
    }

    public Number add(){
        if(num1 instanceof Double || num2 instanceof Double) {
            return num1.doubleValue() + num2.doubleValue();
        } else if(num1 instanceof Float || num2 instanceof Float) {
            return num1.floatValue() + num2.floatValue();
        } else if(num1 instanceof Long || num2 instanceof Long) {
            return num1.longValue() + num2.longValue();
        } else {
            return num1.intValue() + num2.intValue();
        }
    }

    public Number subtract(){
        if(num1 instanceof Double || num2 instanceof Double) {
            return num1.doubleValue() - num2.doubleValue();
        } else if(num1 instanceof Float || num2 instanceof Float) {
            return num1.floatValue() - num2.floatValue();
        } else if(num1 instanceof Long || num2 instanceof Long) {
            return num1.longValue() - num2.longValue();
        } else {
            return num1.intValue() - num2.intValue();
        }
    }

    public Number divide(){
        return num1.doubleValue() / num2.doubleValue();
    }

    public Number multiply(){
        if(num1 instanceof Double || num2 instanceof Double) {
            return num1.doubleValue() * num2.doubleValue();
        } else if(num1 instanceof Float || num2 instanceof Float) {
            return num1.floatValue() * num2.floatValue();
        } else if(num1 instanceof Long || num2 instanceof Long) {
            return num1.longValue() * num2.longValue();
        } else {
            return num1.intValue() * num2.intValue();
        }
    }

    public Number getMin(){
        return compare(num1, num2) == 0 ? num1 : num2;
    }

    public Number getMax(){
        return compare(num1, num2) == 0 ? num2 : num1;
    }


    @Override
    public int compare(Number o1, Number o2) {
        return new BigDecimal(o1.toString()).compareTo(new BigDecimal(o2.toString()));
    }
}

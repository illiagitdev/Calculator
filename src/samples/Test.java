package samples;

import samples.enum_samples.SetValuesStraight;
import samples.enum_samples.in_pakage.Type;

public class Test {
    public static void main(String[] args) {
        System.out.println(SetValuesStraight.FIRST.getI());;
        System.out.println();;
        System.out.println(SetValuesStraight.SECOND.getI());;

        System.out.println(new String("-----------------------------------------------------"));

        System.out.println(Type.FIRST.getInstance().getI());
        System.out.println(Type.SECOND.getInstance().getI());
    }
}

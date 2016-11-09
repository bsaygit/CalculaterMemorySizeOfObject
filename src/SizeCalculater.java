import java.lang.*;
import java.lang.Byte;
import java.lang.reflect.Field;

/**
 * Created by bilalsay on 09.11.2016.
 */
class SizeCalculater {

    SizeCalculater(Object obj) {

        int padding = 0;
        int size = 0;

        for (Field field : obj.getClass().getDeclaredFields()) {

            if (field.getType().equals(Boolean.TYPE)) {
                size += Byt.SBOOLEAN.getByte();
            } else if (field.getType().equals(Byte.TYPE)) {
                size += Byt.SBYTE.getByte();
            } else if (field.getType().equals(Character.TYPE)) {
                size += Byt.SCHAR.getByte();
            } else if (field.getType().equals(Short.TYPE)) {
                size += Byt.SSHORT.getByte();
            } else if (field.getType().equals(Integer.TYPE)) {
                size += Byt.SINT.getByte();
            } else if (field.getType().equals(Float.TYPE)) {
                size += Byt.SFLOAT.getByte();
            } else if (field.getType().equals(Long.TYPE)) {
                size += Byt.SLONG.getByte();
            } else if (field.getType().equals(Double.TYPE)) {
                size += Byt.SDOUBLE.getByte();
            } else if (field.getType() instanceof Object) {
                size += Byt.SOBJECT.getByte();
            }
        }

        padding = (size % 8) == 0 ? 0 : 8 - (size % 8) ;
        System.out.println("Size of object of " + obj.getClass().getName() + " : " + (size) + "\n padding: " + padding + " \n total size : " + (size + padding));
    }
}

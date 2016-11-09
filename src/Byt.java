/**
 * Created by bilalsay on 09.11.2016.
 */
public enum Byt {

    SBOOLEAN(1), SBYTE(1), SCHAR(2), SSHORT(2), SINT(4), SFLOAT(4), SLONG(8), SDOUBLE(8), SOBJECT(16);

    private int byteSize;

    Byt(int size) {
        this.byteSize = size;
    }

    int getByte() {
        return this.byteSize;
    }

}

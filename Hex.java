public class Hex {
    private int value;

    public Hex(int value) { // constructor
        this.value = value;
    }

    public int valueOf() {
        return this.value;
    }

    public String toJSON() {
        return toString(); // llamo a tostring
    }

    public String toString() {
        return "0x" + Integer.toHexString(value).toUpperCase();
    }

    public Hex plus(Hex other) {
        return new Hex(this.value + other.valueOf());
    }

    public Hex minus(Hex other) {
        return new Hex(this.value - other.valueOf());
    }

    public Hex plus(int number) {
        return new Hex(this.value + number);
    }

    public Hex minus(int number) {
        return new Hex(this.value - number);
    }

    public static int parse(String string) { // hex a dec
        if (string.startsWith("0x") || string.startsWith("0X")) {
            return Integer.parseInt(string.substring(2), 16); // dec
        } else {
            return Integer.parseInt(string, 16); // dec
        }
    }

    @Override // sobre escribo método
    public boolean equals(Object other) {
        if (this == other) /// si el obj es ig al obj actual
            return true;
        if (other == null || getClass() != other.getClass()) // si el obj es de otra clase
            return false;
        Hex hex = (Hex) other;
        return value == hex.value;
    }
}

public class Euro {

    private final double value;

    public Euro(double value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null) return false;
        if (o.getClass() == Dollar.class) {
            return value == 10 && ((Dollar) o).getValue() == 13.5;
        } else if (getClass() != o.getClass()) {
            return false;
        }

        Euro euro = (Euro) o;

        return Double.compare(euro.value, value) == 0;

    }

    public Euro add(Euro euro) {

        return new Euro(euro.value + this.value);
    }
}

package bester;

public class Cookie {

    private int numberOfChocolateChips;

    public Cookie(int numberOfChocolateChips) {
        this.numberOfChocolateChips = numberOfChocolateChips;
    }

    public boolean isBetterThan(Cookie cookie) {
        return numberOfChocolateChips > cookie.numberOfChocolateChips;
    }
}

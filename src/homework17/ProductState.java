package homework17;

/*
enam - списк статичних обєктів;
агрегація - об'єкт класу стає полем іншого класу;
 */

public enum ProductState {

    FRESH("Fresh"),
    RIPE("Ripe"),
    UNDERRIPE("Underripe"),
    SPOILED("Spoiled");

    private String state;

    ProductState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}


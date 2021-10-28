public class Player {
    private String _name;
    private EPlayerColour _colour;

    public Player(String name, EPlayerColour colour) {
        this._name = name;
        this._colour = colour;
    }

    public String get_name() {
        return _name;
    }

    public EPlayerColour get_colour() {
        return _colour;
    }
}

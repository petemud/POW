package pow.actions;

/**
 * Created by Olymp on 13.03.15.
 */
public abstract class Action {
    protected final Type type;

    public Action() {
        type = Type.NO_TYPE;
    }

    public Action(Type type) {
        this.type = type;
    }

    public Type getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Action{" +
                "type=" + type +
                '}';
    }
}

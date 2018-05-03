import java.util.Objects;

@FunctionalInterface
public interface Wordship {

    void chant(String name);

    default Wordship again(Wordship w) {
        return (name) -> {
            Objects.requireNonNull(w);
            chant(name);
            w.chant(name);
        };
    }

}

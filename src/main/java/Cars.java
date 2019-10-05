import java.util.List;

public interface Cars {

    String getModel();

    int getHorsePower();

    EngineType getEngineType();

    List<String> getList();

    default boolean hasBrokenEngine() {

        return false;
    }

    void startEngine();


}

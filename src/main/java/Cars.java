public interface Cars {

    String getModel();

    int getHorsePower();

    EngineType getEngineType();

   default boolean hasBrokenEngine(){

       return false;
   }

    void startEngine();


}

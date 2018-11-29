public interface Fly {
    void takeOff();

    void ascend (int meters);

    void descend (int meters);

    void land();

    default void glide() {
        System.out.println("it glides into the air");
    }


}

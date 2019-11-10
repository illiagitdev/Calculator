package lesson15_16;

public class Camera extends Product<Camera> {
    int pix;

    @Override
    public int subCompare(Camera o) {
        return 0;//super.subCompare(o) == 0 && pix == ((Camera) o).pix ? 0 : -1;
    }
}

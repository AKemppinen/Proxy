import java.util.ArrayList;
import java.util.List;

class ProxyExample {
    /**
     * Test method
     */
    public static void main(final String[] arguments) {

        List<Image> images = new ArrayList<>();
        images.add( new ProxyImage("HiRes_10MB_Photo1"));
        images.add( new ProxyImage("HiRes_10MB_Photo2"));

        for (Image image : images) {
            image.showData();
        }
    }
}
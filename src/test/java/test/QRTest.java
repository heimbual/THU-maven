package test;

import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;
import java.net.URLDecoder;

import java.net.URL;
import maven.QRCodeReader;
import org.junit.Test;

public class QRTest {

    @Test
    public void test() throws Exception {
        String resourceName = "qr.png";
        URL resource = ClassLoader.getSystemResource(resourceName);
        String configPath = URLDecoder.decode(resource.getFile(), "UTF-8");

        //ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(configPath);
        String absolutePath = file.getAbsolutePath();
        System.out.println(absolutePath);
        assertTrue(absolutePath.endsWith(".png"));
        //QRCodeReader.decodeQRCode(file);
        QRCodeReader.decodeQRCode(file);

    }

}

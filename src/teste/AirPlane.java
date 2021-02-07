package teste;

import java.io.IOException;

public class AirPlane {
    public AirPlane() throws IOException {
        System.out.print("teste");
        throw new IOException();
    }
}

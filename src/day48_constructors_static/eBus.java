package day48_constructors_static;

import com.sun.xml.internal.ws.api.pipe.Engine;

import java.sql.Driver;

public class eBus {
    fDriver driver;
    gEngine engine;

    @Override
    public String toString() {
        return driver.getName()+" | and bus cylinder is V"+ engine.getCylinder();
    }
}

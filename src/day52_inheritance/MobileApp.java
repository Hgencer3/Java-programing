package day52_inheritance;

public class MobileApp {
    private String name ;
    private String version;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    @Override
    public String toString() {
        return "MobileApp{" +
                "name='" + name + '\'' +
                ", version='" + version + '\'' +
                '}';
    }

    protected boolean download(){
        System.out.println("App: "+name+" version: "+version+" is downloaded");
        return true;
    }

    public  void useTheApp(int minutes){
        System.out.println(name+" is used "+minutes+" minutes");
    }
}

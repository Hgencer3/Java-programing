package day32_arrays_split;

public class fAWSZones {
    public static void main(String[] args) {

        String app="etsy";
        String zones="us-east-1,us-west-2,us-west-1";

        System.out.println("----Starting deploying etsy app to AWS zones----");
        String[] zonesToDeploy=zones.split(",");
        for (String eachZone:zonesToDeploy){
            System.out.println("Deploying [" +app+"] to " +eachZone+"...");
            System.out.println("Deployed completed for " + eachZone+"...");
        }
        System.out.println("---All deployment complete, traffic enabled---");
    }
}

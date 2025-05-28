public class CloudServicePlatform {
    private CloudService cloudService;

    // Asignamos el servicio en el constructor
    public CloudServicePlatform(CloudService cloudService) {
        this.cloudService = cloudService;
    }

   
    public void hostingTo(AppWeb app) {
        cloudService.host(app);
    }
}

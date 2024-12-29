import java.io.File;

public interface Remove {
    default void removeFile(String id){
        File file = new File(id);
        if(file.exists()) {
            if(file.delete()){
                System.out.println("\nEmployee has been removed successfully");
            }
        } else
            System.out.println("\nEmployee does not exists in database");
    }
}

import java.io.File;

public class FileFilter {
    public static void main(String[] args) {
        File file = new File(System.getProperty("user.dir"));
        String[] files = file.list((dir, name) -> name.endsWith(".pdf") || name.endsWith(".PDF"));
        for(String f: files){
            System.out.println(f);
        }
        for(String item: files
                ) {
            String[] s1 = item.split("_");
            String s2 = s1[0];

            System.out.println(s2);
        }
    }
}

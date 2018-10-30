import java.util.Base64;

public class Base64Encoded {
    public static void main(String arg[]){
        // Encode using basic encoder
        String base64encodedString = Base64.getEncoder().encodeToString(
                "TutorialsPoint?java8".getBytes());
        System.out.println("Base64 Encoded String (Basic) :" + base64encodedString);
        // Decode
        byte[] base64decodedBytes = Base64.getDecoder().decode(base64encodedString);
        String ss=Base64.getDecoder().decode(base64encodedString).toString();
        System.out.println(ss);
    }
}

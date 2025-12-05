import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws URISyntaxException, IOException, InterruptedException {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ip del servidor");
        String ip = sc.nextLine();

        String[] pistas = {"pista1", "pista2", "pista3"};
        for (int i = 0; i < 3; i++) {


            System.out.println(consumeAPI(ip, pistas[i]));
            Scanner scanner = new Scanner(System.in);
            System.out.println("Quieres resolver?");
            String opcion = scanner.nextLine();
            if (opcion.equals("si")) {
                System.out.println("Nombre del personaje");
                String personaje = scanner.nextLine();
                String response = consumeAPI(ip, "resolver/" + personaje);
                if (response.equals("true")) {
                    System.out.println("Has ganado");
                    break;
                }
            }
        }
    }

    public static void play(String ip) throws URISyntaxException, IOException, InterruptedException {

        try {
            //TODO


        } catch (Exception e) {
            System.out.println("Api no disponible");
            System.out.println("Error" + e);
        }
    }

    public static String consumeAPI(String ip, String path) throws URISyntaxException, IOException, InterruptedException {
        URI targetURI = new URI("http://" + ip + ":8080/" + path);
        HttpRequest httpRequest = HttpRequest.newBuilder().uri(targetURI).GET().build();
        HttpClient httpClient = HttpClient.newHttpClient();
        HttpResponse<String> response = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());
        return response.body();
    }
}
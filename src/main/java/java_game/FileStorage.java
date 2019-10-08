package java_game;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;

/**
 * Инкапсулирует работу с хранилищем
 *
 * @author anton0xf
 */
public class FileStorage {

    private static final Charset UTF_8 = Charset.forName("UTF-8");
    private final String filePath;

    public FileStorage(String filePath) {
        this.filePath = filePath;
    }

    void save(String text) {
        try (FileWriter writer = new FileWriter(filePath, UTF_8, false)) {
            writer.write(text);
        } catch (IOException ex) {
            // @todo show error message in UI
            throw new RuntimeException("Cannot save file " + filePath, ex);
        }
    }

    String load() {
        try (BufferedReader in = new BufferedReader(
                new FileReader(filePath, UTF_8))) {
            StringBuilder builder = new StringBuilder();
            String line;
            while ((line = in.readLine()) != null) {
                builder.append(line).append('\n');
            }
            return builder.toString();
        } catch (IOException ex) {
            // @todo show error message in UI
            throw new RuntimeException("Cannot save file " + filePath, ex);
        }
    }

}

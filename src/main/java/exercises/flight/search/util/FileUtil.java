package exercises.flight.search.util;

import java.io.*;
import java.nio.charset.*;
import java.nio.file.*;

public final class FileUtil {

    public static Reader getFileReader(String pathName, String fileName) throws IOException {

        Path path = Paths.get(pathName, fileName);
        return Files.newBufferedReader(path, Charset.forName("UTF-8"));
    }
}

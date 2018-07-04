package utilities;

import com.jayway.jsonpath.JsonPath;

import java.io.File;
import java.io.IOException;

public class JsonReader {

    private File jsonFile;
    public String fileName;

    public JsonReader(String fileName) {
        this.fileName = fileName;
    }

    public String getLocator(String locator) throws IOException {
        jsonFile = new File(fileName);
        return JsonPath.read(jsonFile, "$."+locator);
    }
}

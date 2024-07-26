package prototype.documents;

import java.util.Map;
import java.util.HashMap;


public class DocClient {
    private Map<String, Document> documentMap = new HashMap<>();

    public void addDocument(String key, Document document) {
        documentMap.put(key, document);
    }

    public Document createDocument(String key) {
        Document document = documentMap.get(key);
        return document != null ? document.getClone() : null;
    }
}

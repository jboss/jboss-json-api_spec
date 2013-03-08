package javax.json;

import java.io.Closeable;

/**
 * Reads a JSON {@link JsonObject object} or an {@link JsonArray array}
 * structure from an input source.
 *
 * <p>The class {@link javax.json.Json} contains methods to create readers from
 * input sources ({@link java.io.InputStream} and {@link java.io.Reader}).
 *
 * <p>
 * <a id="JsonReaderExample1"/>
 * The following example demonstrates how to read an empty JSON array from
 * a string:
 * <pre>
 * <code>
 * JsonReader jsonReader = Json.createReader(new StringReader("[]"));
 * JsonArray array = jsonReader.readArray();
 * jsonReader.close();
 * </code>
 * </pre>
 *
 * <p>
 * The class {@link JsonReaderFactory} also contains methods to create
 * {@code JsonReader} instances. A factory instance can be used to create
 * multiple reader instances with the same configuration. This the preferred
 * way to create multiple instances. A sample usage is shown in the following
 * example:
 * <pre>
 * <code>
 * JsonReaderFactory factory = Json.createReaderFactory(config);
 * JsonReader reader1 = factory.createReader(...);
 * JsonReader reader2 = factory.createReader(...);
 * </code>
 * </pre>
 *
 * @author Jitendra Kotamraju
 */
public interface JsonReader extends  /*Auto*/Closeable {

    /**
     * Returns a JSON array or object that is represented in
     * the input source. This method needs to be called
     * only once for a reader instance.
     *
     * @return a JSON object or array
     * @throws JsonException if a JSON object or array cannot
     *     be created due to i/o error (IOException would be
     * cause of JsonException)
     * @throws javax.json.stream.JsonParsingException if a JSON object or array
     *     cannot be created due to incorrect representation
     * @throws IllegalStateException if read, readObject, readArray or
     *     close method is already called
     */
    JsonStructure read();

    /**
     * Returns a JSON object that is represented in
     * the input source. This method needs to be called
     * only once for a reader instance.
     *
     * @return a JSON object
     * @throws JsonException if a JSON object cannot
     *     be created due to i/o error (IOException would be
     *     cause of JsonException)
     * @throws javax.json.stream.JsonParsingException if a JSON object cannot
     *     be created due to incorrect representation
     * @throws IllegalStateException if read, readObject, readArray or
     *     close method is already called
     */
    JsonObject readObject();

    /**
     * Returns a JSON array that is represented in
     * the input source. This method needs to be called
     * only once for a reader instance.
     *
     * @return a JSON array
     * @throws JsonException if a JSON array cannot
     *     be created due to i/o error (IOException would be
     *     cause of JsonException)
     * @throws javax.json.stream.JsonParsingException if a JSON array cannot
     *     be created due to incorrect representation
     * @throws IllegalStateException if read, readObject, readArray or
     *     close method is already called
     */
    JsonArray readArray();

    /**
     * Closes this reader and frees any resources associated with the
     * reader. This method closes the underlying input source.
     *
     * @throws JsonException if an i/o error occurs (IOException would be
     * cause of JsonException)
     */
    @Override
    void close();

}

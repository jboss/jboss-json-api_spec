package javax.json.stream;

import javax.json.JsonArray;
import javax.json.JsonObject;
import java.io.InputStream;
import java.io.Reader;
import java.nio.charset.Charset;
import java.util.Map;

/**
 * Factory for creating {@link JsonParser} instances. If a factory
 * instance is configured with a configuration, the configuration applies
 * to all parser instances created using that factory instance.
 *
 * <p>
 * The class {@link javax.json.Json Json} also provides methods to create
 * {@link JsonParser} instances, but using {@code JsonParserFactory} is
 * preferred when creating multiple parser instances as shown in the following
 * example:
 *
 * <pre>
 * <code>
 * JsonParserFactory factory = Json.createParserFactory();
 * JsonParser parser1 = factory.createParser(...);
 * JsonParser parser2 = factory.createParser(...);
 * </code>
 * </pre>
 *
 * <p> All the methods in this class are safe for use by multiple concurrent
 * threads.
 *
 * @author Jitendra Kotamraju
 */
public interface JsonParserFactory {

    /**
     * Creates a JSON parser from a character stream.
     *
     * @param reader a i/o reader from which JSON is to be read
     */
    JsonParser createParser(Reader reader);

    /**
     * Creates a JSON parser from the specified byte stream.
     * The character encoding of the stream is determined
     * as specified in <a href="http://tools.ietf.org/rfc/rfc4627.txt">RFC 4627</a>.
     *
     * @param in i/o stream from which JSON is to be read
     * @throws javax.json.JsonException if encoding cannot be determined
     *         or i/o error (IOException would be cause of JsonException)
     */
    JsonParser createParser(InputStream in);

    /**
     * Creates a JSON parser from the specified byte stream.
     * The bytes of the stream are decoded to characters using the
     * specified charset.
     *
     * @param in i/o stream from which JSON is to be read
     * @param charset a charset
     */
    JsonParser createParser(InputStream in, Charset charset);

    /**
     * Creates a JSON parser from the specified JSON object.
     *
     * @param obj a JSON object
     */
    JsonParser createParser(JsonObject obj);

    /**
     * Creates a JSON parser from the specified JSON array.
     *
     * @param array a JSON array
     */
    JsonParser createParser(JsonArray array);

    /**
     * Returns a read-only map of supported provider specific configuration
     * properties that are used to configure the JSON parsers.
     * If there are any specified configuration properties that are not
     * supported by the provider, they won't be part of the returned map.
     *
     * @return a map of supported provider specific properties that are used
     * to configure the created parsers. The map may be empty but not null
     */
    Map<String, ?> getConfigInUse();

}

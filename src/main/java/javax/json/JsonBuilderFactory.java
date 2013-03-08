package javax.json;

import java.util.Map;

/**
 * Factory to create {@link JsonObjectBuilder} and {@link JsonArrayBuilder}
 * instances. If a factory instance is configured with some configuration,
 * that would be used to configure the created builder instances.
 *
 * <p>
 * {@code JsonObjectBuilder} and {@code JsonArrayBuilder} can also be created
 * using {@link Json}'s methods. If multiple builder instances are created,
 * then creating them using a builder factory is preferred.
 *
 * <p>
 * <b>For example:</b>
 * <pre>
 * <code>
 * JsonBuilderFactory factory = Json.createBuilderFactory(...);
 * JsonArray value = factory.createArrayBuilder()
 *     .add(factory.createObjectBuilder()
 *         .add("type", "home")
 *         .add("number", "212 555-1234"))
 *     .add(factory.createObjectBuilder()
 *         .add("type", "fax")
 *         .add("number", "646 555-4567"))
 *     .build();
 * </code>
 * </pre>
 *
 * <p> All the methods in this class are safe for use by multiple concurrent
 * threads.
 *
 * @author Jitendra Kotamraju
 */
public interface JsonBuilderFactory {

    /**
     * Creates a {@code JsonObjectBuilder} instance that is used to build
     * {@link JsonObject}.
     *
     * @return a JSON object builder
     */
    JsonObjectBuilder createObjectBuilder();

    /**
     * Creates a {@code JsonArrayBuilder} instance that is used to build
     * {@link JsonArray}
     *
     * @return a JSON array builder
     */
    JsonArrayBuilder createArrayBuilder();

    /**
     * Returns read-only map of supported provider specific configuration
     * properties that are used to configure the created JSON builders.
     * If there are any specified configuration properties that are not
     * supported by the provider, they won't be part of the returned map.
     *
     * @return a map of supported provider specific properties that are used
     * to configure the builders. The map be empty but not null.
     */
    Map<String, ?> getConfigInUse();

}

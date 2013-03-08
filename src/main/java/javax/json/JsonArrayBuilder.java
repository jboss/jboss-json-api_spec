package javax.json;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * A builder for creating {@link JsonArray} models from scratch. This
 * interface initializes an empty JSON array model and provides methods to add
 * values to the array model and to return the resulting array. The methods
 * in this class can be chained to add multiple values to the array.
 *
 * <p>The class {@link javax.json.Json} contains methods to create the builder
 * object. The example code below shows how to build an empty {@code JsonArray}
 * instance.
 * <pre>
 * <code>
 * JsonArray array = Json.createArrayBuilder().build();
 * </code>
 * </pre>
 *
 * <p>The class {@link JsonBuilderFactory} also contains methods to create
 * {@code JsonArrayBuilder} instances. A factory instance can be used to create
 * multiple builder instances with the same configuration. This the preferred
 * way to create multiple instances.
 *
 * <a id="JsonArrayBuilderExample1"/>
 * The example code below shows how to build a {@code JsonArray} object
 * that represents the following JSON array:
 *
 * <pre>
 * <code>
 * [
 *     { "type": "home", "number": "212 555-1234" },
 *     { "type": "fax", "number": "646 555-4567" }
 * ]
 * </code>
 * </pre>
 *
 * <p>The following code creates the JSON array above:
 *
 * <pre>
 * <code>
 * JsonBuilderFactory factory = Json.createBuilderFactory(config);
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
 * @see JsonObjectBuilder
 */
public interface JsonArrayBuilder {

    /**
     * Adds a value to the array.
     *
     * @param value the JSON value
     * @return this array builder
     */
    JsonArrayBuilder add(JsonValue value);

    /**
     * Adds a value to the array as a {@link JsonString}.
     *
     * @param value the string value
     * @return this array builder
     */
    JsonArrayBuilder add(String value);

    /**
     * Adds a value to the array as a {@link JsonNumber}.
     *
     * @param value the number value
     * @return this array builder
     *
     * @see JsonNumber
     */
    JsonArrayBuilder add(BigDecimal value);

    /**
     * Adds a value to the array as a {@link JsonNumber}.
     *
     * @param value the number value
     * @return this array builder
     *
     * @see JsonNumber
     */
    JsonArrayBuilder add(BigInteger value);

    /**
     * Adds a value to the array as a {@link JsonNumber}.
     *
     * @param value the number value
     * @return this array builder
     *
     * @see JsonNumber
     */
    JsonArrayBuilder add(int value);

    /**
     * Adds a value to the array as a {@link JsonNumber}.
     *
     * @param value the number value
     * @return this array builder
     *
     * @see JsonNumber
     */
    JsonArrayBuilder add(long value);

    /**
     * Adds a value to the array as a {@link JsonNumber}.
     *
     * @param value the number value
     * @return this array builder
     * @throws NumberFormatException if the value is Not-a-Number(NaN) or
     *      infinity
     *
     * @see JsonNumber
     */
    JsonArrayBuilder add(double value);

    /**
     * Adds a {@link JsonValue#TRUE}  or {@link JsonValue#FALSE} value to the
     * array.
     *
     * @param value the boolean value
     * @return this array builder
     */
    JsonArrayBuilder add(boolean value);

    /**
     * Adds a {@link JsonValue#NULL} value to the array.
     *
     * @return this array builder
     */
    JsonArrayBuilder addNull();

    /**
     * Adds a {@link JsonObject} from an object builder to the array.
     *
     * @param builder the object builder
     * @return this array builder
     */
    JsonArrayBuilder add(JsonObjectBuilder builder);

    /**
     * Adds a {@link JsonArray} from an array builder to the array.
     *
     * @param builder the array builder
     * @return this array builder
     */
    JsonArrayBuilder add(JsonArrayBuilder builder);

    /**
     * Returns the current array.
     *
     * @return the current JSON array
     */
    JsonArray build();

}


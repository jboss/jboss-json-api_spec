/**
 * Provides an object model API to process <a href="http://json.org/">JSON</a>.
 *
 * <p>The object model API is a high-level API that provides immutable object
 * models for JSON object and array structures. These JSON structures are
 * represented as object models using the Java types {@link javax.json.JsonObject}
 * and {@link javax.json.JsonArray}. The interface {@code javax.json.JsonObject} provides
 * a {@link java.util.Map} view to access the unordered collection of zero or
 * more name/value pairs from the model. Similarly, the interface
 * {@code JsonArray} provides a {@link java.util.List} view to access the
 * ordered sequence of zero or more values from the model.
 *
 * <p>The object model API uses builder patterns to create these object models.
 * The classes {@link javax.json.JsonObjectBuilder} and
 * {@link javax.json.JsonArrayBuilder} provide methods to create models
 * of type {@code JsonObject} and {@code JsonArray} respectively.
 *
 * <p>These object models can also be created from an input source using
 * the class {@link javax.json.JsonReader}. Similarly, these object models
 * can be written to an output source using the class {@link javax.json.JsonWriter}.
 *
 * @since JSON Processing 1.0
 * @author Jitendra Kotamraju
 */
package javax.json;

/**
 * Provides a streaming API to parse and generate
 * <a href="http://json.org/">JSON</a>.
 *
 * <p>
 * The streaming API consists of the interfaces
 * {@link javax.json.stream.JsonParser} and
 * {@link javax.json.stream.JsonGenerator}. The interface {@code JsonParser}
 * contains methods to parse JSON in a streaming way. The interface
 * {@code JsonGenerator} contains methods to write JSON to an output source
 * in a streaming way.
 *
 * <p>
 * {@code JsonParser} provides forward, read-only access to JSON data using the
 * pull parsing programming model. In this model the application code controls
 * the thread and calls methods in the parser interface to move the parser
 * forward or to obtain JSON data from the current state of the parser.
 *
 * <p>
 * {@code JsonGenerator} provides methods to write JSON to an output source.
 * The generator writes name/value pairs in JSON objects and values in JSON
 * arrays.
 *
 * <p>
 * The streaming API is a low-level API designed to process large amounts of
 * JSON data efficiently. Other JSON frameworks (such as JSON binding) can be
 * implemented using this API.
 *
 * @since JSON Processing 1.0
 * @author Jitendra Kotamraju
 */
package javax.json.stream;

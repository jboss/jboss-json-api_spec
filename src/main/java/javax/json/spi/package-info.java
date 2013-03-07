/**
 * Service Provider Interface (SPI) to plug in implementations for
 * JSON processing objects.
 *
 * <p> {@link javax.json.spi.JsonProvider JsonProvider} is an abstract class
 * that provides a service for creating JSON processing instances.
 * A <i>service provider</i> for {@code JsonProvider} provides an
 * specific implementation by subclassing and implementing the methods in
 * {@code JsonProvider}. This enables using custom, efficient JSON processing
 * implementations (for e.g. parser and generator) other than the default ones.
 *
 * <p>The API locates and loads providers using {@link java.util.ServiceLoader}.
 *
 * @since JSON Processing 1.0
 * @author Jitendra Kotamraju
 */
package javax.json.spi;



import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Generated;

/**
 * Immutable implementation of {@link RollsLeft}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableRollsLeft.builder()}.
 * Use the static factory method to create immutable instances:
 * {@code ImmutableRollsLeft.of()}.
 */
@SuppressWarnings({"all"})
@Generated({"Immutables.generator", "RollsLeft"})
public final class ImmutableRollsLeft extends RollsLeft {
  private final int rollsLeft;

  private ImmutableRollsLeft(int rollsLeft) {
    this.rollsLeft = rollsLeft;
  }

  /**
   * @return The value of the {@code rollsLeft} attribute
   */
  @Override
  protected int rollsLeft() {
    return rollsLeft;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link RollsLeft#rollsLeft() rollsLeft} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for rollsLeft
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableRollsLeft withRollsLeft(int value) {
    if (this.rollsLeft == value) return this;
    return new ImmutableRollsLeft(value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableRollsLeft} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableRollsLeft
        && equalTo((ImmutableRollsLeft) another);
  }

  private boolean equalTo(ImmutableRollsLeft another) {
    return rollsLeft == another.rollsLeft;
  }

  /**
   * Computes a hash code from attributes: {@code rollsLeft}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 31;
    h = h * 17 + rollsLeft;
    return h;
  }

  /**
   * Prints the immutable value {@code RollsLeft} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("RollsLeft")
        .omitNullValues()
        .add("rollsLeft", rollsLeft)
        .toString();
  }

  /**
   * Construct a new immutable {@code RollsLeft} instance.
   * @param rollsLeft The value for the {@code rollsLeft} attribute
   * @return An immutable RollsLeft instance
   */
  public static ImmutableRollsLeft of(int rollsLeft) {
    return new ImmutableRollsLeft(rollsLeft);
  }

  /**
   * Creates an immutable copy of a {@link RollsLeft} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable RollsLeft instance
   */
  public static ImmutableRollsLeft copyOf(RollsLeft instance) {
    if (instance instanceof ImmutableRollsLeft) {
      return (ImmutableRollsLeft) instance;
    }
    return ImmutableRollsLeft.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableRollsLeft ImmutableRollsLeft}.
   * @return A new ImmutableRollsLeft builder
   */
  public static ImmutableRollsLeft.Builder builder() {
    return new ImmutableRollsLeft.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableRollsLeft ImmutableRollsLeft}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder {
    private static final long INIT_BIT_ROLLS_LEFT = 0x1L;
    private long initBits = 0x1L;

    private int rollsLeft;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code RollsLeft} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(RollsLeft instance) {
      Preconditions.checkNotNull(instance, "instance");
      rollsLeft(instance.rollsLeft());
      return this;
    }

    /**
     * Initializes the value for the {@link RollsLeft#rollsLeft() rollsLeft} attribute.
     * @param rollsLeft The value for rollsLeft 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder rollsLeft(int rollsLeft) {
      this.rollsLeft = rollsLeft;
      initBits &= ~INIT_BIT_ROLLS_LEFT;
      return this;
    }

    /**
     * Builds a new {@link ImmutableRollsLeft ImmutableRollsLeft}.
     * @return An immutable instance of RollsLeft
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableRollsLeft build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableRollsLeft(rollsLeft);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = Lists.newArrayList();
      if ((initBits & INIT_BIT_ROLLS_LEFT) != 0) attributes.add("rollsLeft");
      return "Cannot build RollsLeft, some of required attributes are not set " + attributes;
    }
  }
}

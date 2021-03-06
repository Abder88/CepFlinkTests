package cep.itcase;


/**
 * A subclass of {@link Event} for usage in tests.
 */
public class SubEvent extends Event {
	private final double volume;

	public SubEvent(int id, String name, double price, double volume) {
		super(id, name, price);
		this.volume = volume;
	}

	public double getVolume() {
		return volume;
	}

	@Override
	public boolean equals(Object obj) {
		return obj instanceof SubEvent &&
				super.equals(obj) &&
				((SubEvent) obj).volume == volume;
	}

	@Override
	public int hashCode() {
		return super.hashCode() + (int) volume;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();

		builder.append("SubEvent(")
			.append(getId())
			.append(", ")
			.append(getName())
			.append(", ")
			.append(getPrice())
			.append(", ")
			.append(getVolume())
			.append(")");

		return builder.toString();
	}
}

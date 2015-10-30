package de.uni_hannover.sra.minimax_simulator.model.machine.simulation;

/**
 * A trackable {@code Integer}.
 *
 * @see Trackable
 *
 * @author Martin L&uuml;ck
 */
public class TrackableInteger extends AbstractTrackable<Integer> {

	/** The value of the {@code TrackableInteger}. */
	private Integer value;

	@Override
	public Integer get() {
		return value;
	}

	@Override
	public void set(Integer value) {
		this.value = value;
		fireValueChanged();
	}
}
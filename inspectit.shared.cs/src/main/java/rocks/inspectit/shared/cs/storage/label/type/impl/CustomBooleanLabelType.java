package rocks.inspectit.shared.cs.storage.label.type.impl;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import rocks.inspectit.shared.cs.storage.label.type.AbstractCustomStorageLabelType;

/**
 * Custom label type that holds {@link Boolean} values.
 *
 * @author Ivan Senic
 *
 */
@Entity
@DiscriminatorValue("CBLT")
public class CustomBooleanLabelType extends AbstractCustomStorageLabelType<Boolean> {

	/**
	 * Generated UID.
	 */
	private static final long serialVersionUID = 2555296264644436351L;

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Class<Boolean> getValueClass() {
		return Boolean.class;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean isValueReusable() {
		return false;
	}

}

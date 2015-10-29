package de.alpharogroup.rating.system.domain;

import java.util.Date;

import de.alpharogroup.db.domain.BaseBusinessObject;
import de.alpharogroup.rating.system.enums.RatingVisibility;
import de.alpharogroup.user.management.domain.User;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString(callSuper=true)
@EqualsAndHashCode(callSuper=true)
public class Rating<K> extends BaseBusinessObject<K> {
	/** Serial Version UID */
	private static final long serialVersionUID = 1L;

	/** The id from the user that rated the entity. */
	private User rater;
	/** Field mapping */
	private Integer ratingpoints;
	/** The time that the user made the last rating. */
	private Date ratingDate;
	/** A description for the rating. */
	private String ratingDescription;
	/** The title from the event rating. */
	private String titleRating;
	/** Field mapping */
	private RatingVisibility visibility;
}

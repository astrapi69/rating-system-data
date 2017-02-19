package de.alpharogroup.rating.system.domain;

import java.util.Date;

import de.alpharogroup.domain.BaseDomainObject;
import de.alpharogroup.rating.system.enums.RatingVisibility;
import de.alpharogroup.user.domain.User;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * The class {@link Rating}.
 *
 * @param <K> the key type
 */
@Getter
@Setter
@ToString(callSuper=true)
@EqualsAndHashCode(callSuper=true)
@NoArgsConstructor
@AllArgsConstructor
public class Rating<K> extends BaseDomainObject<K> {
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

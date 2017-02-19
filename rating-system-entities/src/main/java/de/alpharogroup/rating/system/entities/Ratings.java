package de.alpharogroup.rating.system.entities;

import java.util.Date;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToOne;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import org.hibernate.annotations.Type;

import de.alpharogroup.db.entity.BaseEntity;
import de.alpharogroup.rating.system.enums.RatingVisibility;
import de.alpharogroup.user.entities.Users;

/**
 * Object mapping for hibernate-handled table: profile_ratings author:
 *
 */
@MappedSuperclass
@Access(AccessType.FIELD)
@Getter
@Setter
@NoArgsConstructor
public class Ratings
extends BaseEntity<Integer>
implements Cloneable {

	/** Serial Version UID */
	private static final long serialVersionUID = 1L;

	/** The id from the user that rated the entity. */
	@OneToOne(fetch=FetchType.EAGER)
	@JoinColumn(name = "rater")
	private Users rater;
	/** Field mapping */
	@Column(name = "rating_points")
	private Integer ratingpoints;
	/** The time that the user made the last rating. */
	@Column(name = "rating_date")
	private Date ratingDate;
	/** A description for the rating. */
	@Column(name = "rating_description", length = 1024)
	private String ratingDescription;
	/** The title from the event rating. */
	@Column(name = "title_rating", length = 256)
	private String titleRating;
	/** Field mapping */
	@Column(name = "visibility")
	@Enumerated(EnumType.STRING)
	@Type(type = "ratingVisibilityConverter")
	private RatingVisibility visibility;

}
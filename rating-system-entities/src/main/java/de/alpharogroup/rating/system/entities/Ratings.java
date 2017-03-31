/**
 * The MIT License
 *
 * Copyright (C) 2015 Asterios Raptis
 *
 * Permission is hereby granted, free of charge, to any person obtaining
 * a copy of this software and associated documentation files (the
 * "Software"), to deal in the Software without restriction, including
 * without limitation the rights to use, copy, modify, merge, publish,
 * distribute, sublicense, and/or sell copies of the Software, and to
 * permit persons to whom the Software is furnished to do so, subject to
 * the following conditions:
 *  *
 * The above copyright notice and this permission notice shall be
 * included in all copies or substantial portions of the Software.
 *  *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
 * EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF
 * MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE
 * LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION
 * OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION
 * WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */
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
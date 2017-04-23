# Overview

Parent project that holds module projects for the persistence of user rating data. 

The entity classes in this project are abstract and can be extended from other projects for specific user rating.

## License

The source code comes under the liberal MIT License, making rating-system-data great for all types of applications with rating features.

# Build status and latest maven version
[![Build Status](https://travis-ci.org/lightblueseas/rating-system-data.svg?branch=master)](https://travis-ci.org/lightblueseas/rating-system-data)

## Maven Central

[![Maven Central](https://maven-badges.herokuapp.com/maven-central/de.alpharogroup/rating-system-data/badge.svg)](https://maven-badges.herokuapp.com/maven-central/de.alpharogroup/rating-system-data)

## Maven dependency

Maven dependency is now on sonatype.
Check out [sonatype repository](https://oss.sonatype.org/index.html#nexus-search;gav~de.alpharogroup~rating-system-data~~~) for latest snapshots and releases.

Add the following maven dependencies to your project `pom.xml` if you want to import the core functionality:

You can first define the version properties:

	<properties>
			...
		<!-- RATING-SYSTEM-DATA versions -->
		<rating-system-data.version>3.11.0</rating-system-data.version>
		<rating-system-entities.version>${rating-system-data.version}</rating-system-entities.version>
		<rating-system-domain.version>${rating-system-data.version}</rating-system-domain.version>
			...
	</properties>

Add the following maven dependency to your project `pom.xml` if you want to import the functionality of rating-system-entities:

		<dependencies>
			...
			<dependency>
				<groupId>de.alpharogroup</groupId>
				<artifactId>rating-system-entities</artifactId>
				<version>${rating-system-entities.version}</version>
			</dependency>
			...
		</dependencies>

Add the following maven dependency to your project `pom.xml` if you want to import the functionality of rating-system-domain:

		<dependencies>
			...
			<dependency>
				<groupId>de.alpharogroup</groupId>
				<artifactId>rating-system-domain</artifactId>
				<version>${rating-system-domain.version}</version>
			</dependency>
			...
		</dependencies>
		 
## Open Issues
[![Open Issues](https://img.shields.io/github/issues/astrapi69/rating-system-data.svg?style=flat)](https://github.com/astrapi69/rating-system-data/issues) 

## Want to Help and improve it? ###

The source code for rating-system-data are on GitHub. Please feel free to fork and send pull requests!

Create your own fork of [lightblueseas/rating-system-data/fork](https://github.com/lightblueseas/rating-system-data/fork)

To share your changes, [submit a pull request](https://github.com/lightblueseas/rating-system-data/pull/new/master).

Don't forget to add new units tests on your changes.

## Contacting the Developer

Do not hesitate to contact the rating-system-data developers with your questions, concerns, comments, bug reports, or feature requests.
- Feature requests, questions and bug reports can be reported at the [issues page](https://github.com/lightblueseas/rating-system-data/issues).

## Note

No animals were harmed in the making of this library.

# Donate

If you like this library, please consider a donation through 
<a href="https://flattr.com/submit/auto?fid=r7vp62&url=https%3A%2F%2Fgithub.com%2Flightblueseas%2Frating-system-data" target="_blank">
<img src="http://button.flattr.com/flattr-badge-large.png" alt="Flattr this" title="Flattr this" border="0">
</a>

package org.skrymer.swgraphql.fetchers;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Character {
	private String name;
	private String height;
	private String mass;
	private String hair_color;
	private String skin_color;
	private String eye_color;
	private String birth_year;
	private String gender;
}
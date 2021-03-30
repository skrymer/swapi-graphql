package org.skrymer.swgraphql.fetchers;

import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsData;
import com.netflix.graphql.dgs.InputArgument;

import java.util.List;
import java.util.stream.Collectors;

@DgsComponent
public class CharacterDatafetcher {

  private final List<Character> characters = List.of(
      Character.builder().name("Luke Skywalker").height("172").mass("77").hair_color("blond").skin_color("fair").eye_color("blue").birth_year("19BBY").gender("male").build(),
      Character.builder().name("Luke Skywalker").height("172").mass("77").hair_color("blond").skin_color("fair").eye_color("blue").birth_year("19BBY").gender("male").build(),
      Character.builder().name("Luke Skywalker").height("172").mass("77").hair_color("blond").skin_color("fair").eye_color("blue").birth_year("19BBY").gender("male").build(),
      Character.builder().name("Luke Skywalker").height("172").mass("77").hair_color("blond").skin_color("fair").eye_color("blue").birth_year("19BBY").gender("male").build(),
      Character.builder().name("Luke Skywalker").height("172").mass("77").hair_color("blond").skin_color("fair").eye_color("blue").birth_year("19BBY").gender("male").build(),
      Character.builder().name("Luke Skywalker").height("172").mass("77").hair_color("blond").skin_color("fair").eye_color("blue").birth_year("19BBY").gender("male").build()
  );

  @DgsData(parentType = "Query", field = "characters")
  public List<Character> characters(@InputArgument("nameFilter") String nameFilter) {
    if(nameFilter == null) {
      return characters;
    }

    return characters.stream().filter(s -> s.getName().contains(nameFilter)).collect(Collectors.toList());
  }
}




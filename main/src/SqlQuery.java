package src;

public enum SqlQuery {
  GET_INGREDIENT_BY_ID(""),
  GET_ALL_INGREDIENTS(""),
  INSERT_INGREDIENTS(""),
  UPDATE_INGREDIENT(""),
  DELETE_INGREDIENT("");

  private final String query;

  SqlQuery(String query) {
    this.query = query;
  }

  public String getQuery() {
    return query;
  }
}

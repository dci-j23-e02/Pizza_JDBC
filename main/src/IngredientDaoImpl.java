package src;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashSet;
import java.util.Set;

public class IngredientDaoImpl implements IngredientDao{

  @Override
  public Ingredient getIngredient(int ingredientId) {
    try(
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(SqlQuery.GET_INGREDIENT_BY_ID.getQuery())
        ){
      preparedStatement.setInt(1, ingredientId);
      ResultSet resultSet = preparedStatement.executeQuery();
      if(resultSet.next()){
        return extractIngredientFromResultSet(resultSet);
      }
    }catch(SQLException e){
      e.printStackTrace();
    }
    return null;
  }



  @Override
  public Set<Ingredient> getAllIngredients() {
    Set<Ingredient> ingredients = new HashSet<>();
    try (Connection connection = ConnectionFactory.getConnection();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(SqlQuery.GET_ALL_INGREDIENTS.getQuery())) {
      while (resultSet.next()) {
        ingredients.add(extractIngredientFromResultSet(resultSet));
      }
    } catch (SQLException e) {
      e.printStackTrace();
    }
    return ingredients;
  }

  @Override
  public boolean insertIngredient(Ingredient ingredient) {
    try(
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(SqlQuery.INSERT_INGREDIENT.getQuery());

        ) {
      preparedStatement.setString(1, ingredient.getName());
      preparedStatement.setInt(2, ingredient.getQuantity());
      int affectedRows = preparedStatement.executeUpdate();
      if(affectedRows > 0){
        return  true;
      }


    } catch (SQLException e) {
      e.printStackTrace();
    }
    return false;
  }

  @Override
  public boolean updateIngredient(Ingredient ingredient) {
    try (Connection connection = ConnectionFactory.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(SqlQuery.UPDATE_INGREDIENT.getQuery())) {
      preparedStatement.setString(1, ingredient.getName());
      preparedStatement.setInt(2, ingredient.getQuantity());
      preparedStatement.setInt(3, ingredient.getId());
      int affectedRows = preparedStatement.executeUpdate();
      return affectedRows > 0;
    } catch (SQLException e) {
      e.printStackTrace();
    }
    return false;
  }

  @Override
  public boolean deleteIngredient(int ingredientId) {
    return false;
  }

  private Ingredient extractIngredientFromResultSet(ResultSet resultSet) throws  SQLException{
    Ingredient ingredient = new Ingredient();
    ingredient.setId(resultSet.getInt("id"));
    ingredient.setName(resultSet.getString("name"));
    ingredient.setQuantity(resultSet.getInt("quantity"));
    return ingredient;
  }

}

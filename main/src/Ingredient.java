package src;

// Model class
public class Ingredient {
// Attributes
  private Integer id;
  private String name;
  private Integer quantity;

  // Constructors

  public Ingredient() {
  }

  public Ingredient(Integer id, String name, Integer quantity) {
    this.id = id;
    this.name = name;
    this.quantity = quantity;
  }

  public Ingredient(String name, Integer quantity) {
    this.name = name;
    this.quantity = quantity;
  }

  // Getters and Setters

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }
}

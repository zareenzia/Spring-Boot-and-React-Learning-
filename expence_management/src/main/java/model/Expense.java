package model;

public class Expense {
    private int id ;
    private String date ;
    private String category ;
    private String name ;
    private String description ;
    private int amount ;
    public Expense(Integer id, String date, String category,String name,String description, Integer amount) {
        this.id = id;
        this.date = date;
        this.category = category;
        this.name =name;
        this.description = description;
        this.amount = amount;
    }
    public Expense(String date, String category,String name,String description, Integer amount) {
        this.date = date;
        this.category = category;
        this.name =name;
        this.description = description;
        this.amount = amount;
    }
    // Setter Getter functions

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }

    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public int getAmount() {
        return amount;
    }
    public void setAmount(int amount) {
        this.amount = amount;
    }
}
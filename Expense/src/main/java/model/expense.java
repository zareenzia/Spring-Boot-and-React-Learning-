package model;

import javax.persistence.*;

@Entity
@Table(name = "EXPENSE")
public class expense {

    private long expenseId;
    private String expenseName;


    public expense(long expenseId, String expenseName) {
        this.expenseId = expenseId;
        this.expenseName = expenseName;
    }

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "EXPENSE_ID")
    public long getExpenseId() {
        return this.expenseId;
    }

    public void getExpenseId(long studentId) {
        this.expenseId = expenseId;
    }

    @Column(name = "EXPENSE_NAME", nullable = false, length = 100)
    public String getExpenseName() {
        return this.expenseName;
    }

    public void setExpenseName(String expenseName) {
        this.expenseName = expenseName;
    }

}
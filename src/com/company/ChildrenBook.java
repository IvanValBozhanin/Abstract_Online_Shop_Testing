package com.company;

public class ChildrenBook extends Book{
    private int age;

    /**
     * Creates a new instance of Book
     *
     * @param regularPrice
     * @param publisher
     * @param yearPublished
     */
    public ChildrenBook(double regularPrice, String publisher, int yearPublished, int age) {
        super(regularPrice, publisher, yearPublished);
        this.age = age;
    }

    @Override
    public double computeSalePrice() {
        return super.getRegularPrice()*0.7;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

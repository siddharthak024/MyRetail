package com.target.myretail.model.response;

public class Item_type
{
    private String name;

    private String category_type;

    private String type;

    public String getName ()
    {
        return name;
    }

    public void setName (String name)
    {
        this.name = name;
    }

    public String getCategory_type ()
    {
        return category_type;
    }

    public void setCategory_type (String category_type)
    {
        this.category_type = category_type;
    }

    public String getType ()
    {
        return type;
    }

    public void setType (String type)
    {
        this.type = type;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [name = "+name+", category_type = "+category_type+", type = "+type+"]";
    }
}
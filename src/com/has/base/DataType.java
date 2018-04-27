package com.has.base;

/**
 * DataType.class
 * 
 * @author Ufuk BOMBAR
 * @since 28.04.2018 00:31
 * @version 1.0
 */
public class DataType
{
    public static final String INT = "java.lang.Integer";
    public static final String STRING = "java.lang.String";
    public static final String CONGIG = "com.has.base.Config";
    public static final String OPTIONS = "com.has.base.Options";
    public static final String DOUBLE = "java.lang.Double";
    public static final String LONG = "java.lang.Long";
    public static final String TIMESTAMP = "java.sql.Timestamp";
    public static final String BUFFERED_IMAGE = "java.awt.image.BufferedImage";
    public static final String NOTIFICATION = "com.has.base.Notification";

    private final String type;

    public DataType( String type )
    {
        this.type = type;
    }

    public String type()
    {
        return type;
    }

    @Override
    public boolean equals( Object obj )
    {
        if ( obj instanceof DataType )
            return this.type.equals( ((DataType) obj ).type );
        else if ( obj instanceof String )
            return this.type.equals( ((String) obj ) );
        else
            return false;
    }

    @Override
    public String toString()
    {
        return type;
    }

    public static DataType getTypeOf( String str )
    {
        // TODO: Write a function that takes a general String and finds the type of it.
        return null;
    }
}
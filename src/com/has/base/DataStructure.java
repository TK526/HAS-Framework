package com.has.base;

/**
 * This is class represents the structure of data inside DataContainer.class
 * DataStructure.class
 * 
 * @author Ufuk BOMBAR
 * @since 28.04.2018 00:51
 * @version 1.0
 */
public class DataStructure
{
    private DataType[] types;

    public DataStructure( int size, DataType type )
    {
        types = new DataType[ size ];

        for ( int i = 0; i < max; i++ )
            types[ i ] = new DataType( type.type() );
    }

    public DataStructure( DataType type1 )
    {
        types = new DataType[]{ 
            new DataType( type1.type() ) };
    }

    public DataStructure( DataType type1, DataType type2 )
    {
        types = new DataType[]{ 
            new DataType( type1.type() ), 
            new DataType( type2.type() ) };
    }

    public DataStructure( DataType type1, DataType type2, DataType type3 )
    {
        types = new DataType[]{ 
            new DataType( type1.type() ), 
            new DataType( type2.type() ),
            new DataType( type3.type() ) };
    }

    public DataStructure( DataType type1, DataType type2, DataType type3, DataType type4 )
    {
        types = new DataType[]{ 
            new DataType( type1.type() ), 
            new DataType( type2.type() ),
            new DataType( type3.type() ),
            new DataType( type4.type() ) };
    }

    public DataStructure( DataType type1, DataType type2, DataType type3, DataType type4, DataType type5 )
    {
        types = new DataType[]{ 
            new DataType( type1.type() ), 
            new DataType( type2.type() ),
            new DataType( type3.type() ),
            new DataType( type4.type() ),
            new DataType( type5.type() ) };
    }

    public DataStructure( DataType type1, DataType type2, DataType type3, DataType type4, DataType type5, DataType type6 )
    {
        types = new DataType[]{ 
            new DataType( type1.type() ), 
            new DataType( type2.type() ),
            new DataType( type3.type() ),
            new DataType( type4.type() ),
            new DataType( type5.type() ),
            new DataType( type6.type() ) };
    }

    public DataStructure( DataType type1, DataType type2, DataType type3, DataType type4, DataType type5, DataType type6, DataType type7 )
    {
        types = new DataType[]{ 
            new DataType( type1.type() ), 
            new DataType( type2.type() ),
            new DataType( type3.type() ),
            new DataType( type4.type() ),
            new DataType( type5.type() ),
            new DataType( type6.type() ),
            new DataType( type7.type() ) };
    }

    public DataStructure( DataType type1, DataType type2, DataType type3, DataType type4, DataType type5, DataType type6, DataType type7, DataType type8 )
    {
        types = new DataType[]{ 
            new DataType( type1.type() ), 
            new DataType( type2.type() ),
            new DataType( type3.type() ),
            new DataType( type4.type() ),
            new DataType( type5.type() ),
            new DataType( type6.type() ),
            new DataType( type7.type() ),
            new DataType( type8.type() ) };
    }

    public DataStructure( String stringDataStructure )
    {
        // TODO: Parsing procedure
    }

    public DataType getDataType( int i )
    {
        return types[ i ];
    }

    public int size()
    {
        return types.length;
    }


}
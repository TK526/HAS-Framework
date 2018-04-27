package com.has.base;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * DataContainer.class
 * 
 * @author Ufuk BOMBAR
 * @since 28.04.2018 00:31
 * @version 1.0
 */
public class DataContainer implements Iterable
{
    @SuppressWarnings( "all" )
    private Object[] data;
    private DataStructure structure;

    private class DataIterator implements Iterator
    {
        DataContainer dc;
        int index;

        public DataIterator( DataContainer dc )
        {
            index = 0;
            this.dc = dc;
        }

        @Override
        public boolean hasNext()
        {
            return index < dc.size();
        }

        @Override
        public Object next()
        {
            index++;
            return dc.getData( index - 1 );
        }
    }

    public DataContainer( DataStructure ds )
    {
        data = new Object[ ds.size() ];
        structure = ds;
    }

    public void setData( int i, Object obj )
    {
        data[ i ] = obj;
    }

    public Object getData( int i )
    {
        return data[ i ];
    }

    public DataType getDataType( int i )
    {
        return structure.getDataType( i );
    }

    public int size()
    {
        return data.length;
    }

    public Iterator<Object> iterator()
    {
        return new DataContainer.DataIterator( this );
    }

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder( "[ " );
        for ( int i = 0; i < this.size() - 1; i++ )
        {
            sb.append( this.data[ i ].toString() );
            sb.append( ", " );
        }
        if ( this.size() != 0 )
        {
            sb.append( this.data[ this.size() - 1 ].toString() );
        }
        sb.append( " ]" );

        return sb.toString();
    }
}

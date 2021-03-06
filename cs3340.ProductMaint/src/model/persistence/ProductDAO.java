package model.persistence;

import model.ProductConstants;

public interface ProductDAO extends ProductReader, ProductWriter, ProductConstants
{
    // all methods from the ProductReader and ProductWriter interfaces
    // all static constants from the DAOConstants interface
}
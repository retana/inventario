/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grselectronics.inventario.funcion;

import com.google.gson.Gson;
import java.util.List;

/**
 *
 * @author retana
 */
public class JQueryDataTableParamModel {
    /// <summary>
    /// Request sequence number sent by DataTable, same value must be returned in response
    /// </summary>       
    public String sEcho;

    /// <summary>
    /// Text used for filtering
    /// </summary>
    public String sSearch;

    /// <summary>
    /// Number of records that should be shown in table
    /// </summary>
    public int iDisplayLength;

    /// <summary>
    /// First record that should be shown(used for paging)
    /// </summary>
    public int iDisplayStart;

    /// <summary>
    /// Number of columns in table
    /// </summary>
    public int iColumns;	

    /// <summary>
    /// Number of columns that are used in sorting
    /// </summary>
    public int iSortingCols;
    
    /// <summary>
    /// Index of the column that is used for sorting
    /// </summary>
    public int iSortColumnIndex;
    
    /// <summary>
    /// Sorting direction "asc" or "desc"
    /// </summary>
    public String sSortDirection;

    /// <summary>
    /// Comma separated list of column names
    /// </summary>
    public String sColumns;
    public List aaData;
    
    public String getJSONFormat(){
        return new Gson().toJson(this);
    }
}

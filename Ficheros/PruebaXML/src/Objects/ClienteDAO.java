/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objects;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class ClienteDAO implements Serializable{
     private final ArrayList<Cliente> list = new ArrayList<Cliente>();

    public ArrayList<Cliente> getList() {
        return list;
    }
     
     
    
}

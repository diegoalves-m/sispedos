
package com.developer.diegoalves.converter;

import com.developer.diegoalves.model.Category;
import com.developer.diegoalves.repository.Categories;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

/**
 *
 * @author Diego Alves
 */
@FacesConverter(forClass = Category.class)
public class CategoryConverter implements Converter {

    Categories categories;
    
    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String value) {
        Category category = null;
        
        if(value != null) {
            Long id = new Long(value);
            category = categories.byId(id);
        }
        
        return category;
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object value) {
        if(value != null) {
            return ((Category) value).getId().toString();
        }
        return "";
    }
    
}

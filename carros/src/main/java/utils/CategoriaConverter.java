package utils;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.inject.Inject;
import javax.inject.Named;

import repository.CategoriaRepository;
import entities.Categoria;

@Named
public class CategoriaConverter implements Converter {

	@Inject
	private CategoriaRepository categoriaRepository;

	@Override
	public Object getAsObject(FacesContext arg0, UIComponent arg1, String objeto) {
		if (objeto != null) {
			return categoriaRepository.findById(Categoria.class, Long.valueOf(objeto));
		}
		return null;
	}

	@Override
	public String getAsString(FacesContext arg0, UIComponent arg1, Object arg2) {
		if (arg2 != null) {
			return String.valueOf(((Categoria) arg2).getId());
		}
		return "-1";
	}

}

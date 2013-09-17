package utils;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.inject.Inject;
import javax.inject.Named;

import repository.MarcaRepository;
import entities.Marca;

@Named
public class MarcaConverter implements Converter {

	@Inject
	private MarcaRepository marcaRepository;

	@Override
	public Object getAsObject(FacesContext arg0, UIComponent arg1, String objeto) {
		if (objeto != null) {
			return marcaRepository.findById(Marca.class, Long.valueOf(objeto));
		}
		return null;
	}

	@Override
	public String getAsString(FacesContext arg0, UIComponent arg1, Object arg2) {
		if (arg2 != null) {
			return String.valueOf(((Marca) arg2).getId());
		}
		return "-1";
	}

}

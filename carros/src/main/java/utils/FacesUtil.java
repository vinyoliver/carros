package utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.faces.application.FacesMessage;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.faces.context.Flash;
import javax.faces.model.SelectItem;

public abstract class FacesUtil {

	public static void exibirMensagemErro(String msg) {
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Atenção!", msg));
	}

	public static void exibirMensagemInformacao(String msg) {
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Atenção!", msg));
	}

	public static void exibirMensagemAviso(String msg) {
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "Atenção!", msg));
	}

	public static ExternalContext getExternalContext() {
		return FacesContext.getCurrentInstance().getExternalContext();
	}

	public static Map<String, Object> getSessionMap() {
		return FacesContext.getCurrentInstance().getExternalContext().getSessionMap();
	}

	/* O escopo Flash dura o tempo de uma requisição */
	public static Flash getFlashScope() {
		return FacesContext.getCurrentInstance().getExternalContext().getFlash();
	}

	public static Object getFlashParameter(Object obj) {
		return FacesContext.getCurrentInstance().getExternalContext().getFlash().get(obj);
	}

	public static void limparCampos() {
		FacesContext.getCurrentInstance().getViewRoot().getChildren().clear();
	}

	@SuppressWarnings("rawtypes")
	public static List<SelectItem> getSelectItems(Class<? extends Enum> tipo) {

		ArrayList<SelectItem> items = new ArrayList<SelectItem>();

		for (Enum e : tipo.getEnumConstants()) {
			items.add(new SelectItem(e.toString()));
		}
		return items;
	}
}

package es.open4job.struts;

 
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
 

 

public class BusquedaIndividual extends Action{

	public ActionForward execute(ActionMapping mapping,ActionForm form,
			HttpServletRequest request,HttpServletResponse response)
	        throws Exception {
	
	/*
		String texto = (String) request.getParameter("Texto");
		request.setAttribute("Texto", texto);
		String nombre = (String) request.getParameter("Nombre");
		request.setAttribute("Nombre", nombre);*/
			return mapping.findForward("success");
		}
	
}

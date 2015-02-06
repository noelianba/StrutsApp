package es.open4job.struts;

 
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import es.open4job.struts.model.dao.EstacionServicioDAO;
import es.open4job.struts.model.vo.EstacionServicio;
 

 

public class ListadoEstaciones extends Action{

	public ActionForward execute(ActionMapping mapping,ActionForm form,
			HttpServletRequest request,HttpServletResponse response)
	        throws Exception {
	
		EstacionServicioDAO estacionServicio = new EstacionServicioDAO();
		ArrayList<EstacionServicio> lista = estacionServicio.getListadoEstacionServicio();
		request.setAttribute("listaestacion", lista);
		

			return mapping.findForward("success");
		}
	
}

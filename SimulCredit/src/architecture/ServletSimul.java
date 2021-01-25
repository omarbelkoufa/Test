package architecture;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import metier.SimulMetier;

public class ServletSimul extends HttpServlet{
	private SimulMetier metier;
	@Override
	public void init() throws ServletException {
		metier = new SimulMetier();
		
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		req.setAttribute("mod", new ModelSimul());
		req.getRequestDispatcher("view.jsp").forward(req, resp);
		
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		ModelSimul ms = new ModelSimul();
		double montant = Double.parseDouble(req.getParameter("montant"));
		int duree = Integer.parseInt(req.getParameter("duree"));
		double taux = Double.parseDouble(req.getParameter("taux"));
		ms.setMontant(montant);
		ms.setDuree(duree);
		ms.setTaux(taux);
		double res = metier.fonctMensualite(ms.getMontant(), ms.getDuree(), ms.getTaux());
		ms.setMensualite(res);
		req.setAttribute("mod", ms);
		req.getRequestDispatcher("view.jsp").forward(req, resp);
	}
}

package com.sivavaka.test.springportlet;

import java.io.*;
import javax.portlet.*;

/**
 * A sample portlet
 */
public class SivaTestSpringPortlet extends javax.portlet.GenericPortlet {
	/**
	 * @see javax.portlet.Portlet#init()
	 */
	public void init() throws PortletException{
		super.init();
	}

	/**
	 * Serve up the <code>view</code> mode.
	 * 
	 * @see javax.portlet.GenericPortlet#doView(javax.portlet.RenderRequest, javax.portlet.RenderResponse)
	 */
	public void doView(RenderRequest request, RenderResponse response) throws PortletException, IOException {
		// Set the MIME type for the render response
		response.setContentType(request.getResponseContentType());

		//
		// TODO: auto-generated method stub for demonstration purposes
		//
		
		// Invoke the JSP to render, replace with the actual jsp name
		//PortletRequestDispatcher rd = getPortletContext().getRequestDispatcher("/_SivaTestSpringPortlet/jsp/html/SivaTestSpringPortletView.jsp");
		//rd.include(request,response);
		
		// or write to the response directly
		//response.getWriter().println("SivaTestSpringPortlet#doView()");
	}

	/**
	 * Serve up the <code>edit</code> mode.
	 * 
	 * @see javax.portlet.GenericPortlet#doEdit(javax.portlet.RenderRequest, javax.portlet.RenderResponse)
	 */
	public void doEdit(RenderRequest request, RenderResponse response) throws PortletException, IOException {
		// TODO: auto-generated method stub
	}

	/**
	 * Serve up the <code>help</code> mode.
	 * 
	 * @see javax.portlet.GenericPortlet#doHelp(javax.portlet.RenderRequest, javax.portlet.RenderResponse)
	 */
	protected void doHelp(RenderRequest request, RenderResponse response) throws PortletException, IOException {
		// TODO: auto-generated method stub
	}

	/**
	 * Process an action request.
	 * 
	 * @see javax.portlet.Portlet#processAction(javax.portlet.ActionRequest, javax.portlet.ActionResponse)
	 */
	public void processAction(ActionRequest request, ActionResponse response) throws PortletException, java.io.IOException {
		// TODO: auto-generated method stub
	}

}

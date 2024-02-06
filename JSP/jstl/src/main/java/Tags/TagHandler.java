package Tags;

import jakarta.servlet.jsp.JspException;
import jakarta.servlet.jsp.JspWriter;
import jakarta.servlet.jsp.tagext.TagSupport;

public class TagHandler extends TagSupport {

	@Override
	public int doStartTag() throws JspException {
	
	try {
		// task .. tags 
			JspWriter out=pageContext.getOut();
			out.print("<h1>THis is custom tag</h1>");
		
	} catch (Exception e) {
		// TODO: handle exception
	}
		
		return SKIP_BODY;
	}

}

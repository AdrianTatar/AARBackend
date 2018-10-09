package com.rso.aar.maintenance;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.nio.charset.Charset;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.rso.aar.common.Constant;

public class ManifestReaderServlet extends HttpServlet {

	private static final long serialVersionUID = 4792113037681095967L;

	private static final String MANIFEST_PATH_INIT_PARAM = "manifest.path";

	private static final Logger LOGGER = LoggerFactory.getLogger(ManifestReaderServlet.class);

	private String manifestContent;

	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);

		ServletContext servletContext = config.getServletContext();
		String manifestPath = config.getInitParameter(MANIFEST_PATH_INIT_PARAM);
		LOGGER.debug("Configured with manifest path \"" + manifestPath + "\"");
		InputStream manifestInputStream = servletContext.getResourceAsStream(manifestPath);
		try {
			manifestContent = inputStreamToString(manifestInputStream);
			LOGGER.debug("Built manifest content \n" + manifestContent);
		} catch (IOException e) {
			throw new ServletException(e);
		}

	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter responseWriter = response.getWriter();
		responseWriter.write(manifestContent);
	}

	private String inputStreamToString(InputStream in) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(in, Charset.defaultCharset()));
		StringBuilder stringBuilder = new StringBuilder();
		String line = null;

		while ((line = bufferedReader.readLine()) != null) {
			stringBuilder.append(line);
			stringBuilder.append(Constant.LINE_SEPARATOR);
		}

		bufferedReader.close();
		return stringBuilder.toString();
	}
}

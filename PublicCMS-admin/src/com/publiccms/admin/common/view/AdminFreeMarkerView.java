package com.publiccms.admin.common.view;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import com.publiccms.common.tools.UserUtils;
import com.publiccms.common.view.InitializeFreeMarkerView;

public class AdminFreeMarkerView extends InitializeFreeMarkerView {
	private static final String CONTEXT_ADMIN = "admin";

	protected void exposeHelpers(Map<String, Object> model, HttpServletRequest request) throws Exception {
		model.put(CONTEXT_ADMIN, UserUtils.getAdminFromSession(request));
		super.exposeHelpers(model, request);
	}
}
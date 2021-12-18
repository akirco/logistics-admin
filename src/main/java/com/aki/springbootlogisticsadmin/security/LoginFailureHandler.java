package com.aki.springbootlogisticsadmin.security;

import cn.hutool.json.JSONUtil;
import com.aki.springbootlogisticsadmin.common.Results;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component
public class LoginFailureHandler implements AuthenticationFailureHandler {
    @Override
    public void onAuthenticationFailure(HttpServletRequest request, HttpServletResponse response, AuthenticationException exception) throws IOException, ServletException {
        response.setContentType("application/json;charset=UTF-8");
        ServletOutputStream servletOutputStream = response.getOutputStream();
        Results results = Results.failRes("请检查用户名或密码是否正确！");

        servletOutputStream.write(JSONUtil.toJsonStr(results).getBytes("UTF-8"));
        servletOutputStream.flush();
        servletOutputStream.close();
    }
}

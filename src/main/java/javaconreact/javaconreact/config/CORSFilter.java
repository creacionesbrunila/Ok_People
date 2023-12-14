package javaconreact.javaconreact.config;

import jakarta.servlet.*;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Component;

import java.io.IOException;



@Component
public class CORSFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws ServletException,  IOException {
        HttpServletResponse response = (HttpServletResponse) servletResponse;
        response.setHeader("Access-Control-Allow-Origin", "*");
        response.setHeader("Access-Control-Allow-Methods", "POST, GET, PUT, OPTIONS, DELETE, PATCH");
        response.setHeader("Access-Control-Max-Age", "3600");
        response.setHeader("Access-Control-Allow-Headers", "Origin, Content-Type, Accept");
        response.setHeader("Access-Control-Expose-Headers", "Location");
        filterChain.doFilter(servletRequest, servletResponse);
    }

    @Override
    public void destroy() {

    }
//Este código implementa un filtro CORS (Cross-Origin Resource Sharing) en una aplicación Java con Spring.
// Permite solicitudes HTTP desde cualquier origen (*), define los métodos HTTP permitidos, establece tiempos de caché y
// configura los encabezados permitidos.
// En resumen, facilita el intercambio de recursos entre diferentes dominios en una aplicación web.

}


package com.distribuidora;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;




@Configuration
@EnableWebSecurity
public class SecurityConfig {
    
    
    @Autowired
    private UserDetailsService userDetailsService;

    @Autowired
    public void configurerGlobal(AuthenticationManagerBuilder build) throws Exception {
        build.userDetailsService(userDetailsService).passwordEncoder(new BCryptPasswordEncoder());
    }
   
  
      @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http)
            throws Exception {
        http
                
                .authorizeHttpRequests((requests) -> requests
                .requestMatchers(
                        "/",
                        "/index",
                        "/errores/**",
                        "/pedido/listado",
                        "/consulta/listado",
                        "/evento/listado",
                        "/oferta/listado",
                        "../../static/img/Evento1.png",
                        "/webjars/**").permitAll()
                        
                       
                .requestMatchers(
                        "/seguridad/listado",
                        "/seguridad/nuevo",
                        "/seguridad/guardar",
                        "/seguridad/editar/**",
                        "/seguridad/eliminar/**"
                        )
                
                .hasRole("ADMIN" )
                
                        
         
                        
                .requestMatchers(
                        "/carrito/nuevo",
                        "/carrito/guardar",
                        "/carrito/editar/**",
                        "/carrito/eliminar/**",
                       "/consulta/listado",
                       "/consulta/eliminar",
                       "/consulta/guardar",
                        "/venta/nuevo",
                        "/venta/guardar",
                        "/venta/editar/**",
                       "/evento/listado",

                        "/venta/eliminar/**")
                .hasRole("USER")   
                     
                        
                 .requestMatchers(
                       "/pedido/nuevo",
                        "/pedido/guardar",
                        "/pedido/editar/**",
                        "/pedido/eliminar/**",
                        "/venta/nuevo",
                         "/evento/listado",

                        "/venta/guardar",
                        "/venta/editar/**",
                        "/venta/eliminar/**")
                .hasAnyRole("ADMIN", "VENDEDOR")
                       
                        
                .requestMatchers(
                        "/carrito/listado",
                        "/pedido/listado",
                        "/venta/listado",
                        "/evento/listado"
                )
                .hasAnyRole("ADMIN", "VENDEDOR", "USER")
               .requestMatchers(
                       "/css/**", 
                       "/js/**", 
                       "../../static/img/Evento1.png",
                       "/img/**" 
                ).permitAll()
                
                
                )
                
                
                
                .formLogin((form) -> form
                .loginPage("/login")
                .permitAll())
                .logout((logout) -> logout.permitAll())
                .exceptionHandling().accessDeniedPage("/errores/403");
        return http.build();
    }
   

    
    }

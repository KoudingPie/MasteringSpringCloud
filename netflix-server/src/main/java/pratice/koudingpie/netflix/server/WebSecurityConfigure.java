package pratice.koudingpie.netflix.server;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * @author 何祥敏
 * @since 2019-12-01
 */
//@EnableWebSecurity
////@Configuration
//public class WebSecurityConfigure extends WebSecurityConfigurerAdapter {
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//
//        http.csrf().disable();
//        http.httpBasic(); //开启认证
//
//
//        System.out.println("csrf disabled-------------");
//        super.configure(http);
//    }
//}
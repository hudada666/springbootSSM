package cn.study.microboot.config;


/*import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.boot.web.servlet.ErrorPage;
import org.springframework.context.annotation.Bean;*/
import org.springframework.context.annotation.Configuration;
//import org.springframework.http.HttpStatus;

@Configuration
public class ErrorPageConfig {
/*    @Bean
    public EmbeddedServletContainerCustomizer containerCustomizer(){
        return new EmbeddedServletContainerCustomizer(){

            @Override
            public void customize(ConfigurableEmbeddedServletContainer configurableEmbeddedServletContainer) {
                ErrorPage errorPage400 = new ErrorPage(HttpStatus.BAD_REQUEST,"/error-400.html");
                ErrorPage errorPage405 = new ErrorPage(HttpStatus.NOT_FOUND,"/error-405.html");
                ErrorPage errorPage500 = new ErrorPage(HttpStatus.INTERNAL_SERVER_ERROR,"/error-500.html");
                configurableEmbeddedServletContainer.addErrorPages(errorPage400,errorPage405,errorPage500);
            }
        };
    }*/
}

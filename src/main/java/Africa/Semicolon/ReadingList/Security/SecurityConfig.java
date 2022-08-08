package Africa.Semicolon.ReadingList.Security;

import Africa.Semicolon.ReadingList.Data.Repository.ReadingListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Autowired
    private ReadingListRepository repository;

    public SecurityConfig(ReadingListRepository readingListRepository){
        this.repository=readingListRepository;
    }
    public void configure(HttpSecurity http) throws Exception{
        http.authorizeRequest
    }

}

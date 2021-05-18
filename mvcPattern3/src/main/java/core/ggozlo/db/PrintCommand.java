package core.ggozlo.db;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.zaxxer.hikari.HikariDataSource;

@Service
@Component
public class PrintCommand implements SCommand {

	private final OracleScoreRepository repository;
	
	
	@Autowired
	public PrintCommand(OracleScoreRepository repository) {
		this.repository = repository;
	}
	
	@Override
	public void execute(Object object) {
		Model model =  (Model)object;
		model.addAttribute(repository.scorePrint());
		
	
	}

}

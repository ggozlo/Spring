package core.ggozlo.db;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Component
public class SaveCommand  implements SCommand{

	
	private final OracleScoreRepository repository;
	
	
	@Autowired
	public SaveCommand(OracleScoreRepository repository) {
		super();
		this.repository = repository;
	}


	@Override
	public void execute(Object object) {
		
		repository.scoreSave((Score)object);
	}

}

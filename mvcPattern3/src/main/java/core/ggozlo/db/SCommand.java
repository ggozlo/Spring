package core.ggozlo.db;


import org.springframework.stereotype.Service;

@Service
public interface SCommand {
	public void execute(Object object);

}

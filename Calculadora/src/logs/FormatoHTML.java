package logs;

import java.util.logging.Formatter;
import java.util.logging.Handler;
import java.util.logging.LogRecord;

public class FormatoHTML extends Formatter {

	@Override
	public String format(LogRecord record) {
		String[] array = record.getMessage().split("\\|");
		//Obtengo la parte "Resultado: XX":
		return "<P> \n"+array[array.length-1] + "\n </P> \n";
	}
	
	@Override
	public String getHead(Handler h) {
		return "<HTML> \n <BODY> \n";
	}
	
	@Override
	public String getTail(Handler h) {
		return "</BODY> \n </HTML> \n";
	}


}

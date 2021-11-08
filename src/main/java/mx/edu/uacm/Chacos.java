package mx.edu.uacm;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Qualifier;

@Component
@Qualifier("chacos")
public class Chacos implements Arma {

}

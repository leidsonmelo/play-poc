package controllers;

import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;

public class Pessoa extends Controller{
    
	public static Form<models.Pessoa> pessoaForm = Form.form(models.Pessoa.class);
	
    public static Result pessoaFisica(){
    	return ok(
    		views.html.pessoa.pessoa.render(
    			"Pessoa Fisica", 
    			views.html.bootstrap.render(), 
    			views.html.pessoa.pessoafisica.render()
    		)
    	);
    }
    
    public static Result pessoaJuridica(){
    	return ok(
    		views.html.pessoa.pessoa.render(
    			"Pessoa Juridica", 
    			views.html.bootstrap.render(), 
    			views.html.pessoa.pessoajuridica.render()
    		)
    	);
    }

    public static Result gravar() {
        Form<models.Pessoa> form = pessoaForm.bindFromRequest();
        return pessoaFisica();
    }

}

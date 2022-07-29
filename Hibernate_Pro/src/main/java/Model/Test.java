package Model;

import java.sql.Date;

import Dao.DaoAdmin;
import Dao.DaoEmpl;

public class Test {

    
    public static void main(String[] args) {
    	
    	DaoEmpl daoemploye = new DaoEmpl();
    	DaoAdmin daoadministateur = new DaoAdmin();
    	
    	Administr administrateurs [] = new Administr[2];
    	administrateurs [0]  = new Administr("seny balde","1234@seny","seny.balde@gmail.com");
    	administrateurs [1]  = new Administr("sana balde","sanahito","sana.histo@gmail.com");
    	
    	//daoadministateur.save(administrateurs [0] );
    	//daoadministateur.save(administrateurs [1]);
    	
		Employe employes[] = new Employe[2];
		employes[0] = new Employe("seny","balde","gertrude@gmail.com","+212637701350",88000.0,"Agadir",Date(25/03/1993));
		 
		//daoemploye.find_ALL();
		/*
		employes[1] = new Employe("Soubapé","BV","nawan@gmail.com","+212626601350",20000.0,"bayti1 Imm 15 Hay Mohammedi",
				new Date(12/06/2022),"En poste","Cadre supérieur");
		employes[2] = new Employe("Soubapé","BV","nawan@gmail.com","+212626601350",20000.0,"bayti1 Imm 15 Hay Mohammedi",
				new Date(12/06/2022),"En poste","Cadre supérieur");
		daoemploye.save(employes[0]); 
		daoemploye.save(employes[1]);
		daoemploye.save(employes[2]);
		*/
    	
    	//suppression des enregistrements dans la base de données
    	//daoadministateur.delete(1L);
		daoemploye.delete(4L);
    	
	}

	private static Date Date(int i) {
		// TODO Auto-generated method stub
		return null;
	}
    
    }



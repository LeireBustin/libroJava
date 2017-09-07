import junit.framework.TestCase;

public class ParticipanteTest extends TestCase {
	
public void testConstructorVacio(){
		
		Participante p = new Participante();
		assertEquals("", p.getNombre() );
		assertEquals("", p.getUsuarioGit() );
		assertEquals("", p.getEmail() );
		assertEquals("https://github.com/", p.getLinkGitHub() );
		assertFalse(p.isTrabajador());
			
	}
	
	public void testConstructor(){
		
		Participante p1 = new Participante("ander", "anderuraga");
		p1.setEmail("auraga@ipartek.com");		
				
		assertEquals("ander", p1.getNombre() );
		assertEquals("anderuraga", p1.getUsuarioGit());
		assertEquals("auraga@ipartek.com", p1.getEmail() );
		assertFalse(p1.isTrabajador());
		assertEquals("https://github.com/anderuraga", p1.getLinkGitHub() );
	}
	
/*
	public void testConstructorVacio() {
		Participante p = new Participante();
		assertEquals("", p.getNombre());
		assertEquals("", p.getUsuarioGithub());
		assertEquals("", p.getEmail());
		assertEquals("https://github.com/",p.getUsuarioGithub);
		assertFalse(p.isTrabajador());
	}
	
	public void testConstructor() {
		
		Participante ander = new Participante("ander", "uraga");
		p1.setEmail("ander@hjhjk");
		
		assertEquals("ander", p1.nombre);
		assertEquals("Anderuraga", p1.usuarioGithub);
		assertEquals("hghjjk@sfs",p1.email);
		assertEquals("https://github.com/",p1.getUsuarioGithub);
		assertFalse(p1.isTrabajador());
*/
	
		
}
	


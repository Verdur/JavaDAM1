package proyecto;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class entregaJunit {
	
	@Test
	void testY() {
		assertEquals(true, new metodoJunit.metodos(true,true).compruebaY());
		assertEquals(false, new metodoJunit.metodos(false,false).compruebaY());
		assertEquals(false, new metodoJunit.metodos(true,false).compruebaY());
		assertEquals(false, new metodoJunit.metodos(false,true).compruebaY());
	}
	@Test
	void testO() {
		assertEquals(true, new metodoJunit.metodos(true,true).compruebaO());
		assertEquals(false, new metodoJunit.metodos(false,false).compruebaO());
		assertEquals(true, new metodoJunit.metodos(true,false).compruebaO());
		assertEquals(true, new metodoJunit.metodos(false,true).compruebaO());
	}
	@Test
	void testNo() {
		assertEquals(true, new metodoJunit.metodos(false,false).compruebaNo());
		assertEquals(false, new metodoJunit.metodos(true,true).compruebaNo());
	}

}

class metodoJunitTest extends junit.framework.TestCase{
    	
       public void testY() {
        assertEquals(true, new metodoJunit.metodos(true,true).compruebaY());
    	assertEquals(false, new metodoJunit.metodos(false,false).compruebaY());
    	assertEquals(false, new metodoJunit.metodos(true,false).compruebaY());
    	assertEquals(false, new metodoJunit.metodos(false,true).compruebaY());
	}
    
	public void testO() {
		assertEquals(true, new metodoJunit.metodos(true,true).compruebaO());
		assertEquals(false, new metodoJunit.metodos(false,false).compruebaO());
    	assertEquals(true, new metodoJunit.metodos(true,false).compruebaO());
		assertEquals(true, new metodoJunit.metodos(false,true).compruebaO());
	}

    	public void testNo() {
    		assertEquals(true, new metodoJunit.metodos(false,false).compruebaNo());
    		assertEquals(false, new metodoJunit.metodos(true,true).compruebaNo());
	}

}


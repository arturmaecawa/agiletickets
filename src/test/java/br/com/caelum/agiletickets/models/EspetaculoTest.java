package br.com.caelum.agiletickets.models;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import java.util.List;

import org.joda.time.LocalDate;
import org.joda.time.LocalTime;
import org.junit.Test;

public class EspetaculoTest {
	@Test
	public void deveCriarApenasUmaSessaoCasoAsDatasSejamIguaisEAPeriodicidadeDiaria(){
		Espetaculo espetaculo = new Espetaculo();

		LocalDate dataInicio = new LocalDate(2010, 1, 1);
		LocalDate dataFim = new LocalDate(2010, 1, 1);
		LocalTime horario = null;
		
		List<Sessao> retorno = espetaculo.criaSessoes(dataInicio, dataFim, horario, Periodicidade.DIARIA);
		
		assertThat(retorno.size(), is(1));
		
	}
	@Test
	public void deveCriaSeteSessoesCasoAPeriodicidadeSejaSemanal(){
		Espetaculo espetaculo = new Espetaculo();
		LocalDate semanaInicio = new LocalDate(2010, 1, 1);
		LocalDate semanaFim = new LocalDate(2010, 1,8);
		LocalTime horario = null;
		List<Sessao> retorno = espetaculo.criaSessoes(semanaInicio, semanaFim, horario, Periodicidade.SEMANAL);
		assertThat(retorno.size(), is(7));
		
	}
	
	@Test
	public void deveCriaQuatorzeSessoesCasoAPeriodicidadeSejaSemanalEDiasSejam16(){
		Espetaculo espetaculo = new Espetaculo();
		LocalDate semanaInicio = new LocalDate(2010, 1, 1);
		LocalDate semanaFim = new LocalDate(2010, 1,16);
		LocalTime horario = null;
		List<Sessao> retorno = espetaculo.criaSessoes(semanaInicio, semanaFim, horario, Periodicidade.SEMANAL);
		assertThat(retorno.size(), is(14));
		
	}

}

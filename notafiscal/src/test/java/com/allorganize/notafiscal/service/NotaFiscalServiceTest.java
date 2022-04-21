package com.allorganize.notafiscal.service;

import com.allorganize.notafiscal.domain.NotaFiscalVO;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;
@ExtendWith(MockitoExtension.class)
public class NotaFiscalServiceTest {


    private  NotaFiscalService service;

    @BeforeEach

     public void iniciaCadaTeste(){

         service = new NotaFiscalService();

     }

    @Test
    @DisplayName("Lançar exceção quando o objeto nota fiscal for null")

    public void  quandoInformarNotaFiscalNull_LancarExcecao(){

        NotaFiscalVO notaFiscalVO = null;

        var assertThrows = assertThrows(IllegalArgumentException.class,
                ()->service.criarNotaFiscal(notaFiscalVO));

        assertEquals("A nota fiscal precisa ser instanciada", assertThrows.getMessage());
    }
    // Critério - 01
    @Test
    @DisplayName("Lançar exceção quando a UF da nota fiscal for null")
    public void quandoNaoInformarUF_LancarExcecao(){

        NotaFiscalVO notaFiscalVO = new NotaFiscalVO();

        var assertThrows = assertThrows(IllegalArgumentException.class,
                ()->service.criarNotaFiscal(notaFiscalVO));
        assertEquals("A uf precisa ser informada.", assertThrows.getMessage());


    }

    // Critério - 02
    @Test
    @DisplayName("Lançar exceção quando a data da nota fiscal for null")
    public void quandoNaoInformarDataDaNf_LancarExcecao(){

        NotaFiscalVO notaFiscalVO = new NotaFiscalVO();
        notaFiscalVO.setUf("SP");

        var assertThrows = assertThrows(IllegalArgumentException.class,
                ()->service.criarNotaFiscal(notaFiscalVO));
        assertEquals("A data da venda precisa ser informada.", assertThrows.getMessage());


    }

    // Critério - 2.1
    @Test
    @DisplayName("Lançar exceção quando a hora da nota fiscal for null")
    public void quandoNaoInformaAHoraDaNotaFiscal_LancarExcecao(){

        NotaFiscalVO notaFiscalVO = new NotaFiscalVO();
        notaFiscalVO.setUf("SP");
        notaFiscalVO.setDataVenda(LocalDate.now());


        var assertThrows = assertThrows(IllegalArgumentException.class,
                ()->service.criarNotaFiscal(notaFiscalVO));
        assertEquals("A hora da venda precisa ser informada.", assertThrows.getMessage());

//
    }

}
















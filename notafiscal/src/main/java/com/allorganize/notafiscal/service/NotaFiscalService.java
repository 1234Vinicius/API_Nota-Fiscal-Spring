// olá
package com.allorganize.notafiscal.service;

import com.allorganize.notafiscal.domain.NotaFiscalVO;

import java.util.Optional;

public class NotaFiscalService {
    public void criarNotaFiscal(NotaFiscalVO notaFiscalVo) {

        Optional.ofNullable(notaFiscalVo)
                .orElseThrow(() -> new IllegalArgumentException("A nota fiscal precisa ser instanciada"));
        Optional.ofNullable(notaFiscalVo.getUf())
                .orElseThrow(() -> new IllegalArgumentException("A uf precisa ser informada."));

        Optional.ofNullable(notaFiscalVo.getDataVenda())
                .orElseThrow(() -> new IllegalArgumentException("A data da venda precisa ser informada."));

        Optional.ofNullable(notaFiscalVo.getHoraVenda())
                .orElseThrow(() -> new IllegalArgumentException("A hora da venda precisa ser informada."));

    }

}




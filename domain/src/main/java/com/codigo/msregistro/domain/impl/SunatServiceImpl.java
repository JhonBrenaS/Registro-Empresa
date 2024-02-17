package com.codigo.msregistro.domain.impl;

import com.codigo.msregistro.domain.aggregates.response.ResponseReniec;
import com.codigo.msregistro.domain.aggregates.response.ResponseSunat;
import com.codigo.msregistro.domain.ports.in.SunatServiceIn;
import com.codigo.msregistro.domain.ports.out.RestReniecOut;
import com.codigo.msregistro.domain.ports.out.RestSunatOut;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SunatServiceImpl implements SunatServiceIn {
    private final RestSunatOut sunatOut;

    @Override
    public ResponseSunat getInfoIn(String numero) {
        return sunatOut.getInfoSunat(numero);
    }
}

package br.robodroolsproducer.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.robodroolsproducer.model.N91;
import br.robodroolsproducer.service.N91Producer;

@RestController
@RequestMapping("/n91")
public class N91Rest {

    @Autowired
    private N91Producer n91producer;

    // http://localhost:8180/rest/n91/enviar/1/2
    @GetMapping("enviar/{coProjeto}/{coCurso}")
    @ResponseBody
    public ResponseEntity<String> validar(final @PathVariable Long coProjeto, final @PathVariable Long coCurso) {
        final N91 n91 = new N91();
        n91.setCoProjeto(coProjeto);
        n91.setCoCurso(coCurso);
        n91producer.sendMessage(n91.toString());
        return ResponseEntity.ok(".");
    }

}

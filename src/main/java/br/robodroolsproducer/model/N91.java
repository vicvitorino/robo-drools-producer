package br.robodroolsproducer.model;

import lombok.Data;

@Data
public class N91 {

    private Long coProjeto;
    private Long coCurso;
    private String noCurso;

    @Override
    public String toString() {
        return "{\"coProjeto\": " + ((coProjeto == null) ? "null" : coProjeto) + "," +
            "\"coCurso\": " + ((coCurso == null) ? "null" : coCurso) + "," +
            "\"noCurso\": " + ((noCurso == null) ? "null" : "\"" + noCurso + "\"") + "}";
    }

}

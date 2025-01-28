package br.ufrn.imd.dao;

import br.ufrn.imd.model.Lebre;
import java.util.ArrayList;
import java.util.List;

public class RaceRepository {
    private final List<Lebre> lebres = new ArrayList<>();

    public void salvarLebre(Lebre lebre) {
        lebres.add(lebre);
    }

    public List<Lebre> getLebres() {
        return new ArrayList<>(lebres);
    }
}

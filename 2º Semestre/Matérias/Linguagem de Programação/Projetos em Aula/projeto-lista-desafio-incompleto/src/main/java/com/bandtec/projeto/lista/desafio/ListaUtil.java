package com.bandtec.projeto.lista.desafio;

import java.util.ArrayList;
import java.util.List;

public class ListaUtil {

    private List<Integer> inteiros;

    public ListaUtil() {

    }

    public Integer count() {
        return inteiros.size();
    }

    public void add(Integer valor) {
        if (valor != null) {
            inteiros.add(valor);
        }
    }

    public void remove(Integer valor) {
        if (valor != null) {
            inteiros.remove(valor);
        }
    }

    public Integer countPares() {
        Integer contadorPares = 0;

        for (int i = 0; i < inteiros.size(); i++) {
            if (i % 2 == 0) {
                contadorPares++;
            }
        }
        return contadorPares;
    }

    public Integer countImpares() {
        Integer contadorImpares = 0;

        for (int i = 0; i < inteiros.size(); i++) {
            if (i % 2 == 1) {
                contadorImpares++;
            }
        }
        return contadorImpares;
    }

    public Integer somar() {
        Integer total = 0;

        if (inteiros.size() == 0) {
            return 0;
        } else {
            for (int i = 0; i < inteiros.size(); i++) {
                total += i;
            }
        }
        return total;
    }

    public Integer getMaior() {
        Integer maiorNumero = 0;

        if (inteiros.size() == 0) {
            return 0;
        } else {
            for (int i = 0; i < inteiros.size(); i++) {
                if (i > maiorNumero) {
                    maiorNumero = i;
                }
            }
        }
        return maiorNumero;
    }

    public Integer getMenor() {
        Integer menorNumero = 0;

        if (inteiros.size() == 0) {
            return 0;
        } else {
            for (int i = 0; i < inteiros.size(); i++) {
                if (i < menorNumero) {
                    menorNumero = i;
                }
            }
        }
        return menorNumero;
    }

    public Boolean hasDuplicidade() {
        for (int i = 0; i < inteiros.size(); i++) {
            if (inteiros.size() == 0) {

            }
        }
        return null;
    }
}

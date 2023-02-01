package br.com.faro.utils;

import java.util.Calendar;
import java.util.Date;

import static java.util.Calendar.*;

public class DataUtils {


    public static Date adicionarDias(Date data, int dias){
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(data);
        calendar.add(DAY_OF_MONTH,dias);
        return calendar.getTime();
    }

    public static Date obterDataComDiferencaDias(int dias){
        return adicionarDias(new Date(),dias);
    }


    public static Date obterData(int dia, int mes, int ano){
        Calendar calendar = Calendar.getInstance();
        calendar.set(DAY_OF_MONTH,dia);
        calendar.set(MONTH, mes-1);
        calendar.set(YEAR, ano);
        return calendar.getTime();
    }

    public static boolean isMesmaData(Date data1, Date data2){
        Calendar calendar1 = Calendar.getInstance();
        calendar1.setTime(data1);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTime(data2);
        return (calendar1.get(DAY_OF_MONTH) == calendar2.get(DAY_OF_MONTH))
                && (calendar1.get(MONTH) == calendar2.get(MONTH))
                && (calendar1.get(YEAR) == calendar2.get(YEAR));
    }


    public static boolean verificaDiaSemana(Date data, int diaSemana) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(data);
        return calendar.get(DAY_OF_WEEK) == diaSemana;
    }
}

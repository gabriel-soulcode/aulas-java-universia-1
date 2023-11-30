package aula_05;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;



public class Data {
  
  public static void main(String[] args) {
    // LocalDate, LocalTime
    LocalDate dataAtual = LocalDate.now();
    System.out.println(dataAtual);

    LocalTime horaAtual = LocalTime.now();
    System.out.println(horaAtual);

    DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    // String dataFormatada = formatador.format(dataAtual);
    // System.out.println(dataFormatada);
    System.out.println(formatador.format(dataAtual));

    DateTimeFormatter formatador2 = DateTimeFormatter.ofPattern("HH:mm:ss");
    System.out.println(formatador2.format(horaAtual));

    LocalDateTime dataHoraAtual = LocalDateTime.now();
    System.out.println(dataHoraAtual);
    DateTimeFormatter formatador3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
    System.out.println(formatador3.format(dataHoraAtual));

    LocalDate natal = LocalDate.of(2023, 12, 25);
    System.out.println(formatador.format(natal));

    LocalTime almoco = LocalTime.of(12, 0, 0);
    System.out.println(formatador2.format(almoco));

    LocalDate anoNovo = LocalDate.parse("2024-01-01");
    System.out.println(formatador.format(anoNovo));

    LocalTime meiaNoite = LocalTime.parse("00:00:00");
    System.out.println(formatador2.format(meiaNoite));

    meiaNoite = meiaNoite.plusHours(2);
    meiaNoite = meiaNoite.plusMinutes(45);
    meiaNoite = meiaNoite.plusSeconds(22);
    System.out.println(formatador2.format(meiaNoite));

    natal = natal.plusDays(6);
    natal = natal.plusMonths(2);
    natal = natal.plusYears(3);
    natal = natal.minusDays(28);
    System.out.println(formatador.format(natal));

    LocalDate dayOfChildren = LocalDate.parse("2024-10-12");
    LocalTime timeForWork = LocalTime.of(9, 0, 0);
    System.out.println("Mês " + dayOfChildren.getMonthValue());
    System.out.println("Dia " + dayOfChildren.getDayOfMonth());
    System.out.println("Horas: " + timeForWork.getHour());

    LocalDate data1 = LocalDate.of(2023, 12, 7);
    LocalDate data2 = data1.plusDays(9);
    System.out.println(formatador.format(data1));
    System.out.println(formatador.format(data2));

    boolean flagAfter = data1.isAfter(data2);
    System.out.println(flagAfter);
    boolean flagBefore = data1.isBefore(data2);
    System.out.println(flagBefore);
    boolean flagEqual = data1.isEqual(data2);
    System.out.println(flagEqual);
  }
}
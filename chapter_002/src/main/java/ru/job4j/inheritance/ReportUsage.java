package ru.job4j.inheritance;

public class ReportUsage {
    public static void main(String[] args) {
        TextReport report = new TextReport();
        String text = report.generate("Report's name", "Report's body");
        System.out.println(text);

        TextReport htmlReport = new HtmlReport();
        String html = htmlReport.generate("Report's name", "Report's body");
        System.out.println(html);

        TextReport jsonReport = new JSONReport();
        String json = jsonReport.generate("Report's name", "Report's body");
        System.out.println(json);
    }
}

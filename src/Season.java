public enum Season {
    AUTUMN("jesień", new String[]{"wrzesień", "październik", "listopad", "grudzień"}),
    WINTER("zima", new String[]{"grudzień", "styczeń", "luty","marzec"}),
    SPRING("wiosna", new String[] {"marzec","kwiecień","maj", "czerwiec"}),
    SUMMER("lato", new String[] {"czerwiec","lipiec","sierpień", "wrzesień"});

    private String polishName;

    private String[] months;

    Season(String polishName, String[] months) {
        this.polishName = polishName;
        this.months = months;
    }

    public String getPolishName() {
        return polishName;
    }

    public String[] getMonths() {
        return months;
    }
}

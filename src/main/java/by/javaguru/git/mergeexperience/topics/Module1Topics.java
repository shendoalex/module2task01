package by.javaguru.git.mergeexperience.topics;

public enum Module1Topics {
    JAKARTA(1, "Jakarta ", "Обзор java enterprise технологий",true, "module1theme1"),
    MAVEN(2, "Apache Maven ", "Изучение сборщика проектов Maven", false, ""),
    TOMCAT(3, "Apache Tomcat ", "Изучение основ HTTP, TCP/IP и web сервера Tomcat",false,""),
    SERVLET(4, "HttpServlet ", "Освоение технологии java сервлетов", false, ""),
    GIT(5, "GIT ", "Работа с системой контроля версий GIT", false,"");

    private int order;
    private String topic;
    private String desc;
    private boolean descriptionAvailable;
    private String descriptionLink;

    Module1Topics(int order, String topic, String desc, boolean descriptionAvailable, String descriptionLink) {
        this.order = order;
        this.topic = topic;
        this.desc = desc;
        this.descriptionAvailable = descriptionAvailable;
        this.descriptionLink = descriptionLink;
    }

    public int getOrder() {
        return order;
    }

    public String getTopic() {
        return topic;
    }

    public String getDesc() {
        return desc;
    }

    public boolean isDescriptionAvailable() {
        return descriptionAvailable;
    }

    public String getDescriptionLink() {
        return descriptionLink;
    }
}

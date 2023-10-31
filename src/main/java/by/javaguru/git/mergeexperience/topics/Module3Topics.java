package by.javaguru.git.mergeexperience.topics;

public enum Module3Topics {
    HIBERNATE(1, "HIBERNATE", "Введение в HIBERNATE", false, ""),
    OBJECTS_IN_HIBERNATE(2, "Objects in HIBERNATE", "Работа с объектами в HIBERNATE", false, ""),
    OBJECT_RELATIONAL_MODEL(3, "Object-relational model", "Основы отображения объектно-реляционной модели", false, ""),
    CLASS_HIERARCHY(4, "Class hierarchy", "Отображение иерархии классов", false, ""),
    RELATIONSHIP(5, "Relationships", "Отображение отношений", false, ""),
    HQL_JPQL(6, "HQL/JPQL", "Объектно-ориентированный языек запросов", false, ""),
    CRITERIA_JPA(7, "CRITERIA JPA", "Запросы CRITERIA JPA", false, ""),
    TRANSACTIONS_AND_CONCURRENCY(8, "Transactions and concurrency", "Транзакции и параллелизм", false, "");

    private int order;
    private String topic;
    private String desc;
    private boolean descriptionAvailable;
    private String descriptionLink;

    Module3Topics(int order, String topic, String desc, boolean descriptionAvailable, String descriptionLink) {
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

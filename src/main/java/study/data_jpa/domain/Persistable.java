package study.data_jpa.domain;

public interface Persistable <ID>{
    ID getId();
    boolean isNew();
}

package org.example.demo3;

public class User {
    public String fieldPublic;
    private String fieldPrivate;
    private final String fieldPrivateFinal="privateFinal";

    public String getFieldPublic() {
        return fieldPublic;
    }

    public void setFieldPublic(String fieldPublic) {
        this.fieldPublic = fieldPublic;
    }

    public String getFieldPrivate() {
        return fieldPrivate;
    }

    public void setFieldPrivate(String fieldPrivate) {
        this.fieldPrivate = fieldPrivate;
    }

    public String getFieldPrivateFinal() {
        return fieldPrivateFinal;
    }

    @Override
    public String toString() {
        return "User{" +
                "fieldPublic='" + fieldPublic + '\'' +
                ", fieldPrivate='" + fieldPrivate + '\'' +
                ", fieldPrivateFinal='" + fieldPrivateFinal + '\'' +
                '}';
    }
}

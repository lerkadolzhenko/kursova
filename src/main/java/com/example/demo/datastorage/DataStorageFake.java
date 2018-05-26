package com.example.demo.datastorage;

import com.example.demo.model.*;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class DataStorageFake {
    private List<Abonement> abonement = new ArrayList<>();
    {
        abonement.add(new Abonement(1,"Абдул Салім","постійний","2017-9-1","2021-4-1"));
        abonement.add(new Abonement(2,"Бабюк Петро","постійний","2017-9-1","2021-4-1"));
        abonement.add(new Abonement(3,"Базалюк Віталій","постійний","2017-9-1","2021-4-1"));
        abonement.add(new Abonement(4,"Бузілов Олексій","міжбібліотечний","2016-9-1","2016-10-1"));
        abonement.add(new Abonement(5,"Вишиван Валентин","міжбібліотечний","2018-3-1","2021-4-1"));
        abonement.add(new Abonement(6,"Дронь Віталій","міжбібліотечний","2018-1-1","2018-2-28"));
        abonement.add(new Abonement(7,"Долженко Валерія","разовий","2018-1-10","2018-1-11"));
        abonement.add(new Abonement(8,"Єсипчук Андрій","разовий","2018-4-3","2018-4-4"));
        abonement.add(new Abonement(9,"Іванюк Андрій","разовий","2018-3-28","2018-3-29"));
        abonement.add(new Abonement(10,"Осадчук Роман","разовий","2018-4-1","2018-4-2"));
        abonement.add(new Abonement(11,"Попелишко Наталія","разовий","2018-4-2","2018-4-3"));
        abonement.add(new Abonement(12,"Янцеловська Яна","разовий","2018-3-29","2018-3-30"));
        abonement.add(new Abonement(13,"Шилепницький Владислав","разовий","2018-4-3","2018-3-30"));
        abonement.add(new Abonement(14,"Комісарчук Володимир","постійний","2006-9-1","2026-9-1"));
        abonement.add(new Abonement(15,"Миронів Іван","постійний","2001-9-1","2021-9-1"));
    }

    public List<Abonement> getAbonement() {
        return abonement;
    }

    public void setAbonement(List<Abonement> abonement) {
        this.abonement = abonement;
    }

    private List<Bans> bans = new ArrayList<>();
    {
        bans.add(new Bans(1,"Бузілов Олексій","2016-10-2","2016-12-2"));
        bans.add(new Bans(2,"Бабюк Петро","2018-3-30","2018-4-10"));
    }

    public List<Bans> getBans() {
        return bans;
    }

    public void setBans(List<Bans> bans) {
        this.bans = bans;
    }

    private List<Books> books = new ArrayList<>();
    {
        books.add(new Books(1,"читальна зала 1","Сторонній","Альбер Камю",1942, 100, 1000, 2));
        books.add(new Books(2,"читальна зала 1","У пошуках утраченого часу","Марсель Пруст",1913, 100, 1000, 3));
        books.add(new Books(3,"читальна зала 1","Процес","Франц Кафка",1925, 100, 100, 4));
        books.add(new Books(4,"читальна зала 1","Маленький принц","Антуан де Сент-Екзюпері",1943, 100, 1000, 5));
        books.add(new Books(5,"читальна зала 1","Умови людського існування","Андре Мальро",1933, 100, 100, 6));
        books.add(new Books(6,"читальна зала 2","Подорож на край ночі","Луї-Фердинанд Селін",1932, 100, 2000, 7));
        books.add(new Books(7,"читальна зала 2","Грона гніву","Джон Стейнбек",1939, 100, 2300, 1));
        books.add(new Books(8,"читальна зала 2","По кому подзвін","Ернест Хемінгуей",1940, 100, 4000, 8));
        books.add(new Books(9,"читальна зала 2","Великий Мольн","Ален-Фурньє",1913, 100, 890, 8));
        books.add(new Books(10,"читальна зала 2","Піна днів","Борис Віан",1947, 100, 300, 9));
        books.add(new Books(11,"абонементи","Друга стать","Сімона де Бовуар",1949, 100, 480, 10));
        books.add(new Books(12,"абонементи","Чекаючи на Ґодо","Семюел Беккет",1952, 100, 490, 10));
        books.add(new Books(13,"абонементи","Буття й ніщо","Жан-Поль Сартр",1943, 100, 500, 12));
        books.add(new Books(14,"абонементи","Імя рози","Умберто Еко",1980, 100, 500, 12));
        books.add(new Books(15,"абонементи","Архіпелаг ГУЛАГ","Олександр Солженіцин",1973, 100, 300, 12));
    }

    public List<Books> getBooks() {
        return books;
    }

    public void setBooks(List<Books> books) {
        this.books = books;
    }
    private  List<Booksdeliver> booksdeliver = new ArrayList<>();
    {
        booksdeliver.add(new Booksdeliver(1,"Сторонній","читальна зала 1",20,"2018-4-5"));
        booksdeliver.add(new Booksdeliver(2,"У пошуках утраченого часу","читальна зала 1",20,"2018-4-5"));
        booksdeliver.add(new Booksdeliver(3,"Процес","читальна зала 1",20,"2018-4-5"));
        booksdeliver.add(new Booksdeliver(4,"Маленький принц","читальна зала 1",20,"2018-4-1"));
        booksdeliver.add(new Booksdeliver(5,"Умови людського існування","читальна зала 1",20,"2018-4-1"));
        booksdeliver.add(new Booksdeliver(6,"Подорож на край ночі","читальна зала 2",20,"2018-4-1"));
        booksdeliver.add(new Booksdeliver(7,"Грона гніву","читальна зала 2",20,"2018-3-27"));
        booksdeliver.add(new Booksdeliver(8,"По кому подзвін","читальна зала 2",20,"2018-3-27"));
        booksdeliver.add(new Booksdeliver(9,"Великий Мольн","читальна зала 2",20,"2018-3-27"));
        booksdeliver.add(new Booksdeliver(10,"Піна днів","читальна зала 2",20,"2018-3-27"));
        booksdeliver.add(new Booksdeliver(11,"Друга стать","абонементи",20,"2018-3-27"));
        booksdeliver.add(new Booksdeliver(12,"Чекаючи на Ґодо","абонементи",20,"2018-3-27"));
        booksdeliver.add(new Booksdeliver(13,"Буття й ніщо","абонементи",20,"2018-3-27"));
        booksdeliver.add(new Booksdeliver(14,"Імя рози","абонементи",20,"2018-3-27"));
        booksdeliver.add(new Booksdeliver(15,"Архіпелаг ГУЛАГ","абонементи",20,"2018-3-27"));
    }

    public List<Booksdeliver> getBooksdeliver() {
        return booksdeliver;
    }

    public void setBooksdeliver(List<Booksdeliver> booksdeliver) {
        this.booksdeliver = booksdeliver;
    }

    private List<Booksissuance> booksissuance =new ArrayList<>();
    {
        booksissuance.add(new Booksissuance(1,"Сторонній","Абдул Салім","на руках","абонементи","2018-4-4", "2018-5-4"));
        booksissuance.add(new Booksissuance(2,"Сторонній","Бабюк Петро","на руках","абонементи","2018-4-30", "2018-5-30"));
        booksissuance.add(new Booksissuance(3,"У пошуках утраченого часу","Базалюк Віталій","на руках","абонементи","2018-4-1", "2018-5-1"));
        booksissuance.add(new Booksissuance(4,"У пошуках утраченого часу","Бузілов Олексій","на руках","абонементи","2018-4-4", "2018-5-4"));
        booksissuance.add(new Booksissuance(5,"Процес","Вишиван Валентин","lost","читальна зала 1","2018-3-4", "2018-4-4"));
        booksissuance.add(new Booksissuance(6,"Процес","Дронь Віталій","lost","читальна зала 1","2018-3-4", "2018-4-4"));
        booksissuance.add(new Booksissuance(7,"Маленький принц","Долженко Валерія","вільна","читальна зала 1","2018-1-10", "2018-1-10"));
        booksissuance.add(new Booksissuance(8,"Маленький принц","Єсипчук Андрій","вільна","читальна зала 1","2018-4-3", "2018-4-3"));
        booksissuance.add(new Booksissuance(9,"Умови людського існування","Іванюк Андрій","вільна","читальна зала 1","2018-3-28", "2018-3-28"));
        booksissuance.add(new Booksissuance(10,"Умови людського існування","Осадчук Роман","вільна","читальна зала 1","2018-4-1", "2018-4-1"));
        booksissuance.add(new Booksissuance(11,"Подорож на край ночі","Попелишко Наталія","вільна","читальна зала 1","2018-4-2", "2018-4-2"));
        booksissuance.add(new Booksissuance(12,"Подорож на край ночі","Янцеловська Яна","вільна","читальна зала 1","2018-3-29", "2018-3-29"));
        booksissuance.add(new Booksissuance(13,"Грона гніву","Шилепницький Владислав","вільна","читальна зала 1","2018-4-3", "2018-4-3"));
        booksissuance.add(new Booksissuance(14,"Грона гніву","Комісарчук Володимир","вільна","читальна зала 2","2018-2-4", "2018-3-4"));
        booksissuance.add(new Booksissuance(15,"По кому подзвін","Миронів Іван","вільна","читальна зала 2","2018-2-4", "2018-3-4"));
        booksissuance.add(new Booksissuance(16,"По кому подзвін","Абдул Салім","вільна","абонементи","2018-2-4", "2018-3-4"));
        booksissuance.add(new Booksissuance(17,"Великий Мольн","Бабюк Петро","lost","абонементи","2018-2-4", "2018-3-4"));
        booksissuance.add(new Booksissuance(18,"Великий Мольн","Базалюк Віталій","lost","абонементи","2018-2-4", "2018-3-4"));
        booksissuance.add(new Booksissuance(19,"Піна днів","Бузілов Олексій","на руках","абонементи","2018-3-30", "2018-4-30"));
        booksissuance.add(new Booksissuance(20,"Піна днів","Вишиван Валентин","на руках","абонементи","2018-3-30", "2018-4-30"));
        booksissuance.add(new Booksissuance(21,"Друга стать","Дронь Віталій","на руках","абонементи","2018-3-30", "2018-4-30"));
        booksissuance.add(new Booksissuance(22,"Друга стать","Долженко Валерія","вільна","читальна зала 2","2018-3-4", "2018-3-4"));
        booksissuance.add(new Booksissuance(23,"Чекаючи на Ґодо","Єсипчук Андрій","вільна","читальна зала 2","2018-3-4", "2018-3-4"));
        booksissuance.add(new Booksissuance(24,"Чекаючи на Ґодо","Іванюк Андрій","вільна","читальна зала 2","2018-3-4", "2018-3-4"));
        booksissuance.add(new Booksissuance(25,"Буття й ніщо","Осадчук Роман","вільна","читальна зала 2","2018-3-4", "2018-3-4"));
        booksissuance.add(new Booksissuance(26,"Буття й ніщо","Попелишко Наталія","вільна","читальна зала 2","2018-3-4", "2018-3-4"));
        booksissuance.add(new Booksissuance(27,"Імя рози","Янцеловська Яна","вільна","читальна зала 2","2018-3-4", "2018-3-4"));
        booksissuance.add(new Booksissuance(28,"Імя рози","Шилепницький Владислав","вільна","читальна зала 2","2018-3-4", "2018-3-4"));
        booksissuance.add(new Booksissuance(29,"Архіпелаг ГУЛАГ","Комісарчук Володимир","вільна","читальна зала 1","2018-3-4", "2018-3-4"));
        booksissuance.add(new Booksissuance(30,"Архіпелаг ГУЛАГ","Миронів Іван","вільна","читальна зала 1","2018-3-4", "2018-3-4"));

    }

    public List<Booksissuance> getBooksissuance() {
        return booksissuance;
    }

    public void setBooksissuance(List<Booksissuance> booksissuance) {
        this.booksissuance = booksissuance;
    }
    private List<Bookstatus> bookstatus=new ArrayList<>();
    {
        bookstatus.add(new Bookstatus(1,"на руках"));
        bookstatus.add(new Bookstatus(2,"вільна"));
        bookstatus.add(new Bookstatus(3,"lost"));
    }

    public List<Bookstatus> getBookstatus() {
        return bookstatus;
    }

    public void setBookstatus(List<Bookstatus> bookstatus) {
        this.bookstatus = bookstatus;
    }
    private List<Fines> fines=new ArrayList<>();
    {
        fines.add(new Fines(1,"прострочка здачі книги","Абдул Салім",200));
        fines.add(new Fines(2,"втрата книги з заміною","Бабюк Петро",0));
        fines.add(new Fines(3,"втрата книги","Базалюк Віталій",3000));
        fines.add(new Fines(4,"прострочка здачі книги","Бузілов Олексій",200));
        fines.add(new Fines(5,"втрата книги з заміною","Вишиван Валентин",0));
        fines.add(new Fines(6,"втрата книги","Дронь Віталій",2000));
        fines.add(new Fines(7,"прострочка здачі книги","Комісарчук Володимир",200));

    }

    public List<Fines> getFines() {
        return fines;
    }

    public void setFines(List<Fines> fines) {
        this.fines = fines;
    }
    private List<Location> location = new ArrayList<>();
    {
        location.add(new Location(1,"читальна зала 1"));
        location.add(new Location(2,"читальна зала 2"));
        location.add(new Location(3,"абонементи"));
    }

    public List<Location> getLocation() {
        return location;
    }

    public void setLocation(List<Location> location) {
        this.location = location;
    }
    private List<Person> person = new ArrayList<>();
    {
//        person.add(new Person(1,"студент","Абдул Салім","ІФТКН", "ІПЗ",111));
//        person.add(new Person(2,"студент","Бабюк Петро","Біологія", "Біохімія",112));
//        person.add(new Person(3,"студент","Базалюк Віталій","Математика", "Інформатика",113));
//        person.add(new Person(4,"слухач пв","Бузілов Олексій","ІФТКН", "ІПЗ",222));
//        person.add(new Person(5,"слухач пв","Вишиван Валентин","Історія", "Історія України",114));
//        person.add(new Person(6,"слухач пв","Дронь Віталій","Іноземні мови", "Англійська мова",315));
//        person.add(new Person(7,"абітурієнт","Долженко Валерія","ІФТКН", "ІПЗ",333));
//        person.add(new Person(8,"абітурієнт","Єсипчук Андрій","Біологія", "Біохімія",212));
//        person.add(new Person(9,"абітурієнт","Іванюк Андрій","Математика", "Інформатика",213));
//        person.add(new Person(10,"стажист","Осадчук Роман","Історія", "Історія України",214));
//        person.add(new Person(11,"стажист","Попелишко Наталія","Іноземні мови", "Англійська мова",415));
//        person.add(new Person(12,"слухач фпк","Янцеловська Яна","Біологія", "Біохімія",312));
//        person.add(new Person(13,"слухач фпк","Шилепницький Владислав","Іноземні мови", "Англійська мова",515));
//        person.add(new Person(14,"вчитель","Комісрчук Володимир","Матемтика", "Інформатика",0));
//        person.add(new Person(15,"вчитель","Миронів Іван","ІФТКН", "ІПЗ",0));
    }

    public List<Person> getPerson() {
        return person;
    }

    public void setPerson(List<Person> person) {
        this.person = person;
    }
    private List<Persontypes> persontypes=new ArrayList<>();
    {
        persontypes.add(new Persontypes(1,"студент"));
        persontypes.add(new Persontypes(2,"вчитель"));
        persontypes.add(new Persontypes(3,"слухач пв"));
        persontypes.add(new Persontypes(4,"абітурієнт"));
        persontypes.add(new Persontypes(5,"стажист"));
        persontypes.add(new Persontypes(6,"слухач фпк"));
    }

    public List<Persontypes> getPersontypes() {
        return persontypes;
    }

    public void setPersontypes(List<Persontypes> persontypes) {
        this.persontypes = persontypes;
    }
    private List<Typefine>typefine=new ArrayList<>();
    {
        typefine.add(new Typefine(1,"прострочка здачі книги",2));
        typefine.add(new Typefine(2,"втрата книги з заміною",0));
        typefine.add(new Typefine(3,"втрата книги",10));
    }

    public List<Typefine> getTypefine() {
        return typefine;
    }

    public void setTypefine(List<Typefine> typefine) {
        this.typefine = typefine;
    }
    private List<Typeofabonement> typeofabonement=new ArrayList<>();
    {
        typeofabonement.add(new Typeofabonement(1,"постіний"));
        typeofabonement.add(new Typeofabonement(1,"разовий"));
        typeofabonement.add(new Typeofabonement(1,"міжбібліотечний"));
    }

    public List<Typeofabonement> getTypeofabonement() {
        return typeofabonement;
    }

    public void setTypeofabonement(List<Typeofabonement> typeofabonement) {
        this.typeofabonement = typeofabonement;
    }
}

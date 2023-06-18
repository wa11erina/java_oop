package guru.qa;

public class MainOop {

    public static void main(String[] args) {
        Book future = new Book("Dmitry Glukhovsky","Futu.re",2013,
                "Science Fiction / Dystopia / Thriller", true);
        System.out.println(future.toString());

        Book metro = new Book("Dmitry Glukhovsky", "The Metro Trilogy", 2017,
                "Science Fiction / Post Apocalyptic / Dystopia / Horror", true);
        System.out.println(metro.toString());

        Book text = new Book("Dmitry Glukhovsky", "Text", 2017,
                "Fiction / Thriller / Contemporary", true);
        System.out.println(text.toString());

        Book outpost = new Book("Dmitry Glukhovsky", "The Outpost", 2022,
                "Science Fiction / Post Apocalyptic / Dystopia / Horror", true);
        System.out.println(outpost.toString());

        Book[] previousBooks = new Book[] {future, metro, text};
        outpost.addBook(previousBooks);
        outpost.printPreviousBooks();
        outpost.printBookByTitleIfPresent("Dusk");
        outpost.printBookByTitleIfPresent("Futu.re");

        Book books = new Book();
        books.addBookToList(future);
        books.addBookToList(metro);
        books.addBookToList(text);
        books.addBookToList(outpost);
        books.printBooks();
        books.removeBook(text);
        books.printBooks();
        System.out.println("Find: The Metro Trilogy" + " " + books.findBook(metro));



        Car fordfocus = new Car("Ford", "Focus RS", 2010,
                1700000, false);
        System.out.println(fordfocus.toString());

        Car bmw = new Car("BMW", "Z4 M Coupe", 2008,
                2000000, false);
        System.out.println(bmw.toString());

        Car nissan = new Car("Nissan", "Skyline GT-R V-Spec (R34)", 2002,
                800000, false);
        System.out.println(nissan.toString());

        Car formula1 = new Car("FORMULA 1®", "F1® ACADEMY CAR", 2019,
                1250000000, true);
        System.out.println(formula1.toString());

        Car[] otherCityCars = new Car[] {bmw, nissan};
        fordfocus.addCar(otherCityCars);
        fordfocus.printOtherCityCars();
        fordfocus.printCarByBrandIfPresent("Mazda");
        fordfocus.printCarByBrandIfPresent("BMW");

        Car cars = new Car();
        cars.addCarToQueue(fordfocus);
        cars.addCarToQueue(bmw);
        cars.addCarToQueue(nissan);
        cars.addCarToQueue(formula1);
        cars.printCars();
        cars.findCar(nissan);
        cars.removeCar(fordfocus);
        cars.printCars();


        Cat tisha = new Cat("Tisha", 13.5, "tabby", "Metis", true);
        System.out.println(tisha.toString());

        Cat barsik = new Cat("Barsik", 5, "ginger-white", "Siberian", true);
        System.out.println(barsik.toString());

        Cat tigra = new Cat("Tigra", 3, "tiger color", "Bengal", false);
        System.out.println(tigra.toString());

        Cat musya = new Cat("Musya", 7, "white", "Russian", true);
        System.out.println(musya.toString());

        Cat[] neighbours = new Cat[] {barsik, tigra, musya};
        tisha.addNeighbour(neighbours);
        tisha.printNeighbours();
        tisha.printCatByNameIfPresent("Tigra");
        tisha.printCatByNameIfPresent("Felix");

        Cat cats = new Cat();
        cats.addCatToSet(tisha);
        cats.addCatToSet(barsik);
        cats.addCatToSet(tigra);
        cats.addCatToSet(musya);
        cats.printCats();
        cats.removeCat(tigra);
        cats.printCats();
        System.out.println("Find: Tisha" + " " + cats.findCat(tisha));


        MusicAlbum heavener = new MusicAlbum("Invent Animate", "Heavener", 2023,
                "Metalcore / Progressive Metalcore / Post-Hardcore", true);
        System.out.println(heavener.toString());

        MusicAlbum kodeseven = new MusicAlbum("Kodeseven", "Kodeseven", 2023,
                "EDM / Drum & Bass / Cyberpunk", true);
        System.out.println(kodeseven.toString());

        MusicAlbum currents2023 = new MusicAlbum("Currents", "The Death We Seek", 2023,
                "Progressive Metalcore", false);
        System.out.println(currents2023.toString());

        MusicAlbum sleeptoken2023 = new MusicAlbum("Sleep Token", "Take Me Back to Eden", 2023,
                "Alternative Metal / Progressive Rock / Art Rock", false);
        System.out.println(sleeptoken2023.toString());

        MusicAlbum[] otherGreatAlbums2023 = new MusicAlbum[] {heavener, kodeseven, currents2023};
        sleeptoken2023.addAlbum(otherGreatAlbums2023);
        sleeptoken2023.printGreatAlbums2023();
        sleeptoken2023.printGreatAlbums2023ByArtistIfPresent("Invent Animate");
        sleeptoken2023.printGreatAlbums2023ByArtistIfPresent("Architects");

        MusicAlbum bestAlbums2023 = new MusicAlbum();
        bestAlbums2023.addAlbumToSet(heavener);
        bestAlbums2023.addAlbumToSet(kodeseven);
        bestAlbums2023.addAlbumToSet(currents2023);
        bestAlbums2023.addAlbumToSet(sleeptoken2023);
        bestAlbums2023.printAlbums();
        bestAlbums2023.removeAlbum(kodeseven);
        bestAlbums2023.printAlbums();
        System.out.println("Search for the best album 4ever & ever: Take Me Back To Eden." + " " + bestAlbums2023.findAlbum(sleeptoken2023));


    }
}


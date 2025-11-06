Zadatak je zbog čitljivosti razdvojen na sljedeće fajlove:
- [Application.kt](./src/Application.kt) \
  Implementacija `Application` klase.
- [Category.kt](./src/Category.kt) \
  Implementacija `Category` enum-a, koji predstavlja moguće kategorije aplikacije.
- [Data.kt](./src/Data.kt) \
  Lista aplikacija koja se koristi kao testni set podataka.
- [Functions.kt](./src/Functions.kt) \
  Implementacija funkcija iz zadatka.
- [Main.kt](./src/Main.kt) \
  Entry point aplikacije, vrši testiranje funkcija.

Sve funkcije koje imaju `custom` u imenu su funkcije koje su implementirane ne koristeći funkcije pomenute u postavci zadatka (npr. `customGroupByCategory` ne koristi `groupingBy`).

Funkcije:
- `customFilterByRatingAbove` \
  Uzima listu aplikacija i ocjenu. Pravi i vraća novu listu koja sadrži samo one aplikacije iz date list koje imaju ocjenu veću ili jednaku od date ocjene.
- `filterBy` \
  Uzima listu aplikacija i lambdu. Pravi i vraća novu listu koja sadrži samo one aplikacije iz date list za koje data lambda vraća `true`. \
  Korištena je funkcija `filter` jer je potrebno filtrirati podatke.
- `customGroupByCategory` \
  Uzima listu aplikacija i vraća mapu čiji je ključ kategorija, a vrijednost broj aplikacija iz date liste koje imaju tu kategoriju.
- `groupByCategory` \
  Radi isto što i `customGroupByCategory`. \
  Korištena je funkcija `groupingBy` jer je potrebno grupisati podatke podatke.
- `customSortByDownloadsDesc` \
  Uzima listu aplikacija i vraća listu aplikacija koja je sortirana po broju preuzimanja. Sortiranje je implementirano koristeći bubble sort algoritam.
- `sortByDownloadsDesc` \
  Radi isto što i `customSortByDownloadsDesc`. \
  Korištena je funkcija `sortedByDescending` jer je potrebno sortirati u silaznom poredku.
- `averageSizeByCategory` \
  Uzima listu aplikacija i vraća mapu čiji je ključ kategorija, a vrijednost prosječna veličina aplikacija iz date liste koje imaju tu kategoriju. \
  Korištena je funkcija `fold` jer je potrebno proći kroz cijelu listu i napraviti mapu od nje. Ključ mape je kategorija, a vrijednost je par, gdje je prva vrijednost zbir veličina aplikacija te kategorije, a druga vrijednost broj aplikacija u toj kategoriji. Na kraju je korištena funkcija `mapValues` koja uzima zbir (prva vrijednost para) i dijeli ga sa brojačem (druga vrijednost para), čime se dobija prosjek. Time se dobija mapa koja mapira kategoriju u proječnu veličinu aplikacije iz te kategorije.
- `findByName` \
  Uzima listu aplikacija i naziv aplikacija, traži aplikaciju sa datim nazivom u datoj listi. Ako je pronađe vraća samu aplikaciju, ako ne tada vraća `null`. Naziv nije case sensitive. \
  Korištena je funkcija `find` jer je potrebno pronaći element iz liste.
- `findByNameAndPrint` \
  Uzima listu aplikacija i naziv aplikacije, pomoću `findByName` pronalazi traženu aplikaciju i isprinta njene podatke. U slučaju da aplikacija nije pronađena ispisuje adekvatnu poruku.
- `compactifyNumber` \
  Uzima broj i pretvara ga u string, pri čenu vrši kompaktiranje broja. Ako je broj veći od milijarde, odbija 9 cifara i na kraj dodaje `B+`. Ako je broj veći od milion, odbija 6 cifara i dodaje `M+`. Ako je broj veći od sto hiljada, odbija pet cifara i dodaje `00k`. Ako je broj veći od hiljadu, odbija tri cifre i dodaje `k`. U suprotnom vraća dati broj kao string.
- `prettyFormat` \
  Uzima aplikaciju i pretvara je u string formatiran kako je navedeno u zadatku.
- `prettyPrint` \
  Uzima listu aplikacija, pretvara ih u string pomoću `prettyFormat` i ispisuje ih. \
  Korištena je funkcija `map` kako bi se aplikacije pretvorile u string-ove, a zatim pomoću `forEach` se ispisuje svaki element liste.
- `findDeveloperWithMostDownloads` \
  Pronalazi developera sa najvećim ukupnim brojem preuzimanja. \
  Korištena je funkcija `map` kako bi se za svakog developera izračunao zbir preuzimanja njegovih aplikacija. Mapira developera u par gdje je ključ sam developer, a vrijednost broj preuzimanja. Korišena je funkcija `sumOf` kako bi se sabrala preuzimanja svih developerovih aplikacija. Korištena je funkcija `maxBy` kako bi se pronašao developer sa najvećim brojem preuzimanja.
- `getAverageRating` \
  Pronalazi prosječnu ocjenu developerovih aplikacija. \
  Korišena je funkcija `sumOf` kako bi se izračunala suma ocijena developerovih aplikacija, što je potrebno za računanje prosjeka.

Moguće je koristiti ove funkcije kako bi se pronašli specifični podaci iz velike liste podataka.
Nakon što se podaci pronađu mogu se proslijediti u neki *view* kao *RecyclerView* ili slično.
Moguće je primijeniti filtriranje podataka, sortiranje, pronalazak aplikacija, itd.

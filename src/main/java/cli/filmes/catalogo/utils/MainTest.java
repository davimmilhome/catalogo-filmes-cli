package main.java.cli.filmes.catalogo.utils;

import main.java.cli.filmes.catalogo.enums.TipoFilme;
import main.java.cli.filmes.catalogo.models.Ator;
import main.java.cli.filmes.catalogo.models.Diretor;
import main.java.cli.filmes.catalogo.models.Filme;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.ArrayList;

public class MainTest {
    public static void main(String[] args) {
        dataLoader();
    }

    public static ArrayList<Filme> dataLoader() {

        ArrayList filmes = new ArrayList<>();

        Diretor peterJackson = new Diretor(
                "Peter",
                "Jackson",
                LocalDate.of(1961, 10, 31),
                "New Zealander"
        );

        Diretor gregorVerbinski = new Diretor(
                "Gregor",
                " Verbinski",
                LocalDate.of(1964, 3, 16),
                "american"
        );

        Ator naomiWatts = new Ator(
                "Naomi",
                "Watts",
                LocalDate.of(1968, 9, 28),
                "british"
        );

        Ator elijahWood = new Ator(
                "Elijah",
                "Wood",
                LocalDate.of(1981, 1, 28),
                "american"
        );

        Ator johnnyDepp  = new Ator(
                "Johnny",
                "Depp",
                LocalDate.of(1963, 6, 9),
                "american"
        );

        Filme kingKong = new Filme(
                TipoFilme.ACAO,
                "King Kong",
                "12/12/2005",
                "In 1933 New York, an overly ambitious movie producer coerces his cast and hired ship crew to travel to mysterious Skull Island, where they encounter Kong, a giant ape who is immediately smitten with the leading lady.",
                peterJackson,
                new ArrayList<>(Arrays.asList(naomiWatts)),
                new BigDecimal("207000000")
        );

        Filme lor1 = new Filme(
                TipoFilme.ACAO,
                "The Lord of the Rings: The Fellowship of the Ring",
                "18/12/2001",
                "Young hobbit Frodo Baggins, after inheriting a mysterious ring from his uncle Bilbo, must leave his home in order to keep it from falling into the hands of its evil creator. Along the way, a fellowship is formed to protect the ringbearer and make sure that the ring arrives at its final destination: Mt. Doom, the only place where it can be destroyed.",
                peterJackson,
                new ArrayList<>(Arrays.asList(elijahWood)),
                new BigDecimal("93000000")
        );

        Filme lor2 = new Filme(
                TipoFilme.ACAO,
                "The Lord of the Rings: The Two Towers",
                "18/12/2002",
                "Frodo and Sam are trekking to Mordor to destroy the One Ring of Power while Gimli, Legolas and Aragorn search for the orc-captured Merry and Pippin. All along, nefarious wizard Saruman awaits the Fellowship members at the Orthanc Tower in Isengard.",
                peterJackson,
                new ArrayList<>(Arrays.asList(elijahWood)),
                new BigDecimal("79000000")
        );

        Filme lor3 = new Filme(
                TipoFilme.ACAO,
                "The Lord of the Rings: The Return of the King",
                "01/12/2003",
                "Aragorn is revealed as the heir to the ancient kings as he, Gandalf and the other members of the broken fellowship struggle to save Gondor from Sauron's forces. Meanwhile, Frodo and Sam take the ring closer to the heart of Mordor, the dark lord's realm.",
                peterJackson,
                new ArrayList<>(Arrays.asList(elijahWood)),
                new BigDecimal("94000000")
        );


        Filme poc1 = new Filme(
                TipoFilme.ACAO,
                "Pirates of the Caribbean: The Curse of the Black Pearl",
                "09/07/2003",
                "Jack Sparrow, a freewheeling 18th-century pirate, quarrels with a rival pirate bent on pillaging Port Royal. When the governor's daughter is kidnapped, Sparrow decides to help the girl's love save her.",
                gregorVerbinski,
                new ArrayList<>(Arrays.asList(johnnyDepp)),
                new BigDecimal("140000000")
        );
        Filme poc2 = new Filme(
                TipoFilme.ACAO,
                "Pirates of the Caribbean: Dead Man's Chest",
                "06/07/2006",
                "Captain Jack Sparrow works his way out of a blood debt with the ghostly Davy Jones to avoid eternal damnation.",
                gregorVerbinski,
                new ArrayList<>(Arrays.asList(johnnyDepp)),
                new BigDecimal("200000000")
        );

        Filme poc3 = new Filme(
                TipoFilme.ACAO,
                "Pirates of the Caribbean: At World's End",
                "19/05/2007",
                "Captain Barbossa, long believed to be dead, has come back to life and is headed to the edge of the Earth with Will Turner and Elizabeth Swann. But nothing is quite as it seems.",
                gregorVerbinski,
                new ArrayList<>(Arrays.asList(johnnyDepp)),
                new BigDecimal("300000000")
        );

        filmes.add(kingKong);
        filmes.add(lor1);
        filmes.add(lor2);
        filmes.add(lor3);
        filmes.add(poc1);
        filmes.add(poc2);
        filmes.add(poc3);

        return filmes;
    }


}

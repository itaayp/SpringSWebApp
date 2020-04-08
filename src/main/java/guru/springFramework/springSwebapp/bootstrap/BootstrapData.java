package guru.springFramework.springSwebapp.bootstrap;

import guru.springFramework.springSwebapp.domain.Author;
import guru.springFramework.springSwebapp.domain.Book;
import guru.springFramework.springSwebapp.repositories.AuthorRepository;
import guru.springFramework.springSwebapp.repositories.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 *
 * @author Itay
 */

@Component
public class BootstrapData implements CommandLineRunner{

    private AuthorRepository authorRepository;
    private BookRepository bookRepository;

    public BootstrapData(AuthorRepository authorRepository, BookRepository bookRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
    }
    
    @Override
    public void run(String... args) throws Exception {
        //Author1 & Book1
        Author ayelet = new Author("Ayelet", "Gundar-Goshen");
        Book markovitchNight = new Book("A Markovitch Night", "123432");
        ayelet.getBooks().add(markovitchNight);
        markovitchNight.getAuthors().add(ayelet);
        
        authorRepository.save(ayelet);
        bookRepository.save(markovitchNight);

        //Author2 & Book2
        Author thureau = new Author("Henry David", "Thureau");
        Book walden = new Book("Walden", "654317");
        thureau.getBooks().add(walden);
        walden.getAuthors().add(thureau);

        authorRepository.save(thureau);
        bookRepository.save(walden);

        
        authorRepository.save(ayelet);
        bookRepository.save(markovitchNight);

        System.out.println("Started in Bootstrap");
        System.out.println("Number of Books: " + bookRepository.count());
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guru.springFramework.springSwebapp.repositories;

import guru.springFramework.springSwebapp.domain.Author;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Itay
 */
public interface AuthorRepository extends CrudRepository<Author, Long>{
    
}

package ie.atu.using_jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PersonRepository extends JpaRepository<Person, Long> {
    Optional<Person> findByEmployeeId(String employeeId);
    //Optional<Person> updatePersonById(String employeeId, Person person);
}

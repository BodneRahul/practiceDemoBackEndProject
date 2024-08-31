package newPractice.practiceDemo.Repository;

import newPractice.practiceDemo.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}

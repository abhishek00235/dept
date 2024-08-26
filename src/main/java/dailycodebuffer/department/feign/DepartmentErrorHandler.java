package dailycodebuffer.department.feign;
import dailycodebuffer.employee.Entity.EmployeeEntity;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient("EMPLOYEE")
public interface DepartmentErrorHandler {
    @GetMapping("api/employee")
    ResponseEntity<List<EmployeeEntity>> getEmployee();
    }

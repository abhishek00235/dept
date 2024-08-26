package dailycodebuffer.department.Controller;

import dailycodebuffer.department.Entity.Department;
import dailycodebuffer.department.feign.DepartmentErrorHandler;
import dailycodebuffer.department.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class DepartmentController {

    @Autowired
    RestTemplate restTemplate;

    @Autowired
    DepartmentService departmentService;

    @Autowired
    DepartmentErrorHandler departmentErrorHandler;


    @GetMapping("api/department")
    public ResponseEntity<List<Department>> getDepartment() {
        return ResponseEntity.ok(departmentService.getDepartments());
    }


    @GetMapping("api/department/empData")
    public ResponseEntity<List> getEmpDepartment() {
        return ResponseEntity.ok(departmentErrorHandler.getEmployee().getBody());
       /* return ResponseEntity.ok(restTemplate
                .getForObject("http://EMPLOYEE/api/employee", List.class));*/

    }
}

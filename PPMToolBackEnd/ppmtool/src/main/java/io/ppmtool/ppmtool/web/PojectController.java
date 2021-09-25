package io.ppmtool.ppmtool.web;

import io.ppmtool.ppmtool.domain.Project;
import io.ppmtool.ppmtool.services.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.ws.Response;

@RestController
@RequestMapping("/api/project")
public class PojectController {
    @Autowired
    private ProjectService projectService;

    @PostMapping("")
    public ResponseEntity<Project> createNewProject(@RequestBody Project project)
    {
        projectService.saveOrUpdateProject(project);
        return new ResponseEntity<Project>(project,HttpStatus.CREATED);
    }

}

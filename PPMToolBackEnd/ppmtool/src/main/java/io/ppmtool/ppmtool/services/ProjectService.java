package io.ppmtool.ppmtool.services;

import io.ppmtool.ppmtool.domain.Project;
import io.ppmtool.ppmtool.reposotories.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectService {
    @Autowired
    private ProjectRepository projectRepository;

    public Project saveOrUpdateProject(Project project) {
        return  projectRepository.save(project);
    }
}

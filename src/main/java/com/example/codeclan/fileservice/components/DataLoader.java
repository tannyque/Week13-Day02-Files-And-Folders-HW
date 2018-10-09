package com.example.codeclan.fileservice.components;

import com.example.codeclan.fileservice.models.File;
import com.example.codeclan.fileservice.models.Folder;
import com.example.codeclan.fileservice.models.User;
import com.example.codeclan.fileservice.repositories.FileRepository;
import com.example.codeclan.fileservice.repositories.FolderRepository;
import com.example.codeclan.fileservice.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    FileRepository fileRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    UserRepository userRepository;

    public DataLoader() {
    }

    public void run(ApplicationArguments args){
        User user = new User("Java");
        userRepository.save(user);

        Folder folder = new Folder("Alphabet", user);
        folderRepository.save(folder);

        File file = new File("bloop", "java", 5.62, folder);
        fileRepository.save(file);
    }
}

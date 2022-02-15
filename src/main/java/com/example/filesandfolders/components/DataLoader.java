package com.example.filesandfolders.components;

import com.example.filesandfolders.models.Folder;
import com.example.filesandfolders.models.User;
import com.example.filesandfolders.repositories.FolderRepository;
import com.example.filesandfolders.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    UserRepository userRepository;

    public DataLoader() {

    }

    public void run(ApplicationArguments args) {

        User scott = new User("Scott");
        userRepository.save(scott);

        User matthew = new User("Matthew");
        userRepository.save(matthew);

        User cameron = new User("Cameron");
        userRepository.save(cameron);

        Folder documents = new Folder("Documents", scott);
        folderRepository.save(documents);

        Folder photos = new Folder("Photos", cameron);
        folderRepository.save(photos);

    }
}

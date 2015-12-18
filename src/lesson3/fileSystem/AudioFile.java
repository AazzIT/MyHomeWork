package lesson3.fileSystem;
//Class Audio File
public class AudioFile extends File {
    public AudioFile(String name, Folder parentFolder) {
        super.setName(name);
        super.setTypeOfFile("I am Audio"); // просто тип - audio
        super.setParentFolder(parentFolder);
    }

// убираем лишние пробелы
}

package lesson6.fileSystem;

public class TextFile extends File {
    public TextFile(String name, File parentFolder) {
        if (name.substring(name.length() - 4 ,name.length()).equals(TXT_EXTENSION)) {//Хардкод
            super.setName(name);
            super.setType(TEXT_FILE_TYPE);//Хардкод
            super.setParentFolder(parentFolder);
        } else
            throw new IllegalStateException("[Error]: Illegal File Extension of Text File! Must be \".txt\"");
    }
}

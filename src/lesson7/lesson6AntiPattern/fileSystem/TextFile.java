package lesson7.lesson6AntiPattern.fileSystem;

public class TextFile extends File {
    public TextFile(String name, File parentFolder) {
        if (name.substring(name.length() - 4 ,name.length()).equals(TXT_EXTENSION)) {
            super.setName(name);
            super.setType(TEXT_FILE_TYPE);
            super.setParentFolder(parentFolder);
        } else
            throw new IllegalStateException("[Error]: Illegal File Extension of Text File! Must be \".txt\"");
    }
}

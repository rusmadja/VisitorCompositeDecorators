package Part1.Visitor;

import Part1.File.*;
import Part1.FileDetails;

public class FileSizeCalculatorVisitor implements FileVisitor{

    @Override
    public int visit(DirectoryDetails dir) {
        int file_size = 0;
        for (FileDetails file : dir.getdir()) {
            file_size += file.accept(this);
        }
        return file_size;
    }

    @Override
    public int visit(DocxFileDetails file) {
        return file.getSize();
    }

    @Override
    public int visit(HtmlFileDetails file) {
        return file.getSize();
    }

    @Override
    public int visit(JpgFileDetails file) {
        return file.getSize();
    }

    @Override
    public int visit(Mp3FileDetails file) {
        return file.getSize();
    }

    @Override
    public int visit(PptxFileDetails file) {
        return file.getSize();
    }

    @Override
    public int visit(TxtFileDetails file) {
        return file.getSize();
    }
}

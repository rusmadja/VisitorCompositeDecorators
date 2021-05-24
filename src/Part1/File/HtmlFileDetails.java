package Part1.File;

import Part1.FileDetails;
import Part1.Visitor.FileVisitor;

public class HtmlFileDetails extends FileDetails {
    private int lines;
    private int size;
    public HtmlFileDetails(String path, String fileName, int lines, int size){
        super(path,fileName);
        this.lines=lines;
        this.size=size;
    }

    public int getLines() {
        return lines;
    }

    public void setLines(int lines) {
        this.lines = lines;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public int accept(FileVisitor visitor) {
        return 0;
    }
}

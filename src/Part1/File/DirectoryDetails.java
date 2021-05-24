package Part1.File;

import Part1.FileDetails;
import Part1.Visitor.FileVisitor;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class DirectoryDetails extends FileDetails {
    private List<FileDetails> children;

    public DirectoryDetails(String path, String name){
        super(path,name);
        children = new ArrayList<FileDetails>();
    }
    public void addFile(FileDetails fileDetails){
        children.add(fileDetails);
    }
    public List<FileDetails> getdir(){return children;}
    @Override
    public int accept(FileVisitor visitor) {
        return visitor.visit(this);
    }
}
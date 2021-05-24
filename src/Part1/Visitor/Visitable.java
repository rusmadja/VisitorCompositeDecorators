package Part1.Visitor;

public interface Visitable {
    int accept(FileVisitor visitor);
}

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public interface CommentInterface<T extends ArrayList> {
    T createCommentStructure(ArrayList<Comment> comments);
}
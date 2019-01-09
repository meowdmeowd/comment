import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MainClass {
    public static void main(String args[]) {
        ArrayList<Comment> list = new ArrayList<>();
        ArrayList<Comment> roots= new ArrayList<>();
        initializeList(list);

        setHistoryOfComments(list);
        CommentInterface commentInterface = new CommentInterface() {
            @Override
            public ArrayList createCommentStructure(ArrayList arrayList) {
                return arrayList;
            }
        };
        commentInterface.createCommentStructure(list);
    }

    private static void setHistoryOfComments(ArrayList<Comment> list) {
            Collections.sort(list, new Comparator<Comment>(){
                    public int compare(Comment o1, Comment o2){
                        if(o1.getReplyTo() == o2.getReplyTo())
                            return 0;
                        return o1.getReplyTo() < o2.getReplyTo() ? -1 : 1;
                    }
                });
    }

    private static void initializeList(ArrayList<Comment> list) {
        Comment firstComment = new Comment();
        firstComment.setId(1);
        firstComment.setUserId(1);
        firstComment.setReplyTo(0);
        firstComment.setName("Janibek");
        firstComment.setContent("Я первый");

        Comment secondComment = new Comment();
        secondComment.setId(2);
        secondComment.setUserId(2);
        secondComment.setReplyTo(1);
        secondComment.setName("Damir");
        secondComment.setContent("Второй");

        Comment thirdComment = new Comment();
        thirdComment.setId(3);
        thirdComment.setUserId(3);
        thirdComment.setReplyTo(0);
        thirdComment.setName("Roman");
        thirdComment.setContent("Удачной продажи, брат");

        list.add(firstComment);
        list.add(secondComment);
        list.add(thirdComment);
    }

}


package board.domains;

public class ReplyDto extends ArticleDto{
    private int replyId;
    
    
    public int getReplyId() {
        return replyId;
    }
    public void setReplyId(int replyId) {
        this.replyId = replyId;
    }
    
    /*
    public boolean equals(Object o) {
        if(o instanceof ReplyDTO) {
            ReplyDTO r = (ReplyDTO)o;
            if(id == r.id) {
                return true;
            }
        }
        
        return false;
    }
    */
}





















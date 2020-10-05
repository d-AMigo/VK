package domain;

public class UserInfo {
    private int userId;
    private String userName;
    private boolean registeredUser;
    private boolean canRepost;
    private boolean canLikePost;
    private boolean canComment;
    private boolean canLikeComment;
    private boolean canEdit;
    private boolean canDelete;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public boolean isRegisteredUser() {
        return registeredUser;
    }

    public void setRegisteredUser(boolean registeredUser) {
        this.registeredUser = registeredUser;
    }

    public boolean isCanRepost() {
        return canRepost;
    }

    public void setCanRepost(boolean canRepost) {
        this.canRepost = canRepost;
    }

    public boolean isCanLikePost() {
        return canLikePost;
    }

    public void setCanLikePost(boolean canLikePost) {
        this.canLikePost = canLikePost;
    }

    public boolean isCanComment() {
        return canComment;
    }

    public void setCanComment(boolean canComment) {
        this.canComment = canComment;
    }

    public boolean isCanLikeComment() {
        return canLikeComment;
    }

    public void setCanLikeComment(boolean canLikeComment) {
        this.canLikeComment = canLikeComment;
    }

    public boolean isCanEdit() {
        return canEdit;
    }

    public void setCanEdit(boolean canEdit) {
        this.canEdit = canEdit;
    }

    public boolean isCanDelete() {
        return canDelete;
    }

    public void setCanDelete(boolean canDelete) {
        this.canDelete = canDelete;
    }
}
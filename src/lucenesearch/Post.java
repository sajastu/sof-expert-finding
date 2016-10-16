package lucenesearch;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import org.w3c.dom.NamedNodeMap;

/**
 *
 * @author arashdn
 */
public class Post
{

    private int id;
    private int postTypeId; 
    private int acceptedAnswerId;
    private int parentId;
    private Date creationDate;
    private int score;
    private int viewCount;
    private String body;
    private int ownerUserId;
    private int lastEditorUserId;
    private String lastEditorDisplayName;
    private Date lastEditDate;
    private Date lastActivityDate;
    private String title;
    private ArrayList<String> tags;
    private int answerCount;
    private int commentCount; 
    private int favoriteCount;
    private Date communityOwnedDate;

    // <editor-fold desc="Setters and getters" defaultstate="collapsed">
    public Date getCommunityOwnedDate()
    {
        return communityOwnedDate;
    }
    public void setCommunityOwnedDate(Date communityOwnedDate)
    {
        this.communityOwnedDate = communityOwnedDate;
    }
    public void setCommunityOwnedDate(String lastActivityDate) throws ParseException
    {
        String d = lastActivityDate.replaceAll("T", " ");
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss.SSS");
        this.setCommunityOwnedDate(dateFormat.parse(d));
    }
    public int getFavoriteCount()
    {
        return favoriteCount;
    }
    public void setFavoriteCount(int favoriteCount)
    {
        this.favoriteCount = favoriteCount;
    }
    public int getCommentCount()
    {
        return commentCount;
    }

    public void setCommentCount(int commentCount)
    {
        this.commentCount = commentCount;
    }

    public int getAnswerCount()
    {
        return answerCount;
    }

    public void setAnswerCount(int answerCount)
    {
        this.answerCount = answerCount;
    }

    public ArrayList<String> getTags()
    {
        return tags;
    }

    public void setTags(ArrayList<String> tags)
    {
        this.tags = tags;
    }
    public void setTags(String tags)
    {
        String s = tags.replaceAll("><", " ");
        s = s.replaceAll(">", " ");
        s = s.replaceAll("<", " ");
        s = s.trim();
        this.tags = new ArrayList<>(Arrays.asList(s.split(" ")));
        
    }

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public Date getLastActivityDate()
    {
        return lastActivityDate;
    }

    public void setLastActivityDate(Date lastActivityDate)
    {
        this.lastActivityDate = lastActivityDate;
    }

    public void setLastActivityDate(String lastActivityDate) throws ParseException
    {
        String d = lastActivityDate.replaceAll("T", " ");
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss.SSS");
        this.setLastActivityDate(dateFormat.parse(d));
    }
    
    public String getLastEditorDisplayName()
    {
        return lastEditorDisplayName;
    }

    public void setLastEditorDisplayName(String lastEditorDisplayName)
    {
        this.lastEditorDisplayName = lastEditorDisplayName;
    }
    
    public int getLastEditorUserId()
    {
        return lastEditorUserId;
    }

    public void setLastEditorUserId(int lastEditorUserId)
    {
        this.lastEditorUserId = lastEditorUserId;
    }

    public int getOwnerUserId()
    {
        return ownerUserId;
    }

    public void setOwnerUserId(int ownerUserId)
    {
        this.ownerUserId = ownerUserId;
    }

    public String getBody()
    {
        return body;
    }

    public void setBody(String body)
    {
        this.body = body;
    }

    public int getViewCount()
    {
        return viewCount;
    }

    public void setViewCount(int viewCount)
    {
        this.viewCount = viewCount;
    }

    public int getScore()
    {
        return score;
    }

    public void setScore(int score)
    {
        this.score = score;
    }

    public Date getCreationDate()
    {
        return creationDate;
    }

    public void setCreationDate(Date CreationDate)
    {
        this.creationDate = CreationDate;
    }

    public void setCreationDate(String CreationDate) throws ParseException
    {
        String d = CreationDate.replaceAll("T", " ");
        final String NEW_FORMAT = "yyyy-MM-dd HH:mm:ss.SSS";
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss.SSS");
        this.setCreationDate(dateFormat.parse(d));
    }
    
    public Date getLastEditDate()
    {
        return lastEditDate;
    }

    public void setLastEditDate(Date lastEditDate)
    {
        this.lastEditDate = lastEditDate;
    }
    public void setLastEditDate(String CreationDate) throws ParseException
    {
        String d = CreationDate.replaceAll("T", " ");
        final String NEW_FORMAT = "yyyy-MM-dd HH:mm:ss.SSS";
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss.SSS");
        this.setLastEditDate(dateFormat.parse(d));
    }
    
    public int getAcceptedAnswerId()
    {
        return acceptedAnswerId;
    }

    public void setAcceptedAnswerId(int acceptedAnswerId)
    {
        this.acceptedAnswerId = acceptedAnswerId;
    }

    public int getParentId()
    {
        return parentId;
    }

    public void setParentId(int parentId)
    {
        this.parentId = parentId;
    }

    public int getPostTypeId()
    {
        return postTypeId;
    }

    public void setPostTypeId(int PostTypeId)
    {
        this.postTypeId = PostTypeId;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int Id)
    {
        this.id = Id;
    }
// </editor-fold>

    public Post(NamedNodeMap nnm) throws ParseException
    {
        if (nnm.getNamedItem("Id") != null)
        {
            this.setId(Integer.parseInt(nnm.getNamedItem("Id").getFirstChild().getTextContent()));
        }
        if (nnm.getNamedItem("PostTypeId") != null)
        {
            this.setPostTypeId(Integer.parseInt(nnm.getNamedItem("PostTypeId").getFirstChild().getTextContent()));
        }
        if (nnm.getNamedItem("AcceptedAnswerId") != null)
        {
            this.setAcceptedAnswerId(Integer.parseInt(nnm.getNamedItem("AcceptedAnswerId").getFirstChild().getTextContent()));
        }
        if (nnm.getNamedItem("ParentId") != null)
        {
            this.setParentId(Integer.parseInt(nnm.getNamedItem("ParentId").getFirstChild().getTextContent()));
        }
        if (nnm.getNamedItem("CreationDate") != null)
        {
            this.setCreationDate(nnm.getNamedItem("CreationDate").getFirstChild().getTextContent());
        }
        if (nnm.getNamedItem("Score") != null)
        {
            this.setScore(Integer.parseInt(nnm.getNamedItem("Score").getFirstChild().getTextContent()));
        }
        if (nnm.getNamedItem("ViewCount") != null)
        {
            this.setViewCount(Integer.parseInt(nnm.getNamedItem("ViewCount").getFirstChild().getTextContent()));
        }
        if (nnm.getNamedItem("Body") != null)
        {
            this.setBody(nnm.getNamedItem("Body").getFirstChild().getTextContent());
        }
        if (nnm.getNamedItem("OwnerUserId") != null)
        {
            this.setOwnerUserId(Integer.parseInt(nnm.getNamedItem("OwnerUserId").getFirstChild().getTextContent()));
        }
        if (nnm.getNamedItem("LastEditorUserId") != null)
        {
            this.setLastEditorUserId(Integer.parseInt(nnm.getNamedItem("LastEditorUserId").getFirstChild().getTextContent()));
        }
        if (nnm.getNamedItem("LastEditorDisplayName") != null)
        {
            this.setLastEditorDisplayName(nnm.getNamedItem("LastEditorDisplayName").getFirstChild().getTextContent());
        }
        if (nnm.getNamedItem("LastEditDate") != null)
        {
            this.setLastEditDate(nnm.getNamedItem("LastEditDate").getFirstChild().getTextContent());
        }
        if (nnm.getNamedItem("LastActivityDate") != null)
        {
            this.setLastActivityDate(nnm.getNamedItem("LastActivityDate").getFirstChild().getTextContent());
        }
        if (nnm.getNamedItem("Title") != null)
        {
            this.setTitle(nnm.getNamedItem("Title").getFirstChild().getTextContent());
        }
        if (nnm.getNamedItem("Tags") != null)
        {
            this.setTags(nnm.getNamedItem("Tags").getFirstChild().getTextContent());
        }
        if (nnm.getNamedItem("AnswerCount") != null)
        {
            this.setAnswerCount(Integer.parseInt(nnm.getNamedItem("AnswerCount").getFirstChild().getTextContent()));
        }
        if (nnm.getNamedItem("CommentCount") != null)
        {
            this.setCommentCount(Integer.parseInt(nnm.getNamedItem("CommentCount").getFirstChild().getTextContent()));
        }
        
        if (nnm.getNamedItem("FavoriteCount") != null)
        {
            this.setFavoriteCount(Integer.parseInt(nnm.getNamedItem("FavoriteCount").getFirstChild().getTextContent()));
        }
        if (nnm.getNamedItem("CommunityOwnedDate") != null)
        {
            this.setCommunityOwnedDate(nnm.getNamedItem("CommunityOwnedDate").getFirstChild().getTextContent());
        }

    }

    @Override
    public String toString()
    {
        return "Post{" + "id=" + id + ", postTypeId=" + postTypeId + ", acceptedAnswerId=" + acceptedAnswerId + ", parentId=" + parentId + ", creationDate=" + creationDate + ", score=" + score + ", viewCount=" + viewCount + ", body=" + body + ", ownerUserId=" + ownerUserId + ", lastEditorUserId=" + lastEditorUserId + ", lastEditorDisplayName=" + lastEditorDisplayName + ", lastEditDate=" + lastEditDate + ", lastActivityDate=" + lastActivityDate + ", title=" + title + ", tags=" + tags + ", answerCount=" + answerCount + ", commentCount=" + commentCount + ", favoriteCount=" + favoriteCount + ", communityOwnedDate=" + communityOwnedDate + '}';
    }
    
    
}
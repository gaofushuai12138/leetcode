package other;

import java.util.*;

/***
 * 未解决按照时间排序
 */

public class Twitter{

    private int time = 1;
    private class article{
        private int articleId;
        private int time;

        public int getArticleId() {
            return articleId;
        }

        public void setArticleId(int articleId) {
            this.articleId = articleId;
        }

        public int getTime() {
            return time;
        }

        public void setTime(int time) {
            this.time = time;
        }

        @Override
        public String toString() {
            return "article{" +
                    "articleId=" + articleId +
                    ", time=" + time +
                    '}';
        }
    }

    private HashMap<Integer,ArrayList>UserArticle;
    private ArrayList<article> titleList;
    private HashMap<Integer,ArrayList>Followed;
    private ArrayList folleweeList;
    public Twitter(){
        UserArticle = new HashMap<>();
        Followed = new HashMap<>();
    }

    public void setTime(int time) {
        this.time = time;
    }

    public HashMap<Integer, ArrayList> getUserArticle() {
        return UserArticle;
    }

    public void setUserArticle(HashMap<Integer, ArrayList> userArticle) {
        UserArticle = userArticle;
    }

    public ArrayList<article> getTitleList() {
        return titleList;
    }

    public void setTitleList(ArrayList<article> titleList) {
        this.titleList = titleList;
    }

    public HashMap<Integer, ArrayList> getFollowed() {
        return Followed;
    }

    public void setFollowed(HashMap<Integer, ArrayList> followed) {
        Followed = followed;
    }

    public ArrayList getFolleweeList() {
        return folleweeList;
    }

    public void setFolleweeList(ArrayList folleweeList) {
        this.folleweeList = folleweeList;
    }

    /***
     *
     * @param userId
     * @param tweetId
     */
    public void postTweet(int userId,int tweetId){
         if(UserArticle.containsKey(userId)){
             UserArticle.get(userId).add(tweetId);
         }else {
             titleList = new ArrayList();
             article article = new article();
             article.setArticleId(tweetId);
             article.setTime(time);
             time = time++;
//             titleList.add(tweetId);
             UserArticle.put(userId,titleList);
         }
         tweetId++;
    }

    /***
     *
     * @param userId
     * @return
     */
    public List<Integer> getNewsFeed(int userId){
        List newsFeed = UserArticle.get(userId);
        List userlist = Followed.get(Integer.valueOf(userId));
        int [] users = new int[1];
        if(userlist!=null){
            users = new int[userlist.size()+1];
            int i = 0;
            for(;i < userlist.size();i++){
                users[i] = (int) userlist.get(i);
            }
            users[i] = userId;
        }else {
            users[0] = userId;
        }

        int sum = 0;
        for (int k = 0;k<users.length;k++){
            if(UserArticle.get(Integer.valueOf(users[k]))!=null){
                int result = UserArticle.get(Integer.valueOf(users[k])).size();
                sum = sum + result;
            }
        }

        int[] nums = new int[sum];
        ArrayList sumList = new ArrayList();
        for (int k = 0;k < users.length;k++){
            if(UserArticle.get(Integer.valueOf(users[k]))!=null){
                List art = UserArticle.get(Integer.valueOf(users[k]));
                for( int j = 0;j<art.size();j++){
                    sumList.add(art.get(j));
                }
            }
        }
        List newList;
        if(sumList.size()<10){
            newList = sumList;
        }else {
            newList = sumList.subList(0,10);
        }
        return newList;
    }

    /***
     *
     * @param followerId
     * @param followeeId
     */
    public void follow(int followerId, int followeeId){

        if (Followed.containsKey(followerId)){
            Followed.get(followerId).add(followeeId);
        }else{
            folleweeList = new ArrayList();
            folleweeList.add(followeeId);
            Followed.put(followerId,folleweeList);
        }
    }

    public int[] getFollowList(int userId){
        int result[] = null;
        return result;
    }

    public ArrayList getFolloweeList(int userId){
        ArrayList arrayList = Followed.get(userId);
        return arrayList;
    }


    public int getTime(){
        return 0;
    }

    /***
     *
     * @param followerId
     * @param followeeId
     */
    public void unfollow(int followerId,int followeeId){
       List list = Followed.get(Integer.valueOf(followerId));
       if(list!=null){
           for(int i = 0;i < list.size();i++){
               if(followeeId == (int)list.get(i)){
                   Followed.get(Integer.valueOf(followerId)).remove(Integer.valueOf(followeeId));
               }
           }
       }
    }

    public static void main(String[] args) {
        Twitter twitter = new Twitter();
        twitter.postTweet(1, 1);
        twitter.postTweet(1,2);
        ArrayList arrayList = twitter.getUserArticle().get(Integer.valueOf(1));
        System.out.println(arrayList.size());
        for(int i = 0;i < arrayList.size();i++){
            System.out.println(arrayList.get(i));
        }

    }

//        List list = twitter.getNewsFeed(1);

}

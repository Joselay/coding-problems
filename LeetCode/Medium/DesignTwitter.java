import java.util.*;

class Twitter {
    private static int timeStamp = 0;

    private class Tweet {
        public int id;
        public int time;
        public Tweet next;

        public Tweet(int id) {
            this.id = id;
            time = timeStamp++;
            next = null;
        }
    }

    private class User {
        public int id;
        public Set<Integer> followed;
        public Tweet head;

        public User(int id) {
            this.id = id;
            followed = new HashSet<>();
            head = null;
            follow(id);
        }

        public void follow(int id) {
            followed.add(id);
        }

        public void unfollow(int id) {
            followed.remove(id);
        }

        public void post(int id) {
            Tweet t = new Tweet(id);
            t.next = head;
            head = t;
        }
    }

    private Map<Integer, User> users;

    public Twitter() {
        users = new HashMap<>();
    }

    public void postTweet(int userId, int tweetId) {
        if (!users.containsKey(userId)) {
            User u = new User(userId);
            users.put(userId, u);
        }
        users.get(userId).post(tweetId);
    }

    public List<Integer> getNewsFeed(int userId) {
        List<Integer> res = new ArrayList<>();
        if (!users.containsKey(userId)) return res;

        Set<Integer> followed = users.get(userId).followed;
        PriorityQueue<Tweet> q = new PriorityQueue<>(followed.size(), (a, b) -> (b.time - a.time));
        for (int user : followed) {
            Tweet t = users.get(user).head;
            if (t != null) q.add(t);
        }

        int n = 0;
        while (!q.isEmpty() && n < 10) {
            Tweet t = q.poll();
            res.add(t.id);
            n++;
            if (t.next != null) q.add(t.next);
        }

        return res;
    }

    public void follow(int followerId, int followeeId) {
        if (!users.containsKey(followerId)) {
            User u = new User(followerId);
            users.put(followerId, u);
        }
        if (!users.containsKey(followeeId)) {
            User u = new User(followeeId);
            users.put(followeeId, u);
        }
        users.get(followerId).follow(followeeId);
    }

    public void unfollow(int followerId, int followeeId) {
        if (!users.containsKey(followerId) || followerId == followeeId) return;
        users.get(followerId).unfollow(followeeId);
    }
}

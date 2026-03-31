class FriendNode {
    int friendId;
    FriendNode next;

    FriendNode(int friendId) {
        this.friendId = friendId;
        this.next = null;
    }
}
class UserNode {
    int userId;
    String name;
    int age;
    FriendNode friendHead;
    UserNode next;

    UserNode(int userId, String name, int age) {
        this.userId = userId;
        this.name = name;
        this.age = age;
        this.friendHead = null;
        this.next = null;
    }
}
class SocialMediaList {
    UserNode head = null;
    void addUser(int id, String name, int age) {
        UserNode newUser = new UserNode(id, name, age);
        newUser.next = head;
        head = newUser;
    }
    UserNode findUserById(int id) {
        UserNode temp = head;
        while (temp != null) {
            if (temp.userId == id)
                return temp;
            temp = temp.next;
        }
        return null;
    }
    void addFriend(int userId, int friendId) {
        UserNode user = findUserById(userId);
        if (user == null) return;

        FriendNode newFriend = new FriendNode(friendId);
        newFriend.next = user.friendHead;
        user.friendHead = newFriend;
    }
    void removeFriend(int userId, int friendId) {
        UserNode user = findUserById(userId);
        if (user == null) return;

        FriendNode curr = user.friendHead;
        FriendNode prev = null;

        while (curr != null) {
            if (curr.friendId == friendId) {
                if (prev == null)
                    user.friendHead = curr.next;
                else
                    prev.next = curr.next;
                return;
            }
            prev = curr;
            curr = curr.next;
        }
    }
    void displayFriends(int userId) {
        UserNode user = findUserById(userId);
        if (user == null) return;

        FriendNode temp = user.friendHead;
        System.out.print("Friends of " + user.name + ": ");
        while (temp != null) {
            System.out.print(temp.friendId + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    void mutualFriends(int id1, int id2) {
        UserNode u1 = findUserById(id1);
        UserNode u2 = findUserById(id2);
        if (u1 == null || u2 == null) return;

        System.out.print("Mutual Friends: ");
        FriendNode f1 = u1.friendHead;

        while (f1 != null) {
            FriendNode f2 = u2.friendHead;
            while (f2 != null) {
                if (f1.friendId == f2.friendId) {
                    System.out.print(f1.friendId + " ");
                }
                f2 = f2.next;
            }
            f1 = f1.next;
        }
        System.out.println();
    }
    void searchUser(String name, int id) {
        UserNode temp = head;
        while (temp != null) {
            if (temp.userId == id || temp.name.equals(name)) {
                System.out.println("User Found: " + temp.userId + " " + temp.name);
                return;
            }
            temp = temp.next;
        }
    }
    void countFriends() {
        UserNode temp = head;
        while (temp != null) {
            int count = 0;
            FriendNode f = temp.friendHead;
            while (f != null) {
                count++;
                f = f.next;
            }
            System.out.println(temp.name + " has " + count + " friends");
            temp = temp.next;
        }
    }
}
public class SocialMediaFriendConnections{
    public static void main(String[] args) {
        SocialMediaList sm = new SocialMediaList();
        sm.addUser(1, "Kashish", 20);
        sm.addUser(2, "Navya", 21);
        sm.addUser(3, "Divyanshi", 22);

        sm.addFriend(1, 2);
        sm.addFriend(2, 3);
        sm.addFriend(2, 1);

        sm.displayFriends(1);
        sm.mutualFriends(1, 2);
        sm.countFriends();
        sm.searchUser("Kashish", 1);
    }
}

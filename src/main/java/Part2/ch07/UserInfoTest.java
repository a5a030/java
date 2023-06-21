package Part2.ch07;

public class UserInfoTest {
    public static void main(String[] args) {
        UserInfo userLee = new UserInfo();
        userLee.userId="a1234";
        userLee.userPassword="p1234";
        userLee.userName="Lee";
        userLee.userAddress="seoul, Korea";
        userLee.phoneNumber="01012345678";

        System.out.println(userLee.showUserInfo());

        UserInfo userKim = new UserInfo("b1111", "p1111", "Kim");
        System.out.println(userKim.showUserInfo());
    }
}

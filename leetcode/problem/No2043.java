package leetcode.problem;

/**
 * @Description https://leetcode-cn.com/problems/simple-bank-system/
 * @Author TouwaErioer
 * @Data 2022/3/18 16:28
 **/
public class No2043 {

    private long[] balance;

    public No2043(long[] balance) {
        this.balance = balance;
    }

    public boolean transfer(int account1, int account2, long money) {
        account1 = account1 - 1;
        account2 = account2 - 1;
        if (account1 > balance.length || account2 > balance.length) {
            return false;
        }
        long send = balance[account1] - money;
        long receive = balance[account2] + money;
        if (send < 0 || receive < 0) {
            return false;
        }
        if (account1 != account2) {
            balance[account1] = send;
            balance[account2] = receive;
        }
        return true;
    }

    public boolean deposit(int account, long money) {
        account = account - 1;
        if (account > balance.length) {
            return false;
        }
        if (balance[account] + money < 0) {
            return false;
        }
        balance[account] = balance[account] + money;
        return true;
    }

    public boolean withdraw(int account, long money) {
        account = account - 1;
        if (account > balance.length) {
            return false;
        }
        if (balance[account] - money < 0) {
            return false;
        }
        balance[account] = balance[account] - money;
        return true;
    }
}

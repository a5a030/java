package Part3.ch16.policy;

public interface Scheduler {
    void getNextCall();
    void sendCallToAgent();
}

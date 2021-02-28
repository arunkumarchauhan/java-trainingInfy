package methodOverridingExercise;

public class PremiumUser extends User {

	public PremiumUser(int id, String userName, String emailId, double walletBalance) {
		super(id, userName, emailId, walletBalance);
		// TODO Auto-generated constructor stub
	}

	private int rewardPoints;

	public int getRewardPoints() {
		return rewardPoints;
	}

	public void setRewardPoints(int rewardPoints) {
		this.rewardPoints = rewardPoints;
	}

	@Override
	public boolean makePayment(double billAmount) {
		if (this.getWalletBalance() >= billAmount) {
			this.rewardPoints += (int) (0.1 * billAmount);
			this.setWalletBalance(this.getWalletBalance() - billAmount);
			return true;
		}
		return false;

	}

}

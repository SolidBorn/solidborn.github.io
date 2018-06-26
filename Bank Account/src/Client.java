import java.util.Random;

public class Client {

	private int id;
	private String name;
	private int age;
	private String address;
	private String phoneNumber;
	private boolean checkingAccount;
	private boolean savingAccount;

	public void makeClient(String name, int age, String address, String number, boolean checking, boolean saving) {
		this.id = new Random().nextInt(9999 - 1000) + 1000;
		this.name = name;
		this.age = age;
		this.address = address;
		this.phoneNumber = number;
		this.checkingAccount = checking;
		this.savingAccount = saving;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public boolean isCheckingAccount() {
		return checkingAccount;
	}

	public void setCheckingAccount(boolean checkingAccount) {
		this.checkingAccount = checkingAccount;
	}

	public boolean isSavingAccount() {
		return savingAccount;
	}

	public void setSavingAccount(boolean savingAccount) {
		this.savingAccount = savingAccount;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "id=" + id + ", name=" + name + ", age=" + age + ", address=" + address + ", phoneNumber=" + phoneNumber + ", checkingAccount=" + checkingAccount + ", savingAccount=" + savingAccount;
	}
	
	

}
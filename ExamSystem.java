package mahaboob.com23CipherbyteTechnologies;

import java.util.Timer;
import java.util.TimerTask;

class ExamSystem {
	@SuppressWarnings("unused")
	private User currentUser;
	private Timer timer;

	public ExamSystem() {
		this.timer = new Timer();
	}

	public void login(String username, String password) {
		// Authenticate user
		// If authentication successful, set currentUser
	}

	public void updateProfile() {
		// Implement profile update functionality
	}

	public void selectAnswers() {
		// Implement MCQ selection functionality
	}

	public void startExam() {
		// Implement exam start functionality
		// Start timer
		timer.schedule(new TimerTask() {
			@Override
			public void run() {
				autoSubmit();
			}
		}, 60 * 60 * 1000); // 60 minutes
	}

	public void autoSubmit() {
		// Implement auto-submit functionality
		// When timer expires, submit selected answers
	}

	public void logout() {
		// Implement logout functionality
		// Reset currentUser and perform cleanup
	}
}




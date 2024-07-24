package mediator;

public class Test {
    public static void main(String[] args) {    
        ProfileDialog dialog = new ProfileDialog();
        dialog.dogCheckbox.setChecked(true);
        dialog.dogNameField.setText("Buddy");
        dialog.submitButton.click();

        // Try without entering dog's name
        dialog.dogCheckbox.setChecked(true);
        dialog.dogNameField.setText("");
        dialog.submitButton.click();
    }
}

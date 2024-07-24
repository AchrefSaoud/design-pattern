package mediator;


class ProfileDialog implements Mediator {
    public Checkbox dogCheckbox;
    public Button submitButton;
    public TextField dogNameField;

    public ProfileDialog() {
        this.dogCheckbox = new Checkbox(this);
        this.dogNameField = new TextField(this);
        this.submitButton = new Button(this);
    }

    @Override
    public void notify(Component sender, String event) {
        if (sender == dogCheckbox && event.equals("check")) {
            dogNameField.setVisible(dogCheckbox.isChecked());
        } else if (sender == submitButton && event.equals("submit")) {
            this.validateForm();
        }
    }

    private void validateForm() {
        if (dogCheckbox.isChecked() && dogNameField.getText().isEmpty()) {
            System.out.println("Please enter your dog's name.");
        } else {
            System.out.println("Form submitted successfully!");
        }
    }
}

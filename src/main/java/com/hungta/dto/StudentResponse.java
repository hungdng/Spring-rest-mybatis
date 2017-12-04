package com.hungta.dto;


public class StudentResponse {
	private String id;

    private String userName;

    private String firstName;

    private String lastName;

    private String password;

    private String emailAddress;

    private String dateOfBirth;
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public static final class StudentResponseBuilder {
        private String id;
        private String userName;
        private String firstName;
        private String lastName;
        private String password;
        private String emailAddress;
        private String dateOfBirth;

        private StudentResponseBuilder() {
        }

        public static StudentResponseBuilder aStudentResponse() {
            return new StudentResponseBuilder();
        }

        public StudentResponseBuilder withId(String id) {
            this.id = id;
            return this;
        }

        public StudentResponseBuilder withUserName(String userName) {
            this.userName = userName;
            return this;
        }

        public StudentResponseBuilder withFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public StudentResponseBuilder withLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public StudentResponseBuilder withPassword(String password) {
            this.password = password;
            return this;
        }

        public StudentResponseBuilder withEmailAddress(String emailAddress) {
            this.emailAddress = emailAddress;
            return this;
        }

        public StudentResponseBuilder withDateOfBirth(String dateOfBirth) {
            this.dateOfBirth = dateOfBirth;
            return this;
        }

        public StudentResponse build() {
            StudentResponse studentResponse = new StudentResponse();
            studentResponse.setId(id);
            studentResponse.setUserName(userName);
            studentResponse.setFirstName(firstName);
            studentResponse.setLastName(lastName);
            studentResponse.setPassword(password);
            studentResponse.setEmailAddress(emailAddress);
            studentResponse.setDateOfBirth(dateOfBirth);
            return studentResponse;
        }
    }
        
}

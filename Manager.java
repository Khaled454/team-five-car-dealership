package cardealership;

import java.time.LocalDate;

public class Manager extends Employee{

    department dept;
    
    public enum department {
        SALES, INVENTORY, GENERAL, ACCOUNTING
    }
    
    public Manager(department dept, int salary, LocalDate hireDate, int employeeID, String firstName, String lastName, String emailAddress, String phoneNumber, Address address, boolean status, role role) {
        super(salary, hireDate, employeeID, firstName, lastName, emailAddress, phoneNumber, address, status, role);
        this.dept = dept;
        setRole(role.MANAGER);
    }

    public department getDept() {
        return dept;
    }

    public void setDept(department dept) {
        this.dept = dept;
    }

    @Override
    public int getSalary() {
        return salary;
    }

    @Override
    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public LocalDate getHireDate() {
        return hireDate;
    }

    @Override
    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String getEmailAddress() {
        return emailAddress;
    }

    @Override
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    @Override
    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public Address getAddress() {
        return address;
    }

    @Override
    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public boolean isStatus() {
        return status;
    }

    @Override
    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public role getRole() {
        return role;
    }

    @Override
    public void setRole(role role) {
        this.role = role;
    }
    
}

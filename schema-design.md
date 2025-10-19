# MySQL Database Design - Smart Clinic Management System

## Tables and Relationships

### 1. Doctor
- doctor_id (Primary Key)
- name
- specialty
- phone
- email

### 2. Patient
- patient_id (Primary Key)
- name
- dob
- phone
- email

### 3. Appointment
- appointment_id (Primary Key)
- doctor_id (Foreign Key → Doctor.doctor_id)
- patient_id (Foreign Key → Patient.patient_id)
- appointment_date
- status

## Relationships
- One **Doctor** can have many **Appointments**
- One **Patient** can have many **Appointments**
- Each **Appointment** links one **Doctor** and one **Patient**

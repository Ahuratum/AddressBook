package com.example.addressbook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.List;

public class PersonCard extends AppCompatActivity {

    Button confirmAdd, confirmCancel;
    List<BaseContact> contactList;
    EditText et_addPersonName, et_addPersonAge,
            et_addPersonPhone, et_addPersonEmail,
            et_addPersonImage;
    TextView tv_addPersonId;
    int id;
    MyApplication myApp = (MyApplication) this.getApplication();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_person_card);

        confirmAdd = findViewById(R.id.btn_confirmAdd);
        confirmCancel = findViewById(R.id.btn_confirmCancel);
        contactList = myApp.getHumanList();
        et_addPersonName = findViewById(R.id.et_addPersonName);
        et_addPersonAge = findViewById(R.id.et_addPersonAge);
        et_addPersonPhone = findViewById(R.id.et_addPersonPhone);
        et_addPersonEmail = findViewById(R.id.et_addPersonEmail);
        et_addPersonImage = findViewById(R.id.et_addPersonImage);
        tv_addPersonId = findViewById(R.id.tv_addPersonId);

        Intent intent = getIntent();
        id = intent.getIntExtra("id", -1);
        PersonContact contact = null;

        if (id >= 0) {
            // Edit the person contact
            for (BaseContact newContact: contactList) {
                if (newContact.getId() == id) {
                    contact = (PersonContact) newContact;
                }
            }
            et_addPersonName.setText(contact.getName());
            et_addPersonAge.setText(String.valueOf(contact.getAge()));
            et_addPersonPhone.setText(contact.getPhoneNumber());
            et_addPersonEmail.setText(contact.getEmail());
            et_addPersonImage.setText(contact.getImage());
            tv_addPersonId.setText(String.valueOf(id));
        }
        else {
            // Add a new person

        }

        Intent backToMain = new Intent(PersonCard.this, MainActivity.class);

        confirmAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (id >= 0) {
                    // Edit person contact
                    PersonContact updatePerson = new PersonContact(et_addPersonName.getText().toString(), id,
                            Integer.parseInt(et_addPersonAge.getText().toString()),
                            et_addPersonPhone.getText().toString(),
                            et_addPersonEmail.getText().toString(),
                            et_addPersonImage.getText().toString(),
                            );
                    humanList.set(id, updateHuman);
                }
                else {
                    // Create new ID for person
                    int nextId = myApp.getNextId();

                    // Create a new person object
                    Human newHuman = new Human(nextId, et_addPersonName.getText().toString(),
                            Integer.parseInt(et_addPersonAge.getText().toString()),
                            et_addPersonPhone.getText().toString(),
                            et_addPersonEmail.getText().toString(),
                            et_addPersonImage.getText().toString());

                    // Add the human to the list of contacts
                    humanList.add(newHuman);
                    myApp.setNextId(nextId++);
                }

                // Back to main
                startActivity(backToMain);
            }
        });

        confirmCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(backToMain);
            }
        });

    }
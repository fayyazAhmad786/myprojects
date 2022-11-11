package com.sindhfloodvalidator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class House extends AppCompatActivity {

    EditText etsearchcnic, etsurveyid, etdestructiontype, etdistrict, etTehsil, etqounungoihalqa, etpatwaricircle, etmuaza,
            etname, etfatherspousename, etgender, etmaritalstatus, etcnich, etage, etaddress, etmobile, etnameofkin,
            etrelationwithdeceased, etcnicdeceased, etwatercanalmeter, etoccupancystatus, etlocationrisk, etfloodpalin,
            etbankaccount, etremarks, etdatetime, etlat, etlng, etnamewithrelation, etcnicrelation, etgenderrelation,
            etdisability, etrelationhousehold, etagerelation, etdeath, etdeathcause, etinjury, ettype, etothertypedamage,
            etdamagetype, etboundarywalldamaged, etroomsdamaged, etintact, etnorooms, etstructuretype, etdamagecategory;

    Button senddata;

    ImageView searchdata;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_house);

        getSupportActionBar().setTitle("Validate House");

        findViews();

    }

    private void findViews() {

        etsearchcnic = findViewById(R.id.etsearchcnic);
        searchdata = findViewById(R.id.searchdata);

        etsurveyid = findViewById(R.id.etsurveyid);
        etdestructiontype = findViewById(R.id.etdestructiontype);
        etdistrict = findViewById(R.id.etdistrict);
        etTehsil = findViewById(R.id.etTehsil);
        etqounungoihalqa = findViewById(R.id.etqounungoihalqa);
        etpatwaricircle = findViewById(R.id.etpatwaricircle);
        etmuaza = findViewById(R.id.etmuaza);
        etname = findViewById(R.id.etname);
        etfatherspousename = findViewById(R.id.etfatherspousename);
        etgender = findViewById(R.id.etgender);
        etmaritalstatus = findViewById(R.id.etmaritalstatus);
        etcnich = findViewById(R.id.etcnich);
        etage = findViewById(R.id.etage);
        etaddress = findViewById(R.id.etaddress);
        etmobile = findViewById(R.id.etmobile);
        etnameofkin = findViewById(R.id.etnameofkin);
        etrelationwithdeceased = findViewById(R.id.etrelationwithdeceased);
        etcnicdeceased = findViewById(R.id.etcnicdeceased);
        etwatercanalmeter = findViewById(R.id.etwatercanalmeter);
        etoccupancystatus = findViewById(R.id.etoccupancystatus);
        etlocationrisk = findViewById(R.id.etlocationrisk);
        etfloodpalin = findViewById(R.id.etfloodpalin);
        etbankaccount = findViewById(R.id.etbankaccount);
        etremarks = findViewById(R.id.etremarks);
        etdatetime = findViewById(R.id.etdatetime);
        etlat = findViewById(R.id.etlat);
        etlng = findViewById(R.id.etlng);
        etnamewithrelation = findViewById(R.id.etnamewithrelation);
        etcnicrelation = findViewById(R.id.etcnicrelation);
        etgenderrelation = findViewById(R.id.etgenderrelation);
        etdisability = findViewById(R.id.etdisability);
        etrelationhousehold = findViewById(R.id.etrelationhousehold);
        etagerelation = findViewById(R.id.etagerelation);
        etdeath = findViewById(R.id.etdeath);
        etdeathcause = findViewById(R.id.etdeathcause);
        etinjury = findViewById(R.id.etinjury);
        ettype = findViewById(R.id.ettype);
        etothertypedamage = findViewById(R.id.etothertypedamage);
        etdamagetype = findViewById(R.id.etdamagetype);
        etboundarywalldamaged = findViewById(R.id.etboundarywalldamaged);
        etroomsdamaged = findViewById(R.id.etroomsdamaged);
        etintact = findViewById(R.id.etintact);
        etnorooms = findViewById(R.id.etnorooms);
        etstructuretype = findViewById(R.id.etstructuretype);
        etdamagecategory = findViewById(R.id.etdamagecategory);

        senddata = findViewById(R.id.senddata);

    }
}
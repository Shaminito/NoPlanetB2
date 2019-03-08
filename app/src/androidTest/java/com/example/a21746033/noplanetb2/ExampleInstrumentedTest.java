package com.example.a21746033.noplanetb2;

import android.test.ActivityInstrumentationTestCase2;
import android.test.TouchUtils;
import android.widget.Button;


public class ExampleInstrumentedTest extends ActivityInstrumentationTestCase2<BLogin> {

    private Button btnLogin;

    public ExampleInstrumentedTest() {
        super(BLogin.class);
    }

    protected void setUp() throws Exception {
        super.setUp();
        BLogin actividad = getActivity();
        btnLogin = actividad.findViewById(R.id.btnLogin);

    }

//    protected void tearDown() throws Exception {
//        super.tearDown();
//    }

    public void testLoginSignup() {

        TouchUtils.tapView(this, btnLogin);

    }
}
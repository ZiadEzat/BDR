package com.ziad.azza;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import java.util.HashMap;
import java.util.Map;

import io.github.controlwear.virtual.joystick.android.JoystickView;

public class MainActivity extends AppCompatActivity {
    int state = 0;
    String URL;
    EditText IPAddress;
    EditText IPAddress2;
    Button connect;
    Button videoConnect;
    Button change;
    Button forward;
    Button backward;
    Button left;
    Button right;
    Button stepForward;
    Button stepBackward;
    Button stepLeft;
    Button stepRight;
    Button reset;
    Button open;
    Button close;

    Button[] buttons = new Button[10];

    WebView webView;
    JoystickView joystick;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        IPAddress = findViewById(R.id.IPAddress);
        IPAddress2 = findViewById(R.id.IPAddress3);
        connect = findViewById(R.id.button);
        videoConnect = findViewById(R.id.button3);
        forward = findViewById(R.id.btnOn);
        backward = findViewById(R.id.btnOn2);
        left = findViewById(R.id.btnOn3);
        right = findViewById(R.id.btnOn4);
        stepForward = findViewById(R.id.step_forward);
        stepBackward = findViewById(R.id.step_backward);
        stepLeft = findViewById(R.id.step_left);
        stepRight = findViewById(R.id.step_right);
        reset = findViewById(R.id.reset);
        change = findViewById(R.id.change2);
        open = findViewById(R.id.OPEN);
        close = findViewById(R.id.CLOSE);
        URL = getIntent().getStringExtra("ipaddress");

        sendReq("reset");
        Toast.makeText(getApplication(),"Connected to: " + URL,Toast.LENGTH_SHORT).show();


        
        buttons[0] = findViewById(R.id.motor1up);
        buttons[1] = findViewById(R.id.motor1down);
        buttons[2] = findViewById(R.id.motor2up);
        buttons[3] = findViewById(R.id.motor2down);
        buttons[4] = findViewById(R.id.motor3up);
        buttons[5] = findViewById(R.id.motor3down);
        buttons[6] = findViewById(R.id.motor4up);
        buttons[7] = findViewById(R.id.motor4down);
        buttons[8] = findViewById(R.id.motor5up);
        buttons[9] = findViewById(R.id.motor5down);

        open.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendReq("open");

            }
        });

        close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendReq("close");
            }
        });
        buttons[0].setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(event.getAction() == MotionEvent.ACTION_DOWN) {
                    sendReq("motor1up");
                } else if (event.getAction() == MotionEvent.ACTION_UP) {
                    sendReq("idle");
                }
                return true;
            }
        });
        buttons[1].setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(event.getAction() == MotionEvent.ACTION_DOWN) {
                    sendReq("motor1down");
                } else if (event.getAction() == MotionEvent.ACTION_UP) {
                    sendReq("idle");
                }
                return true;
            }
        });
        buttons[2].setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(event.getAction() == MotionEvent.ACTION_DOWN) {
                    sendReq("motor2up");
                } else if (event.getAction() == MotionEvent.ACTION_UP) {
                    sendReq("idle");
                }
                return true;
            }
        });
        buttons[3].setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(event.getAction() == MotionEvent.ACTION_DOWN) {
                    sendReq("motor2down");
                } else if (event.getAction() == MotionEvent.ACTION_UP) {
                    sendReq("idle");
                }
                return true;
            }
        });
        buttons[4].setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(event.getAction() == MotionEvent.ACTION_DOWN) {
                    sendReq("motor3up");
                } else if (event.getAction() == MotionEvent.ACTION_UP) {
                    sendReq("idle");
                }
                return true;
            }
        });
        buttons[5].setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(event.getAction() == MotionEvent.ACTION_DOWN) {
                    sendReq("motor3down");
                } else if (event.getAction() == MotionEvent.ACTION_UP) {
                    sendReq("idle");
                }
                return true;
            }
        });
        buttons[6].setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(event.getAction() == MotionEvent.ACTION_DOWN) {
                    sendReq("motor4up");
                } else if (event.getAction() == MotionEvent.ACTION_UP) {
                    sendReq("idle");
                }
                return true;
            }
        });
        buttons[7].setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(event.getAction() == MotionEvent.ACTION_DOWN) {
                    sendReq("motor4down");
                } else if (event.getAction() == MotionEvent.ACTION_UP) {
                    sendReq("idle");
                }
                return true;
            }
        });
        buttons[8].setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(event.getAction() == MotionEvent.ACTION_DOWN) {
                    sendReq("motor5up");
                } else if (event.getAction() == MotionEvent.ACTION_UP) {
                    sendReq("idle");
                }
                return true;
            }
        });
        buttons[9].setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(event.getAction() == MotionEvent.ACTION_DOWN) {
                    sendReq("motor5down");
                } else if (event.getAction() == MotionEvent.ACTION_UP) {
                    sendReq("idle");
                }
                return true;
            }
        });


        /*for (i = 0; i < buttons.length; i++) {
             buttons[i].setOnClickListener(new View.OnClickListener() {
                 @Override
                 public void onClick(View v) {

                     if (i == 0) {
                         Toast.makeText(getApplication(),"i == 0",Toast.LENGTH_SHORT).show();

                     }
                     if (i == 0) {
                         Toast.makeText(getApplication(),"i == 1",Toast.LENGTH_SHORT).show();

                     }
                 }
             });
        }*/

        webView = findViewById(R.id.webView);
        joystick = findViewById(R.id.joystick);
        reset = findViewById(R.id.reset);

        joystick.setRotation(45);
        webView.setRotation(180);
        webView.setWebViewClient(new WebViewClient());
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setUseWideViewPort(true);
        webView.getSettings().setLoadWithOverviewMode(true);
        String urlcam = getIntent().getStringExtra("ipaddresscam");

        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl(urlcam + "video");
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendReq("reset");
            }
        });
        change.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if (state == 0) {
                    state = 1;

                    for (int i = 0; buttons.length > i; i++) {

                        buttons[i].setVisibility(View.INVISIBLE);

                    }
                    forward.setVisibility(View.VISIBLE);
                    backward.setVisibility(View.VISIBLE);
                    left.setVisibility(View.VISIBLE);
                    right.setVisibility(View.VISIBLE);
                } else if (state == 1) {
                    state = 2;
                    stepForward.setVisibility(View.VISIBLE);
                    stepBackward.setVisibility(View.VISIBLE);
                    stepLeft.setVisibility(View.VISIBLE);
                    stepRight.setVisibility(View.VISIBLE);
                    forward.setVisibility(View.INVISIBLE);
                    backward.setVisibility(View.INVISIBLE);
                    left.setVisibility(View.INVISIBLE);
                    right.setVisibility(View.INVISIBLE);

                } else if (state == 2) {
                    state = 0;
                    for (int i = 0; buttons.length > i; i++) {

                        buttons[i].setVisibility(View.VISIBLE);
                    }

                    stepForward.setVisibility(View.INVISIBLE);
                    stepBackward.setVisibility(View.INVISIBLE);
                    stepLeft.setVisibility(View.INVISIBLE);
                    stepRight.setVisibility(View.INVISIBLE);
                }

            }
        });

        videoConnect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                webView.setWebViewClient(new WebViewClient());
                String urlcam = getIntent().getStringExtra("ipaddresscam");
                webView.loadUrl(urlcam + "video");

            }
        });


        connect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                URL = IPAddress.getText().toString();
                Toast.makeText(getApplication(),"Connected to: " + URL,Toast.LENGTH_SHORT).show();

            }
        });

        joystick.setOnMoveListener(new JoystickView.OnMoveListener() {
            int state = 0;

            @Override
            public void onMove(int angle, int strength) {

                if (190 >= angle && angle >= 90 && strength >= 40 && state != 1) {
                    state = 1;

                    sendReq("camforward");
                }
                if (91 >= angle && angle >= 0 && strength >= 40 && state != 2) {
                    state = 2;
                    sendReq("camleft");
                }
                if (360 >= angle && angle >= 261 && state != 3) {
                    state = 3;
                    sendReq("cambackward");
                }
                if (260 >= angle && angle >= 191 && state != 4) {
                    state = 4;
                    sendReq("camright");
                }

                if (0 >= angle && angle >= 0 && strength  <= 20 && state != 0) {
                    state = 0;
                    sendReq("camidle");
                }
            }
        });

        forward.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(event.getAction() == MotionEvent.ACTION_DOWN) {
                    sendReq("forward");
                } else if (event.getAction() == MotionEvent.ACTION_UP) {
                    sendReq("idle");
                }
                return true;
            }

        });

        backward.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(event.getAction() == MotionEvent.ACTION_DOWN) {
                    sendReq("backward");
                } else if (event.getAction() == MotionEvent.ACTION_UP) {
                    sendReq("idle");
                }
                return true;
            }

        });

        left.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(event.getAction() == MotionEvent.ACTION_DOWN) {
                    sendReq("left");
                } else if (event.getAction() == MotionEvent.ACTION_UP) {
                    sendReq("idle");
                }
                return true;
            }

        });

        right.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(event.getAction() == MotionEvent.ACTION_DOWN) {
                    sendReq("right");
                } else if (event.getAction() == MotionEvent.ACTION_UP) {
                    sendReq("idle");
                }
                return true;
            }

        });
        stepForward.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(event.getAction() == MotionEvent.ACTION_DOWN) {
                    sendReq("stepforward");
                } else if (event.getAction() == MotionEvent.ACTION_UP) {
                    sendReq("idle");
                }
                return true;
            }

        });
        stepBackward.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(event.getAction() == MotionEvent.ACTION_DOWN) {
                    sendReq("stepbackward");
                } else if (event.getAction() == MotionEvent.ACTION_UP) {
                    sendReq("idle");
                }
                return true;
            }

        });
        stepLeft.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(event.getAction() == MotionEvent.ACTION_DOWN) {
                    sendReq("stepleft");
                } else if (event.getAction() == MotionEvent.ACTION_UP) {
                    sendReq("idle");
                }
                return true;
            }

        });
        stepRight.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(event.getAction() == MotionEvent.ACTION_DOWN) {
                    sendReq("stepright");
                } else if (event.getAction() == MotionEvent.ACTION_UP) {
                    sendReq("idle");
                }
                return true;
            }

        });




    }



    void sendReq(String command) {
        ;
        StringRequest request = new StringRequest(Request.Method.GET, URL + command, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                Toast.makeText(getApplication(),response,Toast.LENGTH_SHORT).show();
            }

        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(getApplication(),error + "",Toast.LENGTH_SHORT).show();

            }
        }


        ){
            @Override
            protected Map<String,String> getParams() throws AuthFailureError {
                Map<String,String> params = new HashMap<String,String>();
                params.put("pins","for");
                Log.d("MyActivity", params.get("pins").toString());
                return params;
            }

        };

        RequestQueue rq = Volley.newRequestQueue(this);
        rq.add(request);

    }


}

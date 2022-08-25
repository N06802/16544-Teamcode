package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.util.ElapsedTime;

public class hardwareMap {

    //Create motors
    public DcMotor leftFront  = null;
    public DcMotor rightFront = null;
    public DcMotor leftBack   = null;
    public DcMotor rightBack  = null;

    /* Local OpMode Members */
    HardwareMap hardwareMap = null;
    private ElapsedTime elapsedTime = new ElapsedTime();

    /* Constructor */
    public hardwareMap(){

    }

    /* Initialize Standard Hardware Interfaces */
    public void init(HardwareMap ahwMap){
        /* Save Reference To HardwareMap*/
        hardwareMap = ahwMap;

        leftFront = hardwareMap.get(DcMotor.class, "leftFront");
        rightFront = hardwareMap.get(DcMotor.class, "rightFront");
        leftBack = hardwareMap.get(DcMotor.class, "leftBack");
        rightBack = hardwareMap.get(DcMotor.class, "rightBack");

    }
}

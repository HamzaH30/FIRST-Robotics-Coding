// package org.firstinspires.ftc.teamcode;

// import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
// import com.qualcomm.robotcore.hardware.DigitalChannel;
// import com.qualcomm.robotcore.hardware.Blinker;
// import com.qualcomm.robotcore.hardware.Gyroscope;
// import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
// import com.qualcomm.robotcore.eventloop.opmode.Disabled;
// import com.qualcomm.robotcore.hardware.DcMotor;
// import com.qualcomm.robotcore.hardware.DcMotorSimple;
// import com.qualcomm.robotcore.util.ElapsedTime;

// @TeleOp

// public class MyFIRSTJavaOpMode extends LinearOpMode {
//     //private Blinker expansion_Hub_1;
//     //private Gyroscope imu;
//     private DcMotor left_drive;
//     private DcMotor right_drive;
//     private DcMotor left_drive_front;
//     private DcMotor right_drive_front;
//     private DcMotor arm_motor;
//     // private DcMotor motorTest;
    
//     @Override
//     public void runOpMode() {
//         // Wheels
//         left_drive = hardwareMap.get(DcMotor.class, "motor_left");
//         right_drive = hardwareMap.get(DcMotor.class, "motor_right");
//         left_drive_front = hardwareMap.get(DcMotor.class, "fl");
//         // right_drive_front = hardwareMap.get(DcMotor.class, "fr");
        
//         // Arm
//         // arm_motor = hardwareMap.get(DcMotor.class, "arm"); // Commented for now, but this is actual line of code needed
//         arm_motor = hardwareMap.dcMotor.get("fr");
        

//         // telemetry.addData("Status", "Initialized");
//         // telemetry.update();
//         // Wait for the game to start (driver presses PLAY)
//         waitForStart();
        

//         // run until the end of the match (driver presses STOP)
//         double tgtPowerLeft = 0;
//         double tgtPowerRight = 0;
//         while (opModeIsActive()) {
//             // Assigning power for wheels
//             tgtPowerLeft = -this.gamepad2.right_stick_y;
//             tgtPowerRight = this.gamepad2.left_stick_y;
            
//             left_drive.setPower(tgtPowerLeft);
//             right_drive.setPower(tgtPowerRight);
//             left_drive_front.setPower(tgtPowerLeft);
//             // right_drive_front.setPower(tgtPowerRight);
            
//             // variables for arm power/speed
//             double arm_spin = 0;
//             if (gamepad2.right_trigger > 0) {
//                 // Clockwise
//                 arm_spin = gamepad2.right_trigger;
//             } 
//             else if (gamepad2.left_trigger > 0) {
//                 // Counter-clockwise
//                 arm_spin = -gamepad2.left_trigger;
//             }
            
//             // Controlling arm pivot using left trigger and right trigger values
//             arm_motor.setPower(arm_spin / 2);
//         }
//     }
// }

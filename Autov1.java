import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

@Autonomous(name = "AutoMode")

public class Autov1 extends LinearOpMode {
    private DcMotor left_drive_back;
    private DcMotor right_drive_back;
    private DcMotor left_drive_front;
    private DcMotor right_drive_front;
    
    // Variables to store positions
    private int rightPosition;
    private int leftPosition;
    
    @Override
    public void runOpMode() {
        // Front Wheels
        left_drive_back = hardwareMap.get(DcMotor.class, "motor_front_left");
        right_drive_back = hardwareMap.get(DcMotor.class, "motor_front_right");
        
        // Back Wheels
        left_drive_front = hardwareMap.get(DcMotor.class, "motor_back_left");
        right_drive_front = hardwareMap.get(DcMotor.class, "motor_back_right");
        
        left_drive_back.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        left_drive_back.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        left_drive_back.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        left_drive_back.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        
        // Reset direction of right motor to match left motor
        right_drive_front.setDirection(DcMotorSimple.Direction.REVERSE);
        right_drive_back.setDirection(DcMotorSimple.Direction.REVERSE);
        
        rightPosition = 0;
        leftPosition = 0;
        
        // Any code after will only be run after user clicks start
        waitForStart();
        
        drive(10000, 10000, 0.25); // Move forward
        // drive(1000, -1000, 0.25); // Turn Right
    }
    
    private void drive(int rightTarget, int leftTarget, double speed) {
        // change motor positions to desired, target positions
        rightPosition += rightTarget;
        leftPosition += leftTarget;
        
        right_drive_front.setTargetPosition(rightPosition);
        right_drive_back.setTargetPosition(rightPosition);
        left_drive_back.setTargetPosition(leftPosition);
        left_drive_front.setTargetPosition(leftPosition);
        
        right_drive_front.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        right_drive_back.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        left_drive_front.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        left_drive_back.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        
        // Speed of the motors
        right_drive_front.setPower(speed);
        right_drive_back.setPower(speed);
        left_drive_front.setPower(speed);
        left_drive_back.setPower(speed);
        
        // Need to make sure no other scripts, methods, etc. are running
        while(
            opModeIsActive() 
            && left_drive_front.isBusy() 
            && left_drive_back.isBusy() 
            && right_drive_front.isBusy() 
            && right_drive_back.isBusy()
            ) {
                idle();
            }
            
    }
}
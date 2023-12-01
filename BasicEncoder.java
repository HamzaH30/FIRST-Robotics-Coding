import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import org.firstinspires.ftc.robotcore.external.Telemetry;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.IMU;
import com.qualcomm.robotcore.hardware.DigitalChannel;
import com.qualcomm.robotcore.hardware.Blinker;
import com.qualcomm.robotcore.hardware.Gyroscope;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.util.ElapsedTime;
@Autonomous

public class BasicEncoder extends LinearOpMode {
    private Blinker control_Hub;
    private Blinker expansion_Hub_1;
    private DcMotor bottom_shoulder;
    private DcMotor elbow;
    private Servo finger;
    private Gyroscope imu;
    private DcMotor motor_back_left;
    private DcMotor motor_back_right;
    private DcMotor motor_front_left;
    private DcMotor motor_front_right;
    private DcMotor top_shoulder1;
    private DcMotor top_shoulder2;
    private Servo wrist;

    // todo: write your code here
    public void runOpMode() {
        motor_back_left = hardwareMap.get(DcMotor.class, "motor_back_left");
        motor_back_right = hardwareMap.get(DcMotor.class, "motor_back_right");
        motor_front_left = hardwareMap.get(DcMotor.class, "motor_front_left");
        motor_front_right = hardwareMap.get(DcMotor.class, "motor_front_right");
        
        motor_front_right.setDirection(DcMotor.Direction.REVERSE);
        motor_back_right.setDirection(DcMotor.Direction.REVERSE);
        
        motor_back_left.setTargetPosition(1000);
        motor_back_right.setTargetPosition(1000);
        motor_front_left.setTargetPosition(1000);
        motor_front_right.setTargetPosition(1000);

        waitForStart();
        
        while (opModeIsActive()) {
            
        }
    }
}
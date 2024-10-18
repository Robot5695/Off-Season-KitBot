package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Robot;

import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.ctre.phoenix.motorcontrol.ControlMode;

public class Shooter extends SubsystemBase {
  private TalonSRX ShooterMotor = new TalonSRX(4);
  private TalonSRX HolderMotor = new TalonSRX(2);
  
  public Shooter() {
    ShooterMotor.setInverted(false);
    HolderMotor.setInverted(false);

  }

  public void setShooterMotorSpeed(double MotorSpeed) {
    ShooterMotor.set(ControlMode.PercentOutput,MotorSpeed);
  }

  public void setHolderMotorSpeed(double MotorSpeed) {
    HolderMotor.set(ControlMode.PercentOutput,MotorSpeed);
  }

  public void stopShooterMotor() {
    ShooterMotor.set(ControlMode.PercentOutput,0);
  }

  public void stopHolderMotor() {
    HolderMotor.set(ControlMode.PercentOutput,0);
  }

  @Override
  public void periodic() {

  }
}
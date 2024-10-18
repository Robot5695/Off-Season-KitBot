package frc.robot.commands;
import frc.robot.subsystems.Shooter;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import frc.robot.commands.PassNote;
import frc.robot.commands.StartShooter;
import frc.robot.commands.StopShooter;


// NOTE:  Consider using this command inline, rather than writing a subclass.  For more
// information, see:
// https://docs.wpilib.org/en/stable/docs/software/commandbased/convenience-features.html
public class Shoot extends SequentialCommandGroup {
  private Shooter Shooter;
  public Shoot(Shooter shooter) {
    addRequirements(shooter);
    this.Shooter = shooter;
    addCommands(
      new StartShooter(shooter),
      new PassNote(shooter),
      // set timer
      new StopShooter(shooter)
    );
  }
}
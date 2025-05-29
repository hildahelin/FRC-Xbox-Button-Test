package frc.robot;

import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.XboxController;

public class Robot extends TimedRobot {
    private XboxController controller;

    @Override
    public void robotInit() {
        controller = new XboxController(0); // 0, USB port numarası (DriverStation'da kontrol et)
    }

    @Override
    public void teleopPeriodic() {
        if (controller.getAButtonPressed()) {
            System.out.println("A Key Pressed");
        }
        if (controller.getBButtonPressed()) {
            System.out.println("B Key Pressed");
        }
        if (controller.getXButtonPressed()) {
            System.out.println("X Key Pressed");
        }
        if (controller.getYButtonPressed()) {
            System.out.println("Y Key Pressed");
        }
    }
}

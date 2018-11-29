package org.usfirst.frc.team342.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj.command.Subsystem;

public class Drive_System extends Subsystem{
	
	private TalonSRX Right;
	private TalonSRX Left; 
	
	public Drive_System()
	{
		Right = new TalonSRX(7);
		Left = new TalonSRX(9);
	}
	
	public void Drive(double R, double L)
	{
		Right.set(ControlMode.PercentOutput, R);
		Left.set(ControlMode.PercentOutput, L);
	}
	
	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
		
	}


}

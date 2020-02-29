import javax.swing.*;
public class CarCare
{
	public static void main(String[] args)
	{
		// vars and constants
		String[] services = {"oil changes", "tire rotation", "battery check", "brake inspection"};
		double[] prices = {25.00, 22.00, 15.00, 5.00};	
		int matchIndex = 0;
		boolean isMatch = false;
		int keepTrying = 0;
		String selection = "";
		
		//do...while loop
		do
		{
			//input phase 
			selection = JOptionPane.showInputDialog(null,
			"Please type the name of the service to see the price:\noil change\ntire rotaion\nbattery check\nbrake inspection ");
			//loop through all the services for a match 
			for(int x=0; x < services.length; ++x)
			{
				// checks if we have a match 
				if(selection.substring(0, 3).equalsIgnoreCase(services[x].substring(0, 3)))
				{
					// matches found
					isMatch = true;
					matchIndex = x;
					JOptionPane.showMessageDialog(null, "You selected: " + services[x] + "\nThe price for the service is: $" + prices[x]);
					// early exit if needed 
					x = services.length;
					
				}
				else
				{
					// not found
					++keepTrying;
					if(keepTrying == services.length)
					{
						JOptionPane.showMessageDialog(null, "you have not selected a valid choice ");
					}	
					
				}
			}
		}
		while(isMatch == false);
	}
}
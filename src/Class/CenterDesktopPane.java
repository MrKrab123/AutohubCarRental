/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Class;

/**
 *
 * @author MrKrab
 */
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;

public class CenterDesktopPane {
    public void DesktopPane(JDesktopPane jDesktopPane1, JInternalFrame internal){
        
   int x = (jDesktopPane1.getWidth() - internal.getWidth())/2;
  int y = (jDesktopPane1.getHeight() - internal.getHeight())/2;
  
  if(internal.isShowing()){
        internal.setLocation(x, y);
  }
  else
  {
        internal.setLocation(x, y);
       jDesktopPane1.add(internal);
       internal.show();
  }
    }

}

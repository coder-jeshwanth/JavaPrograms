import java.applet.Applet;
import java.awt.Font;
import java.awt.Graphics;

public class MyFontApplet extends Applet {
    String fontname;
    int fontsize;

    public void init() {
        fontname = getParameter("font");
        fontsize = Integer.parseInt(getParameter("size"));
    }

    public void paint(Graphics g) {
        Font f = new Font(fontname, Font.BOLD, fontsize);
        g.setFont(f);
        g.drawString("Acharya College", 50, 50);
    }
}

/*<html>
    <head>
        <title>parameter passing to an applet</title>
    </head>
    <body>
        <applet code=MyFontApplet.class width=400 height=500>
            <param name="font" value="Timesroman">
            <param name="size" value="36">
        </applet>
    </body>
</html>*/

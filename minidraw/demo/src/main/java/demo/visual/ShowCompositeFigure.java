package demo.visual;

import java.awt.Point;

import minidraw.framework.*;
import minidraw.framework.drawing.DrawingEditor;
import minidraw.framework.drawing.MiniDrawApplication;
import minidraw.framework.figure.CompositeFigure;
import minidraw.framework.figure.Figure;
import minidraw.framework.figure.GroupFigure;
import minidraw.framework.figure.ImageFigure;
import minidraw.standard.*;
import minidraw.standard.tools.SelectionTool;

/**
 * Demonstrate putting several figures into a composite figure.
 * 
 */
public class ShowCompositeFigure {

  public static void main(String[] args) {
    DrawingEditor window = new MiniDrawApplication(
        "CompositeFigure test: moves as a unit", new ChessBackgroundFactory());
    window.open();

    Figure blackKing = new ImageFigure("bking",
        new Point(14 + 3 * 40, 14 + 0 * 40));
    Figure blackPawn = new ImageFigure("bpawn",
        new Point(14 + 4 * 40, 14 + 1 * 40));

    CompositeFigure composite = new GroupFigure();

    composite.add(blackKing);
    composite.add(blackPawn);

    window.setTool(new SelectionTool(window));

    window.drawing().add(composite);
  }
}

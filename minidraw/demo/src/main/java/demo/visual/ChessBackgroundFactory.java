package demo.visual;

import javax.swing.JTextField;

import minidraw.framework.*;
import minidraw.framework.drawing.Drawing;
import minidraw.framework.drawing.DrawingEditor;
import minidraw.framework.drawing.DrawingView;
import minidraw.framework.drawing.Factory;
import minidraw.framework.figure.StdViewWithBackground;
import minidraw.standard.*;
import minidraw.standard.tools.StandardDrawing;

/**
 * A factory just for testing purposes. Defines a chess board background. 

 */
class ChessBackgroundFactory implements Factory {
  @Override
  public DrawingView createDrawingView(DrawingEditor editor) {
    DrawingView view = new StdViewWithBackground(editor, "chessboard");
    return view;
  }

  @Override
  public Drawing createDrawing(DrawingEditor editor) {
    return new StandardDrawing();
  }

  @Override
  public JTextField createStatusField(DrawingEditor editor) {
    return null;
  }
}

package Component;

import java.awt.Window;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.function.Consumer;

public class ListenerBuilder {
    static final Consumer<WindowEvent> nullConsumer = e -> {}; 

    private Consumer<WindowEvent> opened = nullConsumer;
    private Consumer<WindowEvent> closing = nullConsumer;
    private Consumer<WindowEvent> closed = nullConsumer;
    private Consumer<WindowEvent> iconified = nullConsumer;
    private Consumer<WindowEvent> deiconified = nullConsumer;
    private Consumer<WindowEvent> activated = nullConsumer;
    private Consumer<WindowEvent> deactivated = nullConsumer;

    public ListenerBuilder opened(Consumer<WindowEvent> opened) 
    { this.opened = opened; return this; }

    public ListenerBuilder сlosing(Consumer<WindowEvent> closing) 
    { this.closing = closing; return this; }

    public ListenerBuilder closed(Consumer<WindowEvent> closed) 
    { this.closed = closed; return this; }

    public ListenerBuilder iconified(Consumer<WindowEvent> iconified) 
    { this.iconified = iconified; return this; }

    public ListenerBuilder deiconified(Consumer<WindowEvent> deiconified) 
    { this.deiconified = deiconified; return this; }

    public ListenerBuilder activated(Consumer<WindowEvent> activated) 
    { this.activated = activated; return this; }

    public ListenerBuilder deactivated(Consumer<WindowEvent> deactivated) 
    { this.deactivated = deactivated; return this; }

    public WindowListener build() {
        return new WindowListener() {
            public void windowOpened(WindowEvent e) {
                opened.accept(e);
            }
            public void windowIconified(WindowEvent e) {
                iconified.accept(e);
            }
            public void windowDeiconified(WindowEvent e) {
                deiconified.accept(e);
            }
            public void windowDeactivated(WindowEvent e) {
                deactivated.accept(e);
            }
            public void windowClosing(WindowEvent e) {
                closing.accept(e);
            }
            public void windowClosed(WindowEvent e) {
                closed.accept(e);
            }
            public void windowActivated(WindowEvent e) {
                activated.accept(e);
            }
        };
    }

    public void attachTo(Window w) {
        w.addWindowListener(build());
    }
}
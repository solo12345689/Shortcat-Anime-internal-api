package d2;

import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;

/* JADX INFO: renamed from: d2.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C4557a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f44982a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f44983b = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f44984c = 0;

    /* JADX INFO: renamed from: d2.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class C0707a extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final EditText f44985a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final C4563g f44986b;

        C0707a(EditText editText, boolean z10) {
            this.f44985a = editText;
            C4563g c4563g = new C4563g(editText, z10);
            this.f44986b = c4563g;
            editText.addTextChangedListener(c4563g);
            editText.setEditableFactory(C4558b.getInstance());
        }

        @Override // d2.C4557a.b
        KeyListener a(KeyListener keyListener) {
            if (keyListener instanceof C4561e) {
                return keyListener;
            }
            if (keyListener == null) {
                return null;
            }
            return keyListener instanceof NumberKeyListener ? keyListener : new C4561e(keyListener);
        }

        @Override // d2.C4557a.b
        InputConnection b(InputConnection inputConnection, EditorInfo editorInfo) {
            return inputConnection instanceof C4559c ? inputConnection : new C4559c(this.f44985a, inputConnection, editorInfo);
        }

        @Override // d2.C4557a.b
        void c(boolean z10) {
            this.f44986b.c(z10);
        }
    }

    /* JADX INFO: renamed from: d2.a$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class b {
        b() {
        }

        abstract KeyListener a(KeyListener keyListener);

        abstract InputConnection b(InputConnection inputConnection, EditorInfo editorInfo);

        abstract void c(boolean z10);
    }

    public C4557a(EditText editText, boolean z10) {
        K1.f.h(editText, "editText cannot be null");
        this.f44982a = new C0707a(editText, z10);
    }

    public KeyListener a(KeyListener keyListener) {
        return this.f44982a.a(keyListener);
    }

    public InputConnection b(InputConnection inputConnection, EditorInfo editorInfo) {
        if (inputConnection == null) {
            return null;
        }
        return this.f44982a.b(inputConnection, editorInfo);
    }

    public void c(boolean z10) {
        this.f44982a.c(z10);
    }
}

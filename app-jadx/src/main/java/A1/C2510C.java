package a1;

import android.os.Handler;
import android.view.inputmethod.InputConnection;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: a1.C, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
class C2510C extends AbstractC2509B {
    public C2510C(InputConnection inputConnection, Function1 function1) {
        super(inputConnection, function1);
    }

    @Override // a1.AbstractC2509B
    protected final void b(InputConnection inputConnection) {
        inputConnection.closeConnection();
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i10, int i11) {
        InputConnection inputConnectionC = c();
        if (inputConnectionC != null) {
            return inputConnectionC.deleteSurroundingTextInCodePoints(i10, i11);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final Handler getHandler() {
        InputConnection inputConnectionC = c();
        if (inputConnectionC != null) {
            return inputConnectionC.getHandler();
        }
        return null;
    }
}

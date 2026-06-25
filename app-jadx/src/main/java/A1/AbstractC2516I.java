package a1;

import android.os.Build;
import android.view.inputmethod.InputConnection;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: a1.I, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2516I {
    public static final InterfaceInputConnectionC2508A a(InputConnection inputConnection, Function1 function1) {
        int i10 = Build.VERSION.SDK_INT;
        return i10 >= 34 ? new C2515H(inputConnection, function1) : i10 >= 25 ? new C2512E(inputConnection, function1) : new C2510C(inputConnection, function1);
    }
}

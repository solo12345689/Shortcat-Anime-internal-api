package a1;

import android.os.Bundle;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: a1.E, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
class C2512E extends C2510C {
    public C2512E(InputConnection inputConnection, Function1 function1) {
        super(inputConnection, function1);
    }

    @Override // a1.AbstractC2509B, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i10, Bundle bundle) {
        InputConnection inputConnectionC = c();
        if (inputConnectionC != null) {
            return inputConnectionC.commitContent(inputContentInfo, i10, bundle);
        }
        return false;
    }
}

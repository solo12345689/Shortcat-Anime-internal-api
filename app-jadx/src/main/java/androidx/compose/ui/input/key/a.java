package androidx.compose.ui.input.key;

import androidx.compose.ui.e;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static final e a(e eVar, Function1 function1) {
        return eVar.then(new KeyInputElement(function1, null));
    }

    public static final e b(e eVar, Function1 function1) {
        return eVar.then(new KeyInputElement(null, function1));
    }
}

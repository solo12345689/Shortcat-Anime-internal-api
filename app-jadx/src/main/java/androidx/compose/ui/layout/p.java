package androidx.compose.ui.layout;

import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class p {
    public static final androidx.compose.ui.e a(androidx.compose.ui.e eVar, Function1 function1) {
        return eVar.then(new OnSizeChangedModifier(function1));
    }
}

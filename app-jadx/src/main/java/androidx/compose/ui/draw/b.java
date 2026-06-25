package androidx.compose.ui.draw;

import kotlin.jvm.functions.Function1;
import p0.C5911f;
import p0.InterfaceC5910e;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public static final InterfaceC5910e a(Function1 function1) {
        return new a(new C5911f(), function1);
    }

    public static final androidx.compose.ui.e b(androidx.compose.ui.e eVar, Function1 function1) {
        return eVar.then(new DrawBehindElement(function1));
    }

    public static final androidx.compose.ui.e c(androidx.compose.ui.e eVar, Function1 function1) {
        return eVar.then(new DrawWithCacheElement(function1));
    }

    public static final androidx.compose.ui.e d(androidx.compose.ui.e eVar, Function1 function1) {
        return eVar.then(new DrawWithContentElement(function1));
    }
}

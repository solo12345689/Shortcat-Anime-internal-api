package m0;

import Ud.a0;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class L {
    public static final K a(String str) {
        return new C5612j(a0.c(str));
    }

    public static final String[] b(K k10) {
        AbstractC5504s.f(k10, "null cannot be cast to non-null type androidx.compose.ui.autofill.AndroidContentType");
        return (String[]) ((C5612j) k10).a().toArray(new String[0]);
    }
}

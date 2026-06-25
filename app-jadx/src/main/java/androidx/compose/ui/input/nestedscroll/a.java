package androidx.compose.ui.input.nestedscroll;

import D0.b;
import androidx.compose.ui.e;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static final e a(e eVar, D0.a aVar, b bVar) {
        return eVar.then(new NestedScrollElement(aVar, bVar));
    }

    public static /* synthetic */ e b(e eVar, D0.a aVar, b bVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            bVar = null;
        }
        return a(eVar, aVar, bVar);
    }
}

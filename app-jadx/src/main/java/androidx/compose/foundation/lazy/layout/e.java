package androidx.compose.foundation.lazy.layout;

import i1.AbstractC5010c;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    /* JADX INFO: renamed from: a */
    private static final long f26292a = AbstractC5010c.b(0, 0, 0, 0, 5, null);

    public static final androidx.compose.ui.e b(androidx.compose.ui.e eVar, d dVar) {
        androidx.compose.ui.e eVarThen;
        return (dVar == null || (eVarThen = eVar.then(new TraversablePrefetchStateModifierElement(dVar))) == null) ? eVar : eVarThen;
    }
}

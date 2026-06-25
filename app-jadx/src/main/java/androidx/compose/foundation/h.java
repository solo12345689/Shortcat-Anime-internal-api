package androidx.compose.foundation;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class h {
    public static final androidx.compose.ui.e a(androidx.compose.ui.e eVar, B.m mVar, boolean z10) {
        return eVar.then(z10 ? new HoverableElement(mVar) : androidx.compose.ui.e.f26613a);
    }

    public static /* synthetic */ androidx.compose.ui.e b(androidx.compose.ui.e eVar, B.m mVar, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        return a(eVar, mVar, z10);
    }
}

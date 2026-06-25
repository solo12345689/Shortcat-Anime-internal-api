package Y0;

import Y0.AbstractC2468c;
import android.content.Context;
import android.graphics.Typeface;

/* JADX INFO: renamed from: Y0.k */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class C2476k implements AbstractC2468c.a {

    /* JADX INFO: renamed from: a */
    public static final C2476k f22670a = new C2476k();

    private C2476k() {
    }

    @Override // Y0.AbstractC2468c.a
    public Object a(Context context, AbstractC2468c abstractC2468c, Zd.e eVar) {
        throw new UnsupportedOperationException("All preloaded fonts are blocking.");
    }

    @Override // Y0.AbstractC2468c.a
    public Typeface b(Context context, AbstractC2468c abstractC2468c) {
        AbstractC2475j abstractC2475j = abstractC2468c instanceof AbstractC2475j ? (AbstractC2475j) abstractC2468c : null;
        if (abstractC2475j != null) {
            return abstractC2475j.g(context);
        }
        return null;
    }
}

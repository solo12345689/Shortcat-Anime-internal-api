package Y0;

import Y0.AbstractC2468c;
import android.content.Context;
import android.graphics.Typeface;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class S implements AbstractC2468c.a {

    /* JADX INFO: renamed from: a */
    public static final S f22639a = new S();

    private S() {
    }

    @Override // Y0.AbstractC2468c.a
    public Object a(Context context, AbstractC2468c abstractC2468c, Zd.e eVar) {
        throw new UnsupportedOperationException("All preloaded fonts are optional local.");
    }

    @Override // Y0.AbstractC2468c.a
    public Typeface b(Context context, AbstractC2468c abstractC2468c) {
        C2482q c2482q = abstractC2468c instanceof C2482q ? (C2482q) abstractC2468c : null;
        if (c2482q != null) {
            return c2482q.f(context);
        }
        return null;
    }
}

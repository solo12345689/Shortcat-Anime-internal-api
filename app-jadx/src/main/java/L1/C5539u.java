package l1;

import android.util.Log;
import i1.C5015h;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p1.AbstractC5915c;

/* JADX INFO: renamed from: l1.u */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C5539u {

    /* JADX INFO: renamed from: a */
    private C5015h f52515a;

    /* JADX INFO: renamed from: b */
    private String f52516b;

    /* JADX INFO: renamed from: c */
    private final String f52517c;

    public /* synthetic */ C5539u(C5015h c5015h, String str, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(c5015h, str, str2);
    }

    public final AbstractC5915c a() {
        C5015h c5015h = this.f52515a;
        if (c5015h != null) {
            return new p1.e(c5015h.t());
        }
        String str = this.f52516b;
        if (str != null) {
            return p1.i.u(str);
        }
        Log.e("CCL", "DimensionDescription: Null value & symbol for " + this.f52517c + ". Using WrapContent.");
        return p1.i.u("wrap");
    }

    public final boolean b() {
        return this.f52515a == null && this.f52516b == null;
    }

    private C5539u(C5015h c5015h, String str, String str2) {
        this.f52515a = c5015h;
        this.f52516b = str;
        this.f52517c = str2;
    }
}

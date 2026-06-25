package H4;

import H4.c;
import android.content.Context;
import android.util.DisplayMetrics;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class d implements i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f7911b;

    public d(Context context) {
        this.f7911b = context;
    }

    @Override // H4.i
    public Object c(Zd.e eVar) {
        DisplayMetrics displayMetrics = this.f7911b.getResources().getDisplayMetrics();
        c.a aVarA = a.a(Math.max(displayMetrics.widthPixels, displayMetrics.heightPixels));
        return new h(aVarA, aVarA);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && AbstractC5504s.c(this.f7911b, ((d) obj).f7911b);
    }

    public int hashCode() {
        return this.f7911b.hashCode();
    }
}

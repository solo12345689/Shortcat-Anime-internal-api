package d1;

import Y.h2;
import android.graphics.Typeface;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h2 f44976a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final v f44977b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f44978c;

    public v(h2 h2Var, v vVar) {
        this.f44976a = h2Var;
        this.f44977b = vVar;
        this.f44978c = h2Var.getValue();
    }

    public final Typeface a() {
        Object obj = this.f44978c;
        AbstractC5504s.f(obj, "null cannot be cast to non-null type android.graphics.Typeface");
        return (Typeface) obj;
    }

    public final boolean b() {
        if (this.f44976a.getValue() != this.f44978c) {
            return true;
        }
        v vVar = this.f44977b;
        return vVar != null && vVar.b();
    }
}

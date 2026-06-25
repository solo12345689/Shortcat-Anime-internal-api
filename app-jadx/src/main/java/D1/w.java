package d1;

import U0.AbstractC2207j;
import U0.C2197e;
import U0.b1;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WeakHashMap f44979a = new WeakHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final WeakHashMap f44980b = new WeakHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final WeakHashMap f44981c = new WeakHashMap();

    public final ClickableSpan a(C2197e.d dVar) {
        WeakHashMap weakHashMap = this.f44981c;
        Object nVar = weakHashMap.get(dVar);
        if (nVar == null) {
            nVar = new n((AbstractC2207j) dVar.g());
            weakHashMap.put(dVar, nVar);
        }
        return (ClickableSpan) nVar;
    }

    public final URLSpan b(C2197e.d dVar) {
        WeakHashMap weakHashMap = this.f44980b;
        Object uRLSpan = weakHashMap.get(dVar);
        if (uRLSpan == null) {
            uRLSpan = new URLSpan(((AbstractC2207j.b) dVar.g()).c());
            weakHashMap.put(dVar, uRLSpan);
        }
        return (URLSpan) uRLSpan;
    }

    public final URLSpan c(b1 b1Var) {
        WeakHashMap weakHashMap = this.f44979a;
        Object uRLSpan = weakHashMap.get(b1Var);
        if (uRLSpan == null) {
            uRLSpan = new URLSpan(b1Var.a());
            weakHashMap.put(b1Var, uRLSpan);
        }
        return (URLSpan) uRLSpan;
    }
}

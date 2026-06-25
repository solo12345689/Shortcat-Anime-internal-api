package Q8;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: Q8.v, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2073v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f14515a = Collections.synchronizedMap(new WeakHashMap());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f14516b = Collections.synchronizedMap(new WeakHashMap());

    private final void h(boolean z10, Status status) {
        HashMap map;
        HashMap map2;
        synchronized (this.f14515a) {
            map = new HashMap(this.f14515a);
        }
        synchronized (this.f14516b) {
            map2 = new HashMap(this.f14516b);
        }
        for (Map.Entry entry : map.entrySet()) {
            if (z10 || ((Boolean) entry.getValue()).booleanValue()) {
                ((BasePendingResult) entry.getKey()).forceFailureUnlessReady(status);
            }
        }
        for (Map.Entry entry2 : map2.entrySet()) {
            if (z10 || ((Boolean) entry2.getValue()).booleanValue()) {
                ((n9.j) entry2.getKey()).d(new P8.b(status));
            }
        }
    }

    final void c(BasePendingResult basePendingResult, boolean z10) {
        this.f14515a.put(basePendingResult, Boolean.valueOf(z10));
        basePendingResult.addStatusListener(new C2071t(this, basePendingResult));
    }

    final void d(n9.j jVar, boolean z10) {
        this.f14516b.put(jVar, Boolean.valueOf(z10));
        jVar.a().c(new C2072u(this, jVar));
    }

    final void e(int i10, String str) {
        StringBuilder sb2 = new StringBuilder("The connection to Google Play services was lost");
        if (i10 == 1) {
            sb2.append(" due to service disconnection.");
        } else if (i10 == 3) {
            sb2.append(" due to dead object exception.");
        }
        if (str != null) {
            sb2.append(" Last reason for disconnect: ");
            sb2.append(str);
        }
        h(true, new Status(20, sb2.toString()));
    }

    public final void f() {
        h(false, C2057e.f14464p);
    }

    final boolean g() {
        return (this.f14515a.isEmpty() && this.f14516b.isEmpty()) ? false : true;
    }
}

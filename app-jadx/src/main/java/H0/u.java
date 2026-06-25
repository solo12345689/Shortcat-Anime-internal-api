package h0;

import Ud.S;
import android.os.Bundle;
import androidx.lifecycle.C2865t;
import h0.p;
import ie.InterfaceC5082a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class u implements p, P3.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ p f47582a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final P3.h f47583b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C2865t f47584c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final P3.f f47585d;

    public u(p pVar) {
        this.f47582a = pVar;
        P3.h hVarB = P3.h.f13461c.b(this);
        this.f47583b = hVarB;
        this.f47584c = C2865t.f30249j.a(this);
        this.f47585d = hVarB.b();
        Object objE = e("androidx.savedstate.SavedStateRegistry");
        hVarB.d(objE instanceof Bundle ? (Bundle) objE : null);
        f("androidx.savedstate.SavedStateRegistry", new InterfaceC5082a() { // from class: h0.t
            @Override // ie.InterfaceC5082a
            public final Object invoke() {
                return u.c(this.f47581a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object c(u uVar) {
        Pair[] pairArr;
        Map mapI = S.i();
        if (mapI.isEmpty()) {
            pairArr = new Pair[0];
        } else {
            ArrayList arrayList = new ArrayList(mapI.size());
            for (Map.Entry entry : mapI.entrySet()) {
                arrayList.add(Td.z.a((String) entry.getKey(), entry.getValue()));
            }
            pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
        }
        Bundle bundleA = G1.c.a((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
        P3.j.a(bundleA);
        uVar.f47583b.e(bundleA);
        if (P3.c.f(P3.c.a(bundleA))) {
            return null;
        }
        return bundleA;
    }

    @Override // h0.p
    public boolean a(Object obj) {
        return this.f47582a.a(obj);
    }

    @Override // h0.p
    public Map d() {
        return this.f47582a.d();
    }

    @Override // h0.p
    public Object e(String str) {
        return this.f47582a.e(str);
    }

    @Override // h0.p
    public p.a f(String str, InterfaceC5082a interfaceC5082a) {
        return this.f47582a.f(str, interfaceC5082a);
    }

    @Override // androidx.lifecycle.r
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public C2865t getLifecycle() {
        return this.f47584c;
    }

    @Override // P3.i
    public P3.f getSavedStateRegistry() {
        return this.f47585d;
    }
}

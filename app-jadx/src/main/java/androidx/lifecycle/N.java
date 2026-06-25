package androidx.lifecycle;

import P3.f;
import Td.AbstractC2163n;
import android.os.Bundle;
import ie.InterfaceC5082a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Pair;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class N implements f.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final P3.f f30176a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f30177b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Bundle f30178c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Lazy f30179d;

    public N(P3.f savedStateRegistry, final Y viewModelStoreOwner) {
        AbstractC5504s.h(savedStateRegistry, "savedStateRegistry");
        AbstractC5504s.h(viewModelStoreOwner, "viewModelStoreOwner");
        this.f30176a = savedStateRegistry;
        this.f30179d = AbstractC2163n.b(new InterfaceC5082a() { // from class: androidx.lifecycle.M
            @Override // ie.InterfaceC5082a
            public final Object invoke() {
                return N.f(viewModelStoreOwner);
            }
        });
    }

    private final O d() {
        return (O) this.f30179d.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final O f(Y y10) {
        return L.e(y10);
    }

    @Override // P3.f.b
    public Bundle a() {
        Pair[] pairArr;
        Map mapI = Ud.S.i();
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
        Bundle bundleA2 = P3.j.a(bundleA);
        Bundle bundle = this.f30178c;
        if (bundle != null) {
            P3.j.b(bundleA2, bundle);
        }
        for (Map.Entry entry2 : d().a().entrySet()) {
            String str = (String) entry2.getKey();
            Bundle bundleA3 = ((I) entry2.getValue()).a().a();
            if (!P3.c.f(P3.c.a(bundleA3))) {
                P3.j.c(bundleA2, str, bundleA3);
            }
        }
        this.f30177b = false;
        return bundleA;
    }

    public final Bundle c(String key) {
        Pair[] pairArr;
        AbstractC5504s.h(key, "key");
        e();
        Bundle bundle = this.f30178c;
        if (bundle == null || !P3.c.b(P3.c.a(bundle), key)) {
            return null;
        }
        Bundle bundleD = P3.c.d(P3.c.a(bundle), key);
        if (bundleD == null) {
            Map mapI = Ud.S.i();
            if (mapI.isEmpty()) {
                pairArr = new Pair[0];
            } else {
                ArrayList arrayList = new ArrayList(mapI.size());
                for (Map.Entry entry : mapI.entrySet()) {
                    arrayList.add(Td.z.a((String) entry.getKey(), entry.getValue()));
                }
                pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
            }
            bundleD = G1.c.a((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
            P3.j.a(bundleD);
        }
        P3.j.e(P3.j.a(bundle), key);
        if (P3.c.f(P3.c.a(bundle))) {
            this.f30178c = null;
        }
        return bundleD;
    }

    public final void e() {
        Pair[] pairArr;
        if (this.f30177b) {
            return;
        }
        Bundle bundleA = this.f30176a.a("androidx.lifecycle.internal.SavedStateHandlesProvider");
        Map mapI = Ud.S.i();
        if (mapI.isEmpty()) {
            pairArr = new Pair[0];
        } else {
            ArrayList arrayList = new ArrayList(mapI.size());
            for (Map.Entry entry : mapI.entrySet()) {
                arrayList.add(Td.z.a((String) entry.getKey(), entry.getValue()));
            }
            pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
        }
        Bundle bundleA2 = G1.c.a((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
        Bundle bundleA3 = P3.j.a(bundleA2);
        Bundle bundle = this.f30178c;
        if (bundle != null) {
            P3.j.b(bundleA3, bundle);
        }
        if (bundleA != null) {
            P3.j.b(bundleA3, bundleA);
        }
        this.f30178c = bundleA2;
        this.f30177b = true;
        d();
    }
}

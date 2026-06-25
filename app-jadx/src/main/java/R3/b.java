package R3;

import P3.f;
import P3.i;
import P3.j;
import Td.L;
import Td.z;
import Ud.S;
import android.os.Bundle;
import androidx.lifecycle.AbstractC2857k;
import androidx.lifecycle.InterfaceC2861o;
import androidx.lifecycle.r;
import ie.InterfaceC5082a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: i */
    private static final a f15145i = new a(null);

    /* JADX INFO: renamed from: a */
    private final i f15146a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC5082a f15147b;

    /* JADX INFO: renamed from: c */
    private final c f15148c;

    /* JADX INFO: renamed from: d */
    private final Map f15149d;

    /* JADX INFO: renamed from: e */
    private boolean f15150e;

    /* JADX INFO: renamed from: f */
    private Bundle f15151f;

    /* JADX INFO: renamed from: g */
    private boolean f15152g;

    /* JADX INFO: renamed from: h */
    private boolean f15153h;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public b(i owner, InterfaceC5082a onAttach) {
        AbstractC5504s.h(owner, "owner");
        AbstractC5504s.h(onAttach, "onAttach");
        this.f15146a = owner;
        this.f15147b = onAttach;
        this.f15148c = new c();
        this.f15149d = new LinkedHashMap();
        this.f15153h = true;
    }

    public static final void g(b bVar, r rVar, AbstractC2857k.a event) {
        AbstractC5504s.h(rVar, "<unused var>");
        AbstractC5504s.h(event, "event");
        if (event == AbstractC2857k.a.ON_START) {
            bVar.f15153h = true;
        } else if (event == AbstractC2857k.a.ON_STOP) {
            bVar.f15153h = false;
        }
    }

    public final Bundle c(String key) {
        AbstractC5504s.h(key, "key");
        if (!this.f15152g) {
            throw new IllegalStateException("You can 'consumeRestoredStateForKey' only after the corresponding component has moved to the 'CREATED' state");
        }
        Bundle bundle = this.f15151f;
        if (bundle == null) {
            return null;
        }
        Bundle bundleA = P3.c.a(bundle);
        Bundle bundleC = P3.c.b(bundleA, key) ? P3.c.c(bundleA, key) : null;
        j.e(j.a(bundle), key);
        if (P3.c.f(P3.c.a(bundle))) {
            this.f15151f = null;
        }
        return bundleC;
    }

    public final f.b d(String key) {
        f.b bVar;
        AbstractC5504s.h(key, "key");
        synchronized (this.f15148c) {
            Iterator it = this.f15149d.entrySet().iterator();
            do {
                bVar = null;
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                String str = (String) entry.getKey();
                f.b bVar2 = (f.b) entry.getValue();
                if (AbstractC5504s.c(str, key)) {
                    bVar = bVar2;
                }
            } while (bVar == null);
        }
        return bVar;
    }

    public final boolean e() {
        return this.f15153h;
    }

    public final void f() {
        if (this.f15146a.getLifecycle().getCurrentState() != AbstractC2857k.b.f30236b) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
        }
        if (this.f15150e) {
            throw new IllegalStateException("SavedStateRegistry was already attached.");
        }
        this.f15147b.invoke();
        this.f15146a.getLifecycle().addObserver(new InterfaceC2861o() { // from class: R3.a
            @Override // androidx.lifecycle.InterfaceC2861o
            public final void g(r rVar, AbstractC2857k.a aVar) {
                b.g(this.f15144a, rVar, aVar);
            }
        });
        this.f15150e = true;
    }

    public final void h(Bundle bundle) {
        if (!this.f15150e) {
            f();
        }
        if (this.f15146a.getLifecycle().getCurrentState().b(AbstractC2857k.b.f30238d)) {
            throw new IllegalStateException(("performRestore cannot be called when owner is " + this.f15146a.getLifecycle().getCurrentState()).toString());
        }
        if (this.f15152g) {
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        Bundle bundleC = null;
        if (bundle != null) {
            Bundle bundleA = P3.c.a(bundle);
            if (P3.c.b(bundleA, "androidx.lifecycle.BundlableSavedStateRegistry.key")) {
                bundleC = P3.c.c(bundleA, "androidx.lifecycle.BundlableSavedStateRegistry.key");
            }
        }
        this.f15151f = bundleC;
        this.f15152g = true;
    }

    public final void i(Bundle outBundle) {
        Pair[] pairArr;
        AbstractC5504s.h(outBundle, "outBundle");
        Map mapI = S.i();
        if (mapI.isEmpty()) {
            pairArr = new Pair[0];
        } else {
            ArrayList arrayList = new ArrayList(mapI.size());
            for (Map.Entry entry : mapI.entrySet()) {
                arrayList.add(z.a((String) entry.getKey(), entry.getValue()));
            }
            pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
        }
        Bundle bundleA = G1.c.a((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
        Bundle bundleA2 = j.a(bundleA);
        Bundle bundle = this.f15151f;
        if (bundle != null) {
            j.b(bundleA2, bundle);
        }
        synchronized (this.f15148c) {
            try {
                for (Map.Entry entry2 : this.f15149d.entrySet()) {
                    j.c(bundleA2, (String) entry2.getKey(), ((f.b) entry2.getValue()).a());
                }
                L l10 = L.f17438a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (P3.c.f(P3.c.a(bundleA))) {
            return;
        }
        j.c(j.a(outBundle), "androidx.lifecycle.BundlableSavedStateRegistry.key", bundleA);
    }

    public final void j(String key, f.b provider) {
        AbstractC5504s.h(key, "key");
        AbstractC5504s.h(provider, "provider");
        synchronized (this.f15148c) {
            if (this.f15149d.containsKey(key)) {
                throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
            }
            this.f15149d.put(key, provider);
            L l10 = L.f17438a;
        }
    }

    public final void k(String key) {
        AbstractC5504s.h(key, "key");
        synchronized (this.f15148c) {
        }
    }
}

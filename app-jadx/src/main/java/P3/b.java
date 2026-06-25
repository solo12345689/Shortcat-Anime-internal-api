package P3;

import P3.f;
import Td.z;
import Ud.AbstractC2279u;
import Ud.S;
import android.os.Bundle;
import androidx.lifecycle.AbstractC2857k;
import androidx.lifecycle.InterfaceC2861o;
import androidx.lifecycle.r;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class b implements InterfaceC2861o {

    /* JADX INFO: renamed from: b */
    public static final a f13455b = new a(null);

    /* JADX INFO: renamed from: a */
    private final i f13456a;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: P3.b$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C0214b implements f.b {

        /* JADX INFO: renamed from: a */
        private final Set f13457a;

        public C0214b(f registry) {
            AbstractC5504s.h(registry, "registry");
            this.f13457a = new LinkedHashSet();
            registry.c("androidx.savedstate.Restarter", this);
        }

        @Override // P3.f.b
        public Bundle a() {
            Pair[] pairArr;
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
            j.d(j.a(bundleA), "classes_to_restore", AbstractC2279u.b1(this.f13457a));
            return bundleA;
        }

        public final void b(String className) {
            AbstractC5504s.h(className, "className");
            this.f13457a.add(className);
        }
    }

    public b(i owner) {
        AbstractC5504s.h(owner, "owner");
        this.f13456a = owner;
    }

    private final void a(String str) {
        try {
            Class<? extends U> clsAsSubclass = Class.forName(str, false, b.class.getClassLoader()).asSubclass(f.a.class);
            AbstractC5504s.e(clsAsSubclass);
            try {
                Constructor declaredConstructor = clsAsSubclass.getDeclaredConstructor(null);
                declaredConstructor.setAccessible(true);
                try {
                    Object objNewInstance = declaredConstructor.newInstance(null);
                    AbstractC5504s.e(objNewInstance);
                    ((f.a) objNewInstance).a(this.f13456a);
                } catch (Exception e10) {
                    throw new RuntimeException("Failed to instantiate " + str, e10);
                }
            } catch (NoSuchMethodException e11) {
                throw new IllegalStateException("Class " + clsAsSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e11);
            }
        } catch (ClassNotFoundException e12) {
            throw new RuntimeException("Class " + str + " wasn't found", e12);
        }
    }

    @Override // androidx.lifecycle.InterfaceC2861o
    public void g(r source, AbstractC2857k.a event) {
        AbstractC5504s.h(source, "source");
        AbstractC5504s.h(event, "event");
        if (event != AbstractC2857k.a.ON_CREATE) {
            throw new AssertionError("Next event must be ON_CREATE");
        }
        source.getLifecycle().removeObserver(this);
        Bundle bundleA = this.f13456a.getSavedStateRegistry().a("androidx.savedstate.Restarter");
        if (bundleA == null) {
            return;
        }
        List listE = c.e(c.a(bundleA), "classes_to_restore");
        if (listE == null) {
            throw new IllegalStateException("SavedState with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
        }
        Iterator it = listE.iterator();
        while (it.hasNext()) {
            a((String) it.next());
        }
    }
}

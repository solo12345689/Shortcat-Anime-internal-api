package ua;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile d f61462b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set f61463a = new HashSet();

    d() {
    }

    public static d a() {
        d dVar;
        d dVar2 = f61462b;
        if (dVar2 != null) {
            return dVar2;
        }
        synchronized (d.class) {
            try {
                dVar = f61462b;
                if (dVar == null) {
                    dVar = new d();
                    f61462b = dVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return dVar;
    }

    Set b() {
        Set setUnmodifiableSet;
        synchronized (this.f61463a) {
            setUnmodifiableSet = Collections.unmodifiableSet(this.f61463a);
        }
        return setUnmodifiableSet;
    }
}

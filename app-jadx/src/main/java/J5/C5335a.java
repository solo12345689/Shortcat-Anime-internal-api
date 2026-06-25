package j5;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: j5.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class C5335a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f51642a = new ArrayList();

    /* JADX INFO: renamed from: j5.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class C0813a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Class f51643a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final S4.d f51644b;

        C0813a(Class cls, S4.d dVar) {
            this.f51643a = cls;
            this.f51644b = dVar;
        }

        boolean a(Class cls) {
            return this.f51643a.isAssignableFrom(cls);
        }
    }

    public synchronized void a(Class cls, S4.d dVar) {
        this.f51642a.add(new C0813a(cls, dVar));
    }

    public synchronized S4.d b(Class cls) {
        for (C0813a c0813a : this.f51642a) {
            if (c0813a.a(cls)) {
                return c0813a.f51644b;
            }
        }
        return null;
    }
}

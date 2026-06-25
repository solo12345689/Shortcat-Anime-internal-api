package g5;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: g5.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class C4855f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f47350a = new ArrayList();

    /* JADX INFO: renamed from: g5.f$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Class f47351a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Class f47352b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final InterfaceC4854e f47353c;

        a(Class cls, Class cls2, InterfaceC4854e interfaceC4854e) {
            this.f47351a = cls;
            this.f47352b = cls2;
            this.f47353c = interfaceC4854e;
        }

        public boolean a(Class cls, Class cls2) {
            return this.f47351a.isAssignableFrom(cls) && cls2.isAssignableFrom(this.f47352b);
        }
    }

    public synchronized InterfaceC4854e a(Class cls, Class cls2) {
        if (cls2.isAssignableFrom(cls)) {
            return g.b();
        }
        for (a aVar : this.f47350a) {
            if (aVar.a(cls, cls2)) {
                return aVar.f47353c;
            }
        }
        throw new IllegalArgumentException("No transcoder registered to transcode from " + cls + " to " + cls2);
    }

    public synchronized List b(Class cls, Class cls2) {
        ArrayList arrayList = new ArrayList();
        if (cls2.isAssignableFrom(cls)) {
            arrayList.add(cls2);
            return arrayList;
        }
        for (a aVar : this.f47350a) {
            if (aVar.a(cls, cls2) && !arrayList.contains(aVar.f47352b)) {
                arrayList.add(aVar.f47352b);
            }
        }
        return arrayList;
    }

    public synchronized void c(Class cls, Class cls2, InterfaceC4854e interfaceC4854e) {
        this.f47350a.add(new a(cls, cls2, interfaceC4854e));
    }
}

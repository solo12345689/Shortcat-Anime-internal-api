package w;

import Ud.AbstractC2279u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import oe.AbstractC5874j;
import oe.C5870f;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class w0 {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a implements InterfaceC6914s {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List f62728a;

        a(AbstractC6913q abstractC6913q, float f10, float f11) {
            C5870f c5870fX = AbstractC5874j.x(0, abstractC6913q.b());
            ArrayList arrayList = new ArrayList(AbstractC2279u.x(c5870fX, 10));
            Iterator it = c5870fX.iterator();
            while (it.hasNext()) {
                arrayList.add(new C6881J(f10, f11, abstractC6913q.a(((Ud.O) it).nextInt())));
            }
            this.f62728a = arrayList;
        }

        @Override // w.InterfaceC6914s
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C6881J get(int i10) {
            return (C6881J) this.f62728a.get(i10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b implements InterfaceC6914s {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final C6881J f62729a;

        b(float f10, float f11) {
            this.f62729a = new C6881J(f10, f11, 0.0f, 4, null);
        }

        @Override // w.InterfaceC6914s
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C6881J get(int i10) {
            return this.f62729a;
        }
    }

    public static final long b(y0 y0Var, long j10) {
        return AbstractC5874j.o(j10 - ((long) y0Var.f()), 0L, y0Var.c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC6914s c(AbstractC6913q abstractC6913q, float f10, float f11) {
        return abstractC6913q != null ? new a(abstractC6913q, f10, f11) : new b(f10, f11);
    }

    public static final AbstractC6913q d(v0 v0Var, long j10, AbstractC6913q abstractC6913q, AbstractC6913q abstractC6913q2, AbstractC6913q abstractC6913q3) {
        return v0Var.d(j10 * 1000000, abstractC6913q, abstractC6913q2, abstractC6913q3);
    }
}

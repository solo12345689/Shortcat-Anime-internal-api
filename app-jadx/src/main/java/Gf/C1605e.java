package Gf;

import ae.AbstractC2605b;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: Gf.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
final class C1605e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f7561b = AtomicIntegerFieldUpdater.newUpdater(C1605e.class, "notCompletedCount$volatile");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final W[] f7562a;
    private volatile /* synthetic */ int notCompletedCount$volatile;

    /* JADX INFO: renamed from: Gf.e$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private final class a extends H0 {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final /* synthetic */ AtomicReferenceFieldUpdater f7563h = AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "_disposer$volatile");
        private volatile /* synthetic */ Object _disposer$volatile;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final InterfaceC1623n f7564e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public InterfaceC1612h0 f7565f;

        public a(InterfaceC1623n interfaceC1623n) {
            this.f7564e = interfaceC1623n;
        }

        public final void B(b bVar) {
            f7563h.set(this, bVar);
        }

        public final void C(InterfaceC1612h0 interfaceC1612h0) {
            this.f7565f = interfaceC1612h0;
        }

        @Override // Gf.H0
        public boolean v() {
            return false;
        }

        @Override // Gf.H0
        public void w(Throwable th2) {
            if (th2 != null) {
                Object objB = this.f7564e.B(th2);
                if (objB != null) {
                    this.f7564e.U(objB);
                    b bVarY = y();
                    if (bVarY != null) {
                        bVarY.b();
                        return;
                    }
                    return;
                }
                return;
            }
            if (C1605e.d().decrementAndGet(C1605e.this) == 0) {
                InterfaceC1623n interfaceC1623n = this.f7564e;
                W[] wArr = C1605e.this.f7562a;
                ArrayList arrayList = new ArrayList(wArr.length);
                for (W w10 : wArr) {
                    arrayList.add(w10.q());
                }
                interfaceC1623n.resumeWith(Td.u.b(arrayList));
            }
        }

        public final b y() {
            return (b) f7563h.get(this);
        }

        public final InterfaceC1612h0 z() {
            InterfaceC1612h0 interfaceC1612h0 = this.f7565f;
            if (interfaceC1612h0 != null) {
                return interfaceC1612h0;
            }
            AbstractC5504s.u("handle");
            return null;
        }
    }

    /* JADX INFO: renamed from: Gf.e$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private final class b implements InterfaceC1621m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final a[] f7567a;

        public b(a[] aVarArr) {
            this.f7567a = aVarArr;
        }

        @Override // Gf.InterfaceC1621m
        public void a(Throwable th2) {
            b();
        }

        public final void b() {
            for (a aVar : this.f7567a) {
                aVar.z().dispose();
            }
        }

        public String toString() {
            return "DisposeHandlersOnCancel[" + this.f7567a + ']';
        }
    }

    public C1605e(W[] wArr) {
        this.f7562a = wArr;
        this.notCompletedCount$volatile = wArr.length;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ AtomicIntegerFieldUpdater d() {
        return f7561b;
    }

    public final Object c(Zd.e eVar) {
        C1627p c1627p = new C1627p(AbstractC2605b.c(eVar), 1);
        c1627p.C();
        int length = this.f7562a.length;
        a[] aVarArr = new a[length];
        for (int i10 = 0; i10 < length; i10++) {
            W w10 = this.f7562a[i10];
            w10.start();
            a aVar = new a(c1627p);
            aVar.C(G0.m(w10, false, aVar, 1, null));
            Td.L l10 = Td.L.f17438a;
            aVarArr[i10] = aVar;
        }
        b bVar = new b(aVarArr);
        for (int i11 = 0; i11 < length; i11++) {
            aVarArr[i11].B(bVar);
        }
        if (c1627p.j()) {
            bVar.b();
        } else {
            r.c(c1627p, bVar);
        }
        Object objV = c1627p.v();
        if (objV == AbstractC2605b.f()) {
            kotlin.coroutines.jvm.internal.h.c(eVar);
        }
        return objV;
    }
}

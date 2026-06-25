package c6;

import E6.f;
import E6.o;
import android.util.SparseArray;
import b6.InterfaceC3025b;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import t6.C6647c;
import z5.AbstractC7283a;

/* JADX INFO: renamed from: c6.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3079b implements InterfaceC3025b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f33518e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Class f33519f = C3079b.class;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C6647c f33520a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f33521b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final SparseArray f33522c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private C5.a f33523d;

    /* JADX INFO: renamed from: c6.b$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final C5.a c(C5.a aVar) {
            f fVarU1 = f.U1(aVar, o.f5692d, 0);
            AbstractC5504s.g(fVarU1, "of(...)");
            return C5.a.J(fVarU1);
        }

        public final C5.a b(C5.a aVar) {
            try {
                if (C5.a.H(aVar)) {
                    AbstractC5504s.e(aVar);
                    if (aVar.C() instanceof f) {
                        Object objC = aVar.C();
                        AbstractC5504s.f(objC, "null cannot be cast to non-null type com.facebook.imagepipeline.image.CloseableStaticBitmap");
                        return ((f) objC).X();
                    }
                }
                C5.a.m(aVar);
                return null;
            } finally {
                C5.a.m(aVar);
            }
        }

        private a() {
        }
    }

    public C3079b(C6647c animatedFrameCache, boolean z10) {
        AbstractC5504s.h(animatedFrameCache, "animatedFrameCache");
        this.f33520a = animatedFrameCache;
        this.f33521b = z10;
        this.f33522c = new SparseArray();
    }

    private final synchronized void a(int i10) {
        C5.a aVar = (C5.a) this.f33522c.get(i10);
        if (aVar != null) {
            this.f33522c.delete(i10);
            C5.a.m(aVar);
            AbstractC7283a.z(f33519f, "removePreparedReference(%d) removed. Pending frames: %s", Integer.valueOf(i10), this.f33522c);
        }
    }

    @Override // b6.InterfaceC3025b
    public synchronized boolean H(int i10) {
        return this.f33520a.b(i10);
    }

    @Override // b6.InterfaceC3025b
    public synchronized void I(int i10, C5.a bitmapReference, int i11) {
        AbstractC5504s.h(bitmapReference, "bitmapReference");
        try {
            C5.a aVarC = f33518e.c(bitmapReference);
            if (aVarC == null) {
                C5.a.m(aVarC);
                return;
            }
            C5.a aVarA = this.f33520a.a(i10, aVarC);
            if (C5.a.H(aVarA)) {
                C5.a.m((C5.a) this.f33522c.get(i10));
                this.f33522c.put(i10, aVarA);
                AbstractC7283a.z(f33519f, "cachePreparedFrame(%d) cached. Pending frames: %s", Integer.valueOf(i10), this.f33522c);
            }
            C5.a.m(aVarC);
        } catch (Throwable th2) {
            C5.a.m(null);
            throw th2;
        }
    }

    @Override // b6.InterfaceC3025b
    public synchronized C5.a J(int i10) {
        return f33518e.b(C5.a.j(this.f33523d));
    }

    @Override // b6.InterfaceC3025b
    public synchronized C5.a K(int i10, int i11, int i12) {
        if (!this.f33521b) {
            return null;
        }
        return f33518e.b(this.f33520a.d());
    }

    @Override // b6.InterfaceC3025b
    public synchronized void L(int i10, C5.a bitmapReference, int i11) {
        AbstractC5504s.h(bitmapReference, "bitmapReference");
        a(i10);
        C5.a aVarC = null;
        try {
            aVarC = f33518e.c(bitmapReference);
            if (aVarC != null) {
                C5.a.m(this.f33523d);
                this.f33523d = this.f33520a.a(i10, aVarC);
            }
        } finally {
            C5.a.m(aVarC);
        }
    }

    @Override // b6.InterfaceC3025b
    public synchronized C5.a M(int i10) {
        return f33518e.b(this.f33520a.c(i10));
    }

    @Override // b6.InterfaceC3025b
    public synchronized void clear() {
        try {
            C5.a.m(this.f33523d);
            this.f33523d = null;
            int size = this.f33522c.size();
            for (int i10 = 0; i10 < size; i10++) {
                C5.a.m((C5.a) this.f33522c.valueAt(i10));
            }
            this.f33522c.clear();
        } catch (Throwable th2) {
            throw th2;
        }
    }
}

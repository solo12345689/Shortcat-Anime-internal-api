package Jf;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
final class J extends Kf.b implements u, InterfaceC1742e, Kf.m {

    /* JADX INFO: renamed from: f */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f9545f = AtomicReferenceFieldUpdater.newUpdater(J.class, Object.class, "_state$volatile");
    private volatile /* synthetic */ Object _state$volatile;

    /* JADX INFO: renamed from: e */
    private int f9546e;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a */
        Object f9547a;

        /* JADX INFO: renamed from: b */
        Object f9548b;

        /* JADX INFO: renamed from: c */
        Object f9549c;

        /* JADX INFO: renamed from: d */
        Object f9550d;

        /* JADX INFO: renamed from: e */
        Object f9551e;

        /* JADX INFO: renamed from: f */
        /* synthetic */ Object f9552f;

        /* JADX INFO: renamed from: h */
        int f9554h;

        a(Zd.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f9552f = obj;
            this.f9554h |= Integer.MIN_VALUE;
            return J.this.collect(null, this);
        }
    }

    public J(Object obj) {
        this._state$volatile = obj;
    }

    private final boolean q(Object obj, Object obj2) {
        int i10;
        Kf.d[] dVarArrM;
        synchronized (this) {
            Object obj3 = f9545f.get(this);
            if (obj != null && !AbstractC5504s.c(obj3, obj)) {
                return false;
            }
            if (AbstractC5504s.c(obj3, obj2)) {
                return true;
            }
            f9545f.set(this, obj2);
            int i11 = this.f9546e;
            if ((i11 & 1) != 0) {
                this.f9546e = i11 + 2;
                return true;
            }
            int i12 = i11 + 1;
            this.f9546e = i12;
            Kf.d[] dVarArrM2 = m();
            Td.L l10 = Td.L.f17438a;
            while (true) {
                L[] lArr = (L[]) dVarArrM2;
                if (lArr != null) {
                    for (L l11 : lArr) {
                        if (l11 != null) {
                            l11.g();
                        }
                    }
                }
                synchronized (this) {
                    i10 = this.f9546e;
                    if (i10 == i12) {
                        this.f9546e = i12 + 1;
                        return true;
                    }
                    dVarArrM = m();
                    Td.L l12 = Td.L.f17438a;
                }
                dVarArrM2 = dVarArrM;
                i12 = i10;
            }
        }
    }

    @Override // Kf.m
    public InterfaceC1742e a(Zd.i iVar, int i10, If.a aVar) {
        return K.d(this, iVar, i10, aVar);
    }

    @Override // Jf.t
    public boolean c(Object obj) {
        setValue(obj);
        return true;
    }

    /* JADX WARN: Path cross not found for [B:81:0x008f, B:97:0x00c5], limit reached: 48 */
    /* JADX WARN: Path cross not found for [B:85:0x009e, B:87:0x00a4], limit reached: 48 */
    /* JADX WARN: Path cross not found for [B:87:0x00a4, B:85:0x009e], limit reached: 48 */
    /* JADX WARN: Path cross not found for [B:87:0x00a4, B:95:0x00bf], limit reached: 48 */
    /* JADX WARN: Path cross not found for [B:97:0x00c5, B:81:0x008f], limit reached: 48 */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0099 A[Catch: all -> 0x0042, TryCatch #0 {all -> 0x0042, blocks: (B:67:0x003e, B:81:0x008f, B:83:0x0099, B:85:0x009e, B:95:0x00bf, B:97:0x00c5, B:87:0x00a4, B:91:0x00ab, B:74:0x005f, B:77:0x0071, B:80:0x0080), top: B:102:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x009e A[Catch: all -> 0x0042, TryCatch #0 {all -> 0x0042, blocks: (B:67:0x003e, B:81:0x008f, B:83:0x0099, B:85:0x009e, B:95:0x00bf, B:97:0x00c5, B:87:0x00a4, B:91:0x00ab, B:74:0x005f, B:77:0x0071, B:80:0x0080), top: B:102:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x00c5 A[Catch: all -> 0x0042, TRY_LEAVE, TryCatch #0 {all -> 0x0042, blocks: (B:67:0x003e, B:81:0x008f, B:83:0x0099, B:85:0x009e, B:95:0x00bf, B:97:0x00c5, B:87:0x00a4, B:91:0x00ab, B:74:0x005f, B:77:0x0071, B:80:0x0080), top: B:102:0x0023 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:96:0x00c3 -> B:81:0x008f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:98:0x00d5 -> B:81:0x008f). Please report as a decompilation issue!!! */
    @Override // Jf.y, Jf.InterfaceC1742e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object collect(Jf.InterfaceC1743f r11, Zd.e r12) {
        /*
            Method dump skipped, instruction units count: 220
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Jf.J.collect(Jf.f, Zd.e):java.lang.Object");
    }

    @Override // Jf.t, Jf.InterfaceC1743f
    public Object emit(Object obj, Zd.e eVar) {
        setValue(obj);
        return Td.L.f17438a;
    }

    @Override // Jf.u
    public boolean f(Object obj, Object obj2) {
        if (obj == null) {
            obj = Kf.p.f11122a;
        }
        if (obj2 == null) {
            obj2 = Kf.p.f11122a;
        }
        return q(obj, obj2);
    }

    @Override // Jf.u, Jf.I
    public Object getValue() {
        Lf.E e10 = Kf.p.f11122a;
        Object obj = f9545f.get(this);
        if (obj == e10) {
            return null;
        }
        return obj;
    }

    @Override // Jf.t
    public void h() {
        throw new UnsupportedOperationException("MutableStateFlow.resetReplayCache is not supported");
    }

    @Override // Kf.b
    /* JADX INFO: renamed from: n */
    public L i() {
        return new L();
    }

    @Override // Kf.b
    /* JADX INFO: renamed from: o */
    public L[] j(int i10) {
        return new L[i10];
    }

    @Override // Jf.u
    public void setValue(Object obj) {
        if (obj == null) {
            obj = Kf.p.f11122a;
        }
        q(null, obj);
    }
}

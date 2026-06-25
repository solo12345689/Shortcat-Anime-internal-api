package Z;

import Ud.AbstractC2273n;
import Y.H1;
import Y.InterfaceC2398d;
import Y.InterfaceC2450u1;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import oe.AbstractC5874j;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f23092b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f23094d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f23096f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f23097g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public d[] f23091a = new d[16];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int[] f23093c = new int[16];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object[] f23095e = new Object[16];

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public final class a implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f23098a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f23099b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f23100c;

        public a() {
        }

        @Override // Z.e
        public Object a(int i10) {
            return i.this.f23095e[this.f23100c + i10];
        }

        public final d b() {
            return i.this.f23091a[this.f23098a];
        }

        public final boolean c() {
            if (this.f23098a >= i.this.f23092b) {
                return false;
            }
            d dVarB = b();
            this.f23099b += dVarB.d();
            this.f23100c += dVarB.f();
            int i10 = this.f23098a + 1;
            this.f23098a = i10;
            return i10 < i.this.f23092b;
        }

        @Override // Z.e
        public int getInt(int i10) {
            return i.this.f23093c[this.f23099b + i10];
        }
    }

    private final int b(int i10, int i11) {
        return AbstractC5874j.e(i10 + AbstractC5874j.i(i10, IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET), i11);
    }

    private final void k(int i10, int i11) {
        int[] iArr = new int[b(i10, i11)];
        AbstractC2273n.k(this.f23093c, iArr, 0, 0, i10);
        this.f23093c = iArr;
    }

    private final void l(int i10, int i11) {
        Object[] objArr = new Object[b(i10, i11)];
        System.arraycopy(this.f23095e, 0, objArr, 0, i10);
        this.f23095e = objArr;
    }

    private final void m() {
        int i10 = AbstractC5874j.i(this.f23092b, IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET);
        int i11 = this.f23092b;
        d[] dVarArr = new d[i10 + i11];
        System.arraycopy(this.f23091a, 0, dVarArr, 0, i11);
        this.f23091a = dVarArr;
    }

    public final void a() {
        this.f23092b = 0;
        this.f23094d = 0;
        AbstractC2273n.w(this.f23095e, null, 0, this.f23096f);
        this.f23096f = 0;
    }

    public final void c(d dVar) {
        int i10 = this.f23097g;
        int iD = dVar.d();
        if (i10 == ((iD == 0 ? 0 : -1) >>> (32 - iD))) {
            dVar.f();
        }
    }

    public final void d(InterfaceC2398d interfaceC2398d, H1 h12, InterfaceC2450u1 interfaceC2450u1, f fVar) {
        if (g()) {
            a aVar = new a();
            while (true) {
                InterfaceC2398d interfaceC2398d2 = interfaceC2398d;
                H1 h13 = h12;
                InterfaceC2450u1 interfaceC2450u12 = interfaceC2450u1;
                f fVar2 = fVar;
                aVar.b().b(aVar, interfaceC2398d2, h13, interfaceC2450u12, fVar2);
                if (!aVar.c()) {
                    break;
                }
                interfaceC2398d = interfaceC2398d2;
                h12 = h13;
                interfaceC2450u1 = interfaceC2450u12;
                fVar = fVar2;
            }
        }
        a();
    }

    public final int e() {
        return this.f23092b;
    }

    public final boolean f() {
        return e() == 0;
    }

    public final boolean g() {
        return e() != 0;
    }

    public final void h(i iVar) {
        d[] dVarArr = this.f23091a;
        int i10 = this.f23092b - 1;
        this.f23092b = i10;
        d dVar = dVarArr[i10];
        dVarArr[i10] = null;
        iVar.j(dVar);
        Object[] objArr = this.f23095e;
        Object[] objArr2 = iVar.f23095e;
        int iF = iVar.f23096f - dVar.f();
        int iF2 = this.f23096f - dVar.f();
        System.arraycopy(objArr, iF2, objArr2, iF, this.f23096f - iF2);
        AbstractC2273n.w(this.f23095e, null, this.f23096f - dVar.f(), this.f23096f);
        AbstractC2273n.k(this.f23093c, iVar.f23093c, iVar.f23094d - dVar.d(), this.f23094d - dVar.d(), this.f23094d);
        this.f23096f -= dVar.f();
        this.f23094d -= dVar.d();
    }

    public final void i(d dVar) {
        j(dVar);
    }

    public final void j(d dVar) {
        if (this.f23092b == this.f23091a.length) {
            m();
        }
        int iD = this.f23094d + dVar.d();
        int length = this.f23093c.length;
        if (iD > length) {
            k(length, iD);
        }
        int iF = this.f23096f + dVar.f();
        int length2 = this.f23095e.length;
        if (iF > length2) {
            l(length2, iF);
        }
        d[] dVarArr = this.f23091a;
        int i10 = this.f23092b;
        this.f23092b = i10 + 1;
        dVarArr[i10] = dVar;
        this.f23094d += dVar.d();
        this.f23096f += dVar.f();
    }

    public String toString() {
        return super.toString();
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b {
        public static final void b(i iVar, int i10, Object obj) {
            iVar.f23095e[(iVar.f23096f - iVar.f23091a[iVar.f23092b - 1].f()) + i10] = obj;
        }

        public static final void c(i iVar, int i10, Object obj, int i11, Object obj2) {
            int iF = iVar.f23096f - iVar.f23091a[iVar.f23092b - 1].f();
            Object[] objArr = iVar.f23095e;
            objArr[i10 + iF] = obj;
            objArr[iF + i11] = obj2;
        }

        public static final void d(i iVar, int i10, Object obj, int i11, Object obj2, int i12, Object obj3, int i13, Object obj4) {
            int iF = iVar.f23096f - iVar.f23091a[iVar.f23092b - 1].f();
            Object[] objArr = iVar.f23095e;
            objArr[i10 + iF] = obj;
            objArr[i11 + iF] = obj2;
            objArr[i12 + iF] = obj3;
            objArr[iF + i13] = obj4;
        }

        public static final void e(i iVar, int i10, Object obj, int i11, Object obj2, int i12, Object obj3) {
            int iF = iVar.f23096f - iVar.f23091a[iVar.f23092b - 1].f();
            Object[] objArr = iVar.f23095e;
            objArr[i10 + iF] = obj;
            objArr[i11 + iF] = obj2;
            objArr[iF + i12] = obj3;
        }

        public static i a(i iVar) {
            return iVar;
        }
    }
}

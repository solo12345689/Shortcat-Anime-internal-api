package W2;

import U2.InterfaceC2256q;
import U2.J;
import U2.K;
import U2.O;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.util.Arrays;
import t2.AbstractC6614a;
import t2.a0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f20675a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final O f20676b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f20677c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f20678d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f20679e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f20680f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f20681g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f20682h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f20683i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f20684j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f20685k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f20686l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long[] f20687m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int[] f20688n;

    public e(int i10, d dVar, O o10) {
        this.f20675a = dVar;
        int iB = dVar.b();
        boolean z10 = true;
        if (iB != 1 && iB != 2) {
            z10 = false;
        }
        AbstractC6614a.a(z10);
        this.f20677c = d(i10, iB == 2 ? 1667497984 : 1651965952);
        this.f20679e = dVar.a();
        this.f20676b = o10;
        this.f20678d = iB == 2 ? d(i10, 1650720768) : -1;
        this.f20686l = -1L;
        this.f20687m = new long[IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING];
        this.f20688n = new int[IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING];
        this.f20680f = dVar.f20672e;
    }

    private static int d(int i10, int i11) {
        return (((i10 % 10) + 48) << 8) | ((i10 / 10) + 48) | i11;
    }

    private long e(int i10) {
        return (this.f20679e * ((long) i10)) / ((long) this.f20680f);
    }

    private K h(int i10) {
        return new K(((long) this.f20688n[i10]) * g(), this.f20687m[i10]);
    }

    public void a() {
        this.f20683i++;
    }

    public void b(long j10, boolean z10) {
        if (this.f20686l == -1) {
            this.f20686l = j10;
        }
        if (z10) {
            if (this.f20685k == this.f20688n.length) {
                long[] jArr = this.f20687m;
                this.f20687m = Arrays.copyOf(jArr, (jArr.length * 3) / 2);
                int[] iArr = this.f20688n;
                this.f20688n = Arrays.copyOf(iArr, (iArr.length * 3) / 2);
            }
            long[] jArr2 = this.f20687m;
            int i10 = this.f20685k;
            jArr2[i10] = j10;
            this.f20688n[i10] = this.f20684j;
            this.f20685k = i10 + 1;
        }
        this.f20684j++;
    }

    public void c() {
        int i10;
        this.f20687m = Arrays.copyOf(this.f20687m, this.f20685k);
        this.f20688n = Arrays.copyOf(this.f20688n, this.f20685k);
        if (!k() || this.f20675a.f20674g == 0 || (i10 = this.f20685k) <= 0) {
            return;
        }
        this.f20680f = i10;
    }

    public long f() {
        return e(this.f20683i);
    }

    public long g() {
        return e(1);
    }

    public J.a i(long j10) {
        if (this.f20685k == 0) {
            return new J.a(new K(0L, this.f20686l));
        }
        int iG = (int) (j10 / g());
        int iJ = a0.j(this.f20688n, iG, true, true);
        if (this.f20688n[iJ] == iG) {
            return new J.a(h(iJ));
        }
        K kH = h(iJ);
        int i10 = iJ + 1;
        return i10 < this.f20687m.length ? new J.a(kH, h(i10)) : new J.a(kH);
    }

    public boolean j(int i10) {
        return this.f20677c == i10 || this.f20678d == i10;
    }

    public boolean k() {
        return (this.f20677c & 1651965952) == 1651965952;
    }

    public boolean l() {
        return Arrays.binarySearch(this.f20688n, this.f20683i) >= 0;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public boolean m(InterfaceC2256q interfaceC2256q) {
        int i10 = this.f20682h;
        int iE = i10 - this.f20676b.e(interfaceC2256q, i10, false);
        this.f20682h = iE;
        boolean z10 = iE == 0;
        if (z10) {
            if (this.f20681g > 0) {
                this.f20676b.a(f(), l() ? 1 : 0, this.f20681g, 0, null);
            }
            a();
        }
        return z10;
    }

    public void n(int i10) {
        this.f20681g = i10;
        this.f20682h = i10;
    }

    public void o(long j10) {
        if (this.f20685k == 0) {
            this.f20683i = 0;
        } else {
            this.f20683i = this.f20688n[a0.k(this.f20687m, j10, true, true)];
        }
    }
}

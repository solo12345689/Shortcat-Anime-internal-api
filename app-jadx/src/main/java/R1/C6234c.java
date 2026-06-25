package r1;

import q1.C6068a;
import q1.g;
import t1.AbstractC6597j;
import t1.C6588a;

/* JADX INFO: renamed from: r1.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public class C6234c extends q1.e {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private g.c f58356q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    private int f58357r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    private C6588a f58358s0;

    /* JADX INFO: renamed from: r1.c$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f58359a;

        static {
            int[] iArr = new int[g.c.values().length];
            f58359a = iArr;
            try {
                iArr[g.c.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f58359a[g.c.START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f58359a[g.c.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f58359a[g.c.END.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f58359a[g.c.TOP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f58359a[g.c.BOTTOM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public C6234c(q1.g gVar) {
        super(gVar, g.d.BARRIER);
    }

    @Override // q1.C6068a
    public C6068a J(int i10) {
        this.f58357r0 = i10;
        return this;
    }

    @Override // q1.C6068a
    public C6068a K(Object obj) {
        J(this.f56223m0.e(obj));
        return this;
    }

    @Override // q1.e, q1.C6068a, q1.f
    public void apply() {
        u0();
        int i10 = a.f58359a[this.f58356q0.ordinal()];
        int i11 = 3;
        if (i10 == 3 || i10 == 4) {
            i11 = 1;
        } else if (i10 == 5) {
            i11 = 2;
        } else if (i10 != 6) {
            i11 = 0;
        }
        this.f58358s0.w1(i11);
        this.f58358s0.x1(this.f58357r0);
    }

    @Override // q1.e
    public AbstractC6597j u0() {
        if (this.f58358s0 == null) {
            this.f58358s0 = new C6588a();
        }
        return this.f58358s0;
    }

    public void w0(g.c cVar) {
        this.f58356q0 = cVar;
    }
}

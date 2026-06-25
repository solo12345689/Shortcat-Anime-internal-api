package r1;

import q1.g;
import t1.AbstractC6597j;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public class g extends q1.e {

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    private String f58392A0;

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    private String f58393B0;

    /* JADX INFO: renamed from: C0, reason: collision with root package name */
    private String f58394C0;

    /* JADX INFO: renamed from: D0, reason: collision with root package name */
    private String f58395D0;

    /* JADX INFO: renamed from: E0, reason: collision with root package name */
    private int f58396E0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private s1.b f58397q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    private int f58398r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    private int f58399s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    private int f58400t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    private int f58401u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    private int f58402v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    private int f58403w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    private int f58404x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    private float f58405y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    private float f58406z0;

    public g(q1.g gVar, g.d dVar) {
        super(gVar, dVar);
        this.f58398r0 = 0;
        this.f58399s0 = 0;
        this.f58400t0 = 0;
        this.f58401u0 = 0;
        if (dVar == g.d.ROW) {
            this.f58403w0 = 1;
        } else if (dVar == g.d.COLUMN) {
            this.f58404x0 = 1;
        }
    }

    public void A0(float f10) {
        this.f58405y0 = f10;
    }

    public void B0(int i10) {
        this.f58402v0 = i10;
    }

    public void C0(int i10) {
        this.f58401u0 = i10;
    }

    public void D0(int i10) {
        this.f58399s0 = i10;
    }

    public void E0(int i10) {
        this.f58398r0 = i10;
    }

    public void F0(int i10) {
        this.f58400t0 = i10;
    }

    public void G0(String str) {
        this.f58392A0 = str;
    }

    public void H0(int i10) {
        if (super.v0() == g.d.COLUMN) {
            return;
        }
        this.f58403w0 = i10;
    }

    public void I0(String str) {
        this.f58395D0 = str;
    }

    public void J0(String str) {
        this.f58394C0 = str;
    }

    public void K0(float f10) {
        this.f58406z0 = f10;
    }

    @Override // q1.e, q1.C6068a, q1.f
    public void apply() {
        u0();
        this.f58397q0.m2(this.f58402v0);
        int i10 = this.f58403w0;
        if (i10 != 0) {
            this.f58397q0.o2(i10);
        }
        int i11 = this.f58404x0;
        if (i11 != 0) {
            this.f58397q0.j2(i11);
        }
        float f10 = this.f58405y0;
        if (f10 != 0.0f) {
            this.f58397q0.l2(f10);
        }
        float f11 = this.f58406z0;
        if (f11 != 0.0f) {
            this.f58397q0.r2(f11);
        }
        String str = this.f58392A0;
        if (str != null && !str.isEmpty()) {
            this.f58397q0.n2(this.f58392A0);
        }
        String str2 = this.f58393B0;
        if (str2 != null && !str2.isEmpty()) {
            this.f58397q0.i2(this.f58393B0);
        }
        String str3 = this.f58394C0;
        if (str3 != null && !str3.isEmpty()) {
            this.f58397q0.q2(this.f58394C0);
        }
        String str4 = this.f58395D0;
        if (str4 != null && !str4.isEmpty()) {
            this.f58397q0.p2(this.f58395D0);
        }
        this.f58397q0.k2(this.f58396E0);
        this.f58397q0.J1(this.f58398r0);
        this.f58397q0.G1(this.f58399s0);
        this.f58397q0.K1(this.f58400t0);
        this.f58397q0.F1(this.f58401u0);
        t0();
    }

    @Override // q1.e
    public AbstractC6597j u0() {
        if (this.f58397q0 == null) {
            this.f58397q0 = new s1.b();
        }
        return this.f58397q0;
    }

    public void w0(String str) {
        this.f58393B0 = str;
    }

    public void x0(int i10) {
        if (super.v0() == g.d.ROW) {
            return;
        }
        this.f58404x0 = i10;
    }

    public void y0(int i10) {
        this.f58396E0 = i10;
    }

    public void z0(String str) {
        if (str.isEmpty()) {
            return;
        }
        String[] strArrSplit = str.split("\\|");
        this.f58396E0 = 0;
        for (String str2 : strArrSplit) {
            String lowerCase = str2.toLowerCase();
            lowerCase.getClass();
            if (lowerCase.equals("subgridbycolrow")) {
                this.f58396E0 |= 1;
            } else if (lowerCase.equals("spansrespectwidgetorder")) {
                this.f58396E0 |= 2;
            }
        }
    }
}

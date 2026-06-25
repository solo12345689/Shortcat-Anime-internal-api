package androidx.compose.ui.layout;

import I0.InterfaceC1687m;
import K0.U;
import i1.C5025r;
import i1.EnumC5027t;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: androidx.compose.ui.layout.b */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C2673b implements InterfaceC1687m, l {

    /* JADX INFO: renamed from: a */
    private final K0.F f26910a;

    /* JADX INFO: renamed from: androidx.compose.ui.layout.b$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a implements I0.C {

        /* JADX INFO: renamed from: a */
        private final int f26911a;

        /* JADX INFO: renamed from: b */
        private final int f26912b;

        /* JADX INFO: renamed from: c */
        private final Map f26913c;

        /* JADX INFO: renamed from: d */
        private final Function1 f26914d;

        /* JADX INFO: renamed from: e */
        final /* synthetic */ Function1 f26915e;

        /* JADX INFO: renamed from: f */
        final /* synthetic */ C2673b f26916f;

        a(int i10, int i11, Map map, Function1 function1, Function1 function12, C2673b c2673b) {
            this.f26915e = function12;
            this.f26916f = c2673b;
            this.f26911a = i10;
            this.f26912b = i11;
            this.f26913c = map;
            this.f26914d = function1;
        }

        @Override // I0.C
        public void A() {
            this.f26915e.invoke(this.f26916f.j().O1());
        }

        @Override // I0.C
        public Function1 B() {
            return this.f26914d;
        }

        @Override // I0.C
        public int getHeight() {
            return this.f26912b;
        }

        @Override // I0.C
        public int getWidth() {
            return this.f26911a;
        }

        @Override // I0.C
        public Map z() {
            return this.f26913c;
        }
    }

    public C2673b(K0.F f10, InterfaceC2672a interfaceC2672a) {
        this.f26910a = f10;
    }

    @Override // i1.InterfaceC5011d
    public float A(int i10) {
        return this.f26910a.A(i10);
    }

    @Override // androidx.compose.ui.layout.l
    public I0.C M0(int i10, int i11, Map map, Function1 function1) {
        return this.f26910a.M0(i10, i11, map, function1);
    }

    @Override // i1.InterfaceC5019l
    public long O(float f10) {
        return this.f26910a.O(f10);
    }

    @Override // i1.InterfaceC5011d
    public long Q(long j10) {
        return this.f26910a.Q(j10);
    }

    @Override // i1.InterfaceC5019l
    public float T(long j10) {
        return this.f26910a.T(j10);
    }

    public final InterfaceC2672a b() {
        return null;
    }

    @Override // i1.InterfaceC5011d
    public long d0(float f10) {
        return this.f26910a.d0(f10);
    }

    @Override // i1.InterfaceC5011d
    public float e1(float f10) {
        return this.f26910a.e1(f10);
    }

    @Override // i1.InterfaceC5011d
    public float getDensity() {
        return this.f26910a.getDensity();
    }

    @Override // I0.InterfaceC1687m
    public EnumC5027t getLayoutDirection() {
        return this.f26910a.getLayoutDirection();
    }

    public final K0.F j() {
        return this.f26910a;
    }

    @Override // i1.InterfaceC5019l
    public float j1() {
        return this.f26910a.j1();
    }

    @Override // I0.InterfaceC1687m
    public boolean k0() {
        return false;
    }

    @Override // i1.InterfaceC5011d
    public float l1(float f10) {
        return this.f26910a.l1(f10);
    }

    public long p() {
        U uI2 = this.f26910a.I2();
        AbstractC5504s.e(uI2);
        I0.C cM1 = uI2.M1();
        return C5025r.c((((long) cM1.getWidth()) << 32) | (((long) cM1.getHeight()) & 4294967295L));
    }

    @Override // androidx.compose.ui.layout.l
    public I0.C q1(int i10, int i11, Map map, Function1 function1, Function1 function12) {
        if (!((i10 & (-16777216)) == 0 && ((-16777216) & i11) == 0)) {
            H0.a.b("Size(" + i10 + " x " + i11 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new a(i10, i11, map, function1, function12, this);
    }

    @Override // i1.InterfaceC5011d
    public int s0(float f10) {
        return this.f26910a.s0(f10);
    }

    @Override // i1.InterfaceC5011d
    public long w1(long j10) {
        return this.f26910a.w1(j10);
    }

    @Override // i1.InterfaceC5011d
    public float z0(long j10) {
        return this.f26910a.z0(j10);
    }

    public final void q(InterfaceC2672a interfaceC2672a) {
    }
}

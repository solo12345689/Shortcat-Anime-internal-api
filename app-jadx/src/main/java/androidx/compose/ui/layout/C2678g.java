package androidx.compose.ui.layout;

import I0.InterfaceC1687m;
import i1.EnumC5027t;
import java.util.Map;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: androidx.compose.ui.layout.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C2678g implements l, InterfaceC1687m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ InterfaceC1687m f26937a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final EnumC5027t f26938b;

    public C2678g(InterfaceC1687m interfaceC1687m, EnumC5027t enumC5027t) {
        this.f26937a = interfaceC1687m;
        this.f26938b = enumC5027t;
    }

    @Override // i1.InterfaceC5011d
    public float A(int i10) {
        return this.f26937a.A(i10);
    }

    @Override // i1.InterfaceC5019l
    public long O(float f10) {
        return this.f26937a.O(f10);
    }

    @Override // i1.InterfaceC5011d
    public long Q(long j10) {
        return this.f26937a.Q(j10);
    }

    @Override // i1.InterfaceC5019l
    public float T(long j10) {
        return this.f26937a.T(j10);
    }

    @Override // i1.InterfaceC5011d
    public long d0(float f10) {
        return this.f26937a.d0(f10);
    }

    @Override // i1.InterfaceC5011d
    public float e1(float f10) {
        return this.f26937a.e1(f10);
    }

    @Override // i1.InterfaceC5011d
    public float getDensity() {
        return this.f26937a.getDensity();
    }

    @Override // I0.InterfaceC1687m
    public EnumC5027t getLayoutDirection() {
        return this.f26938b;
    }

    @Override // i1.InterfaceC5019l
    public float j1() {
        return this.f26937a.j1();
    }

    @Override // I0.InterfaceC1687m
    public boolean k0() {
        return this.f26937a.k0();
    }

    @Override // i1.InterfaceC5011d
    public float l1(float f10) {
        return this.f26937a.l1(f10);
    }

    @Override // androidx.compose.ui.layout.l
    public I0.C q1(int i10, int i11, Map map, Function1 function1, Function1 function12) {
        boolean z10 = false;
        if (i10 < 0) {
            i10 = 0;
        }
        if (i11 < 0) {
            i11 = 0;
        }
        if ((i10 & (-16777216)) == 0 && ((-16777216) & i11) == 0) {
            z10 = true;
        }
        if (!z10) {
            H0.a.b("Size(" + i10 + " x " + i11 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new a(i10, i11, map, function1);
    }

    @Override // i1.InterfaceC5011d
    public int s0(float f10) {
        return this.f26937a.s0(f10);
    }

    @Override // i1.InterfaceC5011d
    public long w1(long j10) {
        return this.f26937a.w1(j10);
    }

    @Override // i1.InterfaceC5011d
    public float z0(long j10) {
        return this.f26937a.z0(j10);
    }

    /* JADX INFO: renamed from: androidx.compose.ui.layout.g$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a implements I0.C {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f26939a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f26940b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Map f26941c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function1 f26942d;

        a(int i10, int i11, Map map, Function1 function1) {
            this.f26939a = i10;
            this.f26940b = i11;
            this.f26941c = map;
            this.f26942d = function1;
        }

        @Override // I0.C
        public Function1 B() {
            return this.f26942d;
        }

        @Override // I0.C
        public int getHeight() {
            return this.f26940b;
        }

        @Override // I0.C
        public int getWidth() {
            return this.f26939a;
        }

        @Override // I0.C
        public Map z() {
            return this.f26941c;
        }

        @Override // I0.C
        public void A() {
        }
    }
}

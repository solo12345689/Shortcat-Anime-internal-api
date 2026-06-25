package F;

import i1.EnumC5027t;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class v implements u, androidx.compose.ui.layout.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C1544o f6103a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final I0.P f6104b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final q f6105c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final HashMap f6106d = new HashMap();

    public v(C1544o c1544o, I0.P p10) {
        this.f6103a = c1544o;
        this.f6104b = p10;
        this.f6105c = (q) c1544o.d().invoke();
    }

    @Override // F.u, i1.InterfaceC5011d
    public float A(int i10) {
        return this.f6104b.A(i10);
    }

    @Override // androidx.compose.ui.layout.l
    public I0.C M0(int i10, int i11, Map map, Function1 function1) {
        return this.f6104b.M0(i10, i11, map, function1);
    }

    @Override // i1.InterfaceC5019l
    public long O(float f10) {
        return this.f6104b.O(f10);
    }

    @Override // i1.InterfaceC5011d
    public long Q(long j10) {
        return this.f6104b.Q(j10);
    }

    @Override // i1.InterfaceC5019l
    public float T(long j10) {
        return this.f6104b.T(j10);
    }

    @Override // i1.InterfaceC5011d
    public long d0(float f10) {
        return this.f6104b.d0(f10);
    }

    @Override // i1.InterfaceC5011d
    public float e1(float f10) {
        return this.f6104b.e1(f10);
    }

    @Override // F.u
    public List g0(int i10, long j10) {
        List list = (List) this.f6106d.get(Integer.valueOf(i10));
        if (list != null) {
            return list;
        }
        Object objD = this.f6105c.d(i10);
        List listM = this.f6104b.M(objD, this.f6103a.b(i10, objD, this.f6105c.f(i10)));
        int size = listM.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i11 = 0; i11 < size; i11++) {
            arrayList.add(((I0.A) listM.get(i11)).v0(j10));
        }
        this.f6106d.put(Integer.valueOf(i10), arrayList);
        return arrayList;
    }

    @Override // i1.InterfaceC5011d
    public float getDensity() {
        return this.f6104b.getDensity();
    }

    @Override // I0.InterfaceC1687m
    public EnumC5027t getLayoutDirection() {
        return this.f6104b.getLayoutDirection();
    }

    @Override // i1.InterfaceC5019l
    public float j1() {
        return this.f6104b.j1();
    }

    @Override // I0.InterfaceC1687m
    public boolean k0() {
        return this.f6104b.k0();
    }

    @Override // i1.InterfaceC5011d
    public float l1(float f10) {
        return this.f6104b.l1(f10);
    }

    @Override // androidx.compose.ui.layout.l
    public I0.C q1(int i10, int i11, Map map, Function1 function1, Function1 function12) {
        return this.f6104b.q1(i10, i11, map, function1, function12);
    }

    @Override // i1.InterfaceC5011d
    public int s0(float f10) {
        return this.f6104b.s0(f10);
    }

    @Override // i1.InterfaceC5011d
    public long w1(long j10) {
        return this.f6104b.w1(j10);
    }

    @Override // i1.InterfaceC5011d
    public float z0(long j10) {
        return this.f6104b.z0(j10);
    }
}

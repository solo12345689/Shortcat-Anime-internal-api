package U0;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.Spanned;
import android.text.TextUtils;
import b1.AbstractC2968a;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import g1.C4831k;
import g1.EnumC4829i;
import i1.C5009b;
import java.util.List;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import r0.C6226h;
import r0.C6230l;
import s0.AbstractC6358h0;
import s0.C1;
import s0.InterfaceC6364j0;
import s0.InterfaceC6374m1;
import s0.s1;
import u0.AbstractC6712g;

/* JADX INFO: renamed from: U0.b */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C2191b implements InterfaceC2230v {

    /* JADX INFO: renamed from: a */
    private final d1.e f18795a;

    /* JADX INFO: renamed from: b */
    private final int f18796b;

    /* JADX INFO: renamed from: c */
    private final int f18797c;

    /* JADX INFO: renamed from: d */
    private final long f18798d;

    /* JADX INFO: renamed from: e */
    private final V0.o0 f18799e;

    /* JADX INFO: renamed from: f */
    private final CharSequence f18800f;

    /* JADX INFO: renamed from: g */
    private final List f18801g;

    /* JADX INFO: renamed from: U0.b$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f18802a;

        static {
            int[] iArr = new int[EnumC4829i.values().length];
            try {
                iArr[EnumC4829i.f47274a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC4829i.f47275b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f18802a = iArr;
        }
    }

    public /* synthetic */ C2191b(d1.e eVar, int i10, int i11, long j10, DefaultConstructorMarker defaultConstructorMarker) {
        this(eVar, i10, i11, j10);
    }

    private final V0.o0 F(int i10, int i11, TextUtils.TruncateAt truncateAt, int i12, int i13, int i14, int i15, int i16, CharSequence charSequence) {
        return new V0.o0(charSequence, getWidth(), K(), i10, truncateAt, this.f18795a.i(), 1.0f, 0.0f, d1.c.b(this.f18795a.h()), true, i12, i14, i15, i16, i13, i11, null, null, this.f18795a.g(), 196736, null);
    }

    static /* synthetic */ V0.o0 G(C2191b c2191b, int i10, int i11, TextUtils.TruncateAt truncateAt, int i12, int i13, int i14, int i15, int i16, CharSequence charSequence, int i17, Object obj) {
        return c2191b.F(i10, i11, truncateAt, i12, i13, i14, i15, i16, (i17 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? c2191b.f18800f : charSequence);
    }

    public static final boolean I(R0 r02, RectF rectF, RectF rectF2) {
        return r02.a(s1.f(rectF), s1.f(rectF2));
    }

    private final f1.d[] J(V0.o0 o0Var) {
        if (!(o0Var.G() instanceof Spanned)) {
            return null;
        }
        CharSequence charSequenceG = o0Var.G();
        AbstractC5504s.f(charSequenceG, "null cannot be cast to non-null type android.text.Spanned");
        if (!L((Spanned) charSequenceG, f1.d.class)) {
            return null;
        }
        CharSequence charSequenceG2 = o0Var.G();
        AbstractC5504s.f(charSequenceG2, "null cannot be cast to non-null type android.text.Spanned");
        return (f1.d[]) ((Spanned) charSequenceG2).getSpans(0, o0Var.G().length(), f1.d.class);
    }

    private final boolean L(Spanned spanned, Class cls) {
        return spanned.nextSpanTransition(-1, spanned.length(), cls) != spanned.length();
    }

    private final void M(InterfaceC6364j0 interfaceC6364j0) {
        Canvas canvasD = s0.E.d(interfaceC6364j0);
        if (r()) {
            canvasD.save();
            canvasD.clipRect(0.0f, 0.0f, getWidth(), getHeight());
        }
        this.f18799e.M(canvasD);
        if (r()) {
            canvasD.restore();
        }
    }

    @Override // U0.InterfaceC2230v
    public EnumC4829i A(int i10) {
        return this.f18799e.L(i10) ? EnumC4829i.f47275b : EnumC4829i.f47274a;
    }

    @Override // U0.InterfaceC2230v
    public C6226h B(int i10) {
        boolean z10 = false;
        if (i10 >= 0 && i10 < this.f18800f.length()) {
            z10 = true;
        }
        if (!z10) {
            AbstractC2968a.a("offset(" + i10 + ") is out of bounds [0," + this.f18800f.length() + ')');
        }
        RectF rectFC = this.f18799e.c(i10);
        return new C6226h(rectFC.left, rectFC.top, rectFC.right, rectFC.bottom);
    }

    @Override // U0.InterfaceC2230v
    public List C() {
        return this.f18801g;
    }

    public float H(int i10) {
        return this.f18799e.k(i10);
    }

    public final d1.i K() {
        return this.f18795a.j();
    }

    @Override // U0.InterfaceC2230v
    public float a(int i10) {
        return this.f18799e.w(i10);
    }

    @Override // U0.InterfaceC2230v
    public int b(int i10) {
        return this.f18799e.v(i10);
    }

    @Override // U0.InterfaceC2230v
    public int c() {
        return this.f18799e.m();
    }

    @Override // U0.InterfaceC2230v
    public float d() {
        return this.f18795a.d();
    }

    @Override // U0.InterfaceC2230v
    public float e(int i10) {
        return this.f18799e.l(i10);
    }

    @Override // U0.InterfaceC2230v
    public float f() {
        return this.f18795a.f();
    }

    @Override // U0.InterfaceC2230v
    public void g(InterfaceC6364j0 interfaceC6364j0, long j10, C1 c12, C4831k c4831k, AbstractC6712g abstractC6712g, int i10) {
        int iC = K().c();
        d1.i iVarK = K();
        iVarK.h(j10);
        iVarK.j(c12);
        iVarK.k(c4831k);
        iVarK.i(abstractC6712g);
        iVarK.e(i10);
        M(interfaceC6364j0);
        K().e(iC);
    }

    @Override // U0.InterfaceC2230v
    public float getHeight() {
        return this.f18799e.f();
    }

    @Override // U0.InterfaceC2230v
    public float getWidth() {
        return C5009b.l(this.f18798d);
    }

    @Override // U0.InterfaceC2230v
    public long h(C6226h c6226h, int i10, final R0 r02) {
        int[] iArrC = this.f18799e.C(s1.c(c6226h), AbstractC2193c.r(i10), new Function2() { // from class: U0.a
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return Boolean.valueOf(C2191b.I(r02, (RectF) obj, (RectF) obj2));
            }
        });
        return iArrC == null ? W0.f18785b.a() : X0.b(iArrC[0], iArrC[1]);
    }

    @Override // U0.InterfaceC2230v
    public EnumC4829i i(int i10) {
        return this.f18799e.z(this.f18799e.q(i10)) == 1 ? EnumC4829i.f47274a : EnumC4829i.f47275b;
    }

    @Override // U0.InterfaceC2230v
    public C6226h j(int i10) {
        if (!(i10 >= 0 && i10 <= this.f18800f.length())) {
            AbstractC2968a.a("offset(" + i10 + ") is out of bounds [0," + this.f18800f.length() + ']');
        }
        float fB = V0.o0.B(this.f18799e, i10, false, 2, null);
        int iQ = this.f18799e.q(i10);
        return new C6226h(fB, this.f18799e.w(iQ), fB, this.f18799e.l(iQ));
    }

    @Override // U0.InterfaceC2230v
    public long k(int i10) {
        W0.i iVarI = this.f18799e.I();
        return X0.b(W0.h.b(iVarI, i10), W0.h.a(iVarI, i10));
    }

    @Override // U0.InterfaceC2230v
    public float l() {
        return H(0);
    }

    @Override // U0.InterfaceC2230v
    public int m(long j10) {
        return this.f18799e.y(this.f18799e.r((int) Float.intBitsToFloat((int) (4294967295L & j10))), Float.intBitsToFloat((int) (j10 >> 32)));
    }

    @Override // U0.InterfaceC2230v
    public boolean n(int i10) {
        return this.f18799e.K(i10);
    }

    @Override // U0.InterfaceC2230v
    public int o(int i10, boolean z10) {
        return z10 ? this.f18799e.x(i10) : this.f18799e.p(i10);
    }

    @Override // U0.InterfaceC2230v
    public float p(int i10) {
        return this.f18799e.u(i10);
    }

    @Override // U0.InterfaceC2230v
    public boolean r() {
        return this.f18799e.d();
    }

    @Override // U0.InterfaceC2230v
    public int s(float f10) {
        return this.f18799e.r((int) f10);
    }

    @Override // U0.InterfaceC2230v
    public InterfaceC6374m1 t(int i10, int i11) {
        if (!(i10 >= 0 && i10 <= i11 && i11 <= this.f18800f.length())) {
            AbstractC2968a.a("start(" + i10 + ") or end(" + i11 + ") is out of range [0.." + this.f18800f.length() + "], or start > end!");
        }
        Path path = new Path();
        this.f18799e.F(i10, i11, path);
        return s0.V.c(path);
    }

    @Override // U0.InterfaceC2230v
    public float u(int i10, boolean z10) {
        return z10 ? V0.o0.B(this.f18799e, i10, false, 2, null) : V0.o0.E(this.f18799e, i10, false, 2, null);
    }

    @Override // U0.InterfaceC2230v
    public float v(int i10) {
        return this.f18799e.t(i10);
    }

    @Override // U0.InterfaceC2230v
    public void w(long j10, float[] fArr, int i10) {
        this.f18799e.a(W0.l(j10), W0.k(j10), fArr, i10);
    }

    @Override // U0.InterfaceC2230v
    public float x() {
        return H(c() - 1);
    }

    @Override // U0.InterfaceC2230v
    public void y(InterfaceC6364j0 interfaceC6364j0, AbstractC6358h0 abstractC6358h0, float f10, C1 c12, C4831k c4831k, AbstractC6712g abstractC6712g, int i10) {
        int iC = K().c();
        d1.i iVarK = K();
        float width = getWidth();
        iVarK.f(abstractC6358h0, C6230l.d((((long) Float.floatToRawIntBits(getHeight())) & 4294967295L) | (Float.floatToRawIntBits(width) << 32)), f10);
        iVarK.j(c12);
        iVarK.k(c4831k);
        iVarK.i(abstractC6712g);
        iVarK.e(i10);
        M(interfaceC6364j0);
        K().e(iC);
    }

    @Override // U0.InterfaceC2230v
    public int z(int i10) {
        return this.f18799e.q(i10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:149:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x01fe  */
    /* JADX WARN: Type inference failed for: r0v10, types: [U0.b] */
    /* JADX WARN: Type inference failed for: r0v12, types: [U0.b] */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v4, types: [U0.b] */
    /* JADX WARN: Type inference failed for: r0v5, types: [U0.b] */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r11v41 */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r22v0, types: [U0.b] */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [int] */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private C2191b(d1.e r23, int r24, int r25, long r26) {
        /*
            Method dump skipped, instruction units count: 796
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: U0.C2191b.<init>(d1.e, int, int, long):void");
    }
}

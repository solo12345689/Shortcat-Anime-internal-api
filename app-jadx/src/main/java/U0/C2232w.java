package U0;

import U0.W0;
import kotlin.jvm.internal.AbstractC5504s;
import oe.AbstractC5874j;
import r0.C6224f;
import r0.C6226h;
import s0.InterfaceC6374m1;

/* JADX INFO: renamed from: U0.w, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C2232w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC2230v f18867a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f18868b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f18869c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f18870d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f18871e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f18872f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f18873g;

    public C2232w(InterfaceC2230v interfaceC2230v, int i10, int i11, int i12, int i13, float f10, float f11) {
        this.f18867a = interfaceC2230v;
        this.f18868b = i10;
        this.f18869c = i11;
        this.f18870d = i12;
        this.f18871e = i13;
        this.f18872f = f10;
        this.f18873g = f11;
    }

    public static /* synthetic */ long l(C2232w c2232w, long j10, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        return c2232w.k(j10, z10);
    }

    public final float a() {
        return this.f18873g;
    }

    public final int b() {
        return this.f18869c;
    }

    public final int c() {
        return this.f18871e;
    }

    public final int d() {
        return this.f18869c - this.f18868b;
    }

    public final InterfaceC2230v e() {
        return this.f18867a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2232w)) {
            return false;
        }
        C2232w c2232w = (C2232w) obj;
        return AbstractC5504s.c(this.f18867a, c2232w.f18867a) && this.f18868b == c2232w.f18868b && this.f18869c == c2232w.f18869c && this.f18870d == c2232w.f18870d && this.f18871e == c2232w.f18871e && Float.compare(this.f18872f, c2232w.f18872f) == 0 && Float.compare(this.f18873g, c2232w.f18873g) == 0;
    }

    public final int f() {
        return this.f18868b;
    }

    public final int g() {
        return this.f18870d;
    }

    public final float h() {
        return this.f18872f;
    }

    public int hashCode() {
        return (((((((((((this.f18867a.hashCode() * 31) + Integer.hashCode(this.f18868b)) * 31) + Integer.hashCode(this.f18869c)) * 31) + Integer.hashCode(this.f18870d)) * 31) + Integer.hashCode(this.f18871e)) * 31) + Float.hashCode(this.f18872f)) * 31) + Float.hashCode(this.f18873g);
    }

    public final C6226h i(C6226h c6226h) {
        float f10 = this.f18872f;
        return c6226h.t(C6224f.e((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(f10)) & 4294967295L)));
    }

    public final InterfaceC6374m1 j(InterfaceC6374m1 interfaceC6374m1) {
        float f10 = this.f18872f;
        interfaceC6374m1.l(C6224f.e((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(f10)) & 4294967295L)));
        return interfaceC6374m1;
    }

    public final long k(long j10, boolean z10) {
        if (z10) {
            W0.a aVar = W0.f18785b;
            if (W0.g(j10, aVar.a())) {
                return aVar.a();
            }
        }
        return X0.b(m(W0.n(j10)), m(W0.i(j10)));
    }

    public final int m(int i10) {
        return i10 + this.f18868b;
    }

    public final int n(int i10) {
        return i10 + this.f18870d;
    }

    public final float o(float f10) {
        return f10 + this.f18872f;
    }

    public final C6226h p(C6226h c6226h) {
        float f10 = -this.f18872f;
        return c6226h.t(C6224f.e((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(f10)) & 4294967295L)));
    }

    public final long q(long j10) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32));
        return C6224f.e((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j10 & 4294967295L)) - this.f18872f)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32));
    }

    public final int r(int i10) {
        return AbstractC5874j.m(i10, this.f18868b, this.f18869c) - this.f18868b;
    }

    public final int s(int i10) {
        return i10 - this.f18870d;
    }

    public final float t(float f10) {
        return f10 - this.f18872f;
    }

    public String toString() {
        return "ParagraphInfo(paragraph=" + this.f18867a + ", startIndex=" + this.f18868b + ", endIndex=" + this.f18869c + ", startLineIndex=" + this.f18870d + ", endLineIndex=" + this.f18871e + ", top=" + this.f18872f + ", bottom=" + this.f18873g + ')';
    }
}

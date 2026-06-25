package z9;

import A1.AbstractC1002a;
import E9.b;
import android.content.Context;
import android.graphics.Color;
import o9.AbstractC5838a;
import x9.AbstractC7066a;

/* JADX INFO: renamed from: z9.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class C7345a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f66019f = (int) Math.round(5.1000000000000005d);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f66020a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f66021b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f66022c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f66023d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final float f66024e;

    public C7345a(Context context) {
        this(b.b(context, AbstractC5838a.f54624a0, false), AbstractC7066a.b(context, AbstractC5838a.f54622Z, 0), AbstractC7066a.b(context, AbstractC5838a.f54621Y, 0), AbstractC7066a.b(context, AbstractC5838a.f54604J, 0), context.getResources().getDisplayMetrics().density);
    }

    private boolean e(int i10) {
        return AbstractC1002a.k(i10, 255) == this.f66023d;
    }

    public float a(float f10) {
        if (this.f66024e <= 0.0f || f10 <= 0.0f) {
            return 0.0f;
        }
        return Math.min(((((float) Math.log1p(f10 / r0)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
    }

    public int b(int i10, float f10) {
        int i11;
        float fA = a(f10);
        int iAlpha = Color.alpha(i10);
        int iJ = AbstractC7066a.j(AbstractC1002a.k(i10, 255), this.f66021b, fA);
        if (fA > 0.0f && (i11 = this.f66022c) != 0) {
            iJ = AbstractC7066a.i(iJ, AbstractC1002a.k(i11, f66019f));
        }
        return AbstractC1002a.k(iJ, iAlpha);
    }

    public int c(int i10, float f10) {
        return (this.f66020a && e(i10)) ? b(i10, f10) : i10;
    }

    public boolean d() {
        return this.f66020a;
    }

    public C7345a(boolean z10, int i10, int i11, int i12, float f10) {
        this.f66020a = z10;
        this.f66021b = i10;
        this.f66022c = i11;
        this.f66023d = i12;
        this.f66024e = f10;
    }
}

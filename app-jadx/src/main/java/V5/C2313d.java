package V5;

import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: V5.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2313d {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f19790f = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f19792b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ColorFilter f19793c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f19791a = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f19794d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f19795e = -1;

    /* JADX INFO: renamed from: V5.d$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public final void a(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        int i10 = this.f19791a;
        if (i10 != -1) {
            drawable.setAlpha(i10);
        }
        if (this.f19792b) {
            drawable.setColorFilter(this.f19793c);
        }
        int i11 = this.f19794d;
        if (i11 != -1) {
            drawable.setDither(i11 != 0);
        }
        int i12 = this.f19795e;
        if (i12 != -1) {
            drawable.setFilterBitmap(i12 != 0);
        }
    }

    public final void b(int i10) {
        this.f19791a = i10;
    }

    public final void c(ColorFilter colorFilter) {
        this.f19793c = colorFilter;
        this.f19792b = colorFilter != null;
    }

    public final void d(boolean z10) {
        this.f19794d = z10 ? 1 : 0;
    }

    public final void e(boolean z10) {
        this.f19795e = z10 ? 1 : 0;
    }
}

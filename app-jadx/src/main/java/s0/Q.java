package s0;

import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.os.Build;
import s0.G1;
import s0.H1;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class Q {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f58905a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f58906b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f58907c;

        static {
            int[] iArr = new int[Paint.Style.values().length];
            try {
                iArr[Paint.Style.STROKE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f58905a = iArr;
            int[] iArr2 = new int[Paint.Cap.values().length];
            try {
                iArr2[Paint.Cap.BUTT.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr2[Paint.Cap.ROUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[Paint.Cap.SQUARE.ordinal()] = 3;
            } catch (NoSuchFieldError unused4) {
            }
            f58906b = iArr2;
            int[] iArr3 = new int[Paint.Join.values().length];
            try {
                iArr3[Paint.Join.MITER.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr3[Paint.Join.BEVEL.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[Paint.Join.ROUND.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            f58907c = iArr3;
        }
    }

    public static final InterfaceC6368k1 a() {
        return new androidx.compose.ui.graphics.b();
    }

    public static final InterfaceC6368k1 b(Paint paint) {
        return new androidx.compose.ui.graphics.b(paint);
    }

    public static final float c(Paint paint) {
        return paint.getAlpha() / 255.0f;
    }

    public static final long d(Paint paint) {
        return AbstractC6387s0.b(paint.getColor());
    }

    public static final int e(Paint paint) {
        return !paint.isFilterBitmap() ? X0.f58918a.b() : X0.f58918a.a();
    }

    public static final int f(Paint paint) {
        Paint.Cap strokeCap = paint.getStrokeCap();
        int i10 = strokeCap == null ? -1 : a.f58906b[strokeCap.ordinal()];
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? G1.f58877a.a() : G1.f58877a.c() : G1.f58877a.b() : G1.f58877a.a();
    }

    public static final int g(Paint paint) {
        Paint.Join strokeJoin = paint.getStrokeJoin();
        int i10 = strokeJoin == null ? -1 : a.f58907c[strokeJoin.ordinal()];
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? H1.f58881a.b() : H1.f58881a.c() : H1.f58881a.a() : H1.f58881a.b();
    }

    public static final float h(Paint paint) {
        return paint.getStrokeMiter();
    }

    public static final float i(Paint paint) {
        return paint.getStrokeWidth();
    }

    public static final Paint j() {
        return new Paint(7);
    }

    public static final void k(Paint paint, float f10) {
        paint.setAlpha((int) Math.rint(f10 * 255.0f));
    }

    public static final void l(Paint paint, boolean z10) {
        paint.setAntiAlias(z10);
    }

    public static final void m(Paint paint, int i10) {
        if (Build.VERSION.SDK_INT >= 29) {
            O1.f58904a.a(paint, i10);
        } else {
            paint.setXfermode(new PorterDuffXfermode(androidx.compose.ui.graphics.a.b(i10)));
        }
    }

    public static final void n(Paint paint, long j10) {
        paint.setColor(AbstractC6387s0.k(j10));
    }

    public static final void o(Paint paint, androidx.compose.ui.graphics.d dVar) {
        paint.setColorFilter(dVar != null ? F.b(dVar) : null);
    }

    public static final void p(Paint paint, int i10) {
        paint.setFilterBitmap(!X0.d(i10, X0.f58918a.b()));
    }

    public static final void q(Paint paint, InterfaceC6377n1 interfaceC6377n1) {
        android.support.v4.media.session.b.a(interfaceC6377n1);
        paint.setPathEffect(null);
    }

    public static final void r(Paint paint, Shader shader) {
        paint.setShader(shader);
    }

    public static final void s(Paint paint, int i10) {
        G1.a aVar = G1.f58877a;
        paint.setStrokeCap(G1.e(i10, aVar.c()) ? Paint.Cap.SQUARE : G1.e(i10, aVar.b()) ? Paint.Cap.ROUND : G1.e(i10, aVar.a()) ? Paint.Cap.BUTT : Paint.Cap.BUTT);
    }

    public static final void t(Paint paint, int i10) {
        H1.a aVar = H1.f58881a;
        paint.setStrokeJoin(H1.e(i10, aVar.b()) ? Paint.Join.MITER : H1.e(i10, aVar.a()) ? Paint.Join.BEVEL : H1.e(i10, aVar.c()) ? Paint.Join.ROUND : Paint.Join.MITER);
    }

    public static final void u(Paint paint, float f10) {
        paint.setStrokeMiter(f10);
    }

    public static final void v(Paint paint, float f10) {
        paint.setStrokeWidth(f10);
    }

    public static final void w(Paint paint, int i10) {
        paint.setStyle(AbstractC6371l1.d(i10, AbstractC6371l1.f58959a.b()) ? Paint.Style.STROKE : Paint.Style.FILL);
    }
}

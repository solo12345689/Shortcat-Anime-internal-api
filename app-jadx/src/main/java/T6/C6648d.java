package t6;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import r6.InterfaceC6273a;
import r6.b;
import r6.e;

/* JADX INFO: renamed from: t6.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class C6648d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC6273a f60849a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f60850b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Paint f60851c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f60852d;

    /* JADX INFO: renamed from: t6.d$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f60853a;

        static {
            int[] iArr = new int[c.values().length];
            f60853a = iArr;
            try {
                iArr[c.REQUIRED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f60853a[c.NOT_REQUIRED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f60853a[c.ABORT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f60853a[c.SKIP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: renamed from: t6.d$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface b {
        void a(int i10, Bitmap bitmap);

        C5.a b(int i10);
    }

    /* JADX INFO: renamed from: t6.d$c */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private enum c {
        REQUIRED,
        NOT_REQUIRED,
        SKIP,
        ABORT
    }

    public C6648d(InterfaceC6273a interfaceC6273a, boolean z10, b bVar) {
        this.f60849a = interfaceC6273a;
        this.f60850b = bVar;
        this.f60852d = z10;
        Paint paint = new Paint();
        this.f60851c = paint;
        paint.setColor(0);
        paint.setStyle(Paint.Style.FILL);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
    }

    private void a(Canvas canvas, r6.b bVar) {
        canvas.drawRect(bVar.f58612b, bVar.f58613c, r0 + bVar.f58614d, r1 + bVar.f58615e, this.f60851c);
    }

    private c b(int i10) {
        r6.b bVarC = this.f60849a.c(i10);
        b.EnumC0885b enumC0885b = bVarC.f58617g;
        return enumC0885b == b.EnumC0885b.DISPOSE_DO_NOT ? c.REQUIRED : enumC0885b == b.EnumC0885b.DISPOSE_TO_BACKGROUND ? c(bVarC) ? c.NOT_REQUIRED : c.REQUIRED : enumC0885b == b.EnumC0885b.DISPOSE_TO_PREVIOUS ? c.SKIP : c.ABORT;
    }

    private boolean c(r6.b bVar) {
        return bVar.f58612b == 0 && bVar.f58613c == 0 && bVar.f58614d == this.f60849a.j() && bVar.f58615e == this.f60849a.h();
    }

    private boolean d(int i10) {
        if (i10 == 0) {
            return true;
        }
        r6.b bVarC = this.f60849a.c(i10);
        r6.b bVarC2 = this.f60849a.c(i10 - 1);
        if (bVarC.f58616f == b.a.NO_BLEND && c(bVarC)) {
            return true;
        }
        return bVarC2.f58617g == b.EnumC0885b.DISPOSE_TO_BACKGROUND && c(bVarC2);
    }

    private void e(Bitmap bitmap) {
        e eVarK = this.f60849a.k();
        if (eVarK == null) {
            return;
        }
        eVarK.c();
    }

    private int f(int i10, Canvas canvas) {
        while (i10 >= 0) {
            int i11 = a.f60853a[b(i10).ordinal()];
            if (i11 == 1) {
                r6.b bVarC = this.f60849a.c(i10);
                C5.a aVarB = this.f60850b.b(i10);
                if (aVarB != null) {
                    try {
                        canvas.drawBitmap((Bitmap) aVarB.C(), 0.0f, 0.0f, (Paint) null);
                        if (bVarC.f58617g == b.EnumC0885b.DISPOSE_TO_BACKGROUND) {
                            a(canvas, bVarC);
                        }
                        return i10 + 1;
                    } finally {
                        if (!this.f60852d) {
                            aVarB.close();
                        }
                    }
                }
                if (d(i10)) {
                    return i10;
                }
                i10--;
            } else {
                if (i11 == 2) {
                    return i10 + 1;
                }
                if (i11 == 3) {
                    return i10;
                }
                i10--;
            }
        }
        return 0;
    }

    public void g(int i10, Bitmap bitmap) {
        this.f60849a.i(i10, new Canvas(bitmap));
    }

    public void h(int i10, Bitmap bitmap) {
        if (this.f60852d) {
            g(i10, bitmap);
            return;
        }
        Canvas canvas = new Canvas(bitmap);
        canvas.drawColor(0, PorterDuff.Mode.SRC);
        for (int iF = !d(i10) ? f(i10 - 1, canvas) : i10; iF < i10; iF++) {
            r6.b bVarC = this.f60849a.c(iF);
            b.EnumC0885b enumC0885b = bVarC.f58617g;
            if (enumC0885b != b.EnumC0885b.DISPOSE_TO_PREVIOUS) {
                if (bVarC.f58616f == b.a.NO_BLEND) {
                    a(canvas, bVarC);
                }
                this.f60849a.e(iF, canvas);
                this.f60850b.a(iF, bitmap);
                if (enumC0885b == b.EnumC0885b.DISPOSE_TO_BACKGROUND) {
                    a(canvas, bVarC);
                }
            }
        }
        r6.b bVarC2 = this.f60849a.c(i10);
        if (bVarC2.f58616f == b.a.NO_BLEND) {
            a(canvas, bVarC2);
        }
        this.f60849a.e(i10, canvas);
        e(bitmap);
    }
}

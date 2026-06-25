package t6;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import r6.InterfaceC6273a;
import r6.b;
import r6.e;
import u6.C6740a;

/* JADX INFO: renamed from: t6.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class C6645a implements InterfaceC6273a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C6740a f60829a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e f60830b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final r6.c f60831c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Rect f60832d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int[] f60833e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int[] f60834f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f60835g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final r6.b[] f60836h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Rect f60837i = new Rect();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Rect f60838j = new Rect();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final boolean f60839k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Paint f60840l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Bitmap f60841m;

    public C6645a(C6740a c6740a, e eVar, Rect rect, boolean z10) {
        this.f60829a = c6740a;
        this.f60830b = eVar;
        r6.c cVarD = eVar.d();
        this.f60831c = cVarD;
        int[] iArrH = cVarD.h();
        this.f60833e = iArrH;
        c6740a.a(iArrH);
        this.f60835g = c6740a.c(iArrH);
        this.f60834f = c6740a.b(iArrH);
        this.f60832d = m(cVarD, rect);
        this.f60839k = z10;
        this.f60836h = new r6.b[cVarD.a()];
        for (int i10 = 0; i10 < this.f60831c.a(); i10++) {
            this.f60836h[i10] = this.f60831c.c(i10);
        }
        Paint paint = new Paint();
        this.f60840l = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    private synchronized void l() {
        Bitmap bitmap = this.f60841m;
        if (bitmap != null) {
            bitmap.recycle();
            this.f60841m = null;
        }
    }

    private static Rect m(r6.c cVar, Rect rect) {
        return rect == null ? new Rect(0, 0, cVar.getWidth(), cVar.getHeight()) : new Rect(0, 0, Math.min(rect.width(), cVar.getWidth()), Math.min(rect.height(), cVar.getHeight()));
    }

    private void n(Canvas canvas, float f10, float f11, r6.b bVar) {
        if (bVar.f58617g == b.EnumC0885b.DISPOSE_TO_BACKGROUND) {
            int iCeil = (int) Math.ceil(bVar.f58614d * f10);
            int iCeil2 = (int) Math.ceil(bVar.f58615e * f11);
            int iCeil3 = (int) Math.ceil(bVar.f58612b * f10);
            int iCeil4 = (int) Math.ceil(bVar.f58613c * f11);
            canvas.drawRect(new Rect(iCeil3, iCeil4, iCeil + iCeil3, iCeil2 + iCeil4), this.f60840l);
        }
    }

    private synchronized Bitmap o(int i10, int i11) {
        try {
            Bitmap bitmap = this.f60841m;
            if (bitmap != null && (bitmap.getWidth() < i10 || this.f60841m.getHeight() < i11)) {
                l();
            }
            if (this.f60841m == null) {
                this.f60841m = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
            }
            this.f60841m.eraseColor(0);
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f60841m;
    }

    private void p(Canvas canvas, r6.d dVar) {
        int width;
        int height;
        int iB;
        int iC;
        if (this.f60839k) {
            float fMax = Math.max(dVar.getWidth() / Math.min(dVar.getWidth(), canvas.getWidth()), dVar.getHeight() / Math.min(dVar.getHeight(), canvas.getHeight()));
            width = (int) (dVar.getWidth() / fMax);
            height = (int) (dVar.getHeight() / fMax);
            iB = (int) (dVar.b() / fMax);
            iC = (int) (dVar.c() / fMax);
        } else {
            width = dVar.getWidth();
            height = dVar.getHeight();
            iB = dVar.b();
            iC = dVar.c();
        }
        synchronized (this) {
            Bitmap bitmapO = o(width, height);
            this.f60841m = bitmapO;
            dVar.a(width, height, bitmapO);
            canvas.save();
            canvas.translate(iB, iC);
            canvas.drawBitmap(this.f60841m, 0.0f, 0.0f, (Paint) null);
            canvas.restore();
        }
    }

    private void q(Canvas canvas, r6.d dVar) {
        double dWidth = ((double) this.f60832d.width()) / ((double) this.f60831c.getWidth());
        double dHeight = ((double) this.f60832d.height()) / ((double) this.f60831c.getHeight());
        int iRound = (int) Math.round(((double) dVar.getWidth()) * dWidth);
        int iRound2 = (int) Math.round(((double) dVar.getHeight()) * dHeight);
        int iB = (int) (((double) dVar.b()) * dWidth);
        int iC = (int) (((double) dVar.c()) * dHeight);
        synchronized (this) {
            try {
                int iWidth = this.f60832d.width();
                int iHeight = this.f60832d.height();
                o(iWidth, iHeight);
                Bitmap bitmap = this.f60841m;
                if (bitmap != null) {
                    dVar.a(iRound, iRound2, bitmap);
                }
                this.f60837i.set(0, 0, iWidth, iHeight);
                this.f60838j.set(iB, iC, iWidth + iB, iHeight + iC);
                Bitmap bitmap2 = this.f60841m;
                if (bitmap2 != null) {
                    canvas.drawBitmap(bitmap2, this.f60837i, this.f60838j, (Paint) null);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void r(Canvas canvas, r6.d dVar, r6.b bVar, r6.b bVar2) {
        Rect rect = this.f60832d;
        if (rect == null || rect.width() <= 0 || this.f60832d.height() <= 0) {
            return;
        }
        float width = canvas.getWidth() / this.f60832d.width();
        if (bVar2 != null) {
            n(canvas, width, width, bVar2);
        }
        int width2 = dVar.getWidth();
        int height = dVar.getHeight();
        Rect rect2 = new Rect(0, 0, width2, height);
        int i10 = (int) (width2 * width);
        int i11 = (int) (height * width);
        int iB = (int) (dVar.b() * width);
        int iC = (int) (dVar.c() * width);
        Rect rect3 = new Rect(iB, iC, i10 + iB, i11 + iC);
        if (bVar.f58616f == b.a.NO_BLEND) {
            canvas.drawRect(rect3, this.f60840l);
        }
        synchronized (this) {
            Bitmap bitmapO = o(width2, height);
            dVar.a(width2, height, bitmapO);
            canvas.drawBitmap(bitmapO, rect2, rect3, (Paint) null);
        }
    }

    private void s(Canvas canvas, r6.d dVar, r6.b bVar, r6.b bVar2) {
        float f10;
        float f11;
        float f12;
        float f13;
        int width = this.f60831c.getWidth();
        int height = this.f60831c.getHeight();
        float f14 = width;
        float f15 = height;
        int width2 = dVar.getWidth();
        int height2 = dVar.getHeight();
        int iB = dVar.b();
        int iC = dVar.c();
        if (f14 > canvas.getWidth() || f15 > canvas.getHeight()) {
            int iMin = Math.min(canvas.getWidth(), width);
            int iMin2 = Math.min(canvas.getHeight(), height);
            float f16 = f14 / f15;
            if (iMin > iMin2) {
                f11 = iMin;
                f10 = f11 / f16;
            } else {
                f10 = iMin2;
                f11 = f10 * f16;
            }
            f12 = f11 / f14;
            f13 = f10 / f15;
            width2 = (int) Math.ceil(dVar.getWidth() * f12);
            height2 = (int) Math.ceil(dVar.getHeight() * f13);
            iB = (int) Math.ceil(dVar.b() * f12);
            iC = (int) Math.ceil(dVar.c() * f13);
        } else {
            f12 = 1.0f;
            f13 = 1.0f;
        }
        Rect rect = new Rect(0, 0, width2, height2);
        Rect rect2 = new Rect(iB, iC, iB + width2, iC + height2);
        if (bVar2 != null) {
            n(canvas, f12, f13, bVar2);
        }
        if (bVar.f58616f == b.a.NO_BLEND) {
            canvas.drawRect(rect2, this.f60840l);
        }
        synchronized (this) {
            Bitmap bitmapO = o(width2, height2);
            dVar.a(width2, height2, bitmapO);
            canvas.drawBitmap(bitmapO, rect, rect2, (Paint) null);
        }
    }

    @Override // r6.InterfaceC6273a
    public int a() {
        return this.f60831c.a();
    }

    @Override // r6.InterfaceC6273a
    public int b() {
        return this.f60831c.b();
    }

    @Override // r6.InterfaceC6273a
    public r6.b c(int i10) {
        return this.f60836h[i10];
    }

    @Override // r6.InterfaceC6273a
    public int d() {
        return this.f60835g;
    }

    @Override // r6.InterfaceC6273a
    public void e(int i10, Canvas canvas) {
        r6.d dVarF = this.f60831c.f(i10);
        try {
            if (dVarF.getWidth() > 0 && dVarF.getHeight() > 0) {
                if (this.f60831c.d()) {
                    q(canvas, dVarF);
                } else {
                    p(canvas, dVarF);
                }
                dVarF.dispose();
            }
        } finally {
            dVarF.dispose();
        }
    }

    @Override // r6.InterfaceC6273a
    public InterfaceC6273a f(Rect rect) {
        return m(this.f60831c, rect).equals(this.f60832d) ? this : new C6645a(this.f60829a, this.f60830b, rect, this.f60839k);
    }

    @Override // r6.InterfaceC6273a
    public int g(int i10) {
        return this.f60833e[i10];
    }

    @Override // r6.InterfaceC6273a
    public int getHeight() {
        return this.f60831c.getHeight();
    }

    @Override // r6.InterfaceC6273a
    public int getWidth() {
        return this.f60831c.getWidth();
    }

    @Override // r6.InterfaceC6273a
    public int h() {
        return this.f60832d.height();
    }

    @Override // r6.InterfaceC6273a
    public void i(int i10, Canvas canvas) {
        r6.d dVarF = this.f60831c.f(i10);
        r6.b bVarC = this.f60831c.c(i10);
        r6.b bVarC2 = i10 == 0 ? null : this.f60831c.c(i10 - 1);
        try {
            if (dVarF.getWidth() > 0 && dVarF.getHeight() > 0) {
                if (this.f60831c.d()) {
                    s(canvas, dVarF, bVarC, bVarC2);
                } else {
                    r(canvas, dVarF, bVarC, bVarC2);
                }
                dVarF.dispose();
            }
        } finally {
            dVarF.dispose();
        }
    }

    @Override // r6.InterfaceC6273a
    public int j() {
        return this.f60832d.width();
    }

    @Override // r6.InterfaceC6273a
    public e k() {
        return this.f60830b;
    }
}

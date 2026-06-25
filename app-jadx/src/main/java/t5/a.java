package T5;

import U5.b;
import V5.q;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class a extends Drawable implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f17162a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f17163b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f17164c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f17165d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f17166e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f17167f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private q f17168g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f17170i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f17171j;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f17177p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f17178q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f17179r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f17180s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f17181t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private long f17182u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private String f17183v;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private HashMap f17169h = new HashMap();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f17172k = 80;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Paint f17173l = new Paint(1);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Matrix f17174m = new Matrix();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Rect f17175n = new Rect();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final RectF f17176o = new RectF();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f17184w = -1;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f17185x = 0;

    public a() {
        i();
    }

    private void c(Canvas canvas, String str, Object obj) {
        e(canvas, str, String.valueOf(obj), -1);
    }

    private void d(Canvas canvas, String str, String str2) {
        e(canvas, str, str2, -1);
    }

    private void e(Canvas canvas, String str, String str2, int i10) {
        String str3 = str + ": ";
        float fMeasureText = this.f17173l.measureText(str3);
        float fMeasureText2 = this.f17173l.measureText(str2);
        this.f17173l.setColor(1711276032);
        int i11 = this.f17180s;
        int i12 = this.f17181t;
        canvas.drawRect(i11 - 4, i12 + 8, i11 + fMeasureText + fMeasureText2 + 4.0f, i12 + this.f17179r + 8, this.f17173l);
        this.f17173l.setColor(-1);
        canvas.drawText(str3, this.f17180s, this.f17181t, this.f17173l);
        this.f17173l.setColor(i10);
        canvas.drawText(str2, this.f17180s + fMeasureText, this.f17181t, this.f17173l);
        this.f17181t += this.f17179r;
    }

    private static String g(String str, Object... objArr) {
        return objArr == null ? str : String.format(Locale.US, str, objArr);
    }

    private void h(Rect rect, int i10, int i11) {
        int iMin = Math.min(40, Math.max(10, Math.min(rect.width() / i11, rect.height() / i10)));
        this.f17173l.setTextSize(iMin);
        int i12 = iMin + 8;
        this.f17179r = i12;
        int i13 = this.f17172k;
        if (i13 == 80) {
            this.f17179r = i12 * (-1);
        }
        this.f17177p = rect.left + 10;
        this.f17178q = i13 == 80 ? rect.bottom - 10 : rect.top + 20;
    }

    @Override // U5.b
    public void a(long j10) {
        this.f17182u = j10;
        invalidateSelf();
    }

    public void b(String str, String str2) {
        this.f17169h.put(str, str2);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        this.f17173l.setStyle(Paint.Style.STROKE);
        this.f17173l.setStrokeWidth(2.0f);
        this.f17173l.setColor(-26624);
        canvas.drawRect(bounds.left, bounds.top, bounds.right, bounds.bottom, this.f17173l);
        Paint paint = this.f17173l;
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        this.f17173l.setColor(this.f17185x);
        canvas.drawRect(bounds.left, bounds.top, bounds.right, bounds.bottom, this.f17173l);
        this.f17173l.setStyle(style);
        this.f17173l.setStrokeWidth(0.0f);
        this.f17173l.setColor(-1);
        this.f17180s = this.f17177p;
        this.f17181t = this.f17178q;
        String str = this.f17163b;
        if (str != null) {
            d(canvas, "IDs", g("%s, %s", this.f17162a, str));
        } else {
            d(canvas, "ID", this.f17162a);
        }
        d(canvas, "D", g("%dx%d", Integer.valueOf(bounds.width()), Integer.valueOf(bounds.height())));
        if (bounds.height() > 0) {
            c(canvas, "DAR", Float.valueOf(bounds.width() / bounds.height()));
        }
        e(canvas, "I", g("%dx%d", Integer.valueOf(this.f17164c), Integer.valueOf(this.f17165d)), f(this.f17164c, this.f17165d, this.f17168g));
        int i10 = this.f17165d;
        if (i10 > 0) {
            c(canvas, "IAR", Float.valueOf(this.f17164c / i10));
        }
        d(canvas, "I", g("%d KiB", Integer.valueOf(this.f17166e / IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET)));
        String str2 = this.f17167f;
        if (str2 != null) {
            d(canvas, "i format", str2);
        }
        int i11 = this.f17170i;
        if (i11 > 0) {
            d(canvas, "anim", g("f %d, l %d", Integer.valueOf(i11), Integer.valueOf(this.f17171j)));
        }
        q qVar = this.f17168g;
        if (qVar != null) {
            c(canvas, "scale", qVar);
        }
        long j10 = this.f17182u;
        if (j10 >= 0) {
            d(canvas, "t", g("%d ms", Long.valueOf(j10)));
        }
        String str3 = this.f17183v;
        if (str3 != null) {
            e(canvas, "origin", str3, this.f17184w);
        }
        for (Map.Entry entry : this.f17169h.entrySet()) {
            d(canvas, (String) entry.getKey(), (String) entry.getValue());
        }
    }

    int f(int i10, int i11, q qVar) {
        int i12;
        int i13;
        int iWidth = getBounds().width();
        int iHeight = getBounds().height();
        if (iWidth > 0 && iHeight > 0 && i10 > 0 && i11 > 0) {
            if (qVar != null) {
                Rect rect = this.f17175n;
                rect.top = 0;
                rect.left = 0;
                rect.right = iWidth;
                rect.bottom = iHeight;
                this.f17174m.reset();
                i12 = i10;
                i13 = i11;
                qVar.a(this.f17174m, this.f17175n, i12, i13, 0.0f, 0.0f);
                RectF rectF = this.f17176o;
                rectF.top = 0.0f;
                rectF.left = 0.0f;
                rectF.right = i12;
                rectF.bottom = i13;
                this.f17174m.mapRect(rectF);
                int iWidth2 = (int) this.f17176o.width();
                int iHeight2 = (int) this.f17176o.height();
                iWidth = Math.min(iWidth, iWidth2);
                iHeight = Math.min(iHeight, iHeight2);
            } else {
                i12 = i10;
                i13 = i11;
            }
            float f10 = iWidth;
            float f11 = f10 * 0.1f;
            float f12 = f10 * 0.5f;
            float f13 = iHeight;
            float f14 = 0.1f * f13;
            float f15 = f13 * 0.5f;
            int iAbs = Math.abs(i12 - iWidth);
            int iAbs2 = Math.abs(i13 - iHeight);
            float f16 = iAbs;
            if (f16 < f11 && iAbs2 < f14) {
                return -16711936;
            }
            if (f16 < f12 && iAbs2 < f15) {
                return -256;
            }
        }
        return -65536;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public void i() {
        this.f17164c = -1;
        this.f17165d = -1;
        this.f17166e = -1;
        this.f17169h = new HashMap();
        this.f17170i = -1;
        this.f17171j = -1;
        this.f17167f = null;
        j(null);
        this.f17182u = -1L;
        this.f17183v = null;
        this.f17184w = -1;
        invalidateSelf();
    }

    public void j(String str) {
        if (str == null) {
            str = "none";
        }
        this.f17162a = str;
        invalidateSelf();
    }

    public void k(int i10, int i11) {
        this.f17164c = i10;
        this.f17165d = i11;
        invalidateSelf();
    }

    public void l(int i10) {
        this.f17166e = i10;
    }

    public void m(q qVar) {
        this.f17168g = qVar;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        h(rect, 9, 8);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }
}

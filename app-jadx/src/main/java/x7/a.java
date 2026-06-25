package X7;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.DrawFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PaintFlagsDrawFilter;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.github.penfeizhou.animation.decode.b;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class a extends Drawable implements Animatable, b.j {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f21670l = "a";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Paint f21671a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.github.penfeizhou.animation.decode.b f21672b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final DrawFilter f21673c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Matrix f21674d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Set f21675e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Bitmap f21676f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Handler f21677g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Runnable f21678h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f21679i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Set f21680j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f21681k;

    /* JADX INFO: renamed from: X7.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class HandlerC0375a extends Handler {
        HandlerC0375a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == 1) {
                Iterator it = new ArrayList(a.this.f21675e).iterator();
                while (it.hasNext()) {
                    ((androidx.vectordrawable.graphics.drawable.b) it.next()).c(a.this);
                }
            } else {
                if (i10 != 2) {
                    return;
                }
                Iterator it2 = new ArrayList(a.this.f21675e).iterator();
                while (it2.hasNext()) {
                    ((androidx.vectordrawable.graphics.drawable.b) it2.next()).b(a.this);
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.invalidateSelf();
        }
    }

    public a(com.github.penfeizhou.animation.decode.b bVar) {
        Paint paint = new Paint();
        this.f21671a = paint;
        this.f21673c = new PaintFlagsDrawFilter(0, 3);
        this.f21674d = new Matrix();
        this.f21675e = new HashSet();
        this.f21677g = new HandlerC0375a(Looper.getMainLooper());
        this.f21678h = new b();
        this.f21679i = true;
        this.f21680j = new HashSet();
        this.f21681k = false;
        paint.setAntiAlias(true);
        this.f21672b = bVar;
    }

    private void f() {
        ArrayList arrayList = new ArrayList();
        Drawable.Callback callback = getCallback();
        boolean z10 = false;
        for (WeakReference weakReference : new HashSet(this.f21680j)) {
            Drawable.Callback callback2 = (Drawable.Callback) weakReference.get();
            if (callback2 == null) {
                arrayList.add(weakReference);
            } else if (callback2 == callback) {
                z10 = true;
            } else {
                callback2.invalidateDrawable(this);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            this.f21680j.remove((WeakReference) it.next());
        }
        if (z10) {
            return;
        }
        this.f21680j.add(new WeakReference(callback));
    }

    private void g() {
        this.f21672b.p(this);
        if (this.f21679i) {
            this.f21672b.S();
        } else {
            if (this.f21672b.H()) {
                return;
            }
            this.f21672b.S();
        }
    }

    private void h() {
        this.f21672b.N(this);
        if (this.f21679i) {
            this.f21672b.U();
        } else {
            this.f21672b.V();
        }
    }

    @Override // com.github.penfeizhou.animation.decode.b.j
    public void a(ByteBuffer byteBuffer) {
        if (isRunning()) {
            Bitmap bitmap = this.f21676f;
            if (bitmap == null || bitmap.isRecycled()) {
                this.f21676f = Bitmap.createBitmap(this.f21672b.s().width() / this.f21672b.B(), this.f21672b.s().height() / this.f21672b.B(), Bitmap.Config.ARGB_8888);
            }
            byteBuffer.rewind();
            if (byteBuffer.remaining() < this.f21676f.getByteCount()) {
                Log.e(f21670l, "onRender:Buffer not large enough for pixels");
            } else {
                this.f21676f.copyPixelsFromBuffer(byteBuffer);
                this.f21677g.post(this.f21678h);
            }
        }
    }

    @Override // com.github.penfeizhou.animation.decode.b.j
    public void b() {
        Message.obtain(this.f21677g, 1).sendToTarget();
    }

    @Override // com.github.penfeizhou.animation.decode.b.j
    public void c() {
        Message.obtain(this.f21677g, 2).sendToTarget();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Bitmap bitmap = this.f21676f;
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        canvas.setDrawFilter(this.f21673c);
        canvas.drawBitmap(this.f21676f, this.f21674d, this.f21671a);
    }

    public int e() {
        int iY = this.f21672b.y();
        Bitmap bitmap = this.f21676f;
        if (bitmap != null && !bitmap.isRecycled()) {
            iY += this.f21676f.getAllocationByteCount();
        }
        return Math.max(1, iY);
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.Callback getCallback() {
        return super.getCallback();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        if (this.f21681k) {
            return -1;
        }
        try {
            return this.f21672b.s().height();
        } catch (Exception unused) {
            return 0;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        if (this.f21681k) {
            return -1;
        }
        try {
            return this.f21672b.s().width();
        } catch (Exception unused) {
            return 0;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public boolean i() {
        return this.f21672b.G();
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        super.invalidateSelf();
        Iterator it = new HashSet(this.f21680j).iterator();
        while (it.hasNext()) {
            Drawable.Callback callback = (Drawable.Callback) ((WeakReference) it.next()).get();
            if (callback != null && callback != getCallback()) {
                callback.invalidateDrawable(this);
            }
        }
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.f21672b.H();
    }

    public void j() {
        this.f21672b.J();
    }

    public void k() {
        this.f21672b.Q();
    }

    public void l(boolean z10) {
        this.f21679i = z10;
    }

    public void m(boolean z10) {
        this.f21681k = z10;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f21671a.setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(int i10, int i11, int i12, int i13) {
        super.setBounds(i10, i11, i12, i13);
        int iB = this.f21672b.B();
        int iR = this.f21672b.R(getBounds().width(), getBounds().height());
        float f10 = iR;
        this.f21674d.setScale(((getBounds().width() * 1.0f) * f10) / this.f21672b.s().width(), ((getBounds().height() * 1.0f) * f10) / this.f21672b.s().height());
        if (iR != iB) {
            this.f21676f = Bitmap.createBitmap(this.f21672b.s().width() / iR, this.f21672b.s().height() / iR, Bitmap.Config.ARGB_8888);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f21671a.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        f();
        if (this.f21679i) {
            if (z10) {
                if (!isRunning()) {
                    g();
                }
            } else if (isRunning()) {
                h();
            }
        }
        return super.setVisible(z10, z11);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        if (this.f21672b.H()) {
            this.f21672b.U();
        }
        this.f21672b.P();
        g();
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        h();
    }
}

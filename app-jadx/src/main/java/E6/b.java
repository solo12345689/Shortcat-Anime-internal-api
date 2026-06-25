package E6;

import android.graphics.Bitmap;
import com.facebook.imageutils.BitmapUtil;
import com.revenuecat.purchases.ui.revenuecatui.components.SensibleDefaults;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class b extends a implements f {

    /* JADX INFO: renamed from: i */
    private static boolean f5663i = false;

    /* JADX INFO: renamed from: d */
    private C5.a f5664d;

    /* JADX INFO: renamed from: e */
    private volatile Bitmap f5665e;

    /* JADX INFO: renamed from: f */
    private final p f5666f;

    /* JADX INFO: renamed from: g */
    private final int f5667g;

    /* JADX INFO: renamed from: h */
    private final int f5668h;

    protected b(Bitmap bitmap, C5.h hVar, p pVar, int i10, int i11) {
        this.f5665e = (Bitmap) y5.k.g(bitmap);
        this.f5664d = C5.a.S(this.f5665e, (C5.h) y5.k.g(hVar));
        this.f5666f = pVar;
        this.f5667g = i10;
        this.f5668h = i11;
    }

    private synchronized C5.a H() {
        C5.a aVar;
        aVar = this.f5664d;
        this.f5664d = null;
        this.f5665e = null;
        return aVar;
    }

    private static int J(Bitmap bitmap) {
        if (bitmap == null) {
            return 0;
        }
        return bitmap.getHeight();
    }

    private static int O(Bitmap bitmap) {
        if (bitmap == null) {
            return 0;
        }
        return bitmap.getWidth();
    }

    public static boolean S() {
        return f5663i;
    }

    @Override // E6.e
    public int A() {
        return BitmapUtil.getSizeInBytes(this.f5665e);
    }

    @Override // E6.d
    public Bitmap G1() {
        return this.f5665e;
    }

    @Override // E6.f
    public int U0() {
        return this.f5668h;
    }

    @Override // E6.f
    public synchronized C5.a X() {
        return C5.a.j(this.f5664d);
    }

    @Override // E6.e, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        C5.a aVarH = H();
        if (aVarH != null) {
            aVarH.close();
        }
    }

    @Override // E6.e, E6.m
    public int getHeight() {
        int i10;
        return (this.f5667g % SensibleDefaults.X_OFFSET != 0 || (i10 = this.f5668h) == 5 || i10 == 7) ? O(this.f5665e) : J(this.f5665e);
    }

    @Override // E6.e, E6.m
    public int getWidth() {
        int i10;
        return (this.f5667g % SensibleDefaults.X_OFFSET != 0 || (i10 = this.f5668h) == 5 || i10 == 7) ? J(this.f5665e) : O(this.f5665e);
    }

    @Override // E6.f
    public int h1() {
        return this.f5667g;
    }

    @Override // E6.e
    public synchronized boolean isClosed() {
        return this.f5664d == null;
    }

    @Override // E6.a, E6.e
    public p x1() {
        return this.f5666f;
    }

    protected b(C5.a aVar, p pVar, int i10, int i11) {
        C5.a aVar2 = (C5.a) y5.k.g(aVar.h());
        this.f5664d = aVar2;
        this.f5665e = (Bitmap) aVar2.C();
        this.f5666f = pVar;
        this.f5667g = i10;
        this.f5668h = i11;
    }
}

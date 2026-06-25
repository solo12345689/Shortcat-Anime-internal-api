package H6;

import android.graphics.Bitmap;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class t implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final A f8006a = new j();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f8007b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f8008c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final F f8009d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f8010e;

    public t(int i10, int i11, F f10, B5.d dVar) {
        this.f8007b = i10;
        this.f8008c = i11;
        this.f8009d = f10;
        if (dVar != null) {
            dVar.a(this);
        }
    }

    private Bitmap h(int i10) {
        this.f8009d.d(i10);
        return Bitmap.createBitmap(1, i10, Bitmap.Config.ALPHA_8);
    }

    private synchronized void k(int i10) {
        Bitmap bitmap;
        while (this.f8010e > i10 && (bitmap = (Bitmap) this.f8006a.pop()) != null) {
            int iA = this.f8006a.a(bitmap);
            this.f8010e -= iA;
            this.f8009d.b(iA);
        }
    }

    @Override // B5.f
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public synchronized Bitmap get(int i10) {
        try {
            int i11 = this.f8010e;
            int i12 = this.f8007b;
            if (i11 > i12) {
                k(i12);
            }
            Bitmap bitmap = (Bitmap) this.f8006a.get(i10);
            if (bitmap == null) {
                return h(i10);
            }
            int iA = this.f8006a.a(bitmap);
            this.f8010e -= iA;
            this.f8009d.e(iA);
            return bitmap;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // B5.f, C5.h
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public void a(Bitmap bitmap) {
        int iA = this.f8006a.a(bitmap);
        if (iA <= this.f8008c) {
            this.f8009d.c(iA);
            this.f8006a.put(bitmap);
            synchronized (this) {
                this.f8010e += iA;
            }
        }
    }
}

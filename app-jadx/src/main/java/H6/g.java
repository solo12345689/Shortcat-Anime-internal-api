package H6;

import android.graphics.Bitmap;
import com.facebook.imageutils.BitmapUtil;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f7978a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f7979b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f7980c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f7981d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final C5.h f7982e;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a implements C5.h {
        a() {
        }

        @Override // C5.h
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(Bitmap bitmap) {
            try {
                g.this.a(bitmap);
            } finally {
                bitmap.recycle();
            }
        }
    }

    public g(int i10, int i11) {
        y5.k.b(Boolean.valueOf(i10 > 0));
        y5.k.b(Boolean.valueOf(i11 > 0));
        this.f7980c = i10;
        this.f7981d = i11;
        this.f7982e = new a();
    }

    public synchronized void a(Bitmap bitmap) {
        int sizeInBytes = BitmapUtil.getSizeInBytes(bitmap);
        y5.k.c(this.f7978a > 0, "No bitmaps registered.");
        long j10 = sizeInBytes;
        y5.k.d(j10 <= this.f7979b, "Bitmap size bigger than the total registered size: %d, %d", Integer.valueOf(sizeInBytes), Long.valueOf(this.f7979b));
        this.f7979b -= j10;
        this.f7978a--;
    }

    public synchronized int b() {
        return this.f7978a;
    }

    public synchronized int c() {
        return this.f7980c;
    }

    public synchronized int d() {
        return this.f7981d;
    }

    public C5.h e() {
        return this.f7982e;
    }

    public synchronized long f() {
        return this.f7979b;
    }

    public synchronized boolean g(Bitmap bitmap) {
        int sizeInBytes = BitmapUtil.getSizeInBytes(bitmap);
        int i10 = this.f7978a;
        if (i10 < this.f7980c) {
            long j10 = this.f7979b;
            long j11 = sizeInBytes;
            if (j10 + j11 <= this.f7981d) {
                this.f7978a = i10 + 1;
                this.f7979b = j10 + j11;
                return true;
            }
        }
        return false;
    }
}

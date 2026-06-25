package H6;

import android.graphics.Bitmap;
import com.facebook.imageutils.BitmapUtil;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import z5.AbstractC7283a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class j extends u {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f7988c = new a(null);

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Override // H6.u, H6.A
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public Bitmap get(int i10) {
        Bitmap bitmap = (Bitmap) super.get(i10);
        if (bitmap == null || !e(bitmap)) {
            return null;
        }
        bitmap.eraseColor(0);
        return bitmap;
    }

    @Override // H6.A
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public int a(Bitmap bitmap) {
        AbstractC5504s.h(bitmap, "bitmap");
        return BitmapUtil.getSizeInBytes(bitmap);
    }

    protected final boolean e(Bitmap bitmap) {
        if (bitmap == null) {
            return false;
        }
        if (bitmap.isRecycled()) {
            AbstractC7283a.N("BitmapPoolBackend", "Cannot reuse a recycled bitmap: %s", bitmap);
            return false;
        }
        if (bitmap.isMutable()) {
            return true;
        }
        AbstractC7283a.N("BitmapPoolBackend", "Cannot reuse an immutable bitmap: %s", bitmap);
        return false;
    }

    @Override // H6.u, H6.A
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void put(Bitmap bitmap) {
        AbstractC5504s.h(bitmap, "bitmap");
        if (e(bitmap)) {
            super.put(bitmap);
        }
    }
}

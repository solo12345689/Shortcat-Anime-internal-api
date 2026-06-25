package androidx.media3.exoplayer.hls;

import android.net.Uri;
import java.util.LinkedHashMap;
import java.util.Map;
import t2.AbstractC6614a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LinkedHashMap f30830a;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a extends LinkedHashMap {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f30831a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i10, float f10, boolean z10, int i11) {
            super(i10, f10, z10);
            this.f30831a = i11;
        }

        @Override // java.util.LinkedHashMap
        protected boolean removeEldestEntry(Map.Entry entry) {
            return size() > this.f30831a;
        }
    }

    public b(int i10) {
        this.f30830a = new a(i10 + 1, 1.0f, false, i10);
    }

    public byte[] a(Uri uri) {
        if (uri == null) {
            return null;
        }
        return (byte[]) this.f30830a.get(uri);
    }

    public byte[] b(Uri uri, byte[] bArr) {
        return (byte[]) this.f30830a.put((Uri) AbstractC6614a.e(uri), (byte[]) AbstractC6614a.e(bArr));
    }

    public byte[] c(Uri uri) {
        return (byte[]) this.f30830a.remove(AbstractC6614a.e(uri));
    }
}

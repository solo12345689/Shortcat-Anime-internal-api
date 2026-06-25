package W4;

import W4.d;
import android.content.Context;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class f extends d {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a implements d.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f20712a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f20713b;

        a(Context context, String str) {
            this.f20712a = context;
            this.f20713b = str;
        }

        @Override // W4.d.a
        public File a() {
            File cacheDir = this.f20712a.getCacheDir();
            if (cacheDir == null) {
                return null;
            }
            return this.f20713b != null ? new File(cacheDir, this.f20713b) : cacheDir;
        }
    }

    public f(Context context) {
        this(context, "image_manager_disk_cache", 262144000L);
    }

    public f(Context context, String str, long j10) {
        super(new a(context, str), j10);
    }
}

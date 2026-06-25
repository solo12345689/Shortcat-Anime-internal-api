package T7;

import android.content.Context;
import com.facebook.soloader.E;
import com.facebook.soloader.p;
import com.facebook.soloader.v;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class b implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f17321a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f17322b;

    public b(Context context, a aVar) {
        this.f17321a = context;
        this.f17322b = aVar;
    }

    @Override // T7.h
    public boolean a(UnsatisfiedLinkError unsatisfiedLinkError, E[] eArr) {
        String str = this.f17321a.getApplicationInfo().sourceDir;
        if (new File(str).exists()) {
            p.g("soloader.recovery.CheckBaseApkExists", "Base apk exists: " + str);
            return false;
        }
        StringBuilder sb2 = new StringBuilder("Base apk does not exist: ");
        sb2.append(str);
        sb2.append(". ");
        this.f17322b.b(sb2);
        throw new v(sb2.toString(), unsatisfiedLinkError);
    }
}

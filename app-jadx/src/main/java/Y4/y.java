package Y4;

import Y4.n;
import android.net.Uri;
import com.adjust.sdk.Constants;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class y implements n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Set f22857b = Collections.unmodifiableSet(new HashSet(Arrays.asList("http", Constants.SCHEME)));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final n f22858a;

    public y(n nVar) {
        this.f22858a = nVar;
    }

    @Override // Y4.n
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public n.a b(Uri uri, int i10, int i11, S4.h hVar) {
        return this.f22858a.b(new h(uri.toString()), i10, i11, hVar);
    }

    @Override // Y4.n
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(Uri uri) {
        return f22857b.contains(uri.getScheme());
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static class a implements o {
        @Override // Y4.o
        public n d(r rVar) {
            return new y(rVar.d(h.class, InputStream.class));
        }

        @Override // Y4.o
        public void teardown() {
        }
    }
}

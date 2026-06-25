package D4;

import G4.m;
import android.net.Uri;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class g implements d {
    @Override // D4.d
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Uri a(String str, m mVar) {
        Uri uri = Uri.parse(str);
        AbstractC5504s.g(uri, "parse(this)");
        return uri;
    }
}

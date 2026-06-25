package C4;

import G4.m;
import L4.j;
import android.net.Uri;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class c implements b {
    @Override // C4.b
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public String a(Uri uri, m mVar) {
        if (!AbstractC5504s.c(uri.getScheme(), "android.resource")) {
            return uri.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(uri);
        sb2.append('-');
        sb2.append(j.k(mVar.g().getResources().getConfiguration()));
        return sb2.toString();
    }
}

package D4;

import G4.m;
import android.content.Context;
import android.net.Uri;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class e implements d {
    private final boolean b(int i10, Context context) {
        return context.getResources().getResourceEntryName(i10) != null;
    }

    @Override // D4.d
    public /* bridge */ /* synthetic */ Object a(Object obj, m mVar) {
        return c(((Number) obj).intValue(), mVar);
    }

    public Uri c(int i10, m mVar) {
        if (!b(i10, mVar.g())) {
            return null;
        }
        Uri uri = Uri.parse("android.resource://" + mVar.g().getPackageName() + '/' + i10);
        AbstractC5504s.g(uri, "parse(this)");
        return uri;
    }
}

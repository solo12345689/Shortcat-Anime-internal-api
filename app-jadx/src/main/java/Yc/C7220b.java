package yc;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import sb.i;
import yc.C7219a;

/* JADX INFO: renamed from: yc.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C7220b implements i {
    private final void f(Uri uri) {
        if (uri == null) {
            return;
        }
        C7219a.Companion companion = C7219a.INSTANCE;
        companion.b(uri);
        Iterator it = companion.a().iterator();
        while (it.hasNext()) {
            ((Function1) it.next()).invoke(uri);
        }
    }

    @Override // sb.i
    public void a(Activity activity, Bundle bundle) {
        Intent intent;
        f((activity == null || (intent = activity.getIntent()) == null) ? null : intent.getData());
    }

    @Override // sb.i
    public boolean onNewIntent(Intent intent) {
        f(intent != null ? intent.getData() : null);
        return true;
    }
}

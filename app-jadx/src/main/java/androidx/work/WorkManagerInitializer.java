package androidx.work;

import android.content.Context;
import androidx.work.a;
import i4.i;
import i4.t;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class WorkManagerInitializer implements V3.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f32642a = i.i("WrkMgrInitializer");

    @Override // V3.a
    public List a() {
        return Collections.EMPTY_LIST;
    }

    @Override // V3.a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public t b(Context context) {
        i.e().a(f32642a, "Initializing WorkManager with default configuration.");
        t.i(context, new a.b().a());
        return t.h(context);
    }
}

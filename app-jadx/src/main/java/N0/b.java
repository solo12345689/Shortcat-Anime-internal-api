package N0;

import android.view.autofill.AutofillId;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f12570a;

    private b(AutofillId autofillId) {
        this.f12570a = autofillId;
    }

    public static b b(AutofillId autofillId) {
        return new b(autofillId);
    }

    public AutofillId a() {
        return a.a(this.f12570a);
    }
}

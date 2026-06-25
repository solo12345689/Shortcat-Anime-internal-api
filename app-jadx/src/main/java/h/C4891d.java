package h;

import android.content.Context;
import android.content.Intent;
import g.C4811a;
import g.C4818h;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: h.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C4891d extends AbstractC4888a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f47540a = new a(null);

    /* JADX INFO: renamed from: h.d$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Override // h.AbstractC4888a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Intent createIntent(Context context, C4818h input) {
        AbstractC5504s.h(context, "context");
        AbstractC5504s.h(input, "input");
        Intent intentPutExtra = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", input);
        AbstractC5504s.g(intentPutExtra, "Intent(ACTION_INTENT_SEN…NT_SENDER_REQUEST, input)");
        return intentPutExtra;
    }

    @Override // h.AbstractC4888a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C4811a parseResult(int i10, Intent intent) {
        return new C4811a(i10, intent);
    }
}

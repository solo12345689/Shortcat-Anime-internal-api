package h;

import android.content.Context;
import android.content.Intent;
import g.C4811a;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: h.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C4890c extends AbstractC4888a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f47539a = new a(null);

    /* JADX INFO: renamed from: h.c$a */
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
    public Intent createIntent(Context context, Intent input) {
        AbstractC5504s.h(context, "context");
        AbstractC5504s.h(input, "input");
        return input;
    }

    @Override // h.AbstractC4888a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C4811a parseResult(int i10, Intent intent) {
        return new C4811a(i10, intent);
    }
}

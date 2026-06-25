package P7;

import android.text.SpannableStringBuilder;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import z5.AbstractC7283a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class p {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f13537d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f13538a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f13539b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k f13540c;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public p(int i10, int i11, k what) {
        AbstractC5504s.h(what, "what");
        this.f13538a = i10;
        this.f13539b = i11;
        this.f13540c = what;
    }

    public final void a(SpannableStringBuilder builder, int i10) {
        AbstractC5504s.h(builder, "builder");
        if (i10 < 0) {
            throw new IllegalStateException("Check failed.");
        }
        int i11 = this.f13538a == 0 ? 18 : 34;
        int i12 = 255 - i10;
        if (i12 < 0) {
            AbstractC7283a.I("SetSpanOperation", "Text tree size exceeded the limit, styling may become unpredictable");
        }
        builder.setSpan(this.f13540c, this.f13538a, this.f13539b, ((Math.max(i12, 0) << 16) & 16711680) | (i11 & (-16711681)));
    }
}

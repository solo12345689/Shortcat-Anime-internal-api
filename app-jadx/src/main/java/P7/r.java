package P7;

import android.graphics.drawable.Drawable;
import android.text.Spannable;
import android.text.style.ReplacementSpan;
import android.widget.TextView;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class r extends ReplacementSpan implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f13545a = new a(null);

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(Spannable spannable, TextView textView) {
            AbstractC5504s.h(spannable, "spannable");
            Object[] spans = spannable.getSpans(0, spannable.length(), r.class);
            AbstractC5504s.g(spans, "getSpans(...)");
            for (Object obj : spans) {
                r rVar = (r) obj;
                rVar.c();
                rVar.g(textView);
            }
        }

        private a() {
        }
    }

    public abstract Drawable a();

    public abstract int b();

    public abstract void c();

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public abstract void g(TextView textView);
}

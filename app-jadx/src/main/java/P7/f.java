package P7;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.uimanager.f0;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class f extends ClickableSpan implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f13529a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f13530b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f13531c;

    public f(int i10) {
        this.f13529a = i10;
    }

    public final void a(int i10) {
        this.f13531c = i10;
    }

    public final void b(boolean z10) {
        this.f13530b = z10;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(View view) {
        AbstractC5504s.h(view, "view");
        Context context = view.getContext();
        AbstractC5504s.f(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        ReactContext reactContext = (ReactContext) context;
        EventDispatcher eventDispatcherC = f0.c(reactContext, this.f13529a);
        if (eventDispatcherC != null) {
            eventDispatcherC.d(new com.facebook.react.views.view.i(f0.e(reactContext), this.f13529a));
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(TextPaint ds) {
        AbstractC5504s.h(ds, "ds");
        if (this.f13530b) {
            ds.bgColor = this.f13531c;
        }
    }
}

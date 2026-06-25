package P7;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.uimanager.f0;
import com.facebook.react.views.text.PreparedLayout;
import com.facebook.react.views.text.PreparedLayoutTextView;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class i extends ClickableSpan implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f13533a;

    public i(int i10) {
        this.f13533a = i10;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(View view) {
        PreparedLayout preparedLayout;
        int i10;
        EventDispatcher eventDispatcherC;
        AbstractC5504s.h(view, "view");
        Context context = view.getContext();
        AbstractC5504s.f(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        ReactContext reactContext = (ReactContext) context;
        PreparedLayoutTextView preparedLayoutTextView = view instanceof PreparedLayoutTextView ? (PreparedLayoutTextView) view : null;
        if (preparedLayoutTextView == null || (preparedLayout = preparedLayoutTextView.getPreparedLayout()) == null || (eventDispatcherC = f0.c(reactContext, (i10 = preparedLayout.getReactTags()[this.f13533a]))) == null) {
            return;
        }
        eventDispatcherC.d(new com.facebook.react.views.view.i(f0.e(reactContext), i10));
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(TextPaint ds) {
        AbstractC5504s.h(ds, "ds");
    }
}

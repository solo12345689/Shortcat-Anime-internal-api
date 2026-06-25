package com.facebook.react.views.unimplementedview;

import android.content.Context;
import android.widget.LinearLayout;
import androidx.appcompat.widget.D;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class a extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final D f38478a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context) {
        super(context);
        AbstractC5504s.h(context, "context");
        D d10 = new D(context);
        this.f38478a = d10;
        d10.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        d10.setGravity(17);
        d10.setTextColor(-1);
        d10.setText("");
        if (Y6.a.f22860b) {
            setBackgroundColor(1442775040);
        }
        setGravity(1);
        setOrientation(1);
        addView(d10);
    }

    public final void setName$ReactAndroid_release(String name) {
        AbstractC5504s.h(name, "name");
        if (Y6.a.f22860b) {
            this.f38478a.setText("'" + name + "' is not registered.");
        }
    }
}

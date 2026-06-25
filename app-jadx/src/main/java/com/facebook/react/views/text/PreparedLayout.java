package com.facebook.react.views.text;

import android.text.Layout;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0010\b\u0001\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/facebook/react/views/text/PreparedLayout;", "", "Landroid/text/Layout;", "layout", "", "maximumNumberOfLines", "", "verticalOffset", "", "reactTags", "<init>", "(Landroid/text/Layout;IF[I)V", "a", "Landroid/text/Layout;", "()Landroid/text/Layout;", "b", "I", "()I", "c", "F", "d", "()F", "[I", "()[I", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PreparedLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Layout layout;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int maximumNumberOfLines;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final float verticalOffset;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final int[] reactTags;

    public PreparedLayout(Layout layout, int i10, float f10, int[] reactTags) {
        AbstractC5504s.h(layout, "layout");
        AbstractC5504s.h(reactTags, "reactTags");
        this.layout = layout;
        this.maximumNumberOfLines = i10;
        this.verticalOffset = f10;
        this.reactTags = reactTags;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Layout getLayout() {
        return this.layout;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getMaximumNumberOfLines() {
        return this.maximumNumberOfLines;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int[] getReactTags() {
        return this.reactTags;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final float getVerticalOffset() {
        return this.verticalOffset;
    }
}

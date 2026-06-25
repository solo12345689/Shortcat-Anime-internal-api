package com.facebook.react.views.view;

import android.view.View;
import com.facebook.yoga.p;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f38486a = new c();

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f38487a;

        static {
            int[] iArr = new int[p.values().length];
            try {
                iArr[p.EXACTLY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[p.AT_MOST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f38487a = iArr;
        }
    }

    private c() {
    }

    public static final int a(float f10, p mode) {
        AbstractC5504s.h(mode, "mode");
        int i10 = a.f38487a[mode.ordinal()];
        return i10 != 1 ? i10 != 2 ? View.MeasureSpec.makeMeasureSpec(0, 0) : View.MeasureSpec.makeMeasureSpec((int) f10, Integer.MIN_VALUE) : View.MeasureSpec.makeMeasureSpec((int) f10, 1073741824);
    }
}

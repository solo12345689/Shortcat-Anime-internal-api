package com.swmansion.rnscreens;

import android.view.View;
import android.view.ViewParent;
import be.AbstractC3048a;
import com.facebook.react.bridge.ReactContext;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class d0 extends AbstractC4529g {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f44450g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f44451h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f44452i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private a f44453j;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f44454a = new a("LEFT", 0);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f44455b = new a("CENTER", 1);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f44456c = new a("RIGHT", 2);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final a f44457d = new a("BACK", 3);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final a f44458e = new a("SEARCH_BAR", 4);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final /* synthetic */ a[] f44459f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f44460g;

        static {
            a[] aVarArrA = a();
            f44459f = aVarArrA;
            f44460g = AbstractC3048a.a(aVarArrA);
        }

        private a(String str, int i10) {
        }

        private static final /* synthetic */ a[] a() {
            return new a[]{f44454a, f44455b, f44456c, f44457d, f44458e};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f44459f.clone();
        }
    }

    public d0(ReactContext reactContext) {
        super(reactContext);
        this.f44453j = a.f44454a;
    }

    public final a0 getConfig() {
        ViewParent parent = getParent();
        C4527e c4527e = parent instanceof C4527e ? (C4527e) parent : null;
        if (c4527e != null) {
            return c4527e.getConfig();
        }
        return null;
    }

    public final a getType() {
        return this.f44453j;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        if (z10) {
            int i14 = i12 - i10;
            int i15 = i13 - i11;
            if (this.f44452i) {
                b(i14, i15, i10, i11);
            }
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        if (View.MeasureSpec.getMode(i10) == 1073741824 && View.MeasureSpec.getMode(i11) == 1073741824) {
            this.f44450g = View.MeasureSpec.getSize(i10);
            this.f44451h = View.MeasureSpec.getSize(i11);
            this.f44452i = true;
            Object parent = getParent();
            if (parent != null) {
                forceLayout();
                ((View) parent).requestLayout();
            }
        }
        setMeasuredDimension(this.f44450g, this.f44451h);
    }

    public final void setType(a aVar) {
        AbstractC5504s.h(aVar, "<set-?>");
        this.f44453j = aVar;
    }
}

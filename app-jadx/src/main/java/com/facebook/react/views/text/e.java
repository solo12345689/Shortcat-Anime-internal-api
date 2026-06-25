package com.facebook.react.views.text;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f38245b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static e f38246c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final X6.a f38247a;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final e a() {
            e eVar = e.f38246c;
            if (eVar != null) {
                return eVar;
            }
            e eVar2 = new e(X6.a.f21660c.c(), null);
            e.f38246c = eVar2;
            return eVar2;
        }

        private a() {
        }
    }

    public /* synthetic */ e(X6.a aVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar);
    }

    public static final e c() {
        return f38245b.a();
    }

    public final Typeface d(String fontFamilyName, int i10, AssetManager assetManager) {
        AbstractC5504s.h(fontFamilyName, "fontFamilyName");
        AbstractC5504s.h(assetManager, "assetManager");
        return this.f38247a.d(fontFamilyName, i10, assetManager);
    }

    private e(X6.a aVar) {
        this.f38247a = aVar;
    }
}

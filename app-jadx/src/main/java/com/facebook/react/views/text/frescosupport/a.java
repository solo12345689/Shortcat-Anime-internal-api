package com.facebook.react.views.text.frescosupport;

import Df.r;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.uimanager.C3284b0;
import com.facebook.yoga.g;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import z5.AbstractC7283a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class a extends O7.a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final C0632a f38249i = new C0632a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final S5.b f38250a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f38251b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Uri f38252c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ReadableMap f38253d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f38254e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f38255f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f38256g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f38257h;

    /* JADX INFO: renamed from: com.facebook.react.views.text.frescosupport.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C0632a {
        public /* synthetic */ C0632a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Uri a(Context context, String str) {
            AbstractC5504s.h(context, "context");
            if (str == null || str.length() == 0) {
                return null;
            }
            Locale locale = Locale.getDefault();
            AbstractC5504s.g(locale, "getDefault(...)");
            String lowerCase = str.toLowerCase(locale);
            AbstractC5504s.g(lowerCase, "toLowerCase(...)");
            return new Uri.Builder().scheme("res").path(String.valueOf(context.getResources().getIdentifier(r.K(lowerCase, "-", "_", false, 4, null), "drawable", context.getPackageName()))).build();
        }

        private C0632a() {
        }
    }

    static {
        W6.b.a("FrescoBasedReactTextInlineImageShadowNode", W6.a.f20778b);
    }

    public a(S5.b draweeControllerBuilder, Object obj) {
        AbstractC5504s.h(draweeControllerBuilder, "draweeControllerBuilder");
        this.f38250a = draweeControllerBuilder;
        this.f38251b = obj;
        float f10 = g.f38662b;
        this.f38254e = f10;
        this.f38256g = f10;
    }

    @Override // O7.a
    public P7.r f() {
        Resources resources = getThemedContext().getResources();
        int iCeil = (int) Math.ceil(this.f38254e);
        int iCeil2 = (int) Math.ceil(this.f38256g);
        AbstractC5504s.e(resources);
        return new b(resources, iCeil2, iCeil, this.f38257h, j(), i(), h(), g(), this.f38255f);
    }

    public final Object g() {
        return this.f38251b;
    }

    public final S5.b h() {
        return this.f38250a;
    }

    public final ReadableMap i() {
        return this.f38253d;
    }

    @Override // com.facebook.react.uimanager.P, com.facebook.react.uimanager.O
    public boolean isVirtual() {
        return true;
    }

    public final Uri j() {
        return this.f38252c;
    }

    @B7.a(name = "headers")
    public final void setHeaders(ReadableMap readableMap) {
        this.f38253d = readableMap;
    }

    @Override // com.facebook.react.uimanager.r
    public void setHeight(Dynamic newHeight) {
        AbstractC5504s.h(newHeight, "newHeight");
        if (newHeight.getType() == ReadableType.Number) {
            this.f38256g = (float) newHeight.asDouble();
        } else {
            AbstractC7283a.I("ReactNative", "Inline images must not have percentage based height");
            this.f38256g = g.f38662b;
        }
    }

    @B7.a(name = "resizeMode")
    public final void setResizeMode(String str) {
        this.f38255f = str;
    }

    @B7.a(name = "src")
    public final void setSource(ReadableArray readableArray) {
        String string;
        Uri uriA = null;
        if (readableArray == null || readableArray.size() == 0 || readableArray.getType(0) != ReadableType.Map) {
            string = null;
        } else {
            ReadableMap map = readableArray.getMap(0);
            if (map == null) {
                throw new IllegalStateException("Required value was null.");
            }
            string = map.getString("uri");
        }
        if (string != null) {
            try {
                Uri uri = Uri.parse(string);
                if (uri.getScheme() != null) {
                    uriA = uri;
                }
            } catch (Exception unused) {
            }
            if (uriA == null) {
                C0632a c0632a = f38249i;
                C3284b0 themedContext = getThemedContext();
                AbstractC5504s.g(themedContext, "getThemedContext(...)");
                uriA = c0632a.a(themedContext, string);
            }
        }
        if (!AbstractC5504s.c(uriA, this.f38252c)) {
            markUpdated();
        }
        this.f38252c = uriA;
    }

    @B7.a(customType = "Color", name = "tintColor")
    public final void setTintColor(int i10) {
        this.f38257h = i10;
    }

    @Override // com.facebook.react.uimanager.r
    public void setWidth(Dynamic newWidth) {
        AbstractC5504s.h(newWidth, "newWidth");
        if (newWidth.getType() == ReadableType.Number) {
            this.f38254e = (float) newWidth.asDouble();
        } else {
            AbstractC7283a.I("ReactNative", "Inline images must not have percentage based width");
            this.f38254e = g.f38662b;
        }
    }
}

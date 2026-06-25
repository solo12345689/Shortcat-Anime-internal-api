package com.facebook.react.views.view;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.util.TypedValue;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.B;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f38488a = new d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final TypedValue f38489b = new TypedValue();

    private d() {
    }

    public static final Drawable a(Context context, ReadableMap drawableDescriptionDict) {
        AbstractC5504s.h(context, "context");
        AbstractC5504s.h(drawableDescriptionDict, "drawableDescriptionDict");
        String string = drawableDescriptionDict.getString("type");
        if (!AbstractC5504s.c("ThemeAttrAndroid", string)) {
            if (AbstractC5504s.c("RippleAndroid", string)) {
                d dVar = f38488a;
                return dVar.g(drawableDescriptionDict, dVar.f(context, drawableDescriptionDict));
            }
            throw new JSApplicationIllegalArgumentException("Invalid type for android drawable: " + string);
        }
        String string2 = drawableDescriptionDict.getString("attribute");
        if (string2 == null) {
            throw new JSApplicationIllegalArgumentException("JS description missing 'attribute' field");
        }
        d dVar2 = f38488a;
        int iB = dVar2.b(context, string2);
        if (context.getTheme().resolveAttribute(iB, f38489b, true)) {
            return dVar2.g(drawableDescriptionDict, dVar2.d(context));
        }
        throw new JSApplicationIllegalArgumentException("Attribute " + string2 + " with id " + iB + " couldn't be resolved into a drawable");
    }

    private final int b(Context context, String str) {
        return AbstractC5504s.c("selectableItemBackground", str) ? R.attr.selectableItemBackground : AbstractC5504s.c("selectableItemBackgroundBorderless", str) ? R.attr.selectableItemBackgroundBorderless : context.getResources().getIdentifier(str, "attr", "android");
    }

    private final int c(Context context, ReadableMap readableMap) {
        if (readableMap.hasKey("color") && !readableMap.isNull("color")) {
            return readableMap.getInt("color");
        }
        Resources.Theme theme = context.getTheme();
        TypedValue typedValue = f38489b;
        if (theme.resolveAttribute(R.attr.colorControlHighlight, typedValue, true)) {
            return context.getResources().getColor(typedValue.resourceId, context.getTheme());
        }
        throw new JSApplicationIllegalArgumentException("Attribute colorControlHighlight couldn't be resolved into a drawable");
    }

    private final Drawable d(Context context) {
        return context.getResources().getDrawable(f38489b.resourceId, context.getTheme());
    }

    private final Drawable e(ReadableMap readableMap) {
        if (readableMap.hasKey("borderless") && !readableMap.isNull("borderless") && readableMap.getBoolean("borderless")) {
            return null;
        }
        return new ColorDrawable(-1);
    }

    private final RippleDrawable f(Context context, ReadableMap readableMap) {
        int iC = c(context, readableMap);
        return new RippleDrawable(new ColorStateList(new int[][]{new int[0]}, new int[]{iC}), null, e(readableMap));
    }

    private final Drawable g(ReadableMap readableMap, Drawable drawable) {
        if (readableMap.hasKey("rippleRadius") && (drawable instanceof RippleDrawable)) {
            ((RippleDrawable) drawable).setRadius((int) B.h(readableMap.getDouble("rippleRadius")));
        }
        return drawable;
    }
}

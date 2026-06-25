package com.facebook.react.views.text;

import android.content.Context;
import android.graphics.Rect;
import android.text.Layout;
import android.text.TextPaint;
import android.util.DisplayMetrics;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReadableMapBuilder;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f38215a = new b();

    private b() {
    }

    public static final WritableArray a(CharSequence text, Layout layout, Context context) {
        AbstractC5504s.h(text, "text");
        AbstractC5504s.h(layout, "layout");
        AbstractC5504s.h(context, "context");
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        WritableArray writableArrayCreateArray = Arguments.createArray();
        TextPaint textPaint = new TextPaint(layout.getPaint());
        textPaint.setTextSize(textPaint.getTextSize() * 100.0f);
        int i10 = 0;
        int i11 = 1;
        textPaint.getTextBounds("T", 0, 1, new Rect());
        float fHeight = (r6.height() / 100.0f) / displayMetrics.density;
        String str = "x";
        textPaint.getTextBounds("x", 0, 1, new Rect());
        float fHeight2 = (r8.height() / 100.0f) / displayMetrics.density;
        int lineCount = layout.getLineCount();
        while (i10 < lineCount) {
            float lineWidth = (text.length() <= 0 || text.charAt(layout.getLineEnd(i10) - i11) != '\n') ? layout.getLineWidth(i10) : layout.getLineMax(i10);
            layout.getLineBounds(i10, new Rect());
            WritableMap writableMapCreateMap = Arguments.createMap();
            ReadableMapBuilder readableMapBuilder = new ReadableMapBuilder(writableMapCreateMap);
            readableMapBuilder.put(str, layout.getLineLeft(i10) / displayMetrics.density);
            readableMapBuilder.put("y", r12.top / displayMetrics.density);
            readableMapBuilder.put("width", lineWidth / displayMetrics.density);
            readableMapBuilder.put("height", r12.height() / displayMetrics.density);
            readableMapBuilder.put("descender", layout.getLineDescent(i10) / displayMetrics.density);
            readableMapBuilder.put("ascender", (-layout.getLineAscent(i10)) / displayMetrics.density);
            readableMapBuilder.put("baseline", layout.getLineBaseline(i10) / displayMetrics.density);
            readableMapBuilder.put("capHeight", fHeight);
            readableMapBuilder.put("xHeight", fHeight2);
            readableMapBuilder.put("text", text.subSequence(layout.getLineStart(i10), layout.getLineEnd(i10)).toString());
            writableArrayCreateArray.pushMap(writableMapCreateMap);
            i10++;
            str = str;
            lineCount = lineCount;
            i11 = 1;
        }
        return writableArrayCreateArray;
    }
}

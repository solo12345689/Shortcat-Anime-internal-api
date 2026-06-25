package com.horcrux.svg;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.JavaOnlyArray;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.horcrux.svg.m, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
class C4004m extends AbstractC4008q {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Pattern f43847e = Pattern.compile("[0-9.-]+");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ReadableArray f43848c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f43849d;

    public C4004m(ReactContext reactContext) {
        super(reactContext);
        this.f43849d = 1.0f;
    }

    private void setupPaint(Paint paint, float f10, ReadableArray readableArray) {
        if (readableArray.getInt(0) != 0) {
            return;
        }
        if (readableArray.size() != 2) {
            paint.setARGB((int) (readableArray.size() > 4 ? readableArray.getDouble(4) * ((double) f10) * 255.0d : f10 * 255.0f), (int) (readableArray.getDouble(1) * 255.0d), (int) (readableArray.getDouble(2) * 255.0d), (int) (readableArray.getDouble(3) * 255.0d));
        } else {
            paint.setColor((Math.round((r13 >>> 24) * f10) << 24) | ((readableArray.getType(1) == ReadableType.Map ? ColorPropConverter.getColor(readableArray.getMap(1), getContext()).intValue() : readableArray.getInt(1)) & 16777215));
        }
    }

    @Override // com.horcrux.svg.AbstractC4008q
    public Bitmap B(HashMap map, Bitmap bitmap) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint();
        paint.setFlags(129);
        paint.setStyle(Paint.Style.FILL);
        setupPaint(paint, this.f43849d, this.f43848c);
        canvas.drawPaint(paint);
        return bitmapCreateBitmap;
    }

    public void J(Dynamic dynamic) {
        if (dynamic == null || dynamic.isNull()) {
            this.f43848c = null;
            invalidate();
            return;
        }
        if (dynamic.getType().equals(ReadableType.Map)) {
            K(dynamic.asMap());
            return;
        }
        ReadableType type = dynamic.getType();
        int i10 = 0;
        if (type.equals(ReadableType.Number)) {
            this.f43848c = JavaOnlyArray.of(0, Integer.valueOf(dynamic.asInt()));
        } else if (type.equals(ReadableType.Array)) {
            this.f43848c = dynamic.asArray();
        } else {
            JavaOnlyArray javaOnlyArray = new JavaOnlyArray();
            javaOnlyArray.pushInt(0);
            Matcher matcher = f43847e.matcher(dynamic.asString());
            while (matcher.find()) {
                double d10 = Double.parseDouble(matcher.group());
                int i11 = i10 + 1;
                if (i10 < 3) {
                    d10 /= 255.0d;
                }
                javaOnlyArray.pushDouble(d10);
                i10 = i11;
            }
            this.f43848c = javaOnlyArray;
        }
        invalidate();
    }

    public void K(ReadableMap readableMap) {
        if (readableMap == null) {
            this.f43848c = null;
            invalidate();
            return;
        }
        int i10 = readableMap.getInt("type");
        if (i10 == 0) {
            ReadableType type = readableMap.getType("payload");
            if (type.equals(ReadableType.Number)) {
                this.f43848c = JavaOnlyArray.of(0, Integer.valueOf(readableMap.getInt("payload")));
            } else if (type.equals(ReadableType.Map)) {
                this.f43848c = JavaOnlyArray.of(0, readableMap.getMap("payload"));
            }
        } else if (i10 == 1) {
            this.f43848c = JavaOnlyArray.of(1, readableMap.getString("brushRef"));
        } else {
            this.f43848c = JavaOnlyArray.of(Integer.valueOf(i10));
        }
        invalidate();
    }

    public void L(float f10) {
        this.f43849d = f10;
        invalidate();
    }
}

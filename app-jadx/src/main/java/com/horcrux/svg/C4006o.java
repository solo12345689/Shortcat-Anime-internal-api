package com.horcrux.svg;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import java.util.HashMap;

/* JADX INFO: renamed from: com.horcrux.svg.o, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
class C4006o extends AbstractC4008q {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ReadableArray f43859c;

    public C4006o(ReactContext reactContext) {
        super(reactContext);
    }

    @Override // com.horcrux.svg.AbstractC4008q
    public Bitmap B(HashMap map, Bitmap bitmap) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        int size = this.f43859c.size();
        for (int i10 = 0; i10 < size; i10++) {
            String string = this.f43859c.getString(i10);
            Bitmap bitmap2 = string.isEmpty() ? bitmap : (Bitmap) map.get(string);
            if (bitmap2 != null) {
                canvas.drawBitmap(bitmap2, 0.0f, 0.0f, new Paint());
            }
        }
        return bitmapCreateBitmap;
    }

    public void J(ReadableArray readableArray) {
        this.f43859c = readableArray;
        invalidate();
    }
}

package com.horcrux.svg;

import android.content.Context;
import android.graphics.Bitmap;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import com.facebook.react.bridge.ReactContext;
import java.util.HashMap;

/* JADX INFO: renamed from: com.horcrux.svg.n, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
class C4005n extends AbstractC4008q {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    String f43855c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    float f43856d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    float f43857e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    EnumC4009r f43858f;

    public C4005n(ReactContext reactContext) {
        super(reactContext);
    }

    private Bitmap J(Context context, Bitmap bitmap) {
        float fMax = Math.max(this.f43856d, this.f43857e) * 2.0f;
        if (fMax <= 0.0f) {
            return bitmap;
        }
        float fMin = Math.min(fMax, 25.0f);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap);
        RenderScript renderScriptCreate = RenderScript.create(context);
        ScriptIntrinsicBlur scriptIntrinsicBlurCreate = ScriptIntrinsicBlur.create(renderScriptCreate, Element.U8_4(renderScriptCreate));
        Allocation allocationCreateFromBitmap = Allocation.createFromBitmap(renderScriptCreate, bitmap);
        Allocation allocationCreateFromBitmap2 = Allocation.createFromBitmap(renderScriptCreate, bitmapCreateBitmap);
        scriptIntrinsicBlurCreate.setRadius(fMin);
        scriptIntrinsicBlurCreate.setInput(allocationCreateFromBitmap);
        scriptIntrinsicBlurCreate.forEach(allocationCreateFromBitmap2);
        allocationCreateFromBitmap2.copyTo(bitmapCreateBitmap);
        allocationCreateFromBitmap.destroy();
        allocationCreateFromBitmap2.destroy();
        renderScriptCreate.destroy();
        return Bitmap.createScaledBitmap(bitmapCreateBitmap, bitmap.getWidth(), bitmap.getHeight(), false);
    }

    @Override // com.horcrux.svg.AbstractC4008q
    public Bitmap B(HashMap map, Bitmap bitmap) {
        return J(getContext(), AbstractC4008q.D(map, bitmap, this.f43855c));
    }

    public void K(String str) {
        this.f43858f = EnumC4009r.b(str);
        invalidate();
    }

    public void L(String str) {
        this.f43855c = str;
        invalidate();
    }

    public void M(float f10) {
        this.f43856d = f10;
        invalidate();
    }

    public void N(float f10) {
        this.f43857e = f10;
        invalidate();
    }
}

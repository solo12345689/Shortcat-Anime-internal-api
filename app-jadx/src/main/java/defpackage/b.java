package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import ke.AbstractC5466a;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public static final Bitmap a(Bitmap bitmap, Context context, float f10, boolean z10) {
        AbstractC5504s.h(bitmap, "<this>");
        AbstractC5504s.h(context, "context");
        if (f10 < 1.0f) {
            return bitmap;
        }
        double dMin = Math.min(f10, 25.0d);
        Bitmap bitmapC = z10 ? c(bitmap) : bitmap;
        RenderScript renderScriptCreate = RenderScript.create(context);
        Allocation allocationCreateFromBitmap = Allocation.createFromBitmap(renderScriptCreate, bitmapC);
        Allocation allocationCreateTyped = Allocation.createTyped(renderScriptCreate, allocationCreateFromBitmap.getType());
        ScriptIntrinsicBlur scriptIntrinsicBlurCreate = ScriptIntrinsicBlur.create(renderScriptCreate, Element.U8_4(renderScriptCreate));
        scriptIntrinsicBlurCreate.setRadius((float) dMin);
        scriptIntrinsicBlurCreate.setInput(allocationCreateFromBitmap);
        scriptIntrinsicBlurCreate.forEach(allocationCreateTyped);
        Bitmap.Config config = bitmap.getConfig();
        Bitmap bitmapCreateBitmap = config != null ? Bitmap.createBitmap(bitmapC.getWidth(), bitmapC.getHeight(), config) : null;
        allocationCreateTyped.copyTo(bitmapCreateBitmap);
        allocationCreateFromBitmap.destroy();
        allocationCreateTyped.destroy();
        scriptIntrinsicBlurCreate.destroy();
        renderScriptCreate.destroy();
        return bitmapCreateBitmap == null ? bitmapC : bitmapCreateBitmap;
    }

    public static /* synthetic */ Bitmap b(Bitmap bitmap, Context context, float f10, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        return a(bitmap, context, f10, z10);
    }

    private static final Bitmap c(Bitmap bitmap) {
        float fMin = Math.min(400.0f / bitmap.getWidth(), 400.0f / bitmap.getHeight());
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, AbstractC5466a.d(bitmap.getWidth() * fMin), AbstractC5466a.d(fMin * bitmap.getHeight()), true);
        AbstractC5504s.g(bitmapCreateScaledBitmap, "createScaledBitmap(this, width, height, true)");
        return bitmapCreateScaledBitmap;
    }
}

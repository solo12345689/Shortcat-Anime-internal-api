package Fb;

import Td.L;
import Td.z;
import Ub.u;
import Ud.S;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.net.Uri;
import cc.i;
import dc.f;
import expo.modules.font.RenderToImageOptions;
import gc.e;
import ie.InterfaceC5082a;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.O;
import pc.C5972b;
import pc.C5974d;
import pc.M;
import pc.X;
import pe.InterfaceC6014d;
import pe.InterfaceC6027q;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"LFb/c;", "Lgc/c;", "<init>", "()V", "Lgc/e;", "n", "()Lgc/e;", "Landroid/content/Context;", "y", "()Landroid/content/Context;", "context", "expo-font_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class c extends gc.c {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f6604a = new a();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return O.o(String.class);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f6605a = new b();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return O.o(RenderToImageOptions.class);
        }
    }

    /* JADX INFO: renamed from: Fb.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C0088c implements Function2 {
        public C0088c() {
        }

        public final void a(Object[] objArr, u promise) {
            float f10;
            AbstractC5504s.h(objArr, "<destruct>");
            AbstractC5504s.h(promise, "promise");
            Object obj = objArr[0];
            RenderToImageOptions renderToImageOptions = (RenderToImageOptions) objArr[1];
            String str = (String) obj;
            Typeface typefaceD = X6.a.f21660c.c().d(renderToImageOptions.getFontFamily(), 0, c.this.y().getAssets());
            float f11 = c.this.y().getResources().getDisplayMetrics().density;
            float size = renderToImageOptions.getSize() * f11;
            Float lineHeight = renderToImageOptions.getLineHeight();
            Float fValueOf = lineHeight != null ? Float.valueOf(lineHeight.floatValue() * f11) : null;
            Paint paint = new Paint();
            paint.setTypeface(typefaceD);
            paint.setColor(renderToImageOptions.getColor());
            paint.setTextSize(size);
            paint.setAntiAlias(true);
            Paint.FontMetrics fontMetrics = paint.getFontMetrics();
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap((int) Math.ceil(paint.measureText(str)), (int) (fValueOf != null ? fValueOf.floatValue() : (float) Math.ceil(fontMetrics.descent - fontMetrics.ascent)), Bitmap.Config.ARGB_8888);
            AbstractC5504s.g(bitmapCreateBitmap, "createBitmap(...)");
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            if (fValueOf != null) {
                float fFloatValue = fValueOf.floatValue();
                float f12 = fontMetrics.descent;
                float f13 = fontMetrics.ascent;
                f10 = ((fFloatValue - (f12 - f13)) / 2.0f) - f13;
            } else {
                f10 = -fontMetrics.ascent;
            }
            canvas.drawText(str, 0.0f, f10, paint);
            File file = new File(c.this.y().getCacheDir(), UUID.randomUUID() + ".png");
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                try {
                    bitmapCreateBitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
                    fe.c.a(fileOutputStream, null);
                    promise.f(S.l(z.a("uri", Uri.fromFile(file).toString()), z.a("width", Float.valueOf(bitmapCreateBitmap.getWidth() / f11)), z.a("height", Float.valueOf(bitmapCreateBitmap.getHeight() / f11)), z.a("scale", Float.valueOf(f11))));
                } finally {
                }
            } catch (IOException e10) {
                String absolutePath = file.getAbsolutePath();
                AbstractC5504s.g(absolutePath, "getAbsolutePath(...)");
                promise.h(new d(absolutePath, e10));
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((Object[]) obj, (u) obj2);
            return L.f17438a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Context y() throws i {
        Context contextB = i().B();
        if (contextB != null) {
            return contextB;
        }
        throw new i();
    }

    @Override // gc.c
    public e n() {
        X3.a.c("[ExpoModulesCore] " + (getClass() + ".ModuleDefinition"));
        try {
            gc.d dVar = new gc.d(this);
            dVar.s("ExpoFontUtils");
            X xM = dVar.m();
            C5974d c5974d = C5974d.f55938a;
            InterfaceC6014d interfaceC6014dB = O.b(String.class);
            Boolean bool = Boolean.FALSE;
            C5972b c5972b = (C5972b) c5974d.a().get(new Pair(interfaceC6014dB, bool));
            if (c5972b == null) {
                c5972b = new C5972b(new M(O.b(String.class), false, a.f6604a), xM);
            }
            C5972b c5972b2 = (C5972b) c5974d.a().get(new Pair(O.b(RenderToImageOptions.class), bool));
            if (c5972b2 == null) {
                c5972b2 = new C5972b(new M(O.b(RenderToImageOptions.class), false, b.f6605a), xM);
            }
            dVar.k().put("renderToImageAsync", new f("renderToImageAsync", new C5972b[]{c5972b, c5972b2}, new C0088c()));
            e eVarU = dVar.u();
            X3.a.f();
            return eVarU;
        } catch (Throwable th2) {
            X3.a.f();
            throw th2;
        }
    }
}

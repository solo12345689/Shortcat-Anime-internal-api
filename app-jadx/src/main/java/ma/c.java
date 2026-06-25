package Ma;

import Td.z;
import Ud.S;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.os.Build;
import com.facebook.react.uimanager.C3284b0;
import com.reactnativekeyboardcontroller.d;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AbstractC5504s;
import oe.AbstractC5874j;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Map f12315a = S.l(z.a("com.android.inputmethod.latin", z.a(Integer.valueOf(com.reactnativekeyboardcontroller.c.f44005a), Integer.valueOf(com.reactnativekeyboardcontroller.c.f44005a))), z.a("com.google.android.inputmethod.latin", z.a(Integer.valueOf(com.reactnativekeyboardcontroller.c.f44007c), Integer.valueOf(com.reactnativekeyboardcontroller.c.f44006b))), z.a("com.touchtype.swiftkey", z.a(Integer.valueOf(com.reactnativekeyboardcontroller.c.f44013i), Integer.valueOf(com.reactnativekeyboardcontroller.c.f44012h))), z.a("com.google.android.googlequicksearchbox", z.a(Integer.valueOf(com.reactnativekeyboardcontroller.c.f44009e), Integer.valueOf(com.reactnativekeyboardcontroller.c.f44008d))), z.a("com.google.android.tts", z.a(Integer.valueOf(com.reactnativekeyboardcontroller.c.f44009e), Integer.valueOf(com.reactnativekeyboardcontroller.c.f44008d))), z.a("ru.yandex.androidkeyboard", z.a(Integer.valueOf(com.reactnativekeyboardcontroller.c.f44015k), Integer.valueOf(com.reactnativekeyboardcontroller.c.f44014j))), z.a("com.samsung.android.honeyboard", z.a(Integer.valueOf(com.reactnativekeyboardcontroller.c.f44011g), Integer.valueOf(com.reactnativekeyboardcontroller.c.f44010f))));

    public static final a a(Context context, int i10) {
        AbstractC5504s.h(context, "<this>");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i10, d.f44016a);
        AbstractC5504s.g(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        try {
            return new a(typedArrayObtainStyledAttributes.getColor(d.f44017b, -16777216), typedArrayObtainStyledAttributes.getInt(d.f44018c, 0));
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static final int b(C3284b0 c3284b0) {
        AbstractC5504s.h(c3284b0, "<this>");
        String strA = Ba.a.a(c3284b0);
        boolean zC = Ba.a.c(c3284b0);
        Fa.a.b(Fa.a.f6597a, "Skins", "Current IME: " + strA, null, 4, null);
        Pair pairA = (Pair) f12315a.get(strA);
        if (pairA == null) {
            pairA = z.a(Integer.valueOf(com.reactnativekeyboardcontroller.c.f44007c), Integer.valueOf(com.reactnativekeyboardcontroller.c.f44006b));
        }
        int iIntValue = ((Number) pairA.getFirst()).intValue();
        int iIntValue2 = ((Number) pairA.getSecond()).intValue();
        if (zC && Build.VERSION.SDK_INT > 29) {
            iIntValue = iIntValue2;
        }
        return a(c3284b0, iIntValue).a();
    }

    public static final int c(int i10, int i11) {
        return Color.argb(Color.alpha(i10), AbstractC5874j.m(Color.red(i10) + i11, 0, 255), AbstractC5874j.m(Color.green(i10) + i11, 0, 255), AbstractC5874j.m(Color.blue(i10) + i11, 0, 255));
    }
}

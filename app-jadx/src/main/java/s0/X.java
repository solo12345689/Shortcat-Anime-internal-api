package s0;

import android.graphics.Shader;
import android.os.Build;
import s0.I1;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class X {
    public static final Shader.TileMode a(int i10) {
        I1.a aVar = I1.f58895a;
        return I1.f(i10, aVar.a()) ? Shader.TileMode.CLAMP : I1.f(i10, aVar.d()) ? Shader.TileMode.REPEAT : I1.f(i10, aVar.c()) ? Shader.TileMode.MIRROR : I1.f(i10, aVar.b()) ? Build.VERSION.SDK_INT >= 31 ? K1.f58900a.a() : Shader.TileMode.CLAMP : Shader.TileMode.CLAMP;
    }
}

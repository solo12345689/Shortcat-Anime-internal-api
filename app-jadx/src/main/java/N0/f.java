package N0;

import android.os.Bundle;
import android.view.ViewStructure;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f12573a;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class a {
        static Bundle a(ViewStructure viewStructure) {
            return viewStructure.getExtras();
        }

        static void b(ViewStructure viewStructure, String str) {
            viewStructure.setClassName(str);
        }

        static void c(ViewStructure viewStructure, CharSequence charSequence) {
            viewStructure.setContentDescription(charSequence);
        }

        static void d(ViewStructure viewStructure, int i10, int i11, int i12, int i13, int i14, int i15) {
            viewStructure.setDimens(i10, i11, i12, i13, i14, i15);
        }

        static void e(ViewStructure viewStructure, int i10, String str, String str2, String str3) {
            viewStructure.setId(i10, str, str2, str3);
        }

        static void f(ViewStructure viewStructure, CharSequence charSequence) {
            viewStructure.setText(charSequence);
        }

        static void g(ViewStructure viewStructure, float f10, int i10, int i11, int i12) {
            viewStructure.setTextStyle(f10, i10, i11, i12);
        }
    }

    private f(ViewStructure viewStructure) {
        this.f12573a = viewStructure;
    }

    public static f i(ViewStructure viewStructure) {
        return new f(viewStructure);
    }

    public Bundle a() {
        return a.a((ViewStructure) this.f12573a);
    }

    public void b(String str) {
        a.b((ViewStructure) this.f12573a, str);
    }

    public void c(CharSequence charSequence) {
        a.c((ViewStructure) this.f12573a, charSequence);
    }

    public void d(int i10, int i11, int i12, int i13, int i14, int i15) {
        a.d((ViewStructure) this.f12573a, i10, i11, i12, i13, i14, i15);
    }

    public void e(int i10, String str, String str2, String str3) {
        a.e((ViewStructure) this.f12573a, i10, str, str2, str3);
    }

    public void f(CharSequence charSequence) {
        a.f((ViewStructure) this.f12573a, charSequence);
    }

    public void g(float f10, int i10, int i11, int i12) {
        a.g((ViewStructure) this.f12573a, f10, i10, i11, i12);
    }

    public ViewStructure h() {
        return (ViewStructure) this.f12573a;
    }
}

package androidx.loader.app;

import android.os.Bundle;
import androidx.lifecycle.Y;
import androidx.lifecycle.r;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import p2.AbstractC5918b;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: androidx.loader.app.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface InterfaceC0519a {
        AbstractC5918b a(int i10, Bundle bundle);

        void b(AbstractC5918b abstractC5918b, Object obj);

        void c(AbstractC5918b abstractC5918b);
    }

    public static a b(r rVar) {
        return new b(rVar, ((Y) rVar).getViewModelStore());
    }

    public abstract void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    public abstract AbstractC5918b c(int i10, Bundle bundle, InterfaceC0519a interfaceC0519a);

    public abstract void d();
}

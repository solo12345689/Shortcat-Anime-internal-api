package nc;

import Td.L;
import expo.modules.kotlin.jni.JavaScriptObject;
import ie.InterfaceC5082a;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: nc.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C5775b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Map f54106a = new LinkedHashMap();

    /* JADX INFO: Access modifiers changed from: private */
    public static final L c(C5775b c5775b, Class cls) {
        c5775b.d(cls);
        return L.f17438a;
    }

    private final void d(Class cls) {
        this.f54106a.remove(cls);
    }

    public final void b(final Class cls, JavaScriptObject js) {
        AbstractC5504s.h(cls, "native");
        AbstractC5504s.h(js, "js");
        js.c(new InterfaceC5082a() { // from class: nc.a
            @Override // ie.InterfaceC5082a
            public final Object invoke() {
                return C5775b.c(this.f54104a, cls);
            }
        });
        this.f54106a.put(cls, js);
    }

    public final JavaScriptObject e(Class cls) {
        AbstractC5504s.h(cls, "native");
        return (JavaScriptObject) this.f54106a.get(cls);
    }
}

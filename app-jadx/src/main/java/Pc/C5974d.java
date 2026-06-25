package pc;

import Ud.AbstractC2279u;
import android.net.Uri;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import expo.modules.kotlin.jni.JavaScriptObject;
import expo.modules.kotlin.jni.JavaScriptValue;
import java.io.File;
import java.net.URI;
import java.net.URL;
import java.util.Map;
import oc.C5852a;
import oc.C5853b;
import oc.C5854c;
import oc.C5855d;
import pe.InterfaceC6014d;
import qb.InterfaceC6168b;

/* JADX INFO: renamed from: pc.d */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C5974d {

    /* JADX INFO: renamed from: a */
    public static final C5974d f55938a = new C5974d();

    /* JADX INFO: renamed from: b */
    private static final Map f55939b;

    static {
        Map mapC = Ud.S.c();
        for (InterfaceC6014d interfaceC6014d : AbstractC2279u.p(kotlin.jvm.internal.O.b(Integer.TYPE), kotlin.jvm.internal.O.b(Float.TYPE), kotlin.jvm.internal.O.b(Double.TYPE), kotlin.jvm.internal.O.b(Long.TYPE), kotlin.jvm.internal.O.b(Boolean.TYPE), kotlin.jvm.internal.O.b(String.class), kotlin.jvm.internal.O.b(byte[].class), kotlin.jvm.internal.O.b(long[].class), kotlin.jvm.internal.O.b(int[].class), kotlin.jvm.internal.O.b(boolean[].class), kotlin.jvm.internal.O.b(float[].class), kotlin.jvm.internal.O.b(double[].class), kotlin.jvm.internal.O.b(JavaScriptValue.class), kotlin.jvm.internal.O.b(JavaScriptObject.class), kotlin.jvm.internal.O.b(oc.j.class), kotlin.jvm.internal.O.b(oc.h.class), kotlin.jvm.internal.O.b(oc.f.class), kotlin.jvm.internal.O.b(oc.g.class), kotlin.jvm.internal.O.b(oc.n.class), kotlin.jvm.internal.O.b(oc.o.class), kotlin.jvm.internal.O.b(oc.l.class), kotlin.jvm.internal.O.b(oc.m.class), kotlin.jvm.internal.O.b(C5854c.class), kotlin.jvm.internal.O.b(C5855d.class), kotlin.jvm.internal.O.b(C5852a.class), kotlin.jvm.internal.O.b(C5853b.class), kotlin.jvm.internal.O.b(ReadableArray.class), kotlin.jvm.internal.O.b(ReadableMap.class), kotlin.jvm.internal.O.b(URL.class), kotlin.jvm.internal.O.b(Uri.class), kotlin.jvm.internal.O.b(URI.class), kotlin.jvm.internal.O.b(File.class), kotlin.jvm.internal.O.b(Object.class), kotlin.jvm.internal.O.b(Td.L.class), kotlin.jvm.internal.O.b(InterfaceC6168b.class))) {
            mapC.put(Td.z.a(interfaceC6014d, Boolean.FALSE), new C5972b(new C5959A(interfaceC6014d, false), null, 2, null));
            mapC.put(Td.z.a(interfaceC6014d, Boolean.TRUE), new C5972b(new C5959A(interfaceC6014d, true), null, 2, null));
        }
        f55939b = Ud.S.b(mapC);
    }

    private C5974d() {
    }

    public final Map a() {
        return f55939b;
    }
}

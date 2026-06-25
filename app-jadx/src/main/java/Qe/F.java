package Qe;

import Ud.AbstractC2279u;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class F {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final F f14805a = new F();

    private F() {
    }

    private final String c(String str) {
        if (str.length() <= 1) {
            return str;
        }
        return 'L' + str + ';';
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence l(String it) {
        AbstractC5504s.h(it, "it");
        return f14805a.c(it);
    }

    public final String[] b(String... signatures) {
        AbstractC5504s.h(signatures, "signatures");
        ArrayList arrayList = new ArrayList(signatures.length);
        for (String str : signatures) {
            arrayList.add("<init>(" + str + ")V");
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public final Set d(String internalName, String... signatures) {
        AbstractC5504s.h(internalName, "internalName");
        AbstractC5504s.h(signatures, "signatures");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (String str : signatures) {
            linkedHashSet.add(internalName + com.amazon.a.a.o.c.a.b.f34706a + str);
        }
        return linkedHashSet;
    }

    public final Set e(String name, String... signatures) {
        AbstractC5504s.h(name, "name");
        AbstractC5504s.h(signatures, "signatures");
        return d(h(name), (String[]) Arrays.copyOf(signatures, signatures.length));
    }

    public final Set f(String name, String... signatures) {
        AbstractC5504s.h(name, "name");
        AbstractC5504s.h(signatures, "signatures");
        return d(i(name), (String[]) Arrays.copyOf(signatures, signatures.length));
    }

    public final String g(String name) {
        AbstractC5504s.h(name, "name");
        return "java/util/function/" + name;
    }

    public final String h(String name) {
        AbstractC5504s.h(name, "name");
        return "java/lang/" + name;
    }

    public final String i(String name) {
        AbstractC5504s.h(name, "name");
        return "java/util/" + name;
    }

    public final String j(String name) {
        AbstractC5504s.h(name, "name");
        return "java/util/concurrent/atomic/" + name;
    }

    public final String k(String name, List parameters, String ret) {
        AbstractC5504s.h(name, "name");
        AbstractC5504s.h(parameters, "parameters");
        AbstractC5504s.h(ret, "ret");
        return name + '(' + AbstractC2279u.w0(parameters, "", null, null, 0, null, E.f14804a, 30, null) + ')' + c(ret);
    }

    public final String m(String internalName, String jvmDescriptor) {
        AbstractC5504s.h(internalName, "internalName");
        AbstractC5504s.h(jvmDescriptor, "jvmDescriptor");
        return internalName + com.amazon.a.a.o.c.a.b.f34706a + jvmDescriptor;
    }
}

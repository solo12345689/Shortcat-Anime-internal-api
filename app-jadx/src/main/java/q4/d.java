package q4;

import Ud.AbstractC2279u;
import com.amazon.a.a.o.b.f;
import i4.i;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC5504s;
import n4.AbstractC5748x;
import n4.C5733i;
import n4.C5745u;
import n4.InterfaceC5734j;
import n4.InterfaceC5739o;
import n4.InterfaceC5750z;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class d {

    /* JADX INFO: renamed from: a */
    private static final String f57087a;

    static {
        String strI = i.i("DiagnosticsWrkr");
        AbstractC5504s.g(strI, "tagWithPrefix(\"DiagnosticsWrkr\")");
        f57087a = strI;
    }

    private static final String c(C5745u c5745u, String str, Integer num, String str2) {
        return '\n' + c5745u.f53943a + "\t " + c5745u.f53945c + "\t " + num + "\t " + c5745u.f53944b.name() + "\t " + str + "\t " + str2 + '\t';
    }

    public static final String d(InterfaceC5739o interfaceC5739o, InterfaceC5750z interfaceC5750z, InterfaceC5734j interfaceC5734j, List list) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("\n Id \t Class Name\t Job Id\t State\t Unique Name\t Tags\t");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C5745u c5745u = (C5745u) it.next();
            C5733i c5733iB = interfaceC5734j.b(AbstractC5748x.a(c5745u));
            sb2.append(c(c5745u, AbstractC2279u.w0(interfaceC5739o.b(c5745u.f53943a), f.f34694a, null, null, 0, null, null, 62, null), c5733iB != null ? Integer.valueOf(c5733iB.f53918c) : null, AbstractC2279u.w0(interfaceC5750z.a(c5745u.f53943a), f.f34694a, null, null, 0, null, null, 62, null)));
        }
        String string = sb2.toString();
        AbstractC5504s.g(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}

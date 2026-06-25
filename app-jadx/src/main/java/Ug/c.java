package ug;

import Ud.C2272m;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC5504s;
import tg.AbstractC6690o;
import tg.C6689n;
import tg.P;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class c {
    public static final void a(AbstractC6690o abstractC6690o, P dir, boolean z10) throws IOException {
        AbstractC5504s.h(abstractC6690o, "<this>");
        AbstractC5504s.h(dir, "dir");
        C2272m c2272m = new C2272m();
        for (P pN = dir; pN != null && !abstractC6690o.j(pN); pN = pN.n()) {
            c2272m.addFirst(pN);
        }
        if (z10 && c2272m.isEmpty()) {
            throw new IOException(dir + " already exists.");
        }
        Iterator<E> it = c2272m.iterator();
        while (it.hasNext()) {
            abstractC6690o.f((P) it.next());
        }
    }

    public static final boolean b(AbstractC6690o abstractC6690o, P path) {
        AbstractC5504s.h(abstractC6690o, "<this>");
        AbstractC5504s.h(path, "path");
        return abstractC6690o.m(path) != null;
    }

    public static final C6689n c(AbstractC6690o abstractC6690o, P path) throws FileNotFoundException {
        AbstractC5504s.h(abstractC6690o, "<this>");
        AbstractC5504s.h(path, "path");
        C6689n c6689nM = abstractC6690o.m(path);
        if (c6689nM != null) {
            return c6689nM;
        }
        throw new FileNotFoundException("no such file: " + path);
    }
}

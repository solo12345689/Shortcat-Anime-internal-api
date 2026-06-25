package Z7;

import a8.C2585a;
import com.github.penfeizhou.animation.io.Reader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class d {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class a extends IOException {
        a() {
            super("APNG Format error");
        }
    }

    public static boolean a(Reader reader) {
        C2585a c2585a = reader instanceof C2585a ? (C2585a) reader : new C2585a(reader);
        try {
            if (!c2585a.a("\u0089PNG") || !c2585a.a("\r\n\u001a\n")) {
                throw new a();
            }
            while (c2585a.available() > 0) {
                if (c(c2585a) instanceof Z7.a) {
                    return true;
                }
            }
            return false;
        } catch (IOException e10) {
            if (e10 instanceof a) {
                return false;
            }
            e10.printStackTrace();
            return false;
        }
    }

    public static List b(C2585a c2585a) throws a {
        if (!c2585a.a("\u0089PNG") || !c2585a.a("\r\n\u001a\n")) {
            throw new a();
        }
        ArrayList arrayList = new ArrayList();
        while (c2585a.available() > 0) {
            arrayList.add(c(c2585a));
        }
        return arrayList;
    }

    private static e c(C2585a c2585a) throws IOException {
        int iPosition = c2585a.position();
        int iC = c2585a.c();
        int iB = c2585a.b();
        e aVar = iB == Z7.a.f23191g ? new Z7.a() : iB == f.f23214n ? new f() : iB == g.f23224f ? new g() : iB == h.f23226e ? new h() : iB == i.f23227e ? new i() : iB == j.f23228h ? new j() : new e();
        aVar.f23213d = iPosition;
        aVar.f23211b = iB;
        aVar.f23210a = iC;
        aVar.c(c2585a);
        aVar.f23212c = c2585a.c();
        return aVar;
    }
}

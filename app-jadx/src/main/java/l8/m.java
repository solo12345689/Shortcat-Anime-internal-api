package l8;

import com.github.penfeizhou.animation.io.Reader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import m8.C5647a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class m {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class a extends IOException {
        a() {
            super("WebP Format error");
        }
    }

    public static boolean a(Reader reader) {
        C5647a c5647a = reader instanceof C5647a ? (C5647a) reader : new C5647a(reader);
        try {
            if (!c5647a.f("RIFF")) {
                return false;
            }
            c5647a.skip(4L);
            if (!c5647a.f("WEBP")) {
                return false;
            }
            while (c5647a.available() > 0) {
                C5563e c5563eC = c(c5647a);
                if (c5563eC instanceof C5569k) {
                    return ((C5569k) c5563eC).e();
                }
            }
        } catch (IOException e10) {
            if (!(e10 instanceof a)) {
                e10.printStackTrace();
            }
        }
        return false;
    }

    public static List b(C5647a c5647a) throws a {
        if (!c5647a.f("RIFF")) {
            throw new a();
        }
        c5647a.skip(4L);
        if (!c5647a.f("WEBP")) {
            throw new a();
        }
        ArrayList arrayList = new ArrayList();
        while (c5647a.available() > 0) {
            arrayList.add(c(c5647a));
        }
        return arrayList;
    }

    static C5563e c(C5647a c5647a) {
        int iPosition = c5647a.position();
        int iB = c5647a.b();
        int iE = c5647a.e();
        C5563e c5569k = C5569k.f52698g == iB ? new C5569k() : C5560b.f52671f == iB ? new C5560b() : C5561c.f52674m == iB ? new C5561c() : C5559a.f52670d == iB ? new C5559a() : C5567i.f52696d == iB ? new C5567i() : C5568j.f52697d == iB ? new C5568j() : C5565g.f52695d == iB ? new C5565g() : n.f52710d == iB ? new n() : C5564f.f52694d == iB ? new C5564f() : new C5563e();
        c5569k.f52691a = iB;
        c5569k.f52692b = iE;
        c5569k.f52693c = iPosition;
        c5569k.c(c5647a);
        return c5569k;
    }
}

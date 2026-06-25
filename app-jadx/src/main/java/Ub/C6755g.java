package ub;

import Td.AbstractC2156g;
import android.util.Log;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: ub.g */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C6755g extends AbstractC6749a {

    /* JADX INFO: renamed from: a */
    private final String f61485a;

    public C6755g(String category) {
        AbstractC5504s.h(category, "category");
        this.f61485a = category;
    }

    @Override // ub.AbstractC6749a
    public void a(EnumC6751c type, String message, Throwable th2) {
        AbstractC5504s.h(type, "type");
        AbstractC5504s.h(message, "message");
        if (AbstractC6756h.f61486a) {
            int iA = EnumC6751c.f61467b.a(type);
            if (iA == 3) {
                Log.d(this.f61485a, message, th2);
                return;
            }
            if (iA == 4) {
                Log.i(this.f61485a, message, th2);
                return;
            }
            if (iA == 5) {
                Log.w(this.f61485a, message, th2);
                return;
            } else if (iA == 6) {
                Log.e(this.f61485a, message, th2);
                return;
            } else {
                if (iA != 7) {
                    return;
                }
                Log.e(this.f61485a, message, th2);
                return;
            }
        }
        System.out.println((Object) ("[" + type.b() + "] " + this.f61485a + "\t" + message));
        if (th2 != null) {
            System.out.println((Object) (AbstractC6754f.a(th2) + "\n" + AbstractC2156g.c(th2)));
        }
    }
}

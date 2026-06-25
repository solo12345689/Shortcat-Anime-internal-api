package Jd;

import E3.C1375h3;
import E3.T6;
import E3.U6;
import android.os.Bundle;
import com.google.common.util.concurrent.p;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class e implements C1375h3.d {
    @Override // E3.C1375h3.d
    public p f(C1375h3 session, C1375h3.g controller, T6 customCommand, Bundle args) {
        AbstractC5504s.h(session, "session");
        AbstractC5504s.h(controller, "controller");
        AbstractC5504s.h(customCommand, "customCommand");
        AbstractC5504s.h(args, "args");
        String str = customCommand.f4975b;
        int iHashCode = str.hashCode();
        if (iHashCode != -1263673246) {
            if (iHashCode == 1997771742 && str.equals("SEEK_FORWARD")) {
                session.j().z(session.j().getCurrentPosition() + 10000);
            }
        } else if (str.equals("SEEK_REWIND")) {
            session.j().z(session.j().getCurrentPosition() - 10000);
        }
        p pVarF = super.f(session, controller, customCommand, args);
        AbstractC5504s.g(pVarF, "onCustomCommand(...)");
        return pVarF;
    }

    @Override // E3.C1375h3.d
    public C1375h3.e j(C1375h3 session, C1375h3.g controller) {
        AbstractC5504s.h(session, "session");
        AbstractC5504s.h(controller, "controller");
        try {
            C1375h3.e.a aVarB = new C1375h3.e.a(session).b(C1375h3.e.f5317j.b().a(12).a(11).f());
            U6.b bVarA = C1375h3.e.f5315h.a();
            Bundle bundle = Bundle.EMPTY;
            C1375h3.e eVarA = aVarB.c(bVarA.a(new T6("SEEK_REWIND", bundle)).a(new T6("SEEK_FORWARD", bundle)).e()).a();
            AbstractC5504s.g(eVarA, "build(...)");
            return eVarA;
        } catch (Exception unused) {
            C1375h3.e eVarB = C1375h3.e.b();
            AbstractC5504s.g(eVarB, "reject(...)");
            return eVarB;
        }
    }
}

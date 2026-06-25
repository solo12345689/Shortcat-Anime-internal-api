package Xa;

import Td.z;
import Ud.S;
import kotlin.Pair;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class a {
    public static final Pair a(Wa.b event) {
        AbstractC5504s.h(event, "event");
        return z.a(event.getEventName(), S.k(z.a("registrationName", event.a())));
    }
}

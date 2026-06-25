package x4;

import android.content.Context;
import ie.InterfaceC5082a;
import java.io.Closeable;
import java.io.File;
import kotlin.jvm.internal.AbstractC5506u;
import tg.AbstractC6690o;
import tg.InterfaceC6685j;
import tg.P;
import x4.p;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class q {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends AbstractC5506u implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f63921a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Context context) {
            super(0);
            this.f63921a = context;
        }

        @Override // ie.InterfaceC5082a
        public final File invoke() {
            return L4.j.l(this.f63921a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b extends AbstractC5506u implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f63922a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Context context) {
            super(0);
            this.f63922a = context;
        }

        @Override // ie.InterfaceC5082a
        public final File invoke() {
            return L4.j.l(this.f63922a);
        }
    }

    public static final p a(InterfaceC6685j interfaceC6685j, Context context) {
        return new s(interfaceC6685j, new a(context), null);
    }

    public static final p b(InterfaceC6685j interfaceC6685j, Context context, p.a aVar) {
        return new s(interfaceC6685j, new b(context), aVar);
    }

    public static final p c(P p10, AbstractC6690o abstractC6690o, String str, Closeable closeable) {
        return new o(p10, abstractC6690o, str, closeable, null);
    }

    public static /* synthetic */ p d(P p10, AbstractC6690o abstractC6690o, String str, Closeable closeable, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            abstractC6690o = AbstractC6690o.f61068b;
        }
        if ((i10 & 4) != 0) {
            str = null;
        }
        if ((i10 & 8) != 0) {
            closeable = null;
        }
        return c(p10, abstractC6690o, str, closeable);
    }
}

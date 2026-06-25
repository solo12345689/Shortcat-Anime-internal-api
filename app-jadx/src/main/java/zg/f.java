package Zg;

import Fg.p;
import Hg.h;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;

/* JADX INFO: loaded from: classes5.dex */
abstract class f {

    /* JADX INFO: renamed from: a */
    final int f23466a;

    /* JADX INFO: renamed from: b */
    final int f23467b;

    static class a extends f {

        /* JADX INFO: renamed from: c */
        private final p f23468c;

        a() {
            super(64, 64);
            this.f23468c = Jg.b.b(Ig.a.k());
        }
    }

    static class b extends f {

        /* JADX INFO: renamed from: c */
        private final h f23469c;

        /* JADX INFO: renamed from: d */
        private final h f23470d;

        b() {
            super(168, 136);
            this.f23469c = new h(128);
            this.f23470d = new h(IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER);
        }
    }

    f(int i10, int i11) {
        this.f23466a = i10;
        this.f23467b = i11;
    }
}

package mh;

import Fg.p;
import Fg.q;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;

/* JADX INFO: renamed from: mh.g */
/* JADX INFO: loaded from: classes5.dex */
abstract class AbstractC5702g {

    /* JADX INFO: renamed from: mh.g$a */
    static class a extends AbstractC5702g {

        /* JADX INFO: renamed from: a */
        private final Hg.d f53743a = new Hg.d();

        /* JADX INFO: renamed from: b */
        private final Hg.g f53744b = new Hg.g();

        /* JADX INFO: renamed from: c */
        private final p f53745c = Jg.b.b(Ig.a.k());

        a() {
        }
    }

    /* JADX INFO: renamed from: mh.g$b */
    static class b extends AbstractC5702g {

        /* JADX INFO: renamed from: c */
        private final q f53748c = new Hg.h(128);

        /* JADX INFO: renamed from: a */
        private final Hg.f f53746a = new Hg.f(IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER);

        /* JADX INFO: renamed from: b */
        private final Hg.f f53747b = new Hg.f(IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING);

        b() {
        }
    }

    AbstractC5702g() {
    }
}

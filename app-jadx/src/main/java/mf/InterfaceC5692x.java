package mf;

import kotlin.jvm.internal.AbstractC5504s;
import qf.AbstractC6183d0;

/* JADX INFO: renamed from: mf.x, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public interface InterfaceC5692x {

    /* JADX INFO: renamed from: mf.x$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a implements InterfaceC5692x {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f53479a = new a();

        private a() {
        }

        @Override // mf.InterfaceC5692x
        public qf.S a(Se.r proto, String flexibleId, AbstractC6183d0 lowerBound, AbstractC6183d0 upperBound) {
            AbstractC5504s.h(proto, "proto");
            AbstractC5504s.h(flexibleId, "flexibleId");
            AbstractC5504s.h(lowerBound, "lowerBound");
            AbstractC5504s.h(upperBound, "upperBound");
            throw new IllegalArgumentException("This method should not be used.");
        }
    }

    qf.S a(Se.r rVar, String str, AbstractC6183d0 abstractC6183d0, AbstractC6183d0 abstractC6183d02);
}

package i8;

import S4.h;
import S4.j;
import U4.v;
import Z7.d;
import c8.C3083a;
import g8.AbstractC4867h;
import g8.C4866g;
import j8.AbstractC5341a;
import java.nio.ByteBuffer;
import l8.l;
import l8.m;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class b implements j {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a extends AbstractC5341a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ByteBuffer f48731a;

        a(ByteBuffer byteBuffer) {
            this.f48731a = byteBuffer;
        }

        @Override // j8.AbstractC5341a
        public ByteBuffer b() {
            this.f48731a.position(0);
            return this.f48731a;
        }
    }

    /* JADX INFO: renamed from: i8.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class C0775b implements v {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final com.github.penfeizhou.animation.decode.b f48733a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f48734b;

        C0775b(com.github.penfeizhou.animation.decode.b bVar, int i10) {
            this.f48733a = bVar;
            this.f48734b = i10;
        }

        @Override // U4.v
        public Class a() {
            return com.github.penfeizhou.animation.decode.b.class;
        }

        @Override // U4.v
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public com.github.penfeizhou.animation.decode.b get() {
            return this.f48733a;
        }

        @Override // U4.v
        public int getSize() {
            return this.f48734b;
        }

        @Override // U4.v
        public void recycle() {
            this.f48733a.U();
        }
    }

    @Override // S4.j
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public v a(ByteBuffer byteBuffer, int i10, int i11, h hVar) {
        com.github.penfeizhou.animation.decode.b c3083a;
        a aVar = new a(byteBuffer);
        if (m.a(new com.github.penfeizhou.animation.io.a(byteBuffer))) {
            c3083a = new l(aVar, null);
        } else if (d.a(new com.github.penfeizhou.animation.io.a(byteBuffer))) {
            c3083a = new Z7.b(aVar, null);
        } else if (AbstractC4867h.b(new com.github.penfeizhou.animation.io.a(byteBuffer))) {
            c3083a = new C4866g(aVar, null);
        } else {
            if (!c8.c.a(new com.github.penfeizhou.animation.io.a(byteBuffer))) {
                return null;
            }
            c3083a = new C3083a(aVar, null);
        }
        return new C0775b(c3083a, byteBuffer.limit());
    }

    @Override // S4.j
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(ByteBuffer byteBuffer, h hVar) {
        if (!((Boolean) hVar.c(AbstractC5044a.f48727b)).booleanValue() && m.a(new com.github.penfeizhou.animation.io.a(byteBuffer))) {
            return true;
        }
        if (!((Boolean) hVar.c(AbstractC5044a.f48728c)).booleanValue() && d.a(new com.github.penfeizhou.animation.io.a(byteBuffer))) {
            return true;
        }
        if (((Boolean) hVar.c(AbstractC5044a.f48726a)).booleanValue() || !AbstractC4867h.b(new com.github.penfeizhou.animation.io.a(byteBuffer))) {
            return !((Boolean) hVar.c(AbstractC5044a.f48730e)).booleanValue() && c8.c.a(new com.github.penfeizhou.animation.io.a(byteBuffer));
        }
        return true;
    }
}

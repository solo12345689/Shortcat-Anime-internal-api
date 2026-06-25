package mf;

import kotlin.Pair;
import kotlin.jvm.internal.AbstractC5504s;
import ye.InterfaceC7247z;

/* JADX INFO: renamed from: mf.m, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public interface InterfaceC5682m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f53433a = a.f53434a;

    /* JADX INFO: renamed from: mf.m$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f53434a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final InterfaceC5682m f53435b = new C0833a();

        /* JADX INFO: renamed from: mf.m$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static final class C0833a implements InterfaceC5682m {
            C0833a() {
            }

            @Override // mf.InterfaceC5682m
            public Pair a(Se.j proto, InterfaceC7247z ownerFunction, Ue.h typeTable, X typeDeserializer) {
                AbstractC5504s.h(proto, "proto");
                AbstractC5504s.h(ownerFunction, "ownerFunction");
                AbstractC5504s.h(typeTable, "typeTable");
                AbstractC5504s.h(typeDeserializer, "typeDeserializer");
                return null;
            }
        }

        private a() {
        }

        public final InterfaceC5682m a() {
            return f53435b;
        }
    }

    Pair a(Se.j jVar, InterfaceC7247z interfaceC7247z, Ue.h hVar, X x10);
}

package Yf;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class a {

    /* JADX INFO: renamed from: Yf.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C0393a extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Rf.b f22927a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0393a(Rf.b serializer) {
            super(null);
            AbstractC5504s.h(serializer, "serializer");
            this.f22927a = serializer;
        }

        @Override // Yf.a
        public Rf.b a(List typeArgumentsSerializers) {
            AbstractC5504s.h(typeArgumentsSerializers, "typeArgumentsSerializers");
            return this.f22927a;
        }

        public final Rf.b b() {
            return this.f22927a;
        }

        public boolean equals(Object obj) {
            return (obj instanceof C0393a) && AbstractC5504s.c(((C0393a) obj).f22927a, this.f22927a);
        }

        public int hashCode() {
            return this.f22927a.hashCode();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Function1 f22928a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Function1 provider) {
            super(null);
            AbstractC5504s.h(provider, "provider");
            this.f22928a = provider;
        }

        @Override // Yf.a
        public Rf.b a(List typeArgumentsSerializers) {
            AbstractC5504s.h(typeArgumentsSerializers, "typeArgumentsSerializers");
            return (Rf.b) this.f22928a.invoke(typeArgumentsSerializers);
        }

        public final Function1 b() {
            return this.f22928a;
        }
    }

    public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract Rf.b a(List list);

    private a() {
    }
}

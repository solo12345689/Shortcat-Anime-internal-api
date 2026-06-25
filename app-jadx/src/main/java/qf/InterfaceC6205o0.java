package qf;

import kotlin.jvm.internal.AbstractC5504s;
import ze.InterfaceC7369c;

/* JADX INFO: renamed from: qf.o0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public interface InterfaceC6205o0 {

    /* JADX INFO: renamed from: qf.o0$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a implements InterfaceC6205o0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f58081a = new a();

        private a() {
        }

        @Override // qf.InterfaceC6205o0
        public void a(ye.l0 typeAlias, ye.m0 m0Var, S substitutedArgument) {
            AbstractC5504s.h(typeAlias, "typeAlias");
            AbstractC5504s.h(substitutedArgument, "substitutedArgument");
        }

        @Override // qf.InterfaceC6205o0
        public void b(G0 substitutor, S unsubstitutedArgument, S argument, ye.m0 typeParameter) {
            AbstractC5504s.h(substitutor, "substitutor");
            AbstractC5504s.h(unsubstitutedArgument, "unsubstitutedArgument");
            AbstractC5504s.h(argument, "argument");
            AbstractC5504s.h(typeParameter, "typeParameter");
        }

        @Override // qf.InterfaceC6205o0
        public void c(InterfaceC7369c annotation) {
            AbstractC5504s.h(annotation, "annotation");
        }

        @Override // qf.InterfaceC6205o0
        public void d(ye.l0 typeAlias) {
            AbstractC5504s.h(typeAlias, "typeAlias");
        }
    }

    void a(ye.l0 l0Var, ye.m0 m0Var, S s10);

    void b(G0 g02, S s10, S s11, ye.m0 m0Var);

    void c(InterfaceC7369c interfaceC7369c);

    void d(ye.l0 l0Var);
}

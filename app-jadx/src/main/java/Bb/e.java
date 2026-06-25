package Bb;

import Df.C1271d;
import Gf.N;
import Gf.P;
import Td.AbstractC2163n;
import Td.L;
import Ud.AbstractC2279u;
import android.content.Context;
import android.util.Log;
import bc.C3042a;
import bc.EnumC3046e;
import com.facebook.react.bridge.ReactContext;
import dg.C4618A;
import expo.modules.fetch.NativeRequest;
import expo.modules.fetch.NativeRequestInit;
import expo.modules.fetch.NativeResponse;
import expo.modules.kotlin.exception.CodedException;
import expo.modules.kotlin.exception.UnexpectedException;
import expo.modules.kotlin.jni.NativeArrayBuffer;
import hc.C4941m;
import he.AbstractC4945a;
import ie.InterfaceC5082a;
import java.net.URL;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.O;
import pc.C5972b;
import pc.C5974d;
import pc.M;
import pc.U;
import pc.V;
import pc.X;
import pe.InterfaceC6014d;
import pe.InterfaceC6027q;
import rb.AbstractC6300a;
import v7.InterfaceC6851a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000  2\u00020\u0001:\u0001!B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u001b\u0010\f\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001b\u0010\u0011\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0016\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\t\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\u001b\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\t\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006\""}, d2 = {"LBb/e;", "Lgc/c;", "<init>", "()V", "Lgc/e;", "n", "()Lgc/e;", "Ldg/A;", "d", "Lkotlin/Lazy;", "J", "()Ldg/A;", "client", "Lv7/d;", "e", "K", "()Lv7/d;", "cookieHandler", "Lv7/a;", "f", "L", "()Lv7/a;", "cookieJarContainer", "LGf/O;", "g", "M", "()LGf/O;", "moduleCoroutineScope", "Lcom/facebook/react/bridge/ReactContext;", "N", "()Lcom/facebook/react/bridge/ReactContext;", "reactContext", "h", "a", "expo_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class e extends gc.c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f1598i = e.class.getSimpleName();

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Lazy client = AbstractC2163n.b(new InterfaceC5082a() { // from class: Bb.a
        @Override // ie.InterfaceC5082a
        public final Object invoke() {
            return e.G(this.f1593a);
        }
    });

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Lazy cookieHandler = AbstractC2163n.b(new InterfaceC5082a() { // from class: Bb.b
        @Override // ie.InterfaceC5082a
        public final Object invoke() {
            return e.H(this.f1594a);
        }
    });

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final Lazy cookieJarContainer = AbstractC2163n.b(new InterfaceC5082a() { // from class: Bb.c
        @Override // ie.InterfaceC5082a
        public final Object invoke() {
            return e.I(this.f1595a);
        }
    });

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final Lazy moduleCoroutineScope = AbstractC2163n.b(new InterfaceC5082a() { // from class: Bb.d
        @Override // ie.InterfaceC5082a
        public final Object invoke() {
            return e.O(this.f1596a);
        }
    });

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class A implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final A f1603a = new A();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return O.o(NativeRequest.class);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class B implements Function1 {
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] objArr) {
            AbstractC5504s.h(objArr, "<destruct>");
            ((NativeRequest) objArr[0]).J();
            return L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C f1604a = new C();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return O.o(NativeRequest.class);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class D implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final D f1605a = new D();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return O.o(URL.class);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class E implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final E f1606a = new E();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return O.o(NativeRequestInit.class);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class F implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final F f1607a = new F();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return O.f(byte[].class);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class G implements Function2 {
        public G() {
        }

        public final void a(Object[] objArr, Ub.u promise) {
            AbstractC5504s.h(objArr, "<destruct>");
            AbstractC5504s.h(promise, "promise");
            Object obj = objArr[0];
            Object obj2 = objArr[1];
            Object obj3 = objArr[2];
            byte[] bArr = (byte[]) objArr[3];
            NativeRequest nativeRequest = (NativeRequest) obj;
            C4618A c4618aJ = e.this.J();
            nativeRequest.S(c4618aJ, (URL) obj2, (NativeRequestInit) obj3, bArr);
            nativeRequest.getResponse().Z1(AbstractC2279u.p(Bb.p.f1640d, Bb.p.f1644h), new C1101d(promise, nativeRequest));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((Object[]) obj, (Ub.u) obj2);
            return L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class H implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final H f1609a = new H();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return O.o(NativeResponse.class);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class I implements Function1 {
        public I() {
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] objArr) {
            AbstractC5504s.h(objArr, "<destruct>");
            return new NativeRequest(e.this.i(), (NativeResponse) objArr[0]);
        }
    }

    /* JADX INFO: renamed from: Bb.e$b, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class C1099b implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ NativeResponse f1611a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Ub.u f1612b;

        C1099b(NativeResponse nativeResponse, Ub.u uVar) {
            this.f1611a = nativeResponse;
            this.f1612b = uVar;
        }

        public final void a(Bb.p it) {
            AbstractC5504s.h(it, "it");
            this.f1612b.resolve(new NativeArrayBuffer(this.f1611a.getSink().b(true)));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Bb.p) obj);
            return L.f17438a;
        }
    }

    /* JADX INFO: renamed from: Bb.e$c, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class C1100c implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ NativeResponse f1613a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Ub.u f1614b;

        C1100c(NativeResponse nativeResponse, Ub.u uVar) {
            this.f1613a = nativeResponse;
            this.f1614b = uVar;
        }

        public final void a(Bb.p it) {
            AbstractC5504s.h(it, "it");
            byte[] bArrArray = this.f1613a.getSink().b(false).array();
            AbstractC5504s.e(bArrArray);
            this.f1614b.resolve(new String(bArrArray, C1271d.f3718b));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Bb.p) obj);
            return L.f17438a;
        }
    }

    /* JADX INFO: renamed from: Bb.e$d, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class C1101d implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Ub.u f1615a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ NativeRequest f1616b;

        C1101d(Ub.u uVar, NativeRequest nativeRequest) {
            this.f1615a = uVar;
            this.f1616b = nativeRequest;
        }

        public final void a(Bb.p state) {
            CodedException iVar;
            CodedException unexpectedException;
            AbstractC5504s.h(state, "state");
            if (state == Bb.p.f1640d) {
                this.f1615a.b();
                return;
            }
            if (state == Bb.p.f1644h) {
                Ub.u uVar = this.f1615a;
                Exception exc = this.f1616b.getResponse().getApp.notifee.core.event.LogEvent.LEVEL_ERROR java.lang.String();
                if (exc == null) {
                    iVar = new i();
                } else if (exc instanceof CodedException) {
                    iVar = (CodedException) exc;
                } else {
                    if (exc instanceof AbstractC6300a) {
                        AbstractC6300a abstractC6300a = (AbstractC6300a) exc;
                        String strA = abstractC6300a.a();
                        AbstractC5504s.g(strA, "getCode(...)");
                        unexpectedException = new CodedException(strA, abstractC6300a.getMessage(), abstractC6300a.getCause());
                    } else {
                        unexpectedException = new UnexpectedException(exc);
                    }
                    iVar = unexpectedException;
                }
                uVar.h(iVar);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Bb.p) obj);
            return L.f17438a;
        }
    }

    /* JADX INFO: renamed from: Bb.e$e, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C0018e implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0018e f1617a = new C0018e();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return O.o(NativeResponse.class);
        }
    }

    /* JADX INFO: renamed from: Bb.e$f, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C1102f implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C1102f f1618a = new C1102f();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return O.o(NativeRequest.class);
        }
    }

    /* JADX INFO: renamed from: Bb.e$g, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C1103g implements InterfaceC5082a {
        public C1103g() {
        }

        public final void a() {
            e.this.L().a(new dg.w(e.this.K()));
        }

        @Override // ie.InterfaceC5082a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return L.f17438a;
        }
    }

    /* JADX INFO: renamed from: Bb.e$h, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C1104h implements InterfaceC5082a {
        public C1104h() {
        }

        public final void a() {
            e.this.K().f();
            e.this.L().c();
            try {
                P.c(e.this.M(), new rb.e(null, 1, null));
            } catch (IllegalStateException unused) {
                Log.e(e.f1598i, "The scope does not have a job in it");
            }
        }

        @Override // ie.InterfaceC5082a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return L.f17438a;
        }
    }

    /* JADX INFO: renamed from: Bb.e$i, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C1105i implements Function2 {
        /* JADX WARN: Multi-variable type inference failed */
        public final void a(Object[] objArr, Ub.u promise) {
            AbstractC5504s.h(objArr, "<unused var>");
            AbstractC5504s.h(promise, "promise");
            ((NativeResponse) promise).Y1();
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((Object[]) obj, (Ub.u) obj2);
            return L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class j implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final j f1621a = new j();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return O.o(NativeResponse.class);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class k implements Function1 {
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] objArr) {
            AbstractC5504s.h(objArr, "<destruct>");
            return ((NativeResponse) objArr[0]).Y1();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class l implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final l f1622a = new l();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return O.o(NativeResponse.class);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class m implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final m f1623a = new m();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return O.o(String.class);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class n implements Function1 {
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] objArr) {
            AbstractC5504s.h(objArr, "<destruct>");
            Object obj = objArr[0];
            ((NativeResponse) obj).p0();
            return L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class o implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final o f1624a = new o();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return O.o(NativeResponse.class);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class p implements Function2 {
        public final void a(Object[] objArr, Ub.u promise) {
            AbstractC5504s.h(objArr, "<destruct>");
            AbstractC5504s.h(promise, "promise");
            NativeResponse nativeResponse = (NativeResponse) objArr[0];
            nativeResponse.Z1(AbstractC2279u.e(Bb.p.f1641e), new C1099b(nativeResponse, promise));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((Object[]) obj, (Ub.u) obj2);
            return L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class q implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final q f1625a = new q();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return O.o(NativeResponse.class);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class r implements Function2 {
        public final void a(Object[] objArr, Ub.u promise) {
            AbstractC5504s.h(objArr, "<destruct>");
            AbstractC5504s.h(promise, "promise");
            NativeResponse nativeResponse = (NativeResponse) objArr[0];
            nativeResponse.Z1(AbstractC2279u.e(Bb.p.f1641e), new C1100c(nativeResponse, promise));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((Object[]) obj, (Ub.u) obj2);
            return L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class s implements Function1 {
        public s() {
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] it) {
            AbstractC5504s.h(it, "it");
            return new NativeResponse(e.this.i(), e.this.M());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class t implements Function1 {
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] it) {
            AbstractC5504s.h(it, "it");
            return Boolean.valueOf(((NativeResponse) it[0]).G0());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class u implements Function1 {
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] it) {
            List listA;
            AbstractC5504s.h(it, "it");
            Bb.m responseInit = ((NativeResponse) it[0]).getResponseInit();
            return (responseInit == null || (listA = responseInit.a()) == null) ? AbstractC2279u.m() : listA;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class v implements Function1 {
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] it) {
            AbstractC5504s.h(it, "it");
            Bb.m responseInit = ((NativeResponse) it[0]).getResponseInit();
            return Integer.valueOf(responseInit != null ? responseInit.c() : -1);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class w implements Function1 {
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] it) {
            String strD;
            AbstractC5504s.h(it, "it");
            Bb.m responseInit = ((NativeResponse) it[0]).getResponseInit();
            return (responseInit == null || (strD = responseInit.d()) == null) ? "" : strD;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class x implements Function1 {
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] it) {
            String strE;
            AbstractC5504s.h(it, "it");
            Bb.m responseInit = ((NativeResponse) it[0]).getResponseInit();
            return (responseInit == null || (strE = responseInit.e()) == null) ? "" : strE;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class y implements Function1 {
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] it) {
            AbstractC5504s.h(it, "it");
            Bb.m responseInit = ((NativeResponse) it[0]).getResponseInit();
            return Boolean.valueOf(responseInit != null ? responseInit.b() : false);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class z implements Function2 {
        /* JADX WARN: Multi-variable type inference failed */
        public final void a(Object[] objArr, Ub.u promise) {
            AbstractC5504s.h(objArr, "<unused var>");
            AbstractC5504s.h(promise, "promise");
            ((NativeRequest) promise).J();
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((Object[]) obj, (Ub.u) obj2);
            return L.f17438a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4618A G(e eVar) {
        return v7.f.b(eVar.N()).F().a(new expo.modules.fetch.b(eVar.N())).c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final v7.d H(e eVar) {
        return new v7.d(eVar.N());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC6851a I(e eVar) {
        dg.n nVarS = eVar.J().s();
        AbstractC5504s.f(nVarS, "null cannot be cast to non-null type com.facebook.react.modules.network.CookieJarContainer");
        return (InterfaceC6851a) nVarS;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C4618A J() {
        return (C4618A) this.client.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final v7.d K() {
        return (v7.d) this.cookieHandler.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC6851a L() {
        return (InterfaceC6851a) this.cookieJarContainer.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Gf.O M() {
        return (Gf.O) this.moduleCoroutineScope.getValue();
    }

    private final ReactContext N() throws cc.i {
        Context contextB = i().B();
        ReactContext reactContext = contextB instanceof ReactContext ? (ReactContext) contextB : null;
        if (reactContext != null) {
            return reactContext;
        }
        throw new cc.i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Gf.O O(e eVar) {
        return P.a(eVar.i().y().getCoroutineContext().w(new N("expo.modules.fetch.CoroutineScope")));
    }

    @Override // gc.c
    public gc.e n() {
        String str;
        Class cls;
        Class cls2;
        C5972b c5972b;
        Class cls3;
        Yb.c cVar;
        Class cls4;
        Object sVar;
        Object obj;
        Yb.c cVar2;
        Object lVar;
        X3.a.c("[ExpoModulesCore] " + (getClass() + ".ModuleDefinition"));
        try {
            gc.d dVar = new gc.d(this);
            dVar.s("ExpoFetchModule");
            Map mapW = dVar.w();
            EnumC3046e enumC3046e = EnumC3046e.f33268a;
            mapW.put(enumC3046e, new C3042a(enumC3046e, new C1103g()));
            Map mapW2 = dVar.w();
            EnumC3046e enumC3046e2 = EnumC3046e.f33269b;
            mapW2.put(enumC3046e2, new C3042a(enumC3046e2, new C1104h()));
            InterfaceC6014d interfaceC6014dB = O.b(NativeResponse.class);
            gc.c cVarX = dVar.x();
            if (cVarX == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            Ub.d dVarI = cVarX.i();
            String simpleName = AbstractC4945a.b(interfaceC6014dB).getSimpleName();
            AbstractC5504s.g(simpleName, "getSimpleName(...)");
            C5974d c5974d = C5974d.f55938a;
            InterfaceC6014d interfaceC6014dB2 = O.b(NativeResponse.class);
            Boolean bool = Boolean.FALSE;
            C5972b c5972b2 = (C5972b) c5974d.a().get(new Pair(interfaceC6014dB2, bool));
            if (c5972b2 == null) {
                cls = Boolean.class;
                cls2 = Object.class;
                str = "Required value was null.";
                c5972b = new C5972b(new M(O.b(NativeResponse.class), false, C0018e.f1617a), null);
            } else {
                str = "Required value was null.";
                cls = Boolean.class;
                cls2 = Object.class;
                c5972b = c5972b2;
            }
            Yb.c cVar3 = new Yb.c(dVarI, simpleName, interfaceC6014dB, c5972b, dVar.m());
            C5972b[] c5972bArr = new C5972b[0];
            V v10 = V.f55908a;
            U u10 = (U) v10.a().get(O.b(cls2));
            if (u10 == null) {
                u10 = new U(O.b(cls2));
                cls3 = NativeRequest.class;
                v10.a().put(O.b(cls2), u10);
            } else {
                cls3 = NativeRequest.class;
            }
            cVar3.B(new dc.r("constructor", c5972bArr, u10, new s()));
            if (AbstractC5504s.c(NativeResponse.class, Ub.u.class)) {
                cVar = cVar3;
                cls4 = NativeResponse.class;
                sVar = new dc.f("startStreaming", new C5972b[0], new C1105i());
            } else {
                X xM = cVar3.m();
                C5972b c5972b3 = (C5972b) c5974d.a().get(new Pair(O.b(NativeResponse.class), bool));
                if (c5972b3 == null) {
                    cVar = cVar3;
                    cls4 = NativeResponse.class;
                    c5972b3 = new C5972b(new M(O.b(NativeResponse.class), false, j.f1621a), xM);
                } else {
                    cVar = cVar3;
                    cls4 = NativeResponse.class;
                }
                sVar = new dc.s("startStreaming", new C5972b[]{c5972b3}, new k());
            }
            cVar.k().put("startStreaming", sVar);
            X xM2 = cVar.m();
            C5972b c5972b4 = (C5972b) c5974d.a().get(new Pair(O.b(cls4), bool));
            if (c5972b4 == null) {
                c5972b4 = new C5972b(new M(O.b(cls4), false, l.f1622a), xM2);
            }
            C5972b c5972b5 = (C5972b) c5974d.a().get(new Pair(O.b(String.class), bool));
            if (c5972b5 == null) {
                obj = Ub.u.class;
                c5972b5 = new C5972b(new M(O.b(String.class), false, m.f1623a), xM2);
            } else {
                obj = Ub.u.class;
            }
            C5972b[] c5972bArr2 = {c5972b4, c5972b5};
            n nVar = new n();
            Class cls5 = Integer.TYPE;
            boolean zC = AbstractC5504s.c(L.class, cls5);
            Class cls6 = Float.TYPE;
            Class cls7 = Double.TYPE;
            Class cls8 = Boolean.TYPE;
            cVar.k().put("cancelStreaming", zC ? new dc.l("cancelStreaming", c5972bArr2, nVar) : AbstractC5504s.c(L.class, cls8) ? new dc.h("cancelStreaming", c5972bArr2, nVar) : AbstractC5504s.c(L.class, cls7) ? new dc.i("cancelStreaming", c5972bArr2, nVar) : AbstractC5504s.c(L.class, cls6) ? new dc.j("cancelStreaming", c5972bArr2, nVar) : AbstractC5504s.c(L.class, String.class) ? new dc.n("cancelStreaming", c5972bArr2, nVar) : new dc.s("cancelStreaming", c5972bArr2, nVar));
            C4941m c4941m = new C4941m(cVar.y().g(), "bodyUsed");
            C5972b[] c5972bArr3 = {new C5972b(c4941m.d(), null, 2, false ? 1 : 0)};
            U u11 = (U) v10.a().get(O.b(cls));
            if (u11 == null) {
                u11 = new U(O.b(cls));
                v10.a().put(O.b(cls), u11);
            }
            dc.r rVar = new dc.r(com.amazon.a.a.o.b.au, c5972bArr3, u11, new t());
            rVar.l(c4941m.d());
            rVar.k(true);
            c4941m.b(rVar);
            cVar.o().put("bodyUsed", c4941m);
            C4941m c4941m2 = new C4941m(cVar.y().g(), "_rawHeaders");
            C5972b[] c5972bArr4 = {new C5972b(c4941m2.d(), null, 2, false ? 1 : 0)};
            U u12 = (U) v10.a().get(O.b(List.class));
            if (u12 == null) {
                u12 = new U(O.b(List.class));
                v10.a().put(O.b(List.class), u12);
            }
            dc.r rVar2 = new dc.r(com.amazon.a.a.o.b.au, c5972bArr4, u12, new u());
            rVar2.l(c4941m2.d());
            rVar2.k(true);
            c4941m2.b(rVar2);
            cVar.o().put("_rawHeaders", c4941m2);
            C4941m c4941m3 = new C4941m(cVar.y().g(), "status");
            C5972b[] c5972bArr5 = {new C5972b(c4941m3.d(), null, 2, false ? 1 : 0)};
            U u13 = (U) v10.a().get(O.b(Integer.class));
            if (u13 == null) {
                u13 = new U(O.b(Integer.class));
                v10.a().put(O.b(Integer.class), u13);
            }
            dc.r rVar3 = new dc.r(com.amazon.a.a.o.b.au, c5972bArr5, u13, new v());
            rVar3.l(c4941m3.d());
            rVar3.k(true);
            c4941m3.b(rVar3);
            cVar.o().put("status", c4941m3);
            C4941m c4941m4 = new C4941m(cVar.y().g(), "statusText");
            C5972b[] c5972bArr6 = {new C5972b(c4941m4.d(), null, 2, false ? 1 : 0)};
            U u14 = (U) v10.a().get(O.b(String.class));
            if (u14 == null) {
                u14 = new U(O.b(String.class));
                v10.a().put(O.b(String.class), u14);
            }
            dc.r rVar4 = new dc.r(com.amazon.a.a.o.b.au, c5972bArr6, u14, new w());
            rVar4.l(c4941m4.d());
            rVar4.k(true);
            c4941m4.b(rVar4);
            cVar.o().put("statusText", c4941m4);
            C4941m c4941m5 = new C4941m(cVar.y().g(), "url");
            C5972b[] c5972bArr7 = {new C5972b(c4941m5.d(), null, 2, false ? 1 : 0)};
            U u15 = (U) v10.a().get(O.b(String.class));
            if (u15 == null) {
                u15 = new U(O.b(String.class));
                v10.a().put(O.b(String.class), u15);
            }
            dc.r rVar5 = new dc.r(com.amazon.a.a.o.b.au, c5972bArr7, u15, new x());
            rVar5.l(c4941m5.d());
            rVar5.k(true);
            c4941m5.b(rVar5);
            cVar.o().put("url", c4941m5);
            C4941m c4941m6 = new C4941m(cVar.y().g(), "redirected");
            C5972b[] c5972bArr8 = {new C5972b(c4941m6.d(), null, 2, false ? 1 : 0)};
            U u16 = (U) v10.a().get(O.b(cls));
            if (u16 == null) {
                u16 = new U(O.b(cls));
                v10.a().put(O.b(cls), u16);
            }
            dc.r rVar6 = new dc.r(com.amazon.a.a.o.b.au, c5972bArr8, u16, new y());
            rVar6.l(c4941m6.d());
            rVar6.k(true);
            c4941m6.b(rVar6);
            cVar.o().put("redirected", c4941m6);
            X xM3 = cVar.m();
            C5972b c5972b6 = (C5972b) c5974d.a().get(new Pair(O.b(cls4), bool));
            if (c5972b6 == null) {
                c5972b6 = new C5972b(new M(O.b(cls4), false, o.f1624a), xM3);
            }
            cVar.k().put("arrayBuffer", new dc.f("arrayBuffer", new C5972b[]{c5972b6}, new p()));
            X xM4 = cVar.m();
            C5972b c5972b7 = (C5972b) c5974d.a().get(new Pair(O.b(cls4), bool));
            if (c5972b7 == null) {
                c5972b7 = new C5972b(new M(O.b(cls4), false, q.f1625a), xM4);
            }
            cVar.k().put("text", new dc.f("text", new C5972b[]{c5972b7}, new r()));
            dVar.v().add(cVar.v());
            InterfaceC6014d interfaceC6014dB3 = O.b(cls3);
            gc.c cVarX2 = dVar.x();
            if (cVarX2 == null) {
                throw new IllegalArgumentException(str);
            }
            Ub.d dVarI2 = cVarX2.i();
            String simpleName2 = AbstractC4945a.b(interfaceC6014dB3).getSimpleName();
            AbstractC5504s.g(simpleName2, "getSimpleName(...)");
            C5972b c5972b8 = (C5972b) c5974d.a().get(new Pair(O.b(cls3), bool));
            Yb.c cVar4 = new Yb.c(dVarI2, simpleName2, interfaceC6014dB3, c5972b8 == null ? new C5972b(new M(O.b(cls3), false, C1102f.f1618a), null) : c5972b8, dVar.m());
            X xM5 = cVar4.m();
            C5972b c5972b9 = (C5972b) c5974d.a().get(new Pair(O.b(cls4), bool));
            if (c5972b9 == null) {
                c5972b9 = new C5972b(new M(O.b(cls4), false, H.f1609a), xM5);
            }
            C5972b[] c5972bArr9 = {c5972b9};
            U u17 = (U) v10.a().get(O.b(cls2));
            if (u17 == null) {
                u17 = new U(O.b(cls2));
                v10.a().put(O.b(cls2), u17);
            }
            cVar4.B(new dc.r("constructor", c5972bArr9, u17, new I()));
            X xM6 = cVar4.m();
            C5972b c5972b10 = (C5972b) c5974d.a().get(new Pair(O.b(cls3), bool));
            if (c5972b10 == null) {
                c5972b10 = new C5972b(new M(O.b(cls3), false, C.f1604a), xM6);
            }
            C5972b c5972b11 = (C5972b) c5974d.a().get(new Pair(O.b(URL.class), bool));
            if (c5972b11 == null) {
                c5972b11 = new C5972b(new M(O.b(URL.class), false, D.f1605a), xM6);
            }
            C5972b c5972b12 = (C5972b) c5974d.a().get(new Pair(O.b(NativeRequestInit.class), bool));
            if (c5972b12 == null) {
                c5972b12 = new C5972b(new M(O.b(NativeRequestInit.class), false, E.f1606a), xM6);
            }
            C5972b c5972b13 = (C5972b) c5974d.a().get(new Pair(O.b(byte[].class), Boolean.TRUE));
            if (c5972b13 == null) {
                cVar2 = cVar4;
                c5972b13 = new C5972b(new M(O.b(byte[].class), true, F.f1607a), xM6);
            } else {
                cVar2 = cVar4;
            }
            cVar2.k().put("start", new dc.f("start", new C5972b[]{c5972b10, c5972b11, c5972b12, c5972b13}, new G()));
            Class cls9 = cls3;
            if (AbstractC5504s.c(cls9, obj)) {
                lVar = new dc.f("cancel", new C5972b[0], new z());
            } else {
                X xM7 = cVar2.m();
                C5972b c5972b14 = (C5972b) c5974d.a().get(new Pair(O.b(cls9), bool));
                if (c5972b14 == null) {
                    c5972b14 = new C5972b(new M(O.b(cls9), false, A.f1603a), xM7);
                }
                C5972b[] c5972bArr10 = {c5972b14};
                B b10 = new B();
                lVar = AbstractC5504s.c(L.class, cls5) ? new dc.l("cancel", c5972bArr10, b10) : AbstractC5504s.c(L.class, cls8) ? new dc.h("cancel", c5972bArr10, b10) : AbstractC5504s.c(L.class, cls7) ? new dc.i("cancel", c5972bArr10, b10) : AbstractC5504s.c(L.class, cls6) ? new dc.j("cancel", c5972bArr10, b10) : AbstractC5504s.c(L.class, String.class) ? new dc.n("cancel", c5972bArr10, b10) : new dc.s("cancel", c5972bArr10, b10);
            }
            cVar2.k().put("cancel", lVar);
            dVar.v().add(cVar2.v());
            gc.e eVarU = dVar.u();
            X3.a.f();
            return eVarU;
        } catch (Throwable th2) {
            X3.a.f();
            throw th2;
        }
    }
}

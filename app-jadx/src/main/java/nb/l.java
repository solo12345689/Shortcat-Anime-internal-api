package nb;

import Td.AbstractC2163n;
import Td.L;
import Td.u;
import Td.v;
import Td.z;
import Ud.AbstractC2279u;
import ae.AbstractC2605b;
import android.content.ClipData;
import android.content.ClipDescription;
import android.content.ClipboardManager;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import bc.C3042a;
import bc.EnumC3046e;
import dc.C4581b;
import expo.modules.clipboard.GetImageOptions;
import expo.modules.clipboard.GetStringOptions;
import expo.modules.clipboard.SetStringOptions;
import expo.modules.clipboard.StringFormat;
import expo.modules.kotlin.exception.CodedException;
import ie.InterfaceC5082a;
import ie.InterfaceC5096o;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.O;
import nb.l;
import pc.C5972b;
import pc.C5974d;
import pc.M;
import pc.X;
import pe.InterfaceC6014d;
import pe.InterfaceC6027q;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\"B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u001b\u0010\u0011\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0015\u001a\u00060\u0012R\u00020\u00008\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010!\u001a\u0004\u0018\u00010\u001e*\u00020\u001a8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ¨\u0006#"}, d2 = {"Lnb/l;", "Lgc/c;", "<init>", "()V", "", "mimeType", "", "G", "(Ljava/lang/String;)Z", "Lgc/e;", "n", "()Lgc/e;", "Ljava/io/File;", "d", "Lkotlin/Lazy;", "H", "()Ljava/io/File;", "clipboardCacheDir", "Lnb/l$a;", "e", "Lnb/l$a;", "clipboardEventEmitter", "Landroid/content/Context;", "J", "()Landroid/content/Context;", "context", "Landroid/content/ClipboardManager;", "I", "()Landroid/content/ClipboardManager;", "clipboardManager", "Landroid/content/ClipData$Item;", "K", "(Landroid/content/ClipboardManager;)Landroid/content/ClipData$Item;", "firstItem", "a", "expo-clipboard_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class l extends gc.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Lazy clipboardCacheDir = AbstractC2163n.b(new InterfaceC5082a() { // from class: nb.i
        @Override // ie.InterfaceC5082a
        public final Object invoke() {
            return l.F(this.f54063a);
        }
    });

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private a clipboardEventEmitter;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f54068a = true;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f54069b = -1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final ClipboardManager.OnPrimaryClipChangedListener f54070c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final ClipboardManager f54071d;

        public a() {
            Object objB;
            this.f54070c = new ClipboardManager.OnPrimaryClipChangedListener() { // from class: nb.k
                @Override // android.content.ClipboardManager.OnPrimaryClipChangedListener
                public final void onPrimaryClipChanged() {
                    l.a.d(lVar, this);
                }
            };
            try {
                u.a aVar = u.f17466b;
                objB = u.b(l.this.I());
            } catch (Throwable th2) {
                u.a aVar2 = u.f17466b;
                objB = u.b(v.a(th2));
            }
            this.f54071d = (ClipboardManager) (u.g(objB) ? null : objB);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void d(l lVar, a aVar) {
            ClipDescription primaryClipDescription;
            if (lVar.i().t()) {
                ClipboardManager clipboardManager = aVar.f54071d;
                if (!aVar.f54068a) {
                    clipboardManager = null;
                }
                if (clipboardManager == null || (primaryClipDescription = clipboardManager.getPrimaryClipDescription()) == null) {
                    return;
                }
                if (Build.VERSION.SDK_INT >= 26) {
                    if (aVar.f54069b == primaryClipDescription.getTimestamp()) {
                        return;
                    } else {
                        aVar.f54069b = primaryClipDescription.getTimestamp();
                    }
                }
                nb.o oVar = nb.o.f54095b;
                if (!nb.m.f(primaryClipDescription)) {
                    oVar = null;
                }
                nb.o oVar2 = nb.o.f54096c;
                if (!primaryClipDescription.hasMimeType("text/html")) {
                    oVar2 = null;
                }
                List listR = AbstractC2279u.r(oVar, oVar2, primaryClipDescription.hasMimeType("image/*") ? nb.o.f54097d : null);
                ArrayList arrayList = new ArrayList(AbstractC2279u.x(listR, 10));
                Iterator it = listR.iterator();
                while (it.hasNext()) {
                    arrayList.add(((nb.o) it.next()).b());
                }
                lVar.s("onClipboardChanged", G1.c.a(z.a("contentTypes", arrayList)));
            }
        }

        public final Object b() {
            L l10;
            ClipboardManager clipboardManager = this.f54071d;
            if (clipboardManager != null) {
                clipboardManager.addPrimaryClipChangedListener(this.f54070c);
                l10 = L.f17438a;
            } else {
                l10 = null;
            }
            return l10 == null ? Integer.valueOf(Log.e(nb.m.f54094a, "'CLIPBOARD_SERVICE' unavailable. Events won't be received")) : l10;
        }

        public final L c() {
            ClipboardManager clipboardManager = this.f54071d;
            if (clipboardManager == null) {
                return null;
            }
            clipboardManager.removePrimaryClipChangedListener(this.f54070c);
            return L.f17438a;
        }

        public final void e() {
            this.f54068a = false;
        }

        public final void f() {
            this.f54068a = true;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f54073a;

        static {
            int[] iArr = new int[StringFormat.values().length];
            try {
                iArr[StringFormat.PLAIN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StringFormat.HTML.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f54073a = iArr;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class c implements Function2 {
        public c() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void a(Object[] objArr, Ub.u promise) {
            AbstractC5504s.h(objArr, "<unused var>");
            AbstractC5504s.h(promise, "promise");
            l lVar = l.this;
            ClipData.Item itemK = lVar.K(lVar.I());
            int i10 = b.f54073a[((GetStringOptions) promise).getPreferredFormat().ordinal()];
            if (i10 == 1) {
                if (itemK != null) {
                    nb.m.e(itemK, l.this.J());
                }
            } else {
                if (i10 != 2) {
                    throw new Td.r();
                }
                if (itemK != null) {
                    itemK.coerceToHtmlText(l.this.J());
                }
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((Object[]) obj, (Ub.u) obj2);
            return L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class d implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f54075a = new d();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return O.o(GetStringOptions.class);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class e implements Function1 {
        public e() {
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] objArr) {
            AbstractC5504s.h(objArr, "<destruct>");
            GetStringOptions getStringOptions = (GetStringOptions) objArr[0];
            l lVar = l.this;
            ClipData.Item itemK = lVar.K(lVar.I());
            int i10 = b.f54073a[getStringOptions.getPreferredFormat().ordinal()];
            String strE = null;
            if (i10 != 1) {
                if (i10 != 2) {
                    throw new Td.r();
                }
                if (itemK != null) {
                    strE = itemK.coerceToHtmlText(l.this.J());
                }
            } else if (itemK != null) {
                strE = nb.m.e(itemK, l.this.J());
            }
            return strE == null ? "" : strE;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class f implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f f54077a = new f();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return O.o(String.class);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class g implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final g f54078a = new g();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return O.o(SetStringOptions.class);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class h implements Function1 {
        public h() {
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] objArr) {
            ClipData clipDataNewPlainText;
            AbstractC5504s.h(objArr, "<destruct>");
            String str = (String) objArr[0];
            int i10 = b.f54073a[((SetStringOptions) objArr[1]).getInputFormat().ordinal()];
            if (i10 == 1) {
                clipDataNewPlainText = ClipData.newPlainText(null, str);
            } else {
                if (i10 != 2) {
                    throw new Td.r();
                }
                clipDataNewPlainText = ClipData.newHtmlText(null, nb.m.g(str), str);
            }
            l.this.I().setPrimaryClip(clipDataNewPlainText);
            return Boolean.TRUE;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class i implements Function1 {
        public i() {
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] it) {
            AbstractC5504s.h(it, "it");
            ClipDescription primaryClipDescription = l.this.I().getPrimaryClipDescription();
            return Boolean.valueOf(primaryClipDescription != null ? nb.m.f(primaryClipDescription) : false);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class j implements Function1 {
        public j() {
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] it) {
            AbstractC5504s.h(it, "it");
            ClipDescription primaryClipDescription = l.this.I().getPrimaryClipDescription();
            boolean z10 = false;
            if (primaryClipDescription != null && primaryClipDescription.hasMimeType("image/*")) {
                z10 = true;
            }
            return Boolean.valueOf(z10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class k implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final k f54082a = new k();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return O.o(GetImageOptions.class);
        }
    }

    /* JADX INFO: renamed from: nb.l$l, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C0840l extends kotlin.coroutines.jvm.internal.l implements InterfaceC5096o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f54083a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f54084b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ l f54085c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0840l(Zd.e eVar, l lVar) {
            super(3, eVar);
            this.f54085c = lVar;
        }

        @Override // ie.InterfaceC5096o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Gf.O o10, Object[] objArr, Zd.e eVar) {
            C0840l c0840l = new C0840l(eVar, this.f54085c);
            c0840l.f54084b = objArr;
            return c0840l.invokeSuspend(L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            ClipData.Item itemK;
            Object objF = AbstractC2605b.f();
            int i10 = this.f54083a;
            try {
                if (i10 == 0) {
                    v.b(obj);
                    GetImageOptions getImageOptions = (GetImageOptions) ((Object[]) this.f54084b)[0];
                    ClipboardManager clipboardManagerI = this.f54085c.I();
                    if (!this.f54085c.G("image/*")) {
                        clipboardManagerI = null;
                    }
                    Uri uri = (clipboardManagerI == null || (itemK = this.f54085c.K(clipboardManagerI)) == null) ? null : itemK.getUri();
                    if (uri == null) {
                        return null;
                    }
                    Context contextJ = this.f54085c.J();
                    this.f54083a = 1;
                    obj = expo.modules.clipboard.a.t(contextJ, uri, getImageOptions, this);
                    if (obj == objF) {
                        return objF;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    v.b(obj);
                }
                return ((nb.q) obj).a();
            } catch (Throwable th2) {
                th2.printStackTrace();
                if (th2 instanceof CodedException) {
                    throw th2;
                }
                throw (th2 instanceof SecurityException ? new s(th2) : new t(th2, "image"));
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class m implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final m f54086a = new m();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return O.o(String.class);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class n extends kotlin.coroutines.jvm.internal.l implements InterfaceC5096o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f54087a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f54088b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ l f54089c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(Zd.e eVar, l lVar) {
            super(3, eVar);
            this.f54089c = lVar;
        }

        @Override // ie.InterfaceC5096o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Gf.O o10, Object[] objArr, Zd.e eVar) {
            n nVar = new n(eVar, this.f54089c);
            nVar.f54088b = objArr;
            return nVar.invokeSuspend(L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = AbstractC2605b.f();
            int i10 = this.f54087a;
            try {
                if (i10 == 0) {
                    v.b(obj);
                    String str = (String) ((Object[]) this.f54088b)[0];
                    Context contextJ = this.f54089c.J();
                    File fileH = this.f54089c.H();
                    this.f54087a = 1;
                    obj = expo.modules.clipboard.a.k(contextJ, str, fileH, this);
                    if (obj == objF) {
                        return objF;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    v.b(obj);
                }
                this.f54089c.I().setPrimaryClip((ClipData) obj);
                return L.f17438a;
            } finally {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class o implements InterfaceC5082a {
        public o() {
        }

        public final void a() {
            a aVar = l.this.clipboardEventEmitter;
            if (aVar == null) {
                AbstractC5504s.u("clipboardEventEmitter");
                aVar = null;
            }
            aVar.e();
        }

        @Override // ie.InterfaceC5082a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class p implements InterfaceC5082a {
        public p() {
        }

        public final void a() {
            a aVar = l.this.clipboardEventEmitter;
            if (aVar == null) {
                AbstractC5504s.u("clipboardEventEmitter");
                aVar = null;
            }
            aVar.f();
        }

        @Override // ie.InterfaceC5082a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class q implements InterfaceC5082a {
        public q() {
        }

        public final void a() {
            l lVar = l.this;
            lVar.clipboardEventEmitter = lVar.new a();
            a aVar = l.this.clipboardEventEmitter;
            if (aVar == null) {
                AbstractC5504s.u("clipboardEventEmitter");
                aVar = null;
            }
            aVar.b();
        }

        @Override // ie.InterfaceC5082a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class r implements InterfaceC5082a {
        public r() {
        }

        public final void a() {
            a aVar = l.this.clipboardEventEmitter;
            if (aVar == null) {
                AbstractC5504s.u("clipboardEventEmitter");
                aVar = null;
            }
            aVar.c();
        }

        @Override // ie.InterfaceC5082a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return L.f17438a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final File F(l lVar) {
        File file = new File(lVar.J().getCacheDir(), ".clipboard");
        file.mkdirs();
        return file;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean G(String mimeType) {
        ClipDescription primaryClipDescription = I().getPrimaryClipDescription();
        if (primaryClipDescription != null) {
            return primaryClipDescription.hasMimeType(mimeType);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final File H() {
        return (File) this.clipboardCacheDir.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ClipboardManager I() throws nb.n {
        Object systemService = J().getSystemService("clipboard");
        ClipboardManager clipboardManager = systemService instanceof ClipboardManager ? (ClipboardManager) systemService : null;
        if (clipboardManager != null) {
            return clipboardManager;
        }
        throw new nb.n();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Context J() {
        Context contextB = i().B();
        if (contextB != null) {
            return contextB;
        }
        throw new IllegalArgumentException("React Application Context is null");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ClipData.Item K(ClipboardManager clipboardManager) {
        ClipData primaryClip = clipboardManager.getPrimaryClip();
        if (primaryClip != null) {
            if (primaryClip.getItemCount() <= 0) {
                primaryClip = null;
            }
            if (primaryClip != null) {
                return primaryClip.getItemAt(0);
            }
        }
        return null;
    }

    @Override // gc.c
    public gc.e n() {
        Class cls;
        dc.g lVar;
        Class cls2;
        C5974d c5974d;
        Boolean bool;
        Class cls3;
        Class cls4;
        X3.a.c("[ExpoModulesCore] " + (getClass() + ".ModuleDefinition"));
        try {
            gc.d dVar = new gc.d(this);
            dVar.s("ExpoClipboard");
            boolean zC = AbstractC5504s.c(GetStringOptions.class, Ub.u.class);
            Class cls5 = Integer.TYPE;
            Class cls6 = Float.TYPE;
            Class cls7 = Double.TYPE;
            Class cls8 = Boolean.TYPE;
            if (zC) {
                lVar = new dc.f("getStringAsync", new C5972b[0], new c());
                cls = GetImageOptions.class;
            } else {
                X xM = dVar.m();
                cls = GetImageOptions.class;
                C5972b c5972b = (C5972b) C5974d.f55938a.a().get(new Pair(O.b(GetStringOptions.class), Boolean.FALSE));
                if (c5972b == null) {
                    c5972b = new C5972b(new M(O.b(GetStringOptions.class), false, d.f54075a), xM);
                }
                C5972b[] c5972bArr = {c5972b};
                e eVar = new e();
                lVar = AbstractC5504s.c(String.class, cls5) ? new dc.l("getStringAsync", c5972bArr, eVar) : AbstractC5504s.c(String.class, cls8) ? new dc.h("getStringAsync", c5972bArr, eVar) : AbstractC5504s.c(String.class, cls7) ? new dc.i("getStringAsync", c5972bArr, eVar) : AbstractC5504s.c(String.class, cls6) ? new dc.j("getStringAsync", c5972bArr, eVar) : AbstractC5504s.c(String.class, String.class) ? new dc.n("getStringAsync", c5972bArr, eVar) : new dc.s("getStringAsync", c5972bArr, eVar);
            }
            dVar.k().put("getStringAsync", lVar);
            X xM2 = dVar.m();
            C5974d c5974d2 = C5974d.f55938a;
            InterfaceC6014d interfaceC6014dB = O.b(String.class);
            Boolean bool2 = Boolean.FALSE;
            C5972b c5972b2 = (C5972b) c5974d2.a().get(new Pair(interfaceC6014dB, bool2));
            if (c5972b2 == null) {
                cls2 = SetStringOptions.class;
                c5974d = c5974d2;
                c5972b2 = new C5972b(new M(O.b(String.class), false, f.f54077a), xM2);
            } else {
                cls2 = SetStringOptions.class;
                c5974d = c5974d2;
            }
            C5972b c5972b3 = (C5972b) c5974d.a().get(new Pair(O.b(cls2), bool2));
            if (c5972b3 == null) {
                g gVar = g.f54078a;
                InterfaceC6014d interfaceC6014dB2 = O.b(cls2);
                bool = bool2;
                c5972b3 = new C5972b(new M(interfaceC6014dB2, false, gVar), xM2);
            } else {
                bool = bool2;
            }
            C5972b[] c5972bArr2 = {c5972b2, c5972b3};
            h hVar = new h();
            dVar.k().put("setStringAsync", AbstractC5504s.c(Boolean.class, cls5) ? new dc.l("setStringAsync", c5972bArr2, hVar) : AbstractC5504s.c(Boolean.class, cls8) ? new dc.h("setStringAsync", c5972bArr2, hVar) : AbstractC5504s.c(Boolean.class, cls7) ? new dc.i("setStringAsync", c5972bArr2, hVar) : AbstractC5504s.c(Boolean.class, cls6) ? new dc.j("setStringAsync", c5972bArr2, hVar) : AbstractC5504s.c(Boolean.class, String.class) ? new dc.n("setStringAsync", c5972bArr2, hVar) : new dc.s("setStringAsync", c5972bArr2, hVar));
            C5972b[] c5972bArr3 = new C5972b[0];
            i iVar = new i();
            dVar.k().put("hasStringAsync", AbstractC5504s.c(Boolean.class, cls5) ? new dc.l("hasStringAsync", c5972bArr3, iVar) : AbstractC5504s.c(Boolean.class, cls8) ? new dc.h("hasStringAsync", c5972bArr3, iVar) : AbstractC5504s.c(Boolean.class, cls7) ? new dc.i("hasStringAsync", c5972bArr3, iVar) : AbstractC5504s.c(Boolean.class, cls6) ? new dc.j("hasStringAsync", c5972bArr3, iVar) : AbstractC5504s.c(Boolean.class, String.class) ? new dc.n("hasStringAsync", c5972bArr3, iVar) : new dc.s("hasStringAsync", c5972bArr3, iVar));
            C4581b c4581bB = dVar.b("getImageAsync");
            String strC = c4581bB.c();
            X xB = c4581bB.b();
            Boolean bool3 = bool;
            C5972b c5972b4 = (C5972b) c5974d.a().get(new Pair(O.b(cls), bool3));
            if (c5972b4 == null) {
                k kVar = k.f54082a;
                cls4 = String.class;
                InterfaceC6014d interfaceC6014dB3 = O.b(cls);
                cls3 = cls6;
                c5972b4 = new C5972b(new M(interfaceC6014dB3, false, kVar), xB);
            } else {
                cls3 = cls6;
                cls4 = String.class;
            }
            c4581bB.d(new dc.p(strC, new C5972b[]{c5972b4}, new C0840l(null, this)));
            C4581b c4581bB2 = dVar.b("setImageAsync");
            String strC2 = c4581bB2.c();
            X xB2 = c4581bB2.b();
            C5972b c5972b5 = (C5972b) c5974d.a().get(new Pair(O.b(cls4), bool3));
            if (c5972b5 == null) {
                c5972b5 = new C5972b(new M(O.b(cls4), false, m.f54086a), xB2);
            }
            c4581bB2.d(new dc.p(strC2, new C5972b[]{c5972b5}, new n(null, this)));
            C5972b[] c5972bArr4 = new C5972b[0];
            j jVar = new j();
            dVar.k().put("hasImageAsync", AbstractC5504s.c(Boolean.class, cls5) ? new dc.l("hasImageAsync", c5972bArr4, jVar) : AbstractC5504s.c(Boolean.class, cls8) ? new dc.h("hasImageAsync", c5972bArr4, jVar) : AbstractC5504s.c(Boolean.class, cls7) ? new dc.i("hasImageAsync", c5972bArr4, jVar) : AbstractC5504s.c(Boolean.class, cls3) ? new dc.j("hasImageAsync", c5972bArr4, jVar) : AbstractC5504s.c(Boolean.class, cls4) ? new dc.n("hasImageAsync", c5972bArr4, jVar) : new dc.s("hasImageAsync", c5972bArr4, jVar));
            dVar.d("onClipboardChanged");
            Map mapW = dVar.w();
            EnumC3046e enumC3046e = EnumC3046e.f33268a;
            mapW.put(enumC3046e, new C3042a(enumC3046e, new q()));
            Map mapW2 = dVar.w();
            EnumC3046e enumC3046e2 = EnumC3046e.f33269b;
            mapW2.put(enumC3046e2, new C3042a(enumC3046e2, new r()));
            Map mapW3 = dVar.w();
            EnumC3046e enumC3046e3 = EnumC3046e.f33271d;
            mapW3.put(enumC3046e3, new C3042a(enumC3046e3, new o()));
            Map mapW4 = dVar.w();
            EnumC3046e enumC3046e4 = EnumC3046e.f33270c;
            mapW4.put(enumC3046e4, new C3042a(enumC3046e4, new p()));
            gc.e eVarU = dVar.u();
            X3.a.f();
            return eVarU;
        } catch (Throwable th2) {
            X3.a.f();
            throw th2;
        }
    }
}

package Be;

import Be.V;
import Ud.AbstractC2279u;
import com.revenuecat.purchases.common.verification.SigningManager;
import com.revenuecat.purchases.ui.revenuecatui.composables.BackgroundUIConstants;
import com.revenuecat.purchases.ui.revenuecatui.helpers.ColorExtractionConstants;
import ie.InterfaceC5082a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kf.C5472d;
import kf.InterfaceC5474f;
import qf.E0;
import qf.G0;
import qf.N0;
import ye.AbstractC7241t;
import ye.AbstractC7242u;
import ye.InterfaceC7223a;
import ye.InterfaceC7224b;
import ye.InterfaceC7235m;
import ye.InterfaceC7237o;
import ye.InterfaceC7247z;
import ye.c0;
import ye.h0;
import ye.m0;
import ye.t0;
import ze.AbstractC7376j;
import ze.InterfaceC7374h;

/* JADX INFO: renamed from: Be.s */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC1123s extends AbstractC1119n implements InterfaceC7247z {

    /* JADX INFO: renamed from: A */
    private final InterfaceC7247z f1828A;

    /* JADX INFO: renamed from: B */
    private final InterfaceC7224b.a f1829B;

    /* JADX INFO: renamed from: C */
    private InterfaceC7247z f1830C;

    /* JADX INFO: renamed from: D */
    protected Map f1831D;

    /* JADX INFO: renamed from: e */
    private List f1832e;

    /* JADX INFO: renamed from: f */
    private List f1833f;

    /* JADX INFO: renamed from: g */
    private qf.S f1834g;

    /* JADX INFO: renamed from: h */
    private List f1835h;

    /* JADX INFO: renamed from: i */
    private c0 f1836i;

    /* JADX INFO: renamed from: j */
    private c0 f1837j;

    /* JADX INFO: renamed from: k */
    private ye.E f1838k;

    /* JADX INFO: renamed from: l */
    private AbstractC7242u f1839l;

    /* JADX INFO: renamed from: m */
    private boolean f1840m;

    /* JADX INFO: renamed from: n */
    private boolean f1841n;

    /* JADX INFO: renamed from: o */
    private boolean f1842o;

    /* JADX INFO: renamed from: p */
    private boolean f1843p;

    /* JADX INFO: renamed from: q */
    private boolean f1844q;

    /* JADX INFO: renamed from: r */
    private boolean f1845r;

    /* JADX INFO: renamed from: s */
    private boolean f1846s;

    /* JADX INFO: renamed from: t */
    private boolean f1847t;

    /* JADX INFO: renamed from: u */
    private boolean f1848u;

    /* JADX INFO: renamed from: v */
    private boolean f1849v;

    /* JADX INFO: renamed from: w */
    private boolean f1850w;

    /* JADX INFO: renamed from: x */
    private boolean f1851x;

    /* JADX INFO: renamed from: y */
    private Collection f1852y;

    /* JADX INFO: renamed from: z */
    private volatile InterfaceC5082a f1853z;

    /* JADX INFO: renamed from: Be.s$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a implements InterfaceC5082a {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ G0 f1854a;

        a(G0 g02) {
            this.f1854a = g02;
        }

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a */
        public Collection invoke() {
            Af.j jVar = new Af.j();
            Iterator it = AbstractC1123s.this.e().iterator();
            while (it.hasNext()) {
                jVar.add(((InterfaceC7247z) it.next()).c(this.f1854a));
            }
            return jVar;
        }
    }

    /* JADX INFO: renamed from: Be.s$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class b implements InterfaceC5082a {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ List f1856a;

        b(List list) {
            this.f1856a = list;
        }

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a */
        public List invoke() {
            return this.f1856a;
        }
    }

    /* JADX INFO: renamed from: Be.s$c */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public class c implements InterfaceC7247z.a {

        /* JADX INFO: renamed from: a */
        protected E0 f1857a;

        /* JADX INFO: renamed from: b */
        protected InterfaceC7235m f1858b;

        /* JADX INFO: renamed from: c */
        protected ye.E f1859c;

        /* JADX INFO: renamed from: d */
        protected AbstractC7242u f1860d;

        /* JADX INFO: renamed from: e */
        protected InterfaceC7247z f1861e;

        /* JADX INFO: renamed from: f */
        protected InterfaceC7224b.a f1862f;

        /* JADX INFO: renamed from: g */
        protected List f1863g;

        /* JADX INFO: renamed from: h */
        protected List f1864h;

        /* JADX INFO: renamed from: i */
        protected c0 f1865i;

        /* JADX INFO: renamed from: j */
        protected c0 f1866j;

        /* JADX INFO: renamed from: k */
        protected qf.S f1867k;

        /* JADX INFO: renamed from: l */
        protected Xe.f f1868l;

        /* JADX INFO: renamed from: m */
        protected boolean f1869m;

        /* JADX INFO: renamed from: n */
        protected boolean f1870n;

        /* JADX INFO: renamed from: o */
        protected boolean f1871o;

        /* JADX INFO: renamed from: p */
        protected boolean f1872p;

        /* JADX INFO: renamed from: q */
        private boolean f1873q;

        /* JADX INFO: renamed from: r */
        private List f1874r;

        /* JADX INFO: renamed from: s */
        private InterfaceC7374h f1875s;

        /* JADX INFO: renamed from: t */
        private boolean f1876t;

        /* JADX INFO: renamed from: u */
        private Map f1877u;

        /* JADX INFO: renamed from: v */
        private Boolean f1878v;

        /* JADX INFO: renamed from: w */
        protected boolean f1879w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ AbstractC1123s f1880x;

        public c(AbstractC1123s abstractC1123s, E0 e02, InterfaceC7235m interfaceC7235m, ye.E e10, AbstractC7242u abstractC7242u, InterfaceC7224b.a aVar, List list, List list2, c0 c0Var, qf.S s10, Xe.f fVar) {
            if (e02 == null) {
                u(0);
            }
            if (interfaceC7235m == null) {
                u(1);
            }
            if (e10 == null) {
                u(2);
            }
            if (abstractC7242u == null) {
                u(3);
            }
            if (aVar == null) {
                u(4);
            }
            if (list == null) {
                u(5);
            }
            if (list2 == null) {
                u(6);
            }
            if (s10 == null) {
                u(7);
            }
            this.f1880x = abstractC1123s;
            this.f1861e = null;
            this.f1866j = abstractC1123s.f1837j;
            this.f1869m = true;
            this.f1870n = false;
            this.f1871o = false;
            this.f1872p = false;
            this.f1873q = abstractC1123s.D0();
            this.f1874r = null;
            this.f1875s = null;
            this.f1876t = abstractC1123s.G0();
            this.f1877u = new LinkedHashMap();
            this.f1878v = null;
            this.f1879w = false;
            this.f1857a = e02;
            this.f1858b = interfaceC7235m;
            this.f1859c = e10;
            this.f1860d = abstractC7242u;
            this.f1862f = aVar;
            this.f1863g = list;
            this.f1864h = list2;
            this.f1865i = c0Var;
            this.f1867k = s10;
            this.f1868l = fVar;
        }

        private static /* synthetic */ void u(int i10) {
            String str;
            int i11;
            switch (i10) {
                case 9:
                case 11:
                case 13:
                case 15:
                case 16:
                case 18:
                case 20:
                case 22:
                case ColorExtractionConstants.ALPHA_CHANNEL_SHIFT /* 24 */:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case BackgroundUIConstants.minSDKVersionSupportingBlur /* 31 */:
                case 32:
                case 33:
                case 34:
                case 36:
                case 38:
                case 40:
                case 41:
                case 42:
                    str = "@NotNull method %s.%s must not return null";
                    break;
                case 10:
                case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                case 14:
                case 17:
                case 19:
                case 21:
                case 23:
                case 25:
                case 35:
                case 37:
                case 39:
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
            switch (i10) {
                case 9:
                case 11:
                case 13:
                case 15:
                case 16:
                case 18:
                case 20:
                case 22:
                case ColorExtractionConstants.ALPHA_CHANNEL_SHIFT /* 24 */:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case BackgroundUIConstants.minSDKVersionSupportingBlur /* 31 */:
                case 32:
                case 33:
                case 34:
                case 36:
                case 38:
                case 40:
                case 41:
                case 42:
                    i11 = 2;
                    break;
                case 10:
                case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                case 14:
                case 17:
                case 19:
                case 21:
                case 23:
                case 25:
                case 35:
                case 37:
                case 39:
                default:
                    i11 = 3;
                    break;
            }
            Object[] objArr = new Object[i11];
            switch (i10) {
                case 1:
                    objArr[0] = "newOwner";
                    break;
                case 2:
                    objArr[0] = "newModality";
                    break;
                case 3:
                    objArr[0] = "newVisibility";
                    break;
                case 4:
                case 14:
                    objArr[0] = "kind";
                    break;
                case 5:
                    objArr[0] = "newValueParameterDescriptors";
                    break;
                case 6:
                    objArr[0] = "newContextReceiverParameters";
                    break;
                case 7:
                    objArr[0] = "newReturnType";
                    break;
                case 8:
                    objArr[0] = "owner";
                    break;
                case 9:
                case 11:
                case 13:
                case 15:
                case 16:
                case 18:
                case 20:
                case 22:
                case ColorExtractionConstants.ALPHA_CHANNEL_SHIFT /* 24 */:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case BackgroundUIConstants.minSDKVersionSupportingBlur /* 31 */:
                case 32:
                case 33:
                case 34:
                case 36:
                case 38:
                case 40:
                case 41:
                case 42:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl$CopyConfiguration";
                    break;
                case 10:
                    objArr[0] = "modality";
                    break;
                case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                    objArr[0] = "visibility";
                    break;
                case 17:
                    objArr[0] = "name";
                    break;
                case 19:
                case 21:
                    objArr[0] = "parameters";
                    break;
                case 23:
                    objArr[0] = "type";
                    break;
                case 25:
                    objArr[0] = "contextReceiverParameters";
                    break;
                case 35:
                    objArr[0] = "additionalAnnotations";
                    break;
                case 37:
                default:
                    objArr[0] = "substitution";
                    break;
                case 39:
                    objArr[0] = "userDataKey";
                    break;
            }
            switch (i10) {
                case 9:
                    objArr[1] = "setOwner";
                    break;
                case 10:
                case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                case 14:
                case 17:
                case 19:
                case 21:
                case 23:
                case 25:
                case 35:
                case 37:
                case 39:
                default:
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl$CopyConfiguration";
                    break;
                case 11:
                    objArr[1] = "setModality";
                    break;
                case 13:
                    objArr[1] = "setVisibility";
                    break;
                case 15:
                    objArr[1] = "setKind";
                    break;
                case 16:
                    objArr[1] = "setCopyOverrides";
                    break;
                case 18:
                    objArr[1] = "setName";
                    break;
                case 20:
                    objArr[1] = "setValueParameters";
                    break;
                case 22:
                    objArr[1] = "setTypeParameters";
                    break;
                case ColorExtractionConstants.ALPHA_CHANNEL_SHIFT /* 24 */:
                    objArr[1] = "setReturnType";
                    break;
                case 26:
                    objArr[1] = "setContextReceiverParameters";
                    break;
                case 27:
                    objArr[1] = "setExtensionReceiverParameter";
                    break;
                case 28:
                    objArr[1] = "setDispatchReceiverParameter";
                    break;
                case 29:
                    objArr[1] = "setOriginal";
                    break;
                case 30:
                    objArr[1] = "setSignatureChange";
                    break;
                case BackgroundUIConstants.minSDKVersionSupportingBlur /* 31 */:
                    objArr[1] = "setPreserveSourceElement";
                    break;
                case 32:
                    objArr[1] = "setDropOriginalInContainingParts";
                    break;
                case 33:
                    objArr[1] = "setHiddenToOvercomeSignatureClash";
                    break;
                case 34:
                    objArr[1] = "setHiddenForResolutionEverywhereBesideSupercalls";
                    break;
                case 36:
                    objArr[1] = "setAdditionalAnnotations";
                    break;
                case 38:
                    objArr[1] = "setSubstitution";
                    break;
                case 40:
                    objArr[1] = "putUserData";
                    break;
                case 41:
                    objArr[1] = "getSubstitution";
                    break;
                case 42:
                    objArr[1] = "setJustForTypeSubstitution";
                    break;
            }
            switch (i10) {
                case 8:
                    objArr[2] = "setOwner";
                    break;
                case 9:
                case 11:
                case 13:
                case 15:
                case 16:
                case 18:
                case 20:
                case 22:
                case ColorExtractionConstants.ALPHA_CHANNEL_SHIFT /* 24 */:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case BackgroundUIConstants.minSDKVersionSupportingBlur /* 31 */:
                case 32:
                case 33:
                case 34:
                case 36:
                case 38:
                case 40:
                case 41:
                case 42:
                    break;
                case 10:
                    objArr[2] = "setModality";
                    break;
                case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                    objArr[2] = "setVisibility";
                    break;
                case 14:
                    objArr[2] = "setKind";
                    break;
                case 17:
                    objArr[2] = "setName";
                    break;
                case 19:
                    objArr[2] = "setValueParameters";
                    break;
                case 21:
                    objArr[2] = "setTypeParameters";
                    break;
                case 23:
                    objArr[2] = "setReturnType";
                    break;
                case 25:
                    objArr[2] = "setContextReceiverParameters";
                    break;
                case 35:
                    objArr[2] = "setAdditionalAnnotations";
                    break;
                case 37:
                    objArr[2] = "setSubstitution";
                    break;
                case 39:
                    objArr[2] = "putUserData";
                    break;
                default:
                    objArr[2] = "<init>";
                    break;
            }
            String str2 = String.format(str, objArr);
            switch (i10) {
                case 9:
                case 11:
                case 13:
                case 15:
                case 16:
                case 18:
                case 20:
                case 22:
                case ColorExtractionConstants.ALPHA_CHANNEL_SHIFT /* 24 */:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case BackgroundUIConstants.minSDKVersionSupportingBlur /* 31 */:
                case 32:
                case 33:
                case 34:
                case 36:
                case 38:
                case 40:
                case 41:
                case 42:
                    throw new IllegalStateException(str2);
                case 10:
                case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                case 14:
                case 17:
                case 19:
                case 21:
                case 23:
                case 25:
                case 35:
                case 37:
                case 39:
                default:
                    throw new IllegalArgumentException(str2);
            }
        }

        @Override // ye.InterfaceC7247z.a
        /* JADX INFO: renamed from: B */
        public c s(InterfaceC7374h interfaceC7374h) {
            if (interfaceC7374h == null) {
                u(35);
            }
            this.f1875s = interfaceC7374h;
            return this;
        }

        @Override // ye.InterfaceC7247z.a
        /* JADX INFO: renamed from: C */
        public c m(boolean z10) {
            this.f1869m = z10;
            return this;
        }

        @Override // ye.InterfaceC7247z.a
        /* JADX INFO: renamed from: D */
        public c c(c0 c0Var) {
            this.f1866j = c0Var;
            return this;
        }

        @Override // ye.InterfaceC7247z.a
        /* JADX INFO: renamed from: E */
        public c a() {
            this.f1872p = true;
            return this;
        }

        @Override // ye.InterfaceC7247z.a
        /* JADX INFO: renamed from: F */
        public c e(c0 c0Var) {
            this.f1865i = c0Var;
            return this;
        }

        public c G(boolean z10) {
            this.f1878v = Boolean.valueOf(z10);
            return this;
        }

        @Override // ye.InterfaceC7247z.a
        /* JADX INFO: renamed from: H */
        public c f() {
            this.f1876t = true;
            return this;
        }

        @Override // ye.InterfaceC7247z.a
        /* JADX INFO: renamed from: I */
        public c k() {
            this.f1873q = true;
            return this;
        }

        public c J(boolean z10) {
            this.f1879w = z10;
            return this;
        }

        @Override // ye.InterfaceC7247z.a
        /* JADX INFO: renamed from: K */
        public c i(InterfaceC7224b.a aVar) {
            if (aVar == null) {
                u(14);
            }
            this.f1862f = aVar;
            return this;
        }

        @Override // ye.InterfaceC7247z.a
        /* JADX INFO: renamed from: L */
        public c g(ye.E e10) {
            if (e10 == null) {
                u(10);
            }
            this.f1859c = e10;
            return this;
        }

        @Override // ye.InterfaceC7247z.a
        /* JADX INFO: renamed from: M */
        public c j(Xe.f fVar) {
            if (fVar == null) {
                u(17);
            }
            this.f1868l = fVar;
            return this;
        }

        @Override // ye.InterfaceC7247z.a
        /* JADX INFO: renamed from: N */
        public c r(InterfaceC7224b interfaceC7224b) {
            this.f1861e = (InterfaceC7247z) interfaceC7224b;
            return this;
        }

        @Override // ye.InterfaceC7247z.a
        /* JADX INFO: renamed from: O */
        public c n(InterfaceC7235m interfaceC7235m) {
            if (interfaceC7235m == null) {
                u(8);
            }
            this.f1858b = interfaceC7235m;
            return this;
        }

        @Override // ye.InterfaceC7247z.a
        /* JADX INFO: renamed from: P */
        public c l() {
            this.f1871o = true;
            return this;
        }

        @Override // ye.InterfaceC7247z.a
        /* JADX INFO: renamed from: Q */
        public c o(qf.S s10) {
            if (s10 == null) {
                u(23);
            }
            this.f1867k = s10;
            return this;
        }

        @Override // ye.InterfaceC7247z.a
        /* JADX INFO: renamed from: R */
        public c t() {
            this.f1870n = true;
            return this;
        }

        @Override // ye.InterfaceC7247z.a
        /* JADX INFO: renamed from: S */
        public c p(E0 e02) {
            if (e02 == null) {
                u(37);
            }
            this.f1857a = e02;
            return this;
        }

        @Override // ye.InterfaceC7247z.a
        /* JADX INFO: renamed from: T */
        public c q(List list) {
            if (list == null) {
                u(21);
            }
            this.f1874r = list;
            return this;
        }

        @Override // ye.InterfaceC7247z.a
        /* JADX INFO: renamed from: U */
        public c b(List list) {
            if (list == null) {
                u(19);
            }
            this.f1863g = list;
            return this;
        }

        @Override // ye.InterfaceC7247z.a
        /* JADX INFO: renamed from: V */
        public c h(AbstractC7242u abstractC7242u) {
            if (abstractC7242u == null) {
                u(12);
            }
            this.f1860d = abstractC7242u;
            return this;
        }

        @Override // ye.InterfaceC7247z.a
        public InterfaceC7247z build() {
            return this.f1880x.M0(this);
        }

        @Override // ye.InterfaceC7247z.a
        public InterfaceC7247z.a d(InterfaceC7223a.InterfaceC0983a interfaceC0983a, Object obj) {
            if (interfaceC0983a == null) {
                u(39);
            }
            this.f1877u.put(interfaceC0983a, obj);
            return this;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected AbstractC1123s(InterfaceC7235m interfaceC7235m, InterfaceC7247z interfaceC7247z, InterfaceC7374h interfaceC7374h, Xe.f fVar, InterfaceC7224b.a aVar, h0 h0Var) {
        super(interfaceC7235m, interfaceC7374h, fVar, h0Var);
        if (interfaceC7235m == null) {
            T(0);
        }
        if (interfaceC7374h == null) {
            T(1);
        }
        if (fVar == null) {
            T(2);
        }
        if (aVar == null) {
            T(3);
        }
        if (h0Var == null) {
            T(4);
        }
        this.f1839l = AbstractC7241t.f65128i;
        this.f1840m = false;
        this.f1841n = false;
        this.f1842o = false;
        this.f1843p = false;
        this.f1844q = false;
        this.f1845r = false;
        this.f1846s = false;
        this.f1847t = false;
        this.f1848u = false;
        this.f1849v = false;
        this.f1850w = true;
        this.f1851x = false;
        this.f1852y = null;
        this.f1853z = null;
        this.f1830C = null;
        this.f1831D = null;
        this.f1828A = interfaceC7247z == null ? this : interfaceC7247z;
        this.f1829B = aVar;
    }

    private h0 N0(boolean z10, InterfaceC7247z interfaceC7247z) {
        h0 h0VarK;
        if (z10) {
            if (interfaceC7247z == null) {
                interfaceC7247z = a();
            }
            h0VarK = interfaceC7247z.k();
        } else {
            h0VarK = h0.f65112a;
        }
        if (h0VarK == null) {
            T(27);
        }
        return h0VarK;
    }

    public static List O0(InterfaceC7247z interfaceC7247z, List list, G0 g02) {
        if (list == null) {
            T(28);
        }
        if (g02 == null) {
            T(29);
        }
        return P0(interfaceC7247z, list, g02, false, false, null);
    }

    public static List P0(InterfaceC7247z interfaceC7247z, List list, G0 g02, boolean z10, boolean z11, boolean[] zArr) {
        if (list == null) {
            T(30);
        }
        if (g02 == null) {
            T(31);
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            t0 t0Var = (t0) it.next();
            qf.S type = t0Var.getType();
            N0 n02 = N0.f58000f;
            qf.S sP = g02.p(type, n02);
            qf.S sV0 = t0Var.v0();
            qf.S sP2 = sV0 == null ? null : g02.p(sV0, n02);
            if (sP == null) {
                return null;
            }
            if ((sP != t0Var.getType() || sV0 != sP2) && zArr != null) {
                zArr[0] = true;
            }
            arrayList.add(V.K0(interfaceC7247z, z10 ? null : t0Var, t0Var.getIndex(), t0Var.getAnnotations(), t0Var.getName(), sP, t0Var.B0(), t0Var.s0(), t0Var.r0(), sP2, z11 ? t0Var.k() : h0.f65112a, t0Var instanceof V.b ? new b(((V.b) t0Var).P0()) : null));
        }
        return arrayList;
    }

    private static /* synthetic */ void T(int i10) {
        String str;
        int i11;
        switch (i10) {
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case 26:
            case 27:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 10:
            case 11:
            case SigningManager.NONCE_BYTES_SIZE /* 12 */:
            case 17:
            case 22:
            case ColorExtractionConstants.ALPHA_CHANNEL_SHIFT /* 24 */:
            case 25:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i10) {
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case 26:
            case 27:
                i11 = 2;
                break;
            case 10:
            case 11:
            case SigningManager.NONCE_BYTES_SIZE /* 12 */:
            case 17:
            case 22:
            case ColorExtractionConstants.ALPHA_CHANNEL_SHIFT /* 24 */:
            case 25:
            default:
                i11 = 3;
                break;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = "name";
                break;
            case 3:
                objArr[0] = "kind";
                break;
            case 4:
                objArr[0] = "source";
                break;
            case 5:
                objArr[0] = "contextReceiverParameters";
                break;
            case 6:
                objArr[0] = "typeParameters";
                break;
            case 7:
            case 28:
            case 30:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 8:
            case 10:
                objArr[0] = "visibility";
                break;
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case 26:
            case 27:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl";
                break;
            case 11:
                objArr[0] = "unsubstitutedReturnType";
                break;
            case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                objArr[0] = "extensionReceiverParameter";
                break;
            case 17:
                objArr[0] = "overriddenDescriptors";
                break;
            case 22:
                objArr[0] = "originalSubstitutor";
                break;
            case ColorExtractionConstants.ALPHA_CHANNEL_SHIFT /* 24 */:
            case 29:
            case BackgroundUIConstants.minSDKVersionSupportingBlur /* 31 */:
                objArr[0] = "substitutor";
                break;
            case 25:
                objArr[0] = "configuration";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i10) {
            case 9:
                objArr[1] = "initialize";
                break;
            case 10:
            case 11:
            case SigningManager.NONCE_BYTES_SIZE /* 12 */:
            case 17:
            case 22:
            case ColorExtractionConstants.ALPHA_CHANNEL_SHIFT /* 24 */:
            case 25:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl";
                break;
            case 13:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 14:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 15:
                objArr[1] = "getModality";
                break;
            case 16:
                objArr[1] = "getVisibility";
                break;
            case 18:
                objArr[1] = "getTypeParameters";
                break;
            case 19:
                objArr[1] = "getValueParameters";
                break;
            case 20:
                objArr[1] = "getOriginal";
                break;
            case 21:
                objArr[1] = "getKind";
                break;
            case 23:
                objArr[1] = "newCopyBuilder";
                break;
            case 26:
                objArr[1] = "copy";
                break;
            case 27:
                objArr[1] = "getSourceToUseForCopy";
                break;
        }
        switch (i10) {
            case 5:
            case 6:
            case 7:
            case 8:
                objArr[2] = "initialize";
                break;
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case 26:
            case 27:
                break;
            case 10:
                objArr[2] = "setVisibility";
                break;
            case 11:
                objArr[2] = "setReturnType";
                break;
            case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                objArr[2] = "setExtensionReceiverParameter";
                break;
            case 17:
                objArr[2] = "setOverriddenDescriptors";
                break;
            case 22:
                objArr[2] = "substitute";
                break;
            case ColorExtractionConstants.ALPHA_CHANNEL_SHIFT /* 24 */:
                objArr[2] = "newCopyBuilder";
                break;
            case 25:
                objArr[2] = "doSubstitute";
                break;
            case 28:
            case 29:
            case 30:
            case BackgroundUIConstants.minSDKVersionSupportingBlur /* 31 */:
                objArr[2] = "getSubstitutedValueParameters";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i10) {
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case 26:
            case 27:
                throw new IllegalStateException(str2);
            case 10:
            case 11:
            case SigningManager.NONCE_BYTES_SIZE /* 12 */:
            case 17:
            case 22:
            case ColorExtractionConstants.ALPHA_CHANNEL_SHIFT /* 24 */:
            case 25:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    private void T0() {
        InterfaceC5082a interfaceC5082a = this.f1853z;
        if (interfaceC5082a != null) {
            this.f1852y = (Collection) interfaceC5082a.invoke();
            this.f1853z = null;
        }
    }

    private void a1(boolean z10) {
        this.f1848u = z10;
    }

    private void b1(boolean z10) {
        this.f1847t = z10;
    }

    private void d1(InterfaceC7247z interfaceC7247z) {
        this.f1830C = interfaceC7247z;
    }

    @Override // ye.InterfaceC7247z
    public boolean C() {
        return this.f1844q;
    }

    @Override // ye.InterfaceC7247z
    public boolean D0() {
        return this.f1847t;
    }

    public void E0(Collection collection) {
        if (collection == null) {
            T(17);
        }
        this.f1852y = collection;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (((InterfaceC7247z) it.next()).G0()) {
                this.f1848u = true;
                return;
            }
        }
    }

    @Override // ye.InterfaceC7247z
    public boolean G0() {
        return this.f1848u;
    }

    @Override // ye.InterfaceC7223a
    public c0 K() {
        return this.f1837j;
    }

    public InterfaceC7247z K0(InterfaceC7235m interfaceC7235m, ye.E e10, AbstractC7242u abstractC7242u, InterfaceC7224b.a aVar, boolean z10) {
        InterfaceC7247z interfaceC7247zBuild = v().n(interfaceC7235m).g(e10).h(abstractC7242u).i(aVar).m(z10).build();
        if (interfaceC7247zBuild == null) {
            T(26);
        }
        return interfaceC7247zBuild;
    }

    protected abstract AbstractC1123s L0(InterfaceC7235m interfaceC7235m, InterfaceC7247z interfaceC7247z, InterfaceC7224b.a aVar, Xe.f fVar, InterfaceC7374h interfaceC7374h, h0 h0Var);

    protected InterfaceC7247z M0(c cVar) {
        int i10;
        N n10;
        InterfaceC7247z interfaceC7247z;
        qf.S sP;
        if (cVar == null) {
            T(25);
        }
        boolean[] zArr = new boolean[1];
        InterfaceC7374h interfaceC7374hA = cVar.f1875s != null ? AbstractC7376j.a(getAnnotations(), cVar.f1875s) : getAnnotations();
        InterfaceC7235m interfaceC7235m = cVar.f1858b;
        InterfaceC7247z interfaceC7247z2 = cVar.f1861e;
        AbstractC1123s abstractC1123sL0 = L0(interfaceC7235m, interfaceC7247z2, cVar.f1862f, cVar.f1868l, interfaceC7374hA, N0(cVar.f1871o, interfaceC7247z2));
        List typeParameters = cVar.f1874r == null ? getTypeParameters() : cVar.f1874r;
        zArr[0] = (zArr[0] ? 1 : 0) | (!typeParameters.isEmpty() ? 1 : 0);
        ArrayList arrayList = new ArrayList(typeParameters.size());
        G0 g0C = qf.C.c(typeParameters, cVar.f1857a, abstractC1123sL0, arrayList, zArr);
        c0 c0Var = null;
        if (g0C == null) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        if (!cVar.f1864h.isEmpty()) {
            int i11 = 0;
            for (c0 c0Var2 : cVar.f1864h) {
                qf.S sP2 = g0C.p(c0Var2.getType(), N0.f58000f);
                if (sP2 == null) {
                    return null;
                }
                int i12 = i11 + 1;
                arrayList2.add(bf.h.b(abstractC1123sL0, sP2, ((InterfaceC5474f) c0Var2.getValue()).a(), c0Var2.getAnnotations(), i11));
                zArr[0] = (zArr[0] ? 1 : 0) | (sP2 != c0Var2.getType() ? 1 : 0);
                i11 = i12;
            }
        }
        c0 c0Var3 = cVar.f1865i;
        if (c0Var3 != null) {
            qf.S sP3 = g0C.p(c0Var3.getType(), N0.f58000f);
            if (sP3 == null) {
                return null;
            }
            N n11 = new N(abstractC1123sL0, new C5472d(abstractC1123sL0, sP3, cVar.f1865i.getValue()), cVar.f1865i.getAnnotations());
            zArr[0] = (sP3 != cVar.f1865i.getType() ? 1 : 0) | (zArr[0] ? 1 : 0);
            i10 = 0;
            n10 = n11;
        } else {
            i10 = 0;
            n10 = null;
        }
        c0 c0Var4 = cVar.f1866j;
        if (c0Var4 != null) {
            c0 c0VarC = c0Var4.c(g0C);
            if (c0VarC == null) {
                return null;
            }
            zArr[i10] = (zArr[i10] ? 1 : 0) | (c0VarC != cVar.f1866j ? 1 : i10);
            interfaceC7247z = null;
            c0Var = c0VarC;
        } else {
            interfaceC7247z = null;
        }
        List listP0 = P0(abstractC1123sL0, cVar.f1863g, g0C, cVar.f1872p, cVar.f1871o, zArr);
        if (listP0 == null || (sP = g0C.p(cVar.f1867k, N0.f58001g)) == null) {
            return interfaceC7247z;
        }
        boolean z10 = (zArr[i10] ? 1 : 0) | (sP != cVar.f1867k ? 1 : i10);
        zArr[i10] = z10;
        if (z10 == 0 && cVar.f1879w) {
            return this;
        }
        abstractC1123sL0.R0(n10, c0Var, arrayList2, arrayList, listP0, sP, cVar.f1859c, cVar.f1860d);
        abstractC1123sL0.f1(this.f1840m);
        abstractC1123sL0.c1(this.f1841n);
        abstractC1123sL0.X0(this.f1842o);
        abstractC1123sL0.e1(this.f1843p);
        abstractC1123sL0.i1(this.f1844q);
        abstractC1123sL0.h1(this.f1849v);
        abstractC1123sL0.W0(this.f1845r);
        abstractC1123sL0.V0(this.f1846s);
        abstractC1123sL0.Y0(this.f1850w);
        abstractC1123sL0.b1(cVar.f1873q);
        abstractC1123sL0.a1(cVar.f1876t);
        abstractC1123sL0.Z0(cVar.f1878v != null ? cVar.f1878v.booleanValue() : this.f1851x);
        if (!cVar.f1877u.isEmpty() || this.f1831D != null) {
            Map map = cVar.f1877u;
            Map map2 = this.f1831D;
            if (map2 != null) {
                for (Map.Entry entry : map2.entrySet()) {
                    if (!map.containsKey(entry.getKey())) {
                        map.put(entry.getKey(), entry.getValue());
                    }
                }
            }
            if (map.size() == 1) {
                abstractC1123sL0.f1831D = Collections.singletonMap(map.keySet().iterator().next(), map.values().iterator().next());
            } else {
                abstractC1123sL0.f1831D = map;
            }
        }
        if (cVar.f1870n || t0() != null) {
            abstractC1123sL0.d1((t0() != null ? t0() : this).c(g0C));
        }
        if (cVar.f1869m && !a().e().isEmpty()) {
            if (cVar.f1857a.f()) {
                InterfaceC5082a interfaceC5082a = this.f1853z;
                if (interfaceC5082a != null) {
                    abstractC1123sL0.f1853z = interfaceC5082a;
                    return abstractC1123sL0;
                }
                abstractC1123sL0.E0(e());
                return abstractC1123sL0;
            }
            abstractC1123sL0.f1853z = new a(g0C);
        }
        return abstractC1123sL0;
    }

    @Override // ye.InterfaceC7223a
    public c0 O() {
        return this.f1836i;
    }

    public boolean Q0() {
        return this.f1850w;
    }

    public AbstractC1123s R0(c0 c0Var, c0 c0Var2, List list, List list2, List list3, qf.S s10, ye.E e10, AbstractC7242u abstractC7242u) {
        if (list == null) {
            T(5);
        }
        if (list2 == null) {
            T(6);
        }
        if (list3 == null) {
            T(7);
        }
        if (abstractC7242u == null) {
            T(8);
        }
        this.f1832e = AbstractC2279u.b1(list2);
        this.f1833f = AbstractC2279u.b1(list3);
        this.f1834g = s10;
        this.f1838k = e10;
        this.f1839l = abstractC7242u;
        this.f1836i = c0Var;
        this.f1837j = c0Var2;
        this.f1835h = list;
        for (int i10 = 0; i10 < list2.size(); i10++) {
            m0 m0Var = (m0) list2.get(i10);
            if (m0Var.getIndex() != i10) {
                throw new IllegalStateException(m0Var + " index is " + m0Var.getIndex() + " but position is " + i10);
            }
        }
        for (int i11 = 0; i11 < list3.size(); i11++) {
            t0 t0Var = (t0) list3.get(i11);
            if (t0Var.getIndex() != i11) {
                throw new IllegalStateException(t0Var + "index is " + t0Var.getIndex() + " but position is " + i11);
            }
        }
        return this;
    }

    protected c S0(G0 g02) {
        if (g02 == null) {
            T(24);
        }
        return new c(this, g02.j(), b(), r(), getVisibility(), h(), j(), y0(), O(), getReturnType(), null);
    }

    public void U0(InterfaceC7223a.InterfaceC0983a interfaceC0983a, Object obj) {
        if (this.f1831D == null) {
            this.f1831D = new LinkedHashMap();
        }
        this.f1831D.put(interfaceC0983a, obj);
    }

    public void V0(boolean z10) {
        this.f1846s = z10;
    }

    public void W0(boolean z10) {
        this.f1845r = z10;
    }

    public void X0(boolean z10) {
        this.f1842o = z10;
    }

    @Override // ye.D
    public boolean Y() {
        return this.f1846s;
    }

    public void Y0(boolean z10) {
        this.f1850w = z10;
    }

    public void Z0(boolean z10) {
        this.f1851x = z10;
    }

    @Override // Be.AbstractC1119n, Be.AbstractC1118m, ye.InterfaceC7235m, ye.InterfaceC7223a, ye.Z, ye.InterfaceC7224b
    public InterfaceC7247z a() {
        InterfaceC7247z interfaceC7247z = this.f1828A;
        InterfaceC7247z interfaceC7247zA = interfaceC7247z == this ? this : interfaceC7247z.a();
        if (interfaceC7247zA == null) {
            T(20);
        }
        return interfaceC7247zA;
    }

    public Object b0(InterfaceC7237o interfaceC7237o, Object obj) {
        return interfaceC7237o.b(this, obj);
    }

    public void c1(boolean z10) {
        this.f1841n = z10;
    }

    public Collection e() {
        T0();
        Collection collection = this.f1852y;
        if (collection == null) {
            collection = Collections.EMPTY_LIST;
        }
        if (collection == null) {
            T(14);
        }
        return collection;
    }

    public void e1(boolean z10) {
        this.f1843p = z10;
    }

    public void f1(boolean z10) {
        this.f1840m = z10;
    }

    public void g1(qf.S s10) {
        if (s10 == null) {
            T(11);
        }
        this.f1834g = s10;
    }

    public qf.S getReturnType() {
        return this.f1834g;
    }

    @Override // ye.InterfaceC7223a
    public List getTypeParameters() {
        List list = this.f1832e;
        if (list != null) {
            return list;
        }
        throw new IllegalStateException("typeParameters == null for " + this);
    }

    @Override // ye.InterfaceC7239q
    public AbstractC7242u getVisibility() {
        AbstractC7242u abstractC7242u = this.f1839l;
        if (abstractC7242u == null) {
            T(16);
        }
        return abstractC7242u;
    }

    @Override // ye.InterfaceC7224b
    public InterfaceC7224b.a h() {
        InterfaceC7224b.a aVar = this.f1829B;
        if (aVar == null) {
            T(21);
        }
        return aVar;
    }

    public void h1(boolean z10) {
        this.f1849v = z10;
    }

    @Override // ye.InterfaceC7223a
    public boolean i0() {
        return this.f1851x;
    }

    public void i1(boolean z10) {
        this.f1844q = z10;
    }

    @Override // ye.D
    public boolean isExternal() {
        return this.f1842o;
    }

    @Override // ye.InterfaceC7247z
    public boolean isInfix() {
        if (this.f1841n) {
            return true;
        }
        Iterator it = a().e().iterator();
        while (it.hasNext()) {
            if (((InterfaceC7247z) it.next()).isInfix()) {
                return true;
            }
        }
        return false;
    }

    @Override // ye.InterfaceC7247z
    public boolean isInline() {
        return this.f1843p;
    }

    @Override // ye.InterfaceC7247z
    public boolean isOperator() {
        if (this.f1840m) {
            return true;
        }
        Iterator it = a().e().iterator();
        while (it.hasNext()) {
            if (((InterfaceC7247z) it.next()).isOperator()) {
                return true;
            }
        }
        return false;
    }

    @Override // ye.InterfaceC7247z
    public boolean isSuspend() {
        return this.f1849v;
    }

    @Override // ye.InterfaceC7223a
    public List j() {
        List list = this.f1833f;
        if (list == null) {
            T(19);
        }
        return list;
    }

    public void j1(AbstractC7242u abstractC7242u) {
        if (abstractC7242u == null) {
            T(10);
        }
        this.f1839l = abstractC7242u;
    }

    @Override // ye.D
    public boolean m0() {
        return this.f1845r;
    }

    @Override // ye.InterfaceC7223a
    public Object n0(InterfaceC7223a.InterfaceC0983a interfaceC0983a) {
        Map map = this.f1831D;
        if (map == null) {
            return null;
        }
        return map.get(interfaceC0983a);
    }

    @Override // ye.D
    public ye.E r() {
        ye.E e10 = this.f1838k;
        if (e10 == null) {
            T(15);
        }
        return e10;
    }

    @Override // ye.InterfaceC7247z
    public InterfaceC7247z t0() {
        return this.f1830C;
    }

    public InterfaceC7247z.a v() {
        c cVarS0 = S0(G0.f57972b);
        if (cVarS0 == null) {
            T(23);
        }
        return cVarS0;
    }

    @Override // ye.InterfaceC7223a
    public List y0() {
        List list = this.f1835h;
        if (list == null) {
            T(13);
        }
        return list;
    }

    @Override // ye.InterfaceC7247z, ye.j0
    public InterfaceC7247z c(G0 g02) {
        if (g02 == null) {
            T(22);
        }
        return g02.k() ? this : S0(g02).r(a()).l().J(true).build();
    }
}

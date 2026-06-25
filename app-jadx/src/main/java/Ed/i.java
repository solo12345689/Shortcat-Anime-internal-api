package ed;

import Gf.AbstractC1615j;
import Gf.O;
import Td.L;
import ae.AbstractC2605b;
import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.util.Log;
import bc.C3042a;
import bc.EnumC3046e;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import dc.C4581b;
import expo.modules.kotlin.exception.CodedException;
import expo.modules.securestore.SecureStoreOptions;
import fd.C4796a;
import fd.C4797b;
import fd.InterfaceC4798c;
import ie.InterfaceC5082a;
import ie.InterfaceC5096o;
import java.io.IOException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.UnrecoverableEntryException;
import java.security.cert.CertificateException;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import org.json.JSONException;
import org.json.JSONObject;
import pc.C5972b;
import pc.C5974d;
import pc.M;
import pc.U;
import pc.V;
import pc.X;
import pe.InterfaceC6014d;
import pe.InterfaceC6027q;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u0000 J2\u00020\u0001:\u0001KB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0082@¢\u0006\u0004\b\b\u0010\tJ*\u0010\f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0082@¢\u0006\u0004\b\f\u0010\rJ2\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000fH\u0082@¢\u0006\u0004\b\u0012\u0010\u0013J7\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001f\u0010 J?\u0010'\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\"*\u00020!2\f\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000#2\f\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000%2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b'\u0010(JG\u0010)\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\"*\u00020!2\f\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000#2\f\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000%2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u000fH\u0002¢\u0006\u0004\b)\u0010*JE\u0010+\u001a\u00028\u0000\"\b\b\u0000\u0010\"*\u00020!2\f\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000#2\f\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000%2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u000fH\u0002¢\u0006\u0004\b+\u0010*JO\u0010-\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\"*\u00020!2\f\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000#2\f\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000%2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u000f2\u0006\u0010,\u001a\u00020\u000fH\u0002¢\u0006\u0004\b-\u0010.J\u001f\u0010/\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0004H\u0002¢\u0006\u0004\b/\u00100J\u000f\u00102\u001a\u000201H\u0016¢\u0006\u0004\b2\u00103J\r\u00104\u001a\u00020\n¢\u0006\u0004\b4\u00105R\u0014\u00109\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0016\u0010=\u001a\u00020:8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b;\u0010<R\u0016\u0010A\u001a\u00020>8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b?\u0010@R\u0016\u0010E\u001a\u00020B8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bC\u0010DR\u0014\u0010I\u001a\u00020F8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bG\u0010H¨\u0006L"}, d2 = {"Led/i;", "Lgc/c;", "<init>", "()V", "", SubscriberAttributeKt.JSON_NAME_KEY, "Lexpo/modules/securestore/SecureStoreOptions;", "options", "I", "(Ljava/lang/String;Lexpo/modules/securestore/SecureStoreOptions;LZd/e;)Ljava/lang/Object;", "Landroid/content/SharedPreferences;", "prefs", "P", "(Ljava/lang/String;Landroid/content/SharedPreferences;Lexpo/modules/securestore/SecureStoreOptions;LZd/e;)Ljava/lang/Object;", "value", "", "keyIsInvalidated", "LTd/L;", "T", "(Ljava/lang/String;Ljava/lang/String;Lexpo/modules/securestore/SecureStoreOptions;ZLZd/e;)Ljava/lang/Object;", "Lorg/json/JSONObject;", "encryptedItem", "requireAuthentication", "keychainService", "S", "(Lorg/json/JSONObject;Landroid/content/SharedPreferences;Ljava/lang/String;ZLjava/lang/String;)Z", "H", "(Ljava/lang/String;Lexpo/modules/securestore/SecureStoreOptions;)V", "keyStoreAlias", "R", "(Ljava/lang/String;Ljava/lang/String;)V", "Q", "(Ljava/lang/String;)V", "Ljava/security/KeyStore$Entry;", "E", "Ljava/lang/Class;", "keyStoreEntryClass", "Lfd/c;", "encryptor", "L", "(Ljava/lang/Class;Lfd/c;Lexpo/modules/securestore/SecureStoreOptions;)Ljava/security/KeyStore$Entry;", "J", "(Ljava/lang/Class;Lfd/c;Lexpo/modules/securestore/SecureStoreOptions;Z)Ljava/security/KeyStore$Entry;", "M", "usesKeystoreSuffix", "K", "(Ljava/lang/Class;Lfd/c;Lexpo/modules/securestore/SecureStoreOptions;ZZ)Ljava/security/KeyStore$Entry;", "G", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "Lgc/e;", "n", "()Lgc/e;", "O", "()Landroid/content/SharedPreferences;", "Lfd/a;", "d", "Lfd/a;", "mAESEncryptor", "Ljava/security/KeyStore;", "e", "Ljava/security/KeyStore;", "keyStore", "Lfd/b;", "f", "Lfd/b;", "hybridAESEncryptor", "Led/b;", "g", "Led/b;", "authenticationHelper", "Landroid/content/Context;", "N", "()Landroid/content/Context;", "reactContext", "h", "a", "expo-secure-store_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class i extends gc.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final C4796a mAESEncryptor = new C4796a();

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private KeyStore keyStore;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private C4797b hybridAESEncryptor;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private C4669b authenticationHelper;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b extends kotlin.coroutines.jvm.internal.l implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f45925a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f45927c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f45928d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ SecureStoreOptions f45929e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, String str2, SecureStoreOptions secureStoreOptions, Zd.e eVar) {
            super(2, eVar);
            this.f45927c = str;
            this.f45928d = str2;
            this.f45929e = secureStoreOptions;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Zd.e create(Object obj, Zd.e eVar) {
            return i.this.new b(this.f45927c, this.f45928d, this.f45929e, eVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(O o10, Zd.e eVar) {
            return ((b) create(o10, eVar)).invokeSuspend(L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = AbstractC2605b.f();
            int i10 = this.f45925a;
            if (i10 == 0) {
                Td.v.b(obj);
                i iVar = i.this;
                String str = this.f45927c;
                String str2 = this.f45928d;
                SecureStoreOptions secureStoreOptions = this.f45929e;
                this.f45925a = 1;
                if (iVar.T(str, str2, secureStoreOptions, false, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Td.v.b(obj);
            }
            return L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class c extends kotlin.coroutines.jvm.internal.l implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f45930a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f45932c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ SecureStoreOptions f45933d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str, SecureStoreOptions secureStoreOptions, Zd.e eVar) {
            super(2, eVar);
            this.f45932c = str;
            this.f45933d = secureStoreOptions;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Zd.e create(Object obj, Zd.e eVar) {
            return i.this.new c(this.f45932c, this.f45933d, eVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(O o10, Zd.e eVar) {
            return ((c) create(o10, eVar)).invokeSuspend(L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = AbstractC2605b.f();
            int i10 = this.f45930a;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Td.v.b(obj);
                return obj;
            }
            Td.v.b(obj);
            i iVar = i.this;
            String str = this.f45932c;
            SecureStoreOptions secureStoreOptions = this.f45933d;
            this.f45930a = 1;
            Object objI = iVar.I(str, secureStoreOptions, this);
            return objI == objF ? objF : objI;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class d implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f45934a = new d();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return kotlin.jvm.internal.O.o(String.class);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class e implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f45935a = new e();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return kotlin.jvm.internal.O.o(SecureStoreOptions.class);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class f implements Function1 {
        public f() {
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] objArr) throws CodedException {
            AbstractC5504s.h(objArr, "<destruct>");
            Object obj = objArr[0];
            SecureStoreOptions secureStoreOptions = (SecureStoreOptions) objArr[1];
            String str = (String) obj;
            try {
                i.this.H(str, secureStoreOptions);
                return L.f17438a;
            } catch (CodedException e10) {
                throw e10;
            } catch (Exception e11) {
                throw new ed.e(e11.getMessage(), str, secureStoreOptions.getKeychainService(), e11);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class g implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final g f45937a = new g();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return kotlin.jvm.internal.O.f(String.class);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class h implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final h f45938a = new h();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return kotlin.jvm.internal.O.f(String.class);
        }
    }

    /* JADX INFO: renamed from: ed.i$i, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C0727i implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0727i f45939a = new C0727i();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return kotlin.jvm.internal.O.o(SecureStoreOptions.class);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class j extends kotlin.coroutines.jvm.internal.l implements InterfaceC5096o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f45940a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f45941b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ i f45942c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(Zd.e eVar, i iVar) {
            super(3, eVar);
            this.f45942c = iVar;
        }

        @Override // ie.InterfaceC5096o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(O o10, Object[] objArr, Zd.e eVar) {
            j jVar = new j(eVar, this.f45942c);
            jVar.f45941b = objArr;
            return jVar.invokeSuspend(L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws ed.h {
            Object objF = AbstractC2605b.f();
            int i10 = this.f45940a;
            if (i10 == 0) {
                Td.v.b(obj);
                Object[] objArr = (Object[]) this.f45941b;
                Object obj2 = objArr[0];
                Object obj3 = objArr[1];
                SecureStoreOptions secureStoreOptions = (SecureStoreOptions) objArr[2];
                String str = (String) obj3;
                String str2 = (String) obj2;
                if (str == null) {
                    throw new ed.h();
                }
                i iVar = this.f45942c;
                this.f45940a = 1;
                if (iVar.T(str, str2, secureStoreOptions, false, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Td.v.b(obj);
            }
            return L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class k implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final k f45943a = new k();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return kotlin.jvm.internal.O.o(String.class);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class l implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final l f45944a = new l();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return kotlin.jvm.internal.O.o(SecureStoreOptions.class);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class m extends kotlin.coroutines.jvm.internal.l implements InterfaceC5096o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f45945a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f45946b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ i f45947c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(Zd.e eVar, i iVar) {
            super(3, eVar);
            this.f45947c = iVar;
        }

        @Override // ie.InterfaceC5096o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(O o10, Object[] objArr, Zd.e eVar) {
            m mVar = new m(eVar, this.f45947c);
            mVar.f45946b = objArr;
            return mVar.invokeSuspend(L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = AbstractC2605b.f();
            int i10 = this.f45945a;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Td.v.b(obj);
                return obj;
            }
            Td.v.b(obj);
            Object[] objArr = (Object[]) this.f45946b;
            Object obj2 = objArr[0];
            SecureStoreOptions secureStoreOptions = (SecureStoreOptions) objArr[1];
            i iVar = this.f45947c;
            this.f45945a = 1;
            Object objI = iVar.I((String) obj2, secureStoreOptions, this);
            return objI == objF ? objF : objI;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class n implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final n f45948a = new n();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return kotlin.jvm.internal.O.f(String.class);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class o implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final o f45949a = new o();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return kotlin.jvm.internal.O.f(String.class);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class p implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final p f45950a = new p();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return kotlin.jvm.internal.O.o(SecureStoreOptions.class);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class q implements Function1 {
        public q() {
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] objArr) throws ed.h {
            AbstractC5504s.h(objArr, "<destruct>");
            Object obj = objArr[0];
            Object obj2 = objArr[1];
            SecureStoreOptions secureStoreOptions = (SecureStoreOptions) objArr[2];
            String str = (String) obj2;
            String str2 = (String) obj;
            if (str == null) {
                throw new ed.h();
            }
            AbstractC1615j.b(null, i.this.new b(str, str2, secureStoreOptions, null), 1, null);
            return L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class r implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final r f45952a = new r();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return kotlin.jvm.internal.O.o(String.class);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class s implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final s f45953a = new s();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return kotlin.jvm.internal.O.o(SecureStoreOptions.class);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class t implements Function1 {
        public t() {
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] objArr) {
            AbstractC5504s.h(objArr, "<destruct>");
            Object obj = objArr[0];
            SecureStoreOptions secureStoreOptions = (SecureStoreOptions) objArr[1];
            return (String) AbstractC1615j.b(null, i.this.new c((String) obj, secureStoreOptions, null), 1, null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class u implements Function1 {
        public u() {
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] it) {
            boolean z10;
            AbstractC5504s.h(it, "it");
            try {
                C4669b c4669b = i.this.authenticationHelper;
                if (c4669b == null) {
                    AbstractC5504s.u("authenticationHelper");
                    c4669b = null;
                }
                c4669b.b();
                z10 = true;
            } catch (C4668a unused) {
                z10 = false;
            }
            return Boolean.valueOf(z10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class v implements InterfaceC5082a {
        public v() {
        }

        public final void a() throws NoSuchAlgorithmException, IOException, KeyStoreException, CertificateException {
            i.this.authenticationHelper = new C4669b(i.this.N(), i.this.i().v());
            i.this.hybridAESEncryptor = new C4797b(i.this.N(), i.this.mAESEncryptor);
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            i.this.keyStore = keyStore;
        }

        @Override // ie.InterfaceC5082a
        public /* bridge */ /* synthetic */ Object invoke() throws NoSuchAlgorithmException, IOException, KeyStoreException, CertificateException {
            a();
            return L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class w extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f45957a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f45958b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f45959c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f45961e;

        w(Zd.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f45959c = obj;
            this.f45961e |= Integer.MIN_VALUE;
            return i.this.P(null, null, null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class x extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f45962a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f45963b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f45964c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f45965d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f45966e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        boolean f45967f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f45968g;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        int f45970i;

        x(Zd.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f45968g = obj;
            this.f45970i |= Integer.MIN_VALUE;
            return i.this.T(null, null, null, false, this);
        }
    }

    private final String G(String key, String keychainService) {
        return keychainService + "-" + key;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void H(String key, SecureStoreOptions options) throws ed.e {
        SharedPreferences sharedPreferencesO = O();
        String strG = G(key, options.getKeychainService());
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(N());
        boolean zCommit = sharedPreferencesO.contains(strG) ? sharedPreferencesO.edit().remove(strG).commit() : true;
        if (sharedPreferencesO.contains(key)) {
            zCommit = sharedPreferencesO.edit().remove(key).commit() && zCommit;
        }
        if (defaultSharedPreferences.contains(key)) {
            zCommit = defaultSharedPreferences.edit().remove(key).commit() && zCommit;
        }
        if (!zCommit) {
            throw new ed.e("Could not delete the item from SecureStore", key, options.getKeychainService(), null, 8, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object I(String str, SecureStoreOptions secureStoreOptions, Zd.e eVar) {
        SharedPreferences sharedPreferencesO = O();
        if (sharedPreferencesO.contains(G(str, secureStoreOptions.getKeychainService()))) {
            return P(str, sharedPreferencesO, secureStoreOptions, eVar);
        }
        if (sharedPreferencesO.contains(str)) {
            return P(str, sharedPreferencesO, secureStoreOptions, eVar);
        }
        return null;
    }

    private final KeyStore.Entry J(Class keyStoreEntryClass, InterfaceC4798c encryptor, SecureStoreOptions options, boolean requireAuthentication) throws NoSuchAlgorithmException, ed.g, KeyStoreException, UnrecoverableEntryException {
        String strA = encryptor.a(options, requireAuthentication);
        KeyStore keyStore = this.keyStore;
        if (keyStore == null) {
            AbstractC5504s.u("keyStore");
            keyStore = null;
        }
        if (!keyStore.containsAlias(strA)) {
            return null;
        }
        KeyStore keyStore2 = this.keyStore;
        if (keyStore2 == null) {
            AbstractC5504s.u("keyStore");
            keyStore2 = null;
        }
        KeyStore.Entry entry = keyStore2.getEntry(strA, null);
        if (!keyStoreEntryClass.isInstance(entry)) {
            throw new ed.g("The entry for the keystore alias \"" + strA + "\" is not a " + keyStoreEntryClass.getSimpleName());
        }
        KeyStore.Entry entry2 = (KeyStore.Entry) keyStoreEntryClass.cast(entry);
        if (entry2 != null) {
            return entry2;
        }
        throw new ed.g("The entry for the keystore alias \"" + strA + "\" couldn't be cast to correct class");
    }

    private final KeyStore.Entry K(Class keyStoreEntryClass, InterfaceC4798c encryptor, SecureStoreOptions options, boolean requireAuthentication, boolean usesKeystoreSuffix) {
        return usesKeystoreSuffix ? J(keyStoreEntryClass, encryptor, options, requireAuthentication) : L(keyStoreEntryClass, encryptor, options);
    }

    private final KeyStore.Entry L(Class keyStoreEntryClass, InterfaceC4798c encryptor, SecureStoreOptions options) throws NoSuchAlgorithmException, KeyStoreException, UnrecoverableEntryException {
        String strB = encryptor.b(options);
        KeyStore keyStore = this.keyStore;
        if (keyStore == null) {
            AbstractC5504s.u("keyStore");
            keyStore = null;
        }
        if (!keyStore.containsAlias(encryptor.b(options))) {
            return null;
        }
        KeyStore keyStore2 = this.keyStore;
        if (keyStore2 == null) {
            AbstractC5504s.u("keyStore");
            keyStore2 = null;
        }
        KeyStore.Entry entry = keyStore2.getEntry(strB, null);
        if (keyStoreEntryClass.isInstance(entry)) {
            return (KeyStore.Entry) keyStoreEntryClass.cast(entry);
        }
        return null;
    }

    private final KeyStore.Entry M(Class keyStoreEntryClass, InterfaceC4798c encryptor, SecureStoreOptions options, boolean requireAuthentication) throws NoSuchAlgorithmException, ed.g, KeyStoreException, C4668a, UnrecoverableEntryException {
        KeyStore.Entry entryJ = J(keyStoreEntryClass, encryptor, options, requireAuthentication);
        if (entryJ != null) {
            return entryJ;
        }
        KeyStore keyStore = null;
        if (requireAuthentication) {
            C4669b c4669b = this.authenticationHelper;
            if (c4669b == null) {
                AbstractC5504s.u("authenticationHelper");
                c4669b = null;
            }
            c4669b.b();
        }
        KeyStore keyStore2 = this.keyStore;
        if (keyStore2 == null) {
            AbstractC5504s.u("keyStore");
        } else {
            keyStore = keyStore2;
        }
        return encryptor.c(keyStore, options);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0198 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Type inference failed for: r0v20, types: [fd.a] */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v13, types: [ed.i] */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v18, types: [ed.i] */
    /* JADX WARN: Type inference failed for: r11v21 */
    /* JADX WARN: Type inference failed for: r11v22 */
    /* JADX WARN: Type inference failed for: r11v23 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r1v0, types: [ed.i] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v23, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v24, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v25, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v28 */
    /* JADX WARN: Type inference failed for: r1v29 */
    /* JADX WARN: Type inference failed for: r1v30 */
    /* JADX WARN: Type inference failed for: r1v31 */
    /* JADX WARN: Type inference failed for: r1v32 */
    /* JADX WARN: Type inference failed for: r1v33 */
    /* JADX WARN: Type inference failed for: r1v34 */
    /* JADX WARN: Type inference failed for: r1v35 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r2v27, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object P(java.lang.String r18, android.content.SharedPreferences r19, expo.modules.securestore.SecureStoreOptions r20, Zd.e r21) throws expo.modules.kotlin.exception.CodedException {
        /*
            Method dump skipped, instruction units count: 637
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ed.i.P(java.lang.String, android.content.SharedPreferences, expo.modules.securestore.SecureStoreOptions, Zd.e):java.lang.Object");
    }

    private final void Q(String keychainService) {
        SharedPreferences sharedPreferencesO = O();
        Map<String, ?> all = sharedPreferencesO.getAll();
        AbstractC5504s.g(all, "getAll(...)");
        for (Map.Entry<String, ?> entry : all.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            String str = value instanceof String ? (String) value : null;
            if (str != null) {
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    String strOptString = jSONObject.optString("keystoreAlias");
                    if (strOptString != null && jSONObject.optBoolean("requireAuthentication", false) && AbstractC5504s.c(keychainService, strOptString)) {
                        sharedPreferencesO.edit().remove(key).apply();
                        Log.w("ExpoSecureStore", "Removing entry: " + key + " due to the encryption key being deleted");
                    }
                } catch (JSONException unused) {
                }
            }
        }
    }

    private final void R(String keyStoreAlias, String keychainService) throws KeyStoreException {
        KeyStore keyStore = this.keyStore;
        if (keyStore == null) {
            AbstractC5504s.u("keyStore");
            keyStore = null;
        }
        keyStore.deleteEntry(keyStoreAlias);
        Q(keychainService);
    }

    private final boolean S(JSONObject encryptedItem, SharedPreferences prefs, String key, boolean requireAuthentication, String keychainService) throws JSONException, ed.j {
        encryptedItem.put("usesKeystoreSuffix", true);
        encryptedItem.put("keystoreAlias", keychainService);
        encryptedItem.put("requireAuthentication", requireAuthentication);
        String string = encryptedItem.toString();
        AbstractC5504s.g(string, "toString(...)");
        if (string.length() != 0) {
            return prefs.edit().putString(key, string).commit();
        }
        throw new ed.j("Could not JSON-encode the encrypted item for SecureStore - the string " + string + " is null or empty", key, keychainService, null, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x017d, code lost:
    
        if (T(r2, r3, r4, true, r8) == r11) goto L76;
     */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object T(java.lang.String r17, java.lang.String r18, expo.modules.securestore.SecureStoreOptions r19, boolean r20, Zd.e r21) throws expo.modules.kotlin.exception.CodedException {
        /*
            Method dump skipped, instruction units count: 419
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ed.i.T(java.lang.String, java.lang.String, expo.modules.securestore.SecureStoreOptions, boolean, Zd.e):java.lang.Object");
    }

    public Context N() throws cc.i {
        Context contextB = i().B();
        if (contextB != null) {
            return contextB;
        }
        throw new cc.i();
    }

    public final SharedPreferences O() {
        SharedPreferences sharedPreferences = N().getSharedPreferences("SecureStore", 0);
        AbstractC5504s.g(sharedPreferences, "getSharedPreferences(...)");
        return sharedPreferences;
    }

    @Override // gc.c
    public gc.e n() {
        Class cls;
        Class cls2;
        Class cls3;
        C5974d c5974d;
        X3.a.c("[ExpoModulesCore] " + (getClass() + ".ModuleDefinition"));
        try {
            gc.d dVar = new gc.d(this);
            dVar.s("ExpoSecureStore");
            C4581b c4581bB = dVar.b("setValueWithKeyAsync");
            String strC = c4581bB.c();
            X xB = c4581bB.b();
            C5974d c5974d2 = C5974d.f55938a;
            InterfaceC6014d interfaceC6014dB = kotlin.jvm.internal.O.b(String.class);
            Boolean bool = Boolean.TRUE;
            C5972b c5972b = (C5972b) c5974d2.a().get(new Pair(interfaceC6014dB, bool));
            if (c5972b == null) {
                cls = Object.class;
                c5972b = new C5972b(new M(kotlin.jvm.internal.O.b(String.class), true, g.f45937a), xB);
            } else {
                cls = Object.class;
            }
            C5972b c5972b2 = (C5972b) c5974d2.a().get(new Pair(kotlin.jvm.internal.O.b(String.class), bool));
            if (c5972b2 == null) {
                cls2 = SecureStoreOptions.class;
                c5972b2 = new C5972b(new M(kotlin.jvm.internal.O.b(String.class), true, h.f45938a), xB);
            } else {
                cls2 = SecureStoreOptions.class;
            }
            InterfaceC6014d interfaceC6014dB2 = kotlin.jvm.internal.O.b(cls2);
            Boolean bool2 = Boolean.FALSE;
            C5972b c5972b3 = (C5972b) c5974d2.a().get(new Pair(interfaceC6014dB2, bool2));
            if (c5972b3 == null) {
                c5974d = c5974d2;
                cls3 = String.class;
                c5972b3 = new C5972b(new M(kotlin.jvm.internal.O.b(cls2), false, C0727i.f45939a), xB);
            } else {
                cls3 = String.class;
                c5974d = c5974d2;
            }
            c4581bB.d(new dc.p(strC, new C5972b[]{c5972b, c5972b2, c5972b3}, new j(null, this)));
            C4581b c4581bB2 = dVar.b("getValueWithKeyAsync");
            String strC2 = c4581bB2.c();
            X xB2 = c4581bB2.b();
            C5972b c5972b4 = (C5972b) c5974d.a().get(new Pair(kotlin.jvm.internal.O.b(cls3), bool2));
            if (c5972b4 == null) {
                c5972b4 = new C5972b(new M(kotlin.jvm.internal.O.b(cls3), false, k.f45943a), xB2);
            }
            C5972b c5972b5 = (C5972b) c5974d.a().get(new Pair(kotlin.jvm.internal.O.b(cls2), bool2));
            if (c5972b5 == null) {
                c5972b5 = new C5972b(new M(kotlin.jvm.internal.O.b(cls2), false, l.f45944a), xB2);
            }
            c4581bB2.d(new dc.p(strC2, new C5972b[]{c5972b4, c5972b5}, new m(null, this)));
            X xM = dVar.m();
            C5972b c5972b6 = (C5972b) c5974d.a().get(new Pair(kotlin.jvm.internal.O.b(cls3), bool));
            if (c5972b6 == null) {
                c5972b6 = new C5972b(new M(kotlin.jvm.internal.O.b(cls3), true, n.f45948a), xM);
            }
            C5972b c5972b7 = (C5972b) c5974d.a().get(new Pair(kotlin.jvm.internal.O.b(cls3), bool));
            if (c5972b7 == null) {
                c5972b7 = new C5972b(new M(kotlin.jvm.internal.O.b(cls3), true, o.f45949a), xM);
            }
            C5972b c5972b8 = (C5972b) c5974d.a().get(new Pair(kotlin.jvm.internal.O.b(cls2), bool2));
            if (c5972b8 == null) {
                c5972b8 = new C5972b(new M(kotlin.jvm.internal.O.b(cls2), false, p.f45950a), xM);
            }
            C5972b[] c5972bArr = {c5972b6, c5972b7, c5972b8};
            V v10 = V.f55908a;
            U u10 = (U) v10.a().get(kotlin.jvm.internal.O.b(L.class));
            if (u10 == null) {
                u10 = new U(kotlin.jvm.internal.O.b(L.class));
                v10.a().put(kotlin.jvm.internal.O.b(L.class), u10);
            }
            dVar.p().put("setValueWithKeySync", new dc.r("setValueWithKeySync", c5972bArr, u10, new q()));
            X xM2 = dVar.m();
            C5972b c5972b9 = (C5972b) c5974d.a().get(new Pair(kotlin.jvm.internal.O.b(cls3), bool2));
            if (c5972b9 == null) {
                c5972b9 = new C5972b(new M(kotlin.jvm.internal.O.b(cls3), false, r.f45952a), xM2);
            }
            C5972b c5972b10 = (C5972b) c5974d.a().get(new Pair(kotlin.jvm.internal.O.b(cls2), bool2));
            if (c5972b10 == null) {
                c5972b10 = new C5972b(new M(kotlin.jvm.internal.O.b(cls2), false, s.f45953a), xM2);
            }
            C5972b[] c5972bArr2 = {c5972b9, c5972b10};
            U u11 = (U) v10.a().get(kotlin.jvm.internal.O.b(cls3));
            if (u11 == null) {
                u11 = new U(kotlin.jvm.internal.O.b(cls3));
                v10.a().put(kotlin.jvm.internal.O.b(cls3), u11);
            }
            dVar.p().put("getValueWithKeySync", new dc.r("getValueWithKeySync", c5972bArr2, u11, new t()));
            X xM3 = dVar.m();
            C5972b c5972b11 = (C5972b) c5974d.a().get(new Pair(kotlin.jvm.internal.O.b(cls3), bool2));
            if (c5972b11 == null) {
                c5972b11 = new C5972b(new M(kotlin.jvm.internal.O.b(cls3), false, d.f45934a), xM3);
            }
            C5972b c5972b12 = (C5972b) c5974d.a().get(new Pair(kotlin.jvm.internal.O.b(cls2), bool2));
            if (c5972b12 == null) {
                c5972b12 = new C5972b(new M(kotlin.jvm.internal.O.b(cls2), false, e.f45935a), xM3);
            }
            C5972b[] c5972bArr3 = {c5972b11, c5972b12};
            f fVar = new f();
            dVar.k().put("deleteValueWithKeyAsync", AbstractC5504s.c(L.class, Integer.TYPE) ? new dc.l("deleteValueWithKeyAsync", c5972bArr3, fVar) : AbstractC5504s.c(L.class, Boolean.TYPE) ? new dc.h("deleteValueWithKeyAsync", c5972bArr3, fVar) : AbstractC5504s.c(L.class, Double.TYPE) ? new dc.i("deleteValueWithKeyAsync", c5972bArr3, fVar) : AbstractC5504s.c(L.class, Float.TYPE) ? new dc.j("deleteValueWithKeyAsync", c5972bArr3, fVar) : AbstractC5504s.c(L.class, cls3) ? new dc.n("deleteValueWithKeyAsync", c5972bArr3, fVar) : new dc.s("deleteValueWithKeyAsync", c5972bArr3, fVar));
            C5972b[] c5972bArr4 = new C5972b[0];
            U u12 = (U) v10.a().get(kotlin.jvm.internal.O.b(cls));
            if (u12 == null) {
                u12 = new U(kotlin.jvm.internal.O.b(cls));
                v10.a().put(kotlin.jvm.internal.O.b(cls), u12);
            }
            dVar.p().put("canUseBiometricAuthentication", new dc.r("canUseBiometricAuthentication", c5972bArr4, u12, new u()));
            Map mapW = dVar.w();
            EnumC3046e enumC3046e = EnumC3046e.f33268a;
            mapW.put(enumC3046e, new C3042a(enumC3046e, new v()));
            gc.e eVarU = dVar.u();
            X3.a.f();
            return eVarU;
        } catch (Throwable th2) {
            X3.a.f();
            throw th2;
        }
    }
}

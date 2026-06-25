package fd;

import Zd.e;
import android.security.keystore.KeyGenParameterSpec;
import android.util.Base64;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.revenuecat.purchases.common.Constants;
import expo.modules.securestore.SecureStoreOptions;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.UnrecoverableEntryException;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.spec.GCMParameterSpec;
import kotlin.coroutines.jvm.internal.d;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: fd.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C4796a implements InterfaceC4798c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0753a f46996a = new C0753a(null);

    /* JADX INFO: renamed from: fd.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C0753a {
        public /* synthetic */ C0753a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0753a() {
        }
    }

    /* JADX INFO: renamed from: fd.a$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f46997a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f46998b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f46999c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f47001e;

        b(e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f46999c = obj;
            this.f47001e |= Integer.MIN_VALUE;
            return C4796a.this.d(null, null, false, null, null, this);
        }
    }

    /* JADX INFO: renamed from: fd.a$c */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class c extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f47002a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f47003b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f47005d;

        c(e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f47003b = obj;
            this.f47005d |= Integer.MIN_VALUE;
            return C4796a.this.f(null, null, null, null, null, this);
        }
    }

    @Override // fd.InterfaceC4798c
    public String a(SecureStoreOptions options, boolean z10) {
        AbstractC5504s.h(options, "options");
        String str = z10 ? "keystoreAuthenticated" : "keystoreUnauthenticated";
        return b(options) + Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR + str;
    }

    @Override // fd.InterfaceC4798c
    public String b(SecureStoreOptions options) {
        AbstractC5504s.h(options, "options");
        return "AES/GCM/NoPadding:" + options.getKeychainService();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object d(java.lang.String r6, java.security.KeyStore.SecretKeyEntry r7, boolean r8, java.lang.String r9, ed.C4669b r10, Zd.e r11) throws javax.crypto.NoSuchPaddingException, java.security.NoSuchAlgorithmException, java.security.InvalidKeyException, ed.C4668a {
        /*
            r5 = this;
            boolean r0 = r11 instanceof fd.C4796a.b
            if (r0 == 0) goto L13
            r0 = r11
            fd.a$b r0 = (fd.C4796a.b) r0
            int r1 = r0.f47001e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f47001e = r1
            goto L18
        L13:
            fd.a$b r0 = new fd.a$b
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.f46999c
            java.lang.Object r1 = ae.AbstractC2605b.f()
            int r2 = r0.f47001e
            r3 = 1
            if (r2 == 0) goto L3c
            if (r2 != r3) goto L34
            java.lang.Object r6 = r0.f46998b
            javax.crypto.spec.GCMParameterSpec r6 = (javax.crypto.spec.GCMParameterSpec) r6
            java.lang.Object r7 = r0.f46997a
            java.lang.String r7 = (java.lang.String) r7
            Td.v.b(r11)
            r4 = r7
            r7 = r6
            r6 = r4
            goto L68
        L34:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3c:
            Td.v.b(r11)
            javax.crypto.SecretKey r7 = r7.getSecretKey()
            java.lang.String r11 = "AES/GCM/NoPadding"
            javax.crypto.Cipher r11 = javax.crypto.Cipher.getInstance(r11)
            r11.init(r3, r7)
            java.security.AlgorithmParameters r7 = r11.getParameters()
            java.lang.Class<javax.crypto.spec.GCMParameterSpec> r2 = javax.crypto.spec.GCMParameterSpec.class
            java.security.spec.AlgorithmParameterSpec r7 = r7.getParameterSpec(r2)
            javax.crypto.spec.GCMParameterSpec r7 = (javax.crypto.spec.GCMParameterSpec) r7
            kotlin.jvm.internal.AbstractC5504s.e(r11)
            r0.f46997a = r6
            r0.f46998b = r7
            r0.f47001e = r3
            java.lang.Object r11 = r10.c(r11, r8, r9, r0)
            if (r11 != r1) goto L68
            return r1
        L68:
            javax.crypto.Cipher r11 = (javax.crypto.Cipher) r11
            kotlin.jvm.internal.AbstractC5504s.e(r7)
            org.json.JSONObject r6 = r5.e(r6, r11, r7)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: fd.C4796a.d(java.lang.String, java.security.KeyStore$SecretKeyEntry, boolean, java.lang.String, ed.b, Zd.e):java.lang.Object");
    }

    public final JSONObject e(String plaintextValue, Cipher cipher, GCMParameterSpec gcmSpec) throws JSONException {
        AbstractC5504s.h(plaintextValue, "plaintextValue");
        AbstractC5504s.h(cipher, "cipher");
        AbstractC5504s.h(gcmSpec, "gcmSpec");
        Charset UTF_8 = StandardCharsets.UTF_8;
        AbstractC5504s.g(UTF_8, "UTF_8");
        byte[] bytes = plaintextValue.getBytes(UTF_8);
        AbstractC5504s.g(bytes, "getBytes(...)");
        String strEncodeToString = Base64.encodeToString(cipher.doFinal(bytes), 2);
        String strEncodeToString2 = Base64.encodeToString(gcmSpec.getIV(), 2);
        JSONObject jSONObjectPut = new JSONObject().put("ct", strEncodeToString).put("iv", strEncodeToString2).put("tlen", gcmSpec.getTLen());
        AbstractC5504s.g(jSONObjectPut, "put(...)");
        return jSONObjectPut;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object f(java.lang.String r9, org.json.JSONObject r10, java.security.KeyStore.SecretKeyEntry r11, expo.modules.securestore.SecureStoreOptions r12, ed.C4669b r13, Zd.e r14) throws javax.crypto.BadPaddingException, org.json.JSONException, javax.crypto.NoSuchPaddingException, javax.crypto.IllegalBlockSizeException, java.security.NoSuchAlgorithmException, java.security.InvalidKeyException, ed.d, ed.C4668a, java.security.InvalidAlgorithmParameterException {
        /*
            r8 = this;
            boolean r0 = r14 instanceof fd.C4796a.c
            if (r0 == 0) goto L13
            r0 = r14
            fd.a$c r0 = (fd.C4796a.c) r0
            int r1 = r0.f47005d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f47005d = r1
            goto L18
        L13:
            fd.a$c r0 = new fd.a$c
            r0.<init>(r14)
        L18:
            java.lang.Object r14 = r0.f47003b
            java.lang.Object r1 = ae.AbstractC2605b.f()
            int r2 = r0.f47005d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r9 = r0.f47002a
            byte[] r9 = (byte[]) r9
            Td.v.b(r14)
            goto L85
        L2d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L35:
            Td.v.b(r14)
            java.lang.String r14 = "ct"
            java.lang.String r14 = r10.getString(r14)
            java.lang.String r2 = "iv"
            java.lang.String r2 = r10.getString(r2)
            java.lang.String r4 = "tlen"
            int r4 = r10.getInt(r4)
            r5 = 0
            byte[] r14 = android.util.Base64.decode(r14, r5)
            byte[] r2 = android.util.Base64.decode(r2, r5)
            javax.crypto.spec.GCMParameterSpec r5 = new javax.crypto.spec.GCMParameterSpec
            r5.<init>(r4, r2)
            java.lang.String r2 = "AES/GCM/NoPadding"
            javax.crypto.Cipher r2 = javax.crypto.Cipher.getInstance(r2)
            java.lang.String r6 = "requireAuthentication"
            boolean r10 = r10.optBoolean(r6)
            r6 = 96
            if (r4 < r6) goto L9d
            r9 = 2
            javax.crypto.SecretKey r11 = r11.getSecretKey()
            r2.init(r9, r11, r5)
            kotlin.jvm.internal.AbstractC5504s.e(r2)
            java.lang.String r9 = r12.getAuthenticationPrompt()
            r0.f47002a = r14
            r0.f47005d = r3
            java.lang.Object r9 = r13.c(r2, r10, r9, r0)
            if (r9 != r1) goto L82
            return r1
        L82:
            r7 = r14
            r14 = r9
            r9 = r7
        L85:
            javax.crypto.Cipher r14 = (javax.crypto.Cipher) r14
            byte[] r9 = r14.doFinal(r9)
            java.lang.String r10 = "doFinal(...)"
            kotlin.jvm.internal.AbstractC5504s.g(r9, r10)
            java.nio.charset.Charset r10 = java.nio.charset.StandardCharsets.UTF_8
            java.lang.String r11 = "UTF_8"
            kotlin.jvm.internal.AbstractC5504s.g(r10, r11)
            java.lang.String r11 = new java.lang.String
            r11.<init>(r9, r10)
            return r11
        L9d:
            ed.d r0 = new ed.d
            java.lang.String r3 = r12.getKeychainService()
            r5 = 8
            r6 = 0
            java.lang.String r1 = "Authentication tag length must be at least 96 bits long"
            r4 = 0
            r2 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: fd.C4796a.f(java.lang.String, org.json.JSONObject, java.security.KeyStore$SecretKeyEntry, expo.modules.securestore.SecureStoreOptions, ed.b, Zd.e):java.lang.Object");
    }

    @Override // fd.InterfaceC4798c
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public KeyStore.SecretKeyEntry c(KeyStore keyStore, SecureStoreOptions options) throws NoSuchAlgorithmException, KeyStoreException, InvalidAlgorithmParameterException, UnrecoverableEntryException {
        AbstractC5504s.h(keyStore, "keyStore");
        AbstractC5504s.h(options, "options");
        String strA = a(options, options.getRequireAuthentication());
        KeyGenParameterSpec keyGenParameterSpecBuild = new KeyGenParameterSpec.Builder(strA, 3).setKeySize(IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER).setBlockModes("GCM").setEncryptionPaddings("NoPadding").setUserAuthenticationRequired(options.getRequireAuthentication()).build();
        AbstractC5504s.g(keyGenParameterSpecBuild, "build(...)");
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", keyStore.getProvider());
        keyGenerator.init(keyGenParameterSpecBuild);
        keyGenerator.generateKey();
        KeyStore.Entry entry = keyStore.getEntry(strA, null);
        KeyStore.SecretKeyEntry secretKeyEntry = entry instanceof KeyStore.SecretKeyEntry ? (KeyStore.SecretKeyEntry) entry : null;
        if (secretKeyEntry != null) {
            return secretKeyEntry;
        }
        throw new UnrecoverableEntryException("Could not retrieve the newly generated secret key entry");
    }
}

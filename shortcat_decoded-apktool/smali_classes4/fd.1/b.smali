.class public final Lfd/b;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lfd/c;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lfd/b$a;
    }
.end annotation


# static fields
.field public static final d:Lfd/b$a;


# instance fields
.field private a:Landroid/content/Context;

.field private final b:Lfd/a;

.field private final c:Ljava/security/SecureRandom;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lfd/b$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lfd/b$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lfd/b;->d:Lfd/b$a;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lfd/a;)V
    .locals 1

    .line 1
    const-string v0, "mContext"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "mAESEncryptor"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Lfd/b;->a:Landroid/content/Context;

    .line 15
    .line 16
    iput-object p2, p0, Lfd/b;->b:Lfd/a;

    .line 17
    .line 18
    new-instance p1, Ljava/security/SecureRandom;

    .line 19
    .line 20
    invoke-direct {p1}, Ljava/security/SecureRandom;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object p1, p0, Lfd/b;->c:Ljava/security/SecureRandom;

    .line 24
    .line 25
    return-void
.end method

.method private final e()Ljavax/crypto/Cipher;
    .locals 2

    .line 1
    const-string v0, "RSA/None/PKCS1Padding"

    .line 2
    .line 3
    invoke-static {v0}, Ljavax/crypto/Cipher;->getInstance(Ljava/lang/String;)Ljavax/crypto/Cipher;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "getInstance(...)"

    .line 8
    .line 9
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method


# virtual methods
.method public a(Lexpo/modules/securestore/SecureStoreOptions;Z)Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "options"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    if-eqz p2, :cond_0

    .line 7
    .line 8
    const-string p2, "keystoreAuthenticated"

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const-string p2, "keystoreUnauthenticated"

    .line 12
    .line 13
    :goto_0
    invoke-virtual {p0, p1}, Lfd/b;->b(Lexpo/modules/securestore/SecureStoreOptions;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    new-instance v0, Ljava/lang/StringBuilder;

    .line 18
    .line 19
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    const-string p1, ":"

    .line 26
    .line 27
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    return-object p1
.end method

.method public b(Lexpo/modules/securestore/SecureStoreOptions;)Ljava/lang/String;
    .locals 2

    .line 1
    const-string v0, "options"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Lexpo/modules/securestore/SecureStoreOptions;->getKeychainService()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    new-instance v0, Ljava/lang/StringBuilder;

    .line 11
    .line 12
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 13
    .line 14
    .line 15
    const-string v1, "RSA/None/PKCS1Padding:"

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    return-object p1
.end method

.method public bridge synthetic c(Ljava/security/KeyStore;Lexpo/modules/securestore/SecureStoreOptions;)Ljava/security/KeyStore$Entry;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lfd/b;->f(Ljava/security/KeyStore;Lexpo/modules/securestore/SecureStoreOptions;)Ljava/security/KeyStore$PrivateKeyEntry;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public d(Ljava/lang/String;Lorg/json/JSONObject;Ljava/security/KeyStore$PrivateKeyEntry;Lexpo/modules/securestore/SecureStoreOptions;Led/b;LZd/e;)Ljava/lang/Object;
    .locals 9

    .line 1
    const-string v0, "esk"

    .line 2
    .line 3
    invoke-virtual {p2, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-static {v0, v1}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-direct {p0}, Lfd/b;->e()Ljavax/crypto/Cipher;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    const/4 v2, 0x2

    .line 17
    invoke-virtual {p3}, Ljava/security/KeyStore$PrivateKeyEntry;->getPrivateKey()Ljava/security/PrivateKey;

    .line 18
    .line 19
    .line 20
    move-result-object p3

    .line 21
    invoke-virtual {v1, v2, p3}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v1, v0}, Ljavax/crypto/Cipher;->doFinal([B)[B

    .line 25
    .line 26
    .line 27
    move-result-object p3

    .line 28
    new-instance v0, Ljavax/crypto/spec/SecretKeySpec;

    .line 29
    .line 30
    const-string v1, "AES"

    .line 31
    .line 32
    invoke-direct {v0, p3, v1}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V

    .line 33
    .line 34
    .line 35
    new-instance v5, Ljava/security/KeyStore$SecretKeyEntry;

    .line 36
    .line 37
    invoke-direct {v5, v0}, Ljava/security/KeyStore$SecretKeyEntry;-><init>(Ljavax/crypto/SecretKey;)V

    .line 38
    .line 39
    .line 40
    iget-object v2, p0, Lfd/b;->b:Lfd/a;

    .line 41
    .line 42
    move-object v3, p1

    .line 43
    move-object v4, p2

    .line 44
    move-object v6, p4

    .line 45
    move-object v7, p5

    .line 46
    move-object v8, p6

    .line 47
    invoke-virtual/range {v2 .. v8}, Lfd/a;->f(Ljava/lang/String;Lorg/json/JSONObject;Ljava/security/KeyStore$SecretKeyEntry;Lexpo/modules/securestore/SecureStoreOptions;Led/b;LZd/e;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    return-object p1
.end method

.method public f(Ljava/security/KeyStore;Lexpo/modules/securestore/SecureStoreOptions;)Ljava/security/KeyStore$PrivateKeyEntry;
    .locals 1

    .line 1
    const-string v0, "keyStore"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string p1, "options"

    .line 7
    .line 8
    invoke-static {p2, p1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    new-instance p1, Led/g;

    .line 12
    .line 13
    const-string p2, "Tried to initialize HybridAESEncryptor key store entry on Android SDK >= 23. This shouldn\'t happen. If you see this message report an issue at https://github.com/expo/expo."

    .line 14
    .line 15
    invoke-direct {p1, p2}, Led/g;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    throw p1
.end method

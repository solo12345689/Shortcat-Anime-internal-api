.class public final Lxb/b;
.super Lgc/c;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lxb/b$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J9\u0010\u000e\u001a\u00020\r2\u0016\u0010\u0008\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004j\u0002`\u00072\u0006\u0010\n\u001a\u00020\t2\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000bH\u0002\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ)\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u0011H\u0002\u00a2\u0006\u0004\u0008\u0013\u0010\u0014JU\u0010\u0019\u001a\u00020\r2\u0016\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004j\u0002`\u00072\u0016\u0010\u0016\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004j\u0002`\u00072\u0014\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0004H\u0002\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ#\u0010\u001b\u001a\u00020\u0005*\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004j\u0002`\u0007H\u0002\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016\u00a2\u0006\u0004\u0008\u001e\u0010\u001fR\u001b\u0010%\u001a\u00020 8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008!\u0010\"\u001a\u0004\u0008#\u0010$\u00a8\u0006&"
    }
    d2 = {
        "Lxb/b;",
        "Lgc/c;",
        "<init>",
        "()V",
        "Lexpo/modules/kotlin/types/Either;",
        "",
        "",
        "Lexpo/modules/crypto/aes/BinaryInput;",
        "plaintext",
        "Lexpo/modules/crypto/aes/objects/EncryptionKey;",
        "key",
        "Lexpo/modules/crypto/aes/records/EncryptOptions;",
        "options",
        "Lexpo/modules/crypto/aes/objects/SealedData;",
        "C",
        "(Lexpo/modules/kotlin/types/Either;Lexpo/modules/crypto/aes/objects/EncryptionKey;Lexpo/modules/crypto/aes/records/EncryptOptions;)Lexpo/modules/crypto/aes/objects/SealedData;",
        "sealedData",
        "Lexpo/modules/crypto/aes/records/DecryptOptions;",
        "",
        "B",
        "(Lexpo/modules/crypto/aes/objects/SealedData;Lexpo/modules/crypto/aes/objects/EncryptionKey;Lexpo/modules/crypto/aes/records/DecryptOptions;)Ljava/lang/Object;",
        "iv",
        "ciphertext",
        "",
        "tag",
        "F",
        "(Lexpo/modules/kotlin/types/Either;Lexpo/modules/kotlin/types/Either;Lexpo/modules/kotlin/types/Either;)Lexpo/modules/crypto/aes/objects/SealedData;",
        "G",
        "(Lexpo/modules/kotlin/types/Either;)[B",
        "Lgc/e;",
        "n",
        "()Lgc/e;",
        "Ljava/security/SecureRandom;",
        "d",
        "Lkotlin/Lazy;",
        "D",
        "()Ljava/security/SecureRandom;",
        "rng",
        "expo-crypto_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final d:Lkotlin/Lazy;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lgc/c;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lxb/a;

    .line 5
    .line 6
    invoke-direct {v0}, Lxb/a;-><init>()V

    .line 7
    .line 8
    .line 9
    invoke-static {v0}, LTd/n;->b(Lie/a;)Lkotlin/Lazy;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iput-object v0, p0, Lxb/b;->d:Lkotlin/Lazy;

    .line 14
    .line 15
    return-void
.end method

.method public static final synthetic A(Lxb/b;Lexpo/modules/kotlin/types/Either;Lexpo/modules/kotlin/types/Either;Lexpo/modules/kotlin/types/Either;)Lexpo/modules/crypto/aes/objects/SealedData;
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lxb/b;->F(Lexpo/modules/kotlin/types/Either;Lexpo/modules/kotlin/types/Either;Lexpo/modules/kotlin/types/Either;)Lexpo/modules/crypto/aes/objects/SealedData;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private final B(Lexpo/modules/crypto/aes/objects/SealedData;Lexpo/modules/crypto/aes/objects/EncryptionKey;Lexpo/modules/crypto/aes/records/DecryptOptions;)Ljava/lang/Object;
    .locals 4

    .line 1
    invoke-virtual {p2}, Lexpo/modules/crypto/aes/objects/EncryptionKey;->O()Ljavax/crypto/SecretKey;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    :try_start_0
    const-string v0, "AES/GCM/NoPadding"

    .line 6
    .line 7
    invoke-static {v0}, Ljavax/crypto/Cipher;->getInstance(Ljava/lang/String;)Ljavax/crypto/Cipher;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    new-instance v1, Ljavax/crypto/spec/GCMParameterSpec;

    .line 12
    .line 13
    invoke-virtual {p1}, Lexpo/modules/crypto/aes/objects/SealedData;->a1()I

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    mul-int/lit8 v2, v2, 0x8

    .line 18
    .line 19
    invoke-virtual {p1}, Lexpo/modules/crypto/aes/objects/SealedData;->B0()[B

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    invoke-direct {v1, v2, v3}, Ljavax/crypto/spec/GCMParameterSpec;-><init>(I[B)V

    .line 24
    .line 25
    .line 26
    const/4 v2, 0x2

    .line 27
    invoke-virtual {v0, v2, p2, v1}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V

    .line 28
    .line 29
    .line 30
    if-eqz p3, :cond_0

    .line 31
    .line 32
    invoke-virtual {p3}, Lexpo/modules/crypto/aes/records/DecryptOptions;->getAdditionalData()Lexpo/modules/kotlin/types/Either;

    .line 33
    .line 34
    .line 35
    move-result-object p2

    .line 36
    if-eqz p2, :cond_0

    .line 37
    .line 38
    invoke-direct {p0, p2}, Lxb/b;->G(Lexpo/modules/kotlin/types/Either;)[B

    .line 39
    .line 40
    .line 41
    move-result-object p2

    .line 42
    invoke-virtual {v0, p2}, Ljavax/crypto/Cipher;->updateAAD([B)V

    .line 43
    .line 44
    .line 45
    goto :goto_0

    .line 46
    :catchall_0
    move-exception p1

    .line 47
    goto :goto_2

    .line 48
    :cond_0
    :goto_0
    invoke-static {v0}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    invoke-static {v0, p1}, Lyb/c;->a(Ljavax/crypto/Cipher;Lexpo/modules/crypto/aes/objects/SealedData;)Ljava/nio/ByteBuffer;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->array()[B

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    const-string p2, "array(...)"

    .line 60
    .line 61
    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    if-eqz p3, :cond_1

    .line 65
    .line 66
    invoke-virtual {p3}, Lexpo/modules/crypto/aes/records/DecryptOptions;->getOutput()Lexpo/modules/crypto/aes/enums/DataFormat;

    .line 67
    .line 68
    .line 69
    move-result-object p2

    .line 70
    goto :goto_1

    .line 71
    :cond_1
    const/4 p2, 0x0

    .line 72
    :goto_1
    invoke-static {p1, p2}, Lyb/b;->e([BLexpo/modules/crypto/aes/enums/DataFormat;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 76
    return-object p1

    .line 77
    :goto_2
    new-instance p2, Lxb/c;

    .line 78
    .line 79
    invoke-direct {p2, p1}, Lxb/c;-><init>(Ljava/lang/Throwable;)V

    .line 80
    .line 81
    .line 82
    throw p2
.end method

.method private final C(Lexpo/modules/kotlin/types/Either;Lexpo/modules/crypto/aes/objects/EncryptionKey;Lexpo/modules/crypto/aes/records/EncryptOptions;)Lexpo/modules/crypto/aes/objects/SealedData;
    .locals 3

    .line 1
    invoke-virtual {p2}, Lexpo/modules/crypto/aes/objects/EncryptionKey;->O()Ljavax/crypto/SecretKey;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    invoke-direct {p0, p1}, Lxb/b;->G(Lexpo/modules/kotlin/types/Either;)[B

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-static {p1}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    :try_start_0
    const-string v0, "AES/GCM/NoPadding"

    .line 14
    .line 15
    invoke-static {v0}, Ljavax/crypto/Cipher;->getInstance(Ljava/lang/String;)Ljavax/crypto/Cipher;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    if-eqz p3, :cond_0

    .line 20
    .line 21
    invoke-direct {p0}, Lxb/b;->D()Ljava/security/SecureRandom;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-virtual {p3, v1}, Lexpo/modules/crypto/aes/records/EncryptOptions;->gcmParameterSpec$expo_crypto_release(Ljava/security/SecureRandom;)Ljavax/crypto/spec/GCMParameterSpec;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    goto :goto_0

    .line 30
    :catchall_0
    move-exception p1

    .line 31
    goto :goto_1

    .line 32
    :cond_0
    const/4 v1, 0x0

    .line 33
    :goto_0
    const/4 v2, 0x1

    .line 34
    invoke-virtual {v0, v2, p2, v1}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V

    .line 35
    .line 36
    .line 37
    if-eqz p3, :cond_1

    .line 38
    .line 39
    invoke-virtual {p3}, Lexpo/modules/crypto/aes/records/EncryptOptions;->getAdditionalData()Lexpo/modules/kotlin/types/Either;

    .line 40
    .line 41
    .line 42
    move-result-object p2

    .line 43
    if-eqz p2, :cond_1

    .line 44
    .line 45
    invoke-direct {p0, p2}, Lxb/b;->G(Lexpo/modules/kotlin/types/Either;)[B

    .line 46
    .line 47
    .line 48
    move-result-object p2

    .line 49
    invoke-virtual {v0, p2}, Ljavax/crypto/Cipher;->updateAAD([B)V

    .line 50
    .line 51
    .line 52
    :cond_1
    invoke-static {v0}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    invoke-static {p1}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    invoke-static {v0, p1}, Lyb/c;->b(Ljavax/crypto/Cipher;Ljava/nio/ByteBuffer;)Lexpo/modules/crypto/aes/objects/SealedData;

    .line 59
    .line 60
    .line 61
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 62
    return-object p1

    .line 63
    :goto_1
    new-instance p2, Lxb/d;

    .line 64
    .line 65
    invoke-direct {p2, p1}, Lxb/d;-><init>(Ljava/lang/Throwable;)V

    .line 66
    .line 67
    .line 68
    throw p2
.end method

.method private final D()Ljava/security/SecureRandom;
    .locals 1

    .line 1
    iget-object v0, p0, Lxb/b;->d:Lkotlin/Lazy;

    .line 2
    .line 3
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/security/SecureRandom;

    .line 8
    .line 9
    return-object v0
.end method

.method private static final E()Ljava/security/SecureRandom;
    .locals 1

    .line 1
    new-instance v0, Ljava/security/SecureRandom;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/security/SecureRandom;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method private final F(Lexpo/modules/kotlin/types/Either;Lexpo/modules/kotlin/types/Either;Lexpo/modules/kotlin/types/Either;)Lexpo/modules/crypto/aes/objects/SealedData;
    .locals 3

    .line 1
    invoke-direct {p0, p1}, Lxb/b;->G(Lexpo/modules/kotlin/types/Either;)[B

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-direct {p0, p2}, Lxb/b;->G(Lexpo/modules/kotlin/types/Either;)[B

    .line 6
    .line 7
    .line 8
    move-result-object p2

    .line 9
    const/4 v0, 0x1

    .line 10
    if-eqz p3, :cond_0

    .line 11
    .line 12
    sget-object v1, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 13
    .line 14
    invoke-static {v1}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    invoke-virtual {p3, v2}, Lexpo/modules/kotlin/types/Either;->f(Lpe/d;)Z

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    if-ne v2, v0, :cond_0

    .line 23
    .line 24
    invoke-static {v1}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-virtual {p3, v0}, Lexpo/modules/kotlin/types/Either;->c(Lpe/d;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p3

    .line 32
    check-cast p3, Ljava/lang/Number;

    .line 33
    .line 34
    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    .line 35
    .line 36
    .line 37
    move-result p3

    .line 38
    new-instance v0, Lexpo/modules/crypto/aes/objects/SealedData;

    .line 39
    .line 40
    invoke-direct {v0, p1, p2, p3}, Lexpo/modules/crypto/aes/objects/SealedData;-><init>([B[BI)V

    .line 41
    .line 42
    .line 43
    return-object v0

    .line 44
    :cond_0
    if-eqz p3, :cond_1

    .line 45
    .line 46
    const-class v1, [B

    .line 47
    .line 48
    invoke-static {v1}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    invoke-virtual {p3, v2}, Lexpo/modules/kotlin/types/Either;->e(Lpe/d;)Z

    .line 53
    .line 54
    .line 55
    move-result v2

    .line 56
    if-ne v2, v0, :cond_1

    .line 57
    .line 58
    invoke-static {v1}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    invoke-virtual {p3, v0}, Lexpo/modules/kotlin/types/Either;->b(Lpe/d;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object p3

    .line 66
    check-cast p3, [B

    .line 67
    .line 68
    new-instance v0, Lexpo/modules/crypto/aes/objects/SealedData;

    .line 69
    .line 70
    invoke-static {p2, p3}, LUd/n;->A([B[B)[B

    .line 71
    .line 72
    .line 73
    move-result-object p2

    .line 74
    array-length p3, p3

    .line 75
    invoke-direct {v0, p1, p2, p3}, Lexpo/modules/crypto/aes/objects/SealedData;-><init>([B[BI)V

    .line 76
    .line 77
    .line 78
    return-object v0

    .line 79
    :cond_1
    new-instance p3, Lexpo/modules/crypto/aes/objects/SealedData;

    .line 80
    .line 81
    const/16 v0, 0x10

    .line 82
    .line 83
    invoke-direct {p3, p1, p2, v0}, Lexpo/modules/crypto/aes/objects/SealedData;-><init>([B[BI)V

    .line 84
    .line 85
    .line 86
    return-object p3
.end method

.method private final G(Lexpo/modules/kotlin/types/Either;)[B
    .locals 2

    .line 1
    const-class v0, [B

    .line 2
    .line 3
    invoke-static {v0}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {p1, v1}, Lexpo/modules/kotlin/types/Either;->e(Lpe/d;)Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    invoke-static {v0}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {p1, v0}, Lexpo/modules/kotlin/types/Either;->b(Lpe/d;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    check-cast p1, [B

    .line 22
    .line 23
    return-object p1

    .line 24
    :cond_0
    const-class v0, Ljava/lang/String;

    .line 25
    .line 26
    invoke-static {v0}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-virtual {p1, v0}, Lexpo/modules/kotlin/types/Either;->c(Lpe/d;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    check-cast p1, Ljava/lang/String;

    .line 35
    .line 36
    const/4 v0, 0x2

    .line 37
    invoke-static {p1, v0}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    const-string v0, "decode(...)"

    .line 42
    .line 43
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    return-object p1
.end method

.method public static synthetic x()Ljava/security/SecureRandom;
    .locals 1

    .line 1
    invoke-static {}, Lxb/b;->E()Ljava/security/SecureRandom;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public static final synthetic y(Lxb/b;Lexpo/modules/crypto/aes/objects/SealedData;Lexpo/modules/crypto/aes/objects/EncryptionKey;Lexpo/modules/crypto/aes/records/DecryptOptions;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lxb/b;->B(Lexpo/modules/crypto/aes/objects/SealedData;Lexpo/modules/crypto/aes/objects/EncryptionKey;Lexpo/modules/crypto/aes/records/DecryptOptions;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic z(Lxb/b;Lexpo/modules/kotlin/types/Either;Lexpo/modules/crypto/aes/objects/EncryptionKey;Lexpo/modules/crypto/aes/records/EncryptOptions;)Lexpo/modules/crypto/aes/objects/SealedData;
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lxb/b;->C(Lexpo/modules/kotlin/types/Either;Lexpo/modules/crypto/aes/objects/EncryptionKey;Lexpo/modules/crypto/aes/records/EncryptOptions;)Lexpo/modules/crypto/aes/objects/SealedData;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method


# virtual methods
.method public n()Lgc/e;
    .locals 37

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    const-string v0, "constructor"

    .line 4
    .line 5
    const-class v2, Lexpo/modules/crypto/aes/records/DecryptOptions;

    .line 6
    .line 7
    const-class v3, Lexpo/modules/crypto/aes/records/EncryptOptions;

    .line 8
    .line 9
    const-string v4, "get"

    .line 10
    .line 11
    const-class v5, Lexpo/modules/crypto/aes/enums/KeyEncoding;

    .line 12
    .line 13
    const-class v6, Lexpo/modules/crypto/aes/enums/DataFormat;

    .line 14
    .line 15
    const-class v7, Lexpo/modules/crypto/aes/enums/KeySize;

    .line 16
    .line 17
    const-class v8, Ljava/lang/Integer;

    .line 18
    .line 19
    const-class v9, Lexpo/modules/kotlin/types/Either;

    .line 20
    .line 21
    const-class v10, Ljava/lang/Object;

    .line 22
    .line 23
    const-class v11, Lexpo/modules/crypto/aes/objects/EncryptionKey;

    .line 24
    .line 25
    const-class v12, Lexpo/modules/crypto/aes/objects/SealedData;

    .line 26
    .line 27
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    move-result-object v13

    .line 31
    new-instance v14, Ljava/lang/StringBuilder;

    .line 32
    .line 33
    invoke-direct {v14}, Ljava/lang/StringBuilder;-><init>()V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v14, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    const-string v13, ".ModuleDefinition"

    .line 40
    .line 41
    invoke-virtual {v14, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v13

    .line 48
    new-instance v14, Ljava/lang/StringBuilder;

    .line 49
    .line 50
    invoke-direct {v14}, Ljava/lang/StringBuilder;-><init>()V

    .line 51
    .line 52
    .line 53
    const-string v15, "["

    .line 54
    .line 55
    invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    const-string v15, "ExpoModulesCore"

    .line 59
    .line 60
    invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    const-string v15, "] "

    .line 64
    .line 65
    invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    invoke-virtual {v14, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v13

    .line 75
    invoke-static {v13}, LX3/a;->c(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    :try_start_0
    new-instance v13, Lgc/d;

    .line 79
    .line 80
    invoke-direct {v13, v1}, Lgc/d;-><init>(Lgc/c;)V

    .line 81
    .line 82
    .line 83
    const-string v14, "ExpoCryptoAES"

    .line 84
    .line 85
    invoke-virtual {v13, v14}, Lgc/a;->s(Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    const-string v14, "encryptAsync"

    .line 89
    .line 90
    invoke-virtual {v13}, Lhc/f;->m()Lpc/X;

    .line 91
    .line 92
    .line 93
    move-result-object v15

    .line 94
    sget-object v16, Lpc/d;->a:Lpc/d;

    .line 95
    .line 96
    move-object/from16 v17, v2

    .line 97
    .line 98
    new-instance v2, Lkotlin/Pair;

    .line 99
    .line 100
    move-object/from16 v18, v3

    .line 101
    .line 102
    invoke-static {v9}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 103
    .line 104
    .line 105
    move-result-object v3

    .line 106
    move-object/from16 v19, v5

    .line 107
    .line 108
    sget-object v5, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 109
    .line 110
    invoke-direct {v2, v3, v5}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 111
    .line 112
    .line 113
    invoke-virtual/range {v16 .. v16}, Lpc/d;->a()Ljava/util/Map;

    .line 114
    .line 115
    .line 116
    move-result-object v3

    .line 117
    invoke-interface {v3, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object v2

    .line 121
    check-cast v2, Lpc/b;

    .line 122
    .line 123
    if-nez v2, :cond_0

    .line 124
    .line 125
    sget-object v2, Lxb/b$b;->a:Lxb/b$b;

    .line 126
    .line 127
    new-instance v3, Lpc/b;

    .line 128
    .line 129
    move-object/from16 v20, v6

    .line 130
    .line 131
    new-instance v6, Lpc/M;

    .line 132
    .line 133
    move-object/from16 v21, v8

    .line 134
    .line 135
    invoke-static {v9}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 136
    .line 137
    .line 138
    move-result-object v8

    .line 139
    move-object/from16 v22, v9

    .line 140
    .line 141
    const/4 v9, 0x0

    .line 142
    invoke-direct {v6, v8, v9, v2}, Lpc/M;-><init>(Lpe/d;ZLie/a;)V

    .line 143
    .line 144
    .line 145
    invoke-direct {v3, v6, v15}, Lpc/b;-><init>(Lpe/q;Lpc/X;)V

    .line 146
    .line 147
    .line 148
    move-object v2, v3

    .line 149
    goto :goto_0

    .line 150
    :catchall_0
    move-exception v0

    .line 151
    goto/16 :goto_1c

    .line 152
    .line 153
    :cond_0
    move-object/from16 v20, v6

    .line 154
    .line 155
    move-object/from16 v21, v8

    .line 156
    .line 157
    move-object/from16 v22, v9

    .line 158
    .line 159
    :goto_0
    new-instance v3, Lkotlin/Pair;

    .line 160
    .line 161
    invoke-static {v11}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 162
    .line 163
    .line 164
    move-result-object v6

    .line 165
    invoke-direct {v3, v6, v5}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 166
    .line 167
    .line 168
    invoke-virtual/range {v16 .. v16}, Lpc/d;->a()Ljava/util/Map;

    .line 169
    .line 170
    .line 171
    move-result-object v6

    .line 172
    invoke-interface {v6, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    move-result-object v3

    .line 176
    check-cast v3, Lpc/b;

    .line 177
    .line 178
    if-nez v3, :cond_1

    .line 179
    .line 180
    sget-object v3, Lxb/b$c;->a:Lxb/b$c;

    .line 181
    .line 182
    new-instance v6, Lpc/b;

    .line 183
    .line 184
    new-instance v8, Lpc/M;

    .line 185
    .line 186
    invoke-static {v11}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 187
    .line 188
    .line 189
    move-result-object v9

    .line 190
    move-object/from16 v23, v13

    .line 191
    .line 192
    const/4 v13, 0x0

    .line 193
    invoke-direct {v8, v9, v13, v3}, Lpc/M;-><init>(Lpe/d;ZLie/a;)V

    .line 194
    .line 195
    .line 196
    invoke-direct {v6, v8, v15}, Lpc/b;-><init>(Lpe/q;Lpc/X;)V

    .line 197
    .line 198
    .line 199
    move-object v3, v6

    .line 200
    goto :goto_1

    .line 201
    :cond_1
    move-object/from16 v23, v13

    .line 202
    .line 203
    :goto_1
    new-instance v6, Lkotlin/Pair;

    .line 204
    .line 205
    invoke-static/range {v18 .. v18}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 206
    .line 207
    .line 208
    move-result-object v8

    .line 209
    sget-object v9, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 210
    .line 211
    invoke-direct {v6, v8, v9}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 212
    .line 213
    .line 214
    invoke-virtual/range {v16 .. v16}, Lpc/d;->a()Ljava/util/Map;

    .line 215
    .line 216
    .line 217
    move-result-object v8

    .line 218
    invoke-interface {v8, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 219
    .line 220
    .line 221
    move-result-object v6

    .line 222
    check-cast v6, Lpc/b;

    .line 223
    .line 224
    if-nez v6, :cond_2

    .line 225
    .line 226
    sget-object v6, Lxb/b$d;->a:Lxb/b$d;

    .line 227
    .line 228
    new-instance v13, Lpc/b;

    .line 229
    .line 230
    new-instance v8, Lpc/M;

    .line 231
    .line 232
    move-object/from16 v24, v4

    .line 233
    .line 234
    invoke-static/range {v18 .. v18}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 235
    .line 236
    .line 237
    move-result-object v4

    .line 238
    move-object/from16 v18, v11

    .line 239
    .line 240
    const/4 v11, 0x1

    .line 241
    invoke-direct {v8, v4, v11, v6}, Lpc/M;-><init>(Lpe/d;ZLie/a;)V

    .line 242
    .line 243
    .line 244
    invoke-direct {v13, v8, v15}, Lpc/b;-><init>(Lpe/q;Lpc/X;)V

    .line 245
    .line 246
    .line 247
    move-object v6, v13

    .line 248
    goto :goto_2

    .line 249
    :cond_2
    move-object/from16 v24, v4

    .line 250
    .line 251
    move-object/from16 v18, v11

    .line 252
    .line 253
    :goto_2
    filled-new-array {v2, v3, v6}, [Lpc/b;

    .line 254
    .line 255
    .line 256
    move-result-object v2

    .line 257
    new-instance v3, Lxb/b$e;

    .line 258
    .line 259
    invoke-direct {v3, v1}, Lxb/b$e;-><init>(Lxb/b;)V

    .line 260
    .line 261
    .line 262
    sget-object v4, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 263
    .line 264
    invoke-static {v12, v4}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 265
    .line 266
    .line 267
    move-result v6
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 268
    sget-object v8, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    .line 269
    .line 270
    sget-object v11, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    .line 271
    .line 272
    sget-object v13, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 273
    .line 274
    const-class v15, Ljava/lang/String;

    .line 275
    .line 276
    if-eqz v6, :cond_3

    .line 277
    .line 278
    :try_start_1
    new-instance v6, Ldc/l;

    .line 279
    .line 280
    invoke-direct {v6, v14, v2, v3}, Ldc/l;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    .line 281
    .line 282
    .line 283
    goto :goto_3

    .line 284
    :cond_3
    invoke-static {v12, v13}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 285
    .line 286
    .line 287
    move-result v6

    .line 288
    if-eqz v6, :cond_4

    .line 289
    .line 290
    new-instance v6, Ldc/h;

    .line 291
    .line 292
    invoke-direct {v6, v14, v2, v3}, Ldc/h;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    .line 293
    .line 294
    .line 295
    goto :goto_3

    .line 296
    :cond_4
    invoke-static {v12, v11}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 297
    .line 298
    .line 299
    move-result v6

    .line 300
    if-eqz v6, :cond_5

    .line 301
    .line 302
    new-instance v6, Ldc/i;

    .line 303
    .line 304
    invoke-direct {v6, v14, v2, v3}, Ldc/i;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    .line 305
    .line 306
    .line 307
    goto :goto_3

    .line 308
    :cond_5
    invoke-static {v12, v8}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 309
    .line 310
    .line 311
    move-result v6

    .line 312
    if-eqz v6, :cond_6

    .line 313
    .line 314
    new-instance v6, Ldc/j;

    .line 315
    .line 316
    invoke-direct {v6, v14, v2, v3}, Ldc/j;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    .line 317
    .line 318
    .line 319
    goto :goto_3

    .line 320
    :cond_6
    invoke-static {v12, v15}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 321
    .line 322
    .line 323
    move-result v6

    .line 324
    if-eqz v6, :cond_7

    .line 325
    .line 326
    new-instance v6, Ldc/n;

    .line 327
    .line 328
    invoke-direct {v6, v14, v2, v3}, Ldc/n;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    .line 329
    .line 330
    .line 331
    goto :goto_3

    .line 332
    :cond_7
    new-instance v6, Ldc/s;

    .line 333
    .line 334
    invoke-direct {v6, v14, v2, v3}, Ldc/s;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    .line 335
    .line 336
    .line 337
    :goto_3
    invoke-virtual/range {v23 .. v23}, Lhc/f;->k()Ljava/util/Map;

    .line 338
    .line 339
    .line 340
    move-result-object v2

    .line 341
    invoke-interface {v2, v14, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 342
    .line 343
    .line 344
    const-string v2, "decryptAsync"

    .line 345
    .line 346
    invoke-virtual/range {v23 .. v23}, Lhc/f;->m()Lpc/X;

    .line 347
    .line 348
    .line 349
    move-result-object v3

    .line 350
    new-instance v6, Lkotlin/Pair;

    .line 351
    .line 352
    invoke-static {v12}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 353
    .line 354
    .line 355
    move-result-object v14

    .line 356
    invoke-direct {v6, v14, v5}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 357
    .line 358
    .line 359
    invoke-virtual/range {v16 .. v16}, Lpc/d;->a()Ljava/util/Map;

    .line 360
    .line 361
    .line 362
    move-result-object v14

    .line 363
    invoke-interface {v14, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 364
    .line 365
    .line 366
    move-result-object v6

    .line 367
    check-cast v6, Lpc/b;

    .line 368
    .line 369
    if-nez v6, :cond_8

    .line 370
    .line 371
    sget-object v6, Lxb/b$f;->a:Lxb/b$f;

    .line 372
    .line 373
    new-instance v14, Lpc/b;

    .line 374
    .line 375
    move-object/from16 v25, v12

    .line 376
    .line 377
    new-instance v12, Lpc/M;

    .line 378
    .line 379
    move-object/from16 v26, v7

    .line 380
    .line 381
    invoke-static/range {v25 .. v25}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 382
    .line 383
    .line 384
    move-result-object v7

    .line 385
    move-object/from16 v27, v15

    .line 386
    .line 387
    const/4 v15, 0x0

    .line 388
    invoke-direct {v12, v7, v15, v6}, Lpc/M;-><init>(Lpe/d;ZLie/a;)V

    .line 389
    .line 390
    .line 391
    invoke-direct {v14, v12, v3}, Lpc/b;-><init>(Lpe/q;Lpc/X;)V

    .line 392
    .line 393
    .line 394
    move-object v6, v14

    .line 395
    goto :goto_4

    .line 396
    :cond_8
    move-object/from16 v26, v7

    .line 397
    .line 398
    move-object/from16 v25, v12

    .line 399
    .line 400
    move-object/from16 v27, v15

    .line 401
    .line 402
    :goto_4
    new-instance v7, Lkotlin/Pair;

    .line 403
    .line 404
    invoke-static/range {v18 .. v18}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 405
    .line 406
    .line 407
    move-result-object v12

    .line 408
    invoke-direct {v7, v12, v5}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 409
    .line 410
    .line 411
    invoke-virtual/range {v16 .. v16}, Lpc/d;->a()Ljava/util/Map;

    .line 412
    .line 413
    .line 414
    move-result-object v12

    .line 415
    invoke-interface {v12, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 416
    .line 417
    .line 418
    move-result-object v7

    .line 419
    check-cast v7, Lpc/b;

    .line 420
    .line 421
    if-nez v7, :cond_9

    .line 422
    .line 423
    sget-object v7, Lxb/b$g;->a:Lxb/b$g;

    .line 424
    .line 425
    new-instance v12, Lpc/b;

    .line 426
    .line 427
    new-instance v14, Lpc/M;

    .line 428
    .line 429
    invoke-static/range {v18 .. v18}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 430
    .line 431
    .line 432
    move-result-object v15

    .line 433
    move-object/from16 v28, v5

    .line 434
    .line 435
    const/4 v5, 0x0

    .line 436
    invoke-direct {v14, v15, v5, v7}, Lpc/M;-><init>(Lpe/d;ZLie/a;)V

    .line 437
    .line 438
    .line 439
    invoke-direct {v12, v14, v3}, Lpc/b;-><init>(Lpe/q;Lpc/X;)V

    .line 440
    .line 441
    .line 442
    move-object v7, v12

    .line 443
    goto :goto_5

    .line 444
    :cond_9
    move-object/from16 v28, v5

    .line 445
    .line 446
    :goto_5
    new-instance v5, Lkotlin/Pair;

    .line 447
    .line 448
    invoke-static/range {v17 .. v17}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 449
    .line 450
    .line 451
    move-result-object v12

    .line 452
    invoke-direct {v5, v12, v9}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 453
    .line 454
    .line 455
    invoke-virtual/range {v16 .. v16}, Lpc/d;->a()Ljava/util/Map;

    .line 456
    .line 457
    .line 458
    move-result-object v12

    .line 459
    invoke-interface {v12, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 460
    .line 461
    .line 462
    move-result-object v5

    .line 463
    check-cast v5, Lpc/b;

    .line 464
    .line 465
    if-nez v5, :cond_a

    .line 466
    .line 467
    sget-object v5, Lxb/b$h;->a:Lxb/b$h;

    .line 468
    .line 469
    new-instance v12, Lpc/b;

    .line 470
    .line 471
    new-instance v14, Lpc/M;

    .line 472
    .line 473
    invoke-static/range {v17 .. v17}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 474
    .line 475
    .line 476
    move-result-object v15

    .line 477
    move-object/from16 v17, v9

    .line 478
    .line 479
    const/4 v9, 0x1

    .line 480
    invoke-direct {v14, v15, v9, v5}, Lpc/M;-><init>(Lpe/d;ZLie/a;)V

    .line 481
    .line 482
    .line 483
    invoke-direct {v12, v14, v3}, Lpc/b;-><init>(Lpe/q;Lpc/X;)V

    .line 484
    .line 485
    .line 486
    move-object v5, v12

    .line 487
    goto :goto_6

    .line 488
    :cond_a
    move-object/from16 v17, v9

    .line 489
    .line 490
    :goto_6
    filled-new-array {v6, v7, v5}, [Lpc/b;

    .line 491
    .line 492
    .line 493
    move-result-object v3

    .line 494
    new-instance v5, Lxb/b$i;

    .line 495
    .line 496
    invoke-direct {v5, v1}, Lxb/b$i;-><init>(Lxb/b;)V

    .line 497
    .line 498
    .line 499
    invoke-static {v10, v4}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 500
    .line 501
    .line 502
    move-result v6

    .line 503
    if-eqz v6, :cond_b

    .line 504
    .line 505
    new-instance v6, Ldc/l;

    .line 506
    .line 507
    invoke-direct {v6, v2, v3, v5}, Ldc/l;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    .line 508
    .line 509
    .line 510
    :goto_7
    move-object v7, v6

    .line 511
    move-object/from16 v6, v27

    .line 512
    .line 513
    goto :goto_8

    .line 514
    :cond_b
    invoke-static {v10, v13}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 515
    .line 516
    .line 517
    move-result v6

    .line 518
    if-eqz v6, :cond_c

    .line 519
    .line 520
    new-instance v6, Ldc/h;

    .line 521
    .line 522
    invoke-direct {v6, v2, v3, v5}, Ldc/h;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    .line 523
    .line 524
    .line 525
    goto :goto_7

    .line 526
    :cond_c
    invoke-static {v10, v11}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 527
    .line 528
    .line 529
    move-result v6

    .line 530
    if-eqz v6, :cond_d

    .line 531
    .line 532
    new-instance v6, Ldc/i;

    .line 533
    .line 534
    invoke-direct {v6, v2, v3, v5}, Ldc/i;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    .line 535
    .line 536
    .line 537
    goto :goto_7

    .line 538
    :cond_d
    invoke-static {v10, v8}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 539
    .line 540
    .line 541
    move-result v6

    .line 542
    if-eqz v6, :cond_e

    .line 543
    .line 544
    new-instance v6, Ldc/j;

    .line 545
    .line 546
    invoke-direct {v6, v2, v3, v5}, Ldc/j;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    .line 547
    .line 548
    .line 549
    goto :goto_7

    .line 550
    :cond_e
    move-object/from16 v6, v27

    .line 551
    .line 552
    invoke-static {v10, v6}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 553
    .line 554
    .line 555
    move-result v7

    .line 556
    if-eqz v7, :cond_f

    .line 557
    .line 558
    new-instance v7, Ldc/n;

    .line 559
    .line 560
    invoke-direct {v7, v2, v3, v5}, Ldc/n;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    .line 561
    .line 562
    .line 563
    goto :goto_8

    .line 564
    :cond_f
    new-instance v7, Ldc/s;

    .line 565
    .line 566
    invoke-direct {v7, v2, v3, v5}, Ldc/s;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    .line 567
    .line 568
    .line 569
    :goto_8
    invoke-virtual/range {v23 .. v23}, Lhc/f;->k()Ljava/util/Map;

    .line 570
    .line 571
    .line 572
    move-result-object v3

    .line 573
    invoke-interface {v3, v2, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 574
    .line 575
    .line 576
    const-string v31, "EncryptionKey"

    .line 577
    .line 578
    invoke-static/range {v18 .. v18}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 579
    .line 580
    .line 581
    move-result-object v32

    .line 582
    new-instance v29, LYb/c;

    .line 583
    .line 584
    invoke-virtual/range {v23 .. v23}, Lgc/a;->x()Lgc/c;

    .line 585
    .line 586
    .line 587
    move-result-object v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 588
    const-string v3, "Required value was null."

    .line 589
    .line 590
    if-eqz v2, :cond_58

    .line 591
    .line 592
    :try_start_2
    invoke-virtual {v2}, Lgc/c;->i()LUb/d;

    .line 593
    .line 594
    .line 595
    move-result-object v30

    .line 596
    new-instance v2, Lkotlin/Pair;

    .line 597
    .line 598
    invoke-static/range {v18 .. v18}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 599
    .line 600
    .line 601
    move-result-object v5

    .line 602
    move-object/from16 v7, v28

    .line 603
    .line 604
    invoke-direct {v2, v5, v7}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 605
    .line 606
    .line 607
    invoke-virtual/range {v16 .. v16}, Lpc/d;->a()Ljava/util/Map;

    .line 608
    .line 609
    .line 610
    move-result-object v5

    .line 611
    invoke-interface {v5, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 612
    .line 613
    .line 614
    move-result-object v2

    .line 615
    check-cast v2, Lpc/b;

    .line 616
    .line 617
    const/4 v5, 0x0

    .line 618
    if-nez v2, :cond_10

    .line 619
    .line 620
    sget-object v2, Lxb/b$j;->a:Lxb/b$j;

    .line 621
    .line 622
    new-instance v9, Lpc/b;

    .line 623
    .line 624
    new-instance v12, Lpc/M;

    .line 625
    .line 626
    invoke-static/range {v18 .. v18}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 627
    .line 628
    .line 629
    move-result-object v14

    .line 630
    const/4 v15, 0x0

    .line 631
    invoke-direct {v12, v14, v15, v2}, Lpc/M;-><init>(Lpe/d;ZLie/a;)V

    .line 632
    .line 633
    .line 634
    invoke-direct {v9, v12, v5}, Lpc/b;-><init>(Lpe/q;Lpc/X;)V

    .line 635
    .line 636
    .line 637
    move-object/from16 v33, v9

    .line 638
    .line 639
    goto :goto_9

    .line 640
    :cond_10
    move-object/from16 v33, v2

    .line 641
    .line 642
    :goto_9
    invoke-virtual/range {v23 .. v23}, Lhc/f;->m()Lpc/X;

    .line 643
    .line 644
    .line 645
    move-result-object v34

    .line 646
    invoke-direct/range {v29 .. v34}, LYb/c;-><init>(LUb/d;Ljava/lang/String;Lpe/d;Lpc/b;Lpc/X;)V

    .line 647
    .line 648
    .line 649
    move-object/from16 v2, v29

    .line 650
    .line 651
    new-instance v9, Ldc/r;

    .line 652
    .line 653
    const/4 v15, 0x0

    .line 654
    new-array v12, v15, [Lpc/b;

    .line 655
    .line 656
    sget-object v14, Lpc/V;->a:Lpc/V;

    .line 657
    .line 658
    invoke-virtual {v14}, Lpc/V;->a()Ljava/util/Map;

    .line 659
    .line 660
    .line 661
    move-result-object v15

    .line 662
    invoke-static {v10}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 663
    .line 664
    .line 665
    move-result-object v5

    .line 666
    invoke-interface {v15, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 667
    .line 668
    .line 669
    move-result-object v5

    .line 670
    check-cast v5, Lpc/U;

    .line 671
    .line 672
    if-nez v5, :cond_11

    .line 673
    .line 674
    new-instance v5, Lpc/U;

    .line 675
    .line 676
    invoke-static {v10}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 677
    .line 678
    .line 679
    move-result-object v15

    .line 680
    invoke-direct {v5, v15}, Lpc/U;-><init>(Lpe/d;)V

    .line 681
    .line 682
    .line 683
    invoke-virtual {v14}, Lpc/V;->a()Ljava/util/Map;

    .line 684
    .line 685
    .line 686
    move-result-object v15

    .line 687
    move-object/from16 v28, v14

    .line 688
    .line 689
    invoke-static {v10}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 690
    .line 691
    .line 692
    move-result-object v14

    .line 693
    invoke-interface {v15, v14, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 694
    .line 695
    .line 696
    goto :goto_a

    .line 697
    :cond_11
    move-object/from16 v28, v14

    .line 698
    .line 699
    :goto_a
    new-instance v14, Lxb/b$O;

    .line 700
    .line 701
    invoke-direct {v14}, Lxb/b$O;-><init>()V

    .line 702
    .line 703
    .line 704
    invoke-direct {v9, v0, v12, v5, v14}, Ldc/r;-><init>(Ljava/lang/String;[Lpc/b;Lpc/U;Lkotlin/jvm/functions/Function1;)V

    .line 705
    .line 706
    .line 707
    invoke-virtual {v2, v9}, LYb/c;->B(Ldc/r;)V

    .line 708
    .line 709
    .line 710
    const-string v5, "generate"

    .line 711
    .line 712
    const-class v9, LUb/u;

    .line 713
    .line 714
    move-object/from16 v12, v26

    .line 715
    .line 716
    invoke-static {v12, v9}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 717
    .line 718
    .line 719
    move-result v9

    .line 720
    if-eqz v9, :cond_12

    .line 721
    .line 722
    new-instance v9, Ldc/f;

    .line 723
    .line 724
    const/4 v15, 0x0

    .line 725
    new-array v14, v15, [Lpc/b;

    .line 726
    .line 727
    new-instance v15, Lxb/b$Q;

    .line 728
    .line 729
    invoke-direct {v15}, Lxb/b$Q;-><init>()V

    .line 730
    .line 731
    .line 732
    invoke-direct {v9, v5, v14, v15}, Ldc/f;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function2;)V

    .line 733
    .line 734
    .line 735
    move-object/from16 v29, v2

    .line 736
    .line 737
    move-object/from16 v30, v10

    .line 738
    .line 739
    move-object/from16 v26, v12

    .line 740
    .line 741
    move-object/from16 v2, v17

    .line 742
    .line 743
    move-object/from16 v10, v18

    .line 744
    .line 745
    move-object/from16 v17, v3

    .line 746
    .line 747
    goto/16 :goto_d

    .line 748
    .line 749
    :cond_12
    invoke-virtual {v2}, Lhc/f;->m()Lpc/X;

    .line 750
    .line 751
    .line 752
    move-result-object v9

    .line 753
    new-instance v14, Lkotlin/Pair;

    .line 754
    .line 755
    invoke-static {v12}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 756
    .line 757
    .line 758
    move-result-object v15

    .line 759
    move-object/from16 v29, v2

    .line 760
    .line 761
    move-object/from16 v2, v17

    .line 762
    .line 763
    invoke-direct {v14, v15, v2}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 764
    .line 765
    .line 766
    invoke-virtual/range {v16 .. v16}, Lpc/d;->a()Ljava/util/Map;

    .line 767
    .line 768
    .line 769
    move-result-object v15

    .line 770
    invoke-interface {v15, v14}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 771
    .line 772
    .line 773
    move-result-object v14

    .line 774
    check-cast v14, Lpc/b;

    .line 775
    .line 776
    if-nez v14, :cond_13

    .line 777
    .line 778
    sget-object v14, Lxb/b$R;->a:Lxb/b$R;

    .line 779
    .line 780
    new-instance v15, Lpc/b;

    .line 781
    .line 782
    move-object/from16 v26, v12

    .line 783
    .line 784
    new-instance v12, Lpc/M;

    .line 785
    .line 786
    move-object/from16 v17, v3

    .line 787
    .line 788
    invoke-static/range {v26 .. v26}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 789
    .line 790
    .line 791
    move-result-object v3

    .line 792
    move-object/from16 v30, v10

    .line 793
    .line 794
    const/4 v10, 0x1

    .line 795
    invoke-direct {v12, v3, v10, v14}, Lpc/M;-><init>(Lpe/d;ZLie/a;)V

    .line 796
    .line 797
    .line 798
    invoke-direct {v15, v12, v9}, Lpc/b;-><init>(Lpe/q;Lpc/X;)V

    .line 799
    .line 800
    .line 801
    move-object v14, v15

    .line 802
    goto :goto_b

    .line 803
    :cond_13
    move-object/from16 v17, v3

    .line 804
    .line 805
    move-object/from16 v30, v10

    .line 806
    .line 807
    move-object/from16 v26, v12

    .line 808
    .line 809
    :goto_b
    filled-new-array {v14}, [Lpc/b;

    .line 810
    .line 811
    .line 812
    move-result-object v3

    .line 813
    new-instance v9, Lxb/b$S;

    .line 814
    .line 815
    invoke-direct {v9}, Lxb/b$S;-><init>()V

    .line 816
    .line 817
    .line 818
    move-object/from16 v10, v18

    .line 819
    .line 820
    invoke-static {v10, v4}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 821
    .line 822
    .line 823
    move-result v12

    .line 824
    if-eqz v12, :cond_14

    .line 825
    .line 826
    new-instance v12, Ldc/l;

    .line 827
    .line 828
    invoke-direct {v12, v5, v3, v9}, Ldc/l;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    .line 829
    .line 830
    .line 831
    :goto_c
    move-object v9, v12

    .line 832
    goto :goto_d

    .line 833
    :cond_14
    invoke-static {v10, v13}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 834
    .line 835
    .line 836
    move-result v12

    .line 837
    if-eqz v12, :cond_15

    .line 838
    .line 839
    new-instance v12, Ldc/h;

    .line 840
    .line 841
    invoke-direct {v12, v5, v3, v9}, Ldc/h;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    .line 842
    .line 843
    .line 844
    goto :goto_c

    .line 845
    :cond_15
    invoke-static {v10, v11}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 846
    .line 847
    .line 848
    move-result v12

    .line 849
    if-eqz v12, :cond_16

    .line 850
    .line 851
    new-instance v12, Ldc/i;

    .line 852
    .line 853
    invoke-direct {v12, v5, v3, v9}, Ldc/i;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    .line 854
    .line 855
    .line 856
    goto :goto_c

    .line 857
    :cond_16
    invoke-static {v10, v8}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 858
    .line 859
    .line 860
    move-result v12

    .line 861
    if-eqz v12, :cond_17

    .line 862
    .line 863
    new-instance v12, Ldc/j;

    .line 864
    .line 865
    invoke-direct {v12, v5, v3, v9}, Ldc/j;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    .line 866
    .line 867
    .line 868
    goto :goto_c

    .line 869
    :cond_17
    invoke-static {v10, v6}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 870
    .line 871
    .line 872
    move-result v12

    .line 873
    if-eqz v12, :cond_18

    .line 874
    .line 875
    new-instance v12, Ldc/n;

    .line 876
    .line 877
    invoke-direct {v12, v5, v3, v9}, Ldc/n;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    .line 878
    .line 879
    .line 880
    goto :goto_c

    .line 881
    :cond_18
    new-instance v12, Ldc/s;

    .line 882
    .line 883
    invoke-direct {v12, v5, v3, v9}, Ldc/s;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    .line 884
    .line 885
    .line 886
    goto :goto_c

    .line 887
    :goto_d
    invoke-virtual/range {v29 .. v29}, LYb/c;->z()Ljava/util/Map;

    .line 888
    .line 889
    .line 890
    move-result-object v3

    .line 891
    invoke-interface {v3, v5, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 892
    .line 893
    .line 894
    const-string v3, "import"

    .line 895
    .line 896
    invoke-virtual/range {v29 .. v29}, Lhc/f;->m()Lpc/X;

    .line 897
    .line 898
    .line 899
    move-result-object v5

    .line 900
    new-instance v9, Lkotlin/Pair;

    .line 901
    .line 902
    invoke-static/range {v22 .. v22}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 903
    .line 904
    .line 905
    move-result-object v12

    .line 906
    invoke-direct {v9, v12, v7}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 907
    .line 908
    .line 909
    invoke-virtual/range {v16 .. v16}, Lpc/d;->a()Ljava/util/Map;

    .line 910
    .line 911
    .line 912
    move-result-object v12

    .line 913
    invoke-interface {v12, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 914
    .line 915
    .line 916
    move-result-object v9

    .line 917
    check-cast v9, Lpc/b;

    .line 918
    .line 919
    if-nez v9, :cond_19

    .line 920
    .line 921
    sget-object v9, Lxb/b$T;->a:Lxb/b$T;

    .line 922
    .line 923
    new-instance v12, Lpc/b;

    .line 924
    .line 925
    new-instance v14, Lpc/M;

    .line 926
    .line 927
    invoke-static/range {v22 .. v22}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 928
    .line 929
    .line 930
    move-result-object v15

    .line 931
    const/4 v1, 0x0

    .line 932
    invoke-direct {v14, v15, v1, v9}, Lpc/M;-><init>(Lpe/d;ZLie/a;)V

    .line 933
    .line 934
    .line 935
    invoke-direct {v12, v14, v5}, Lpc/b;-><init>(Lpe/q;Lpc/X;)V

    .line 936
    .line 937
    .line 938
    move-object v9, v12

    .line 939
    :cond_19
    new-instance v1, Lkotlin/Pair;

    .line 940
    .line 941
    invoke-static/range {v19 .. v19}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 942
    .line 943
    .line 944
    move-result-object v12

    .line 945
    invoke-direct {v1, v12, v2}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 946
    .line 947
    .line 948
    invoke-virtual/range {v16 .. v16}, Lpc/d;->a()Ljava/util/Map;

    .line 949
    .line 950
    .line 951
    move-result-object v12

    .line 952
    invoke-interface {v12, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 953
    .line 954
    .line 955
    move-result-object v1

    .line 956
    check-cast v1, Lpc/b;

    .line 957
    .line 958
    if-nez v1, :cond_1a

    .line 959
    .line 960
    sget-object v1, Lxb/b$U;->a:Lxb/b$U;

    .line 961
    .line 962
    new-instance v12, Lpc/b;

    .line 963
    .line 964
    new-instance v14, Lpc/M;

    .line 965
    .line 966
    invoke-static/range {v19 .. v19}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 967
    .line 968
    .line 969
    move-result-object v15

    .line 970
    move-object/from16 v18, v2

    .line 971
    .line 972
    const/4 v2, 0x1

    .line 973
    invoke-direct {v14, v15, v2, v1}, Lpc/M;-><init>(Lpe/d;ZLie/a;)V

    .line 974
    .line 975
    .line 976
    invoke-direct {v12, v14, v5}, Lpc/b;-><init>(Lpe/q;Lpc/X;)V

    .line 977
    .line 978
    .line 979
    move-object v1, v12

    .line 980
    goto :goto_e

    .line 981
    :cond_1a
    move-object/from16 v18, v2

    .line 982
    .line 983
    :goto_e
    filled-new-array {v9, v1}, [Lpc/b;

    .line 984
    .line 985
    .line 986
    move-result-object v1

    .line 987
    new-instance v2, Lxb/b$V;

    .line 988
    .line 989
    invoke-direct {v2}, Lxb/b$V;-><init>()V

    .line 990
    .line 991
    .line 992
    invoke-static {v10, v4}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 993
    .line 994
    .line 995
    move-result v5

    .line 996
    if-eqz v5, :cond_1b

    .line 997
    .line 998
    new-instance v5, Ldc/l;

    .line 999
    .line 1000
    invoke-direct {v5, v3, v1, v2}, Ldc/l;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    .line 1001
    .line 1002
    .line 1003
    goto :goto_f

    .line 1004
    :cond_1b
    invoke-static {v10, v13}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1005
    .line 1006
    .line 1007
    move-result v5

    .line 1008
    if-eqz v5, :cond_1c

    .line 1009
    .line 1010
    new-instance v5, Ldc/h;

    .line 1011
    .line 1012
    invoke-direct {v5, v3, v1, v2}, Ldc/h;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    .line 1013
    .line 1014
    .line 1015
    goto :goto_f

    .line 1016
    :cond_1c
    invoke-static {v10, v11}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1017
    .line 1018
    .line 1019
    move-result v5

    .line 1020
    if-eqz v5, :cond_1d

    .line 1021
    .line 1022
    new-instance v5, Ldc/i;

    .line 1023
    .line 1024
    invoke-direct {v5, v3, v1, v2}, Ldc/i;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    .line 1025
    .line 1026
    .line 1027
    goto :goto_f

    .line 1028
    :cond_1d
    invoke-static {v10, v8}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1029
    .line 1030
    .line 1031
    move-result v5

    .line 1032
    if-eqz v5, :cond_1e

    .line 1033
    .line 1034
    new-instance v5, Ldc/j;

    .line 1035
    .line 1036
    invoke-direct {v5, v3, v1, v2}, Ldc/j;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    .line 1037
    .line 1038
    .line 1039
    goto :goto_f

    .line 1040
    :cond_1e
    invoke-static {v10, v6}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1041
    .line 1042
    .line 1043
    move-result v5

    .line 1044
    if-eqz v5, :cond_1f

    .line 1045
    .line 1046
    new-instance v5, Ldc/n;

    .line 1047
    .line 1048
    invoke-direct {v5, v3, v1, v2}, Ldc/n;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    .line 1049
    .line 1050
    .line 1051
    goto :goto_f

    .line 1052
    :cond_1f
    new-instance v5, Ldc/s;

    .line 1053
    .line 1054
    invoke-direct {v5, v3, v1, v2}, Ldc/s;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    .line 1055
    .line 1056
    .line 1057
    :goto_f
    invoke-virtual/range {v29 .. v29}, LYb/c;->z()Ljava/util/Map;

    .line 1058
    .line 1059
    .line 1060
    move-result-object v1

    .line 1061
    invoke-interface {v1, v3, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1062
    .line 1063
    .line 1064
    const-string v1, "bytes"

    .line 1065
    .line 1066
    const-class v2, LUb/u;

    .line 1067
    .line 1068
    invoke-static {v10, v2}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1069
    .line 1070
    .line 1071
    move-result v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 1072
    const-class v3, [B

    .line 1073
    .line 1074
    if-eqz v2, :cond_20

    .line 1075
    .line 1076
    :try_start_3
    new-instance v2, Ldc/f;

    .line 1077
    .line 1078
    const/4 v15, 0x0

    .line 1079
    new-array v5, v15, [Lpc/b;

    .line 1080
    .line 1081
    new-instance v9, Lxb/b$I;

    .line 1082
    .line 1083
    invoke-direct {v9}, Lxb/b$I;-><init>()V

    .line 1084
    .line 1085
    .line 1086
    invoke-direct {v2, v1, v5, v9}, Ldc/f;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function2;)V

    .line 1087
    .line 1088
    .line 1089
    goto/16 :goto_11

    .line 1090
    .line 1091
    :cond_20
    invoke-virtual/range {v29 .. v29}, Lhc/f;->m()Lpc/X;

    .line 1092
    .line 1093
    .line 1094
    move-result-object v2

    .line 1095
    new-instance v5, Lkotlin/Pair;

    .line 1096
    .line 1097
    invoke-static {v10}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 1098
    .line 1099
    .line 1100
    move-result-object v9

    .line 1101
    invoke-direct {v5, v9, v7}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1102
    .line 1103
    .line 1104
    invoke-virtual/range {v16 .. v16}, Lpc/d;->a()Ljava/util/Map;

    .line 1105
    .line 1106
    .line 1107
    move-result-object v9

    .line 1108
    invoke-interface {v9, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1109
    .line 1110
    .line 1111
    move-result-object v5

    .line 1112
    check-cast v5, Lpc/b;

    .line 1113
    .line 1114
    if-nez v5, :cond_21

    .line 1115
    .line 1116
    sget-object v5, Lxb/b$J;->a:Lxb/b$J;

    .line 1117
    .line 1118
    new-instance v9, Lpc/b;

    .line 1119
    .line 1120
    new-instance v12, Lpc/M;

    .line 1121
    .line 1122
    invoke-static {v10}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 1123
    .line 1124
    .line 1125
    move-result-object v14

    .line 1126
    const/4 v15, 0x0

    .line 1127
    invoke-direct {v12, v14, v15, v5}, Lpc/M;-><init>(Lpe/d;ZLie/a;)V

    .line 1128
    .line 1129
    .line 1130
    invoke-direct {v9, v12, v2}, Lpc/b;-><init>(Lpe/q;Lpc/X;)V

    .line 1131
    .line 1132
    .line 1133
    move-object v5, v9

    .line 1134
    :cond_21
    filled-new-array {v5}, [Lpc/b;

    .line 1135
    .line 1136
    .line 1137
    move-result-object v2

    .line 1138
    new-instance v5, Lxb/b$K;

    .line 1139
    .line 1140
    invoke-direct {v5}, Lxb/b$K;-><init>()V

    .line 1141
    .line 1142
    .line 1143
    invoke-static {v3, v4}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1144
    .line 1145
    .line 1146
    move-result v9

    .line 1147
    if-eqz v9, :cond_22

    .line 1148
    .line 1149
    new-instance v9, Ldc/l;

    .line 1150
    .line 1151
    invoke-direct {v9, v1, v2, v5}, Ldc/l;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    .line 1152
    .line 1153
    .line 1154
    :goto_10
    move-object v2, v9

    .line 1155
    goto :goto_11

    .line 1156
    :cond_22
    invoke-static {v3, v13}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1157
    .line 1158
    .line 1159
    move-result v9

    .line 1160
    if-eqz v9, :cond_23

    .line 1161
    .line 1162
    new-instance v9, Ldc/h;

    .line 1163
    .line 1164
    invoke-direct {v9, v1, v2, v5}, Ldc/h;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    .line 1165
    .line 1166
    .line 1167
    goto :goto_10

    .line 1168
    :cond_23
    invoke-static {v3, v11}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1169
    .line 1170
    .line 1171
    move-result v9

    .line 1172
    if-eqz v9, :cond_24

    .line 1173
    .line 1174
    new-instance v9, Ldc/i;

    .line 1175
    .line 1176
    invoke-direct {v9, v1, v2, v5}, Ldc/i;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    .line 1177
    .line 1178
    .line 1179
    goto :goto_10

    .line 1180
    :cond_24
    invoke-static {v3, v8}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1181
    .line 1182
    .line 1183
    move-result v9

    .line 1184
    if-eqz v9, :cond_25

    .line 1185
    .line 1186
    new-instance v9, Ldc/j;

    .line 1187
    .line 1188
    invoke-direct {v9, v1, v2, v5}, Ldc/j;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    .line 1189
    .line 1190
    .line 1191
    goto :goto_10

    .line 1192
    :cond_25
    invoke-static {v3, v6}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1193
    .line 1194
    .line 1195
    move-result v9

    .line 1196
    if-eqz v9, :cond_26

    .line 1197
    .line 1198
    new-instance v9, Ldc/n;

    .line 1199
    .line 1200
    invoke-direct {v9, v1, v2, v5}, Ldc/n;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    .line 1201
    .line 1202
    .line 1203
    goto :goto_10

    .line 1204
    :cond_26
    new-instance v9, Ldc/s;

    .line 1205
    .line 1206
    invoke-direct {v9, v1, v2, v5}, Ldc/s;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    .line 1207
    .line 1208
    .line 1209
    goto :goto_10

    .line 1210
    :goto_11
    invoke-virtual/range {v29 .. v29}, Lhc/f;->k()Ljava/util/Map;

    .line 1211
    .line 1212
    .line 1213
    move-result-object v5

    .line 1214
    invoke-interface {v5, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1215
    .line 1216
    .line 1217
    const-string v1, "encoded"

    .line 1218
    .line 1219
    invoke-virtual/range {v29 .. v29}, Lhc/f;->m()Lpc/X;

    .line 1220
    .line 1221
    .line 1222
    move-result-object v2

    .line 1223
    new-instance v5, Lkotlin/Pair;

    .line 1224
    .line 1225
    invoke-static {v10}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 1226
    .line 1227
    .line 1228
    move-result-object v9

    .line 1229
    invoke-direct {v5, v9, v7}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1230
    .line 1231
    .line 1232
    invoke-virtual/range {v16 .. v16}, Lpc/d;->a()Ljava/util/Map;

    .line 1233
    .line 1234
    .line 1235
    move-result-object v9

    .line 1236
    invoke-interface {v9, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1237
    .line 1238
    .line 1239
    move-result-object v5

    .line 1240
    check-cast v5, Lpc/b;

    .line 1241
    .line 1242
    if-nez v5, :cond_27

    .line 1243
    .line 1244
    sget-object v5, Lxb/b$L;->a:Lxb/b$L;

    .line 1245
    .line 1246
    new-instance v9, Lpc/b;

    .line 1247
    .line 1248
    new-instance v12, Lpc/M;

    .line 1249
    .line 1250
    invoke-static {v10}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 1251
    .line 1252
    .line 1253
    move-result-object v10

    .line 1254
    const/4 v15, 0x0

    .line 1255
    invoke-direct {v12, v10, v15, v5}, Lpc/M;-><init>(Lpe/d;ZLie/a;)V

    .line 1256
    .line 1257
    .line 1258
    invoke-direct {v9, v12, v2}, Lpc/b;-><init>(Lpe/q;Lpc/X;)V

    .line 1259
    .line 1260
    .line 1261
    move-object v5, v9

    .line 1262
    :cond_27
    new-instance v9, Lkotlin/Pair;

    .line 1263
    .line 1264
    invoke-static/range {v19 .. v19}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 1265
    .line 1266
    .line 1267
    move-result-object v10

    .line 1268
    invoke-direct {v9, v10, v7}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1269
    .line 1270
    .line 1271
    invoke-virtual/range {v16 .. v16}, Lpc/d;->a()Ljava/util/Map;

    .line 1272
    .line 1273
    .line 1274
    move-result-object v10

    .line 1275
    invoke-interface {v10, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1276
    .line 1277
    .line 1278
    move-result-object v9

    .line 1279
    check-cast v9, Lpc/b;

    .line 1280
    .line 1281
    if-nez v9, :cond_28

    .line 1282
    .line 1283
    sget-object v9, Lxb/b$M;->a:Lxb/b$M;

    .line 1284
    .line 1285
    new-instance v10, Lpc/b;

    .line 1286
    .line 1287
    new-instance v12, Lpc/M;

    .line 1288
    .line 1289
    invoke-static/range {v19 .. v19}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 1290
    .line 1291
    .line 1292
    move-result-object v14

    .line 1293
    const/4 v15, 0x0

    .line 1294
    invoke-direct {v12, v14, v15, v9}, Lpc/M;-><init>(Lpe/d;ZLie/a;)V

    .line 1295
    .line 1296
    .line 1297
    invoke-direct {v10, v12, v2}, Lpc/b;-><init>(Lpe/q;Lpc/X;)V

    .line 1298
    .line 1299
    .line 1300
    move-object v9, v10

    .line 1301
    :cond_28
    filled-new-array {v5, v9}, [Lpc/b;

    .line 1302
    .line 1303
    .line 1304
    move-result-object v2

    .line 1305
    new-instance v5, Lxb/b$N;

    .line 1306
    .line 1307
    invoke-direct {v5}, Lxb/b$N;-><init>()V

    .line 1308
    .line 1309
    .line 1310
    invoke-static {v6, v4}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1311
    .line 1312
    .line 1313
    move-result v9

    .line 1314
    if-eqz v9, :cond_29

    .line 1315
    .line 1316
    new-instance v9, Ldc/l;

    .line 1317
    .line 1318
    invoke-direct {v9, v1, v2, v5}, Ldc/l;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    .line 1319
    .line 1320
    .line 1321
    goto :goto_12

    .line 1322
    :cond_29
    invoke-static {v6, v13}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1323
    .line 1324
    .line 1325
    move-result v9

    .line 1326
    if-eqz v9, :cond_2a

    .line 1327
    .line 1328
    new-instance v9, Ldc/h;

    .line 1329
    .line 1330
    invoke-direct {v9, v1, v2, v5}, Ldc/h;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    .line 1331
    .line 1332
    .line 1333
    goto :goto_12

    .line 1334
    :cond_2a
    invoke-static {v6, v11}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1335
    .line 1336
    .line 1337
    move-result v9

    .line 1338
    if-eqz v9, :cond_2b

    .line 1339
    .line 1340
    new-instance v9, Ldc/i;

    .line 1341
    .line 1342
    invoke-direct {v9, v1, v2, v5}, Ldc/i;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    .line 1343
    .line 1344
    .line 1345
    goto :goto_12

    .line 1346
    :cond_2b
    invoke-static {v6, v8}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1347
    .line 1348
    .line 1349
    move-result v9

    .line 1350
    if-eqz v9, :cond_2c

    .line 1351
    .line 1352
    new-instance v9, Ldc/j;

    .line 1353
    .line 1354
    invoke-direct {v9, v1, v2, v5}, Ldc/j;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    .line 1355
    .line 1356
    .line 1357
    goto :goto_12

    .line 1358
    :cond_2c
    invoke-static {v6, v6}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1359
    .line 1360
    .line 1361
    move-result v9

    .line 1362
    if-eqz v9, :cond_2d

    .line 1363
    .line 1364
    new-instance v9, Ldc/n;

    .line 1365
    .line 1366
    invoke-direct {v9, v1, v2, v5}, Ldc/n;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    .line 1367
    .line 1368
    .line 1369
    goto :goto_12

    .line 1370
    :cond_2d
    new-instance v9, Ldc/s;

    .line 1371
    .line 1372
    invoke-direct {v9, v1, v2, v5}, Ldc/s;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    .line 1373
    .line 1374
    .line 1375
    :goto_12
    invoke-virtual/range {v29 .. v29}, Lhc/f;->k()Ljava/util/Map;

    .line 1376
    .line 1377
    .line 1378
    move-result-object v2

    .line 1379
    invoke-interface {v2, v1, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1380
    .line 1381
    .line 1382
    const-string v1, "size"

    .line 1383
    .line 1384
    new-instance v2, Lhc/m;

    .line 1385
    .line 1386
    invoke-virtual/range {v29 .. v29}, LYb/c;->y()Lpc/b;

    .line 1387
    .line 1388
    .line 1389
    move-result-object v5

    .line 1390
    invoke-virtual {v5}, Lpc/b;->g()Lpe/q;

    .line 1391
    .line 1392
    .line 1393
    move-result-object v5

    .line 1394
    invoke-direct {v2, v5, v1}, Lhc/m;-><init>(Lpe/q;Ljava/lang/String;)V

    .line 1395
    .line 1396
    .line 1397
    new-instance v5, Ldc/r;

    .line 1398
    .line 1399
    new-instance v9, Lpc/b;

    .line 1400
    .line 1401
    invoke-virtual {v2}, Lhc/m;->d()Lpe/q;

    .line 1402
    .line 1403
    .line 1404
    move-result-object v10

    .line 1405
    const/4 v12, 0x2

    .line 1406
    const/4 v14, 0x0

    .line 1407
    invoke-direct {v9, v10, v14, v12, v14}, Lpc/b;-><init>(Lpe/q;Lpc/X;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 1408
    .line 1409
    .line 1410
    filled-new-array {v9}, [Lpc/b;

    .line 1411
    .line 1412
    .line 1413
    move-result-object v9

    .line 1414
    invoke-virtual/range {v28 .. v28}, Lpc/V;->a()Ljava/util/Map;

    .line 1415
    .line 1416
    .line 1417
    move-result-object v10

    .line 1418
    invoke-static/range {v26 .. v26}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 1419
    .line 1420
    .line 1421
    move-result-object v14

    .line 1422
    invoke-interface {v10, v14}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1423
    .line 1424
    .line 1425
    move-result-object v10

    .line 1426
    check-cast v10, Lpc/U;

    .line 1427
    .line 1428
    if-nez v10, :cond_2e

    .line 1429
    .line 1430
    new-instance v10, Lpc/U;

    .line 1431
    .line 1432
    invoke-static/range {v26 .. v26}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 1433
    .line 1434
    .line 1435
    move-result-object v14

    .line 1436
    invoke-direct {v10, v14}, Lpc/U;-><init>(Lpe/d;)V

    .line 1437
    .line 1438
    .line 1439
    invoke-virtual/range {v28 .. v28}, Lpc/V;->a()Ljava/util/Map;

    .line 1440
    .line 1441
    .line 1442
    move-result-object v14

    .line 1443
    invoke-static/range {v26 .. v26}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 1444
    .line 1445
    .line 1446
    move-result-object v15

    .line 1447
    invoke-interface {v14, v15, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1448
    .line 1449
    .line 1450
    :cond_2e
    new-instance v14, Lxb/b$P;

    .line 1451
    .line 1452
    invoke-direct {v14}, Lxb/b$P;-><init>()V

    .line 1453
    .line 1454
    .line 1455
    move-object/from16 v15, v24

    .line 1456
    .line 1457
    invoke-direct {v5, v15, v9, v10, v14}, Ldc/r;-><init>(Ljava/lang/String;[Lpc/b;Lpc/U;Lkotlin/jvm/functions/Function1;)V

    .line 1458
    .line 1459
    .line 1460
    invoke-virtual {v2}, Lhc/m;->d()Lpe/q;

    .line 1461
    .line 1462
    .line 1463
    move-result-object v9

    .line 1464
    invoke-virtual {v5, v9}, Ldc/a;->l(Lpe/q;)V

    .line 1465
    .line 1466
    .line 1467
    const/4 v9, 0x1

    .line 1468
    invoke-virtual {v5, v9}, Ldc/a;->k(Z)V

    .line 1469
    .line 1470
    .line 1471
    invoke-virtual {v2, v5}, Lhc/l;->b(Ldc/r;)V

    .line 1472
    .line 1473
    .line 1474
    invoke-virtual/range {v29 .. v29}, Lhc/f;->o()Ljava/util/Map;

    .line 1475
    .line 1476
    .line 1477
    move-result-object v5

    .line 1478
    invoke-interface {v5, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1479
    .line 1480
    .line 1481
    invoke-virtual/range {v23 .. v23}, Lgc/a;->v()Ljava/util/List;

    .line 1482
    .line 1483
    .line 1484
    move-result-object v1

    .line 1485
    invoke-virtual/range {v29 .. v29}, LYb/c;->v()LYb/d;

    .line 1486
    .line 1487
    .line 1488
    move-result-object v2

    .line 1489
    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1490
    .line 1491
    .line 1492
    const-string v33, "SealedData"

    .line 1493
    .line 1494
    invoke-static/range {v25 .. v25}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 1495
    .line 1496
    .line 1497
    move-result-object v34

    .line 1498
    new-instance v31, LYb/c;

    .line 1499
    .line 1500
    invoke-virtual/range {v23 .. v23}, Lgc/a;->x()Lgc/c;

    .line 1501
    .line 1502
    .line 1503
    move-result-object v1

    .line 1504
    if-eqz v1, :cond_57

    .line 1505
    .line 1506
    invoke-virtual {v1}, Lgc/c;->i()LUb/d;

    .line 1507
    .line 1508
    .line 1509
    move-result-object v32

    .line 1510
    new-instance v1, Lkotlin/Pair;

    .line 1511
    .line 1512
    invoke-static/range {v25 .. v25}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 1513
    .line 1514
    .line 1515
    move-result-object v2

    .line 1516
    invoke-direct {v1, v2, v7}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1517
    .line 1518
    .line 1519
    invoke-virtual/range {v16 .. v16}, Lpc/d;->a()Ljava/util/Map;

    .line 1520
    .line 1521
    .line 1522
    move-result-object v2

    .line 1523
    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1524
    .line 1525
    .line 1526
    move-result-object v1

    .line 1527
    check-cast v1, Lpc/b;

    .line 1528
    .line 1529
    if-nez v1, :cond_2f

    .line 1530
    .line 1531
    sget-object v1, Lxb/b$k;->a:Lxb/b$k;

    .line 1532
    .line 1533
    new-instance v2, Lpc/b;

    .line 1534
    .line 1535
    new-instance v5, Lpc/M;

    .line 1536
    .line 1537
    invoke-static/range {v25 .. v25}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 1538
    .line 1539
    .line 1540
    move-result-object v9

    .line 1541
    const/4 v10, 0x0

    .line 1542
    invoke-direct {v5, v9, v10, v1}, Lpc/M;-><init>(Lpe/d;ZLie/a;)V

    .line 1543
    .line 1544
    .line 1545
    const/4 v14, 0x0

    .line 1546
    invoke-direct {v2, v5, v14}, Lpc/b;-><init>(Lpe/q;Lpc/X;)V

    .line 1547
    .line 1548
    .line 1549
    move-object/from16 v35, v2

    .line 1550
    .line 1551
    goto :goto_13

    .line 1552
    :cond_2f
    move-object/from16 v35, v1

    .line 1553
    .line 1554
    :goto_13
    invoke-virtual/range {v23 .. v23}, Lhc/f;->m()Lpc/X;

    .line 1555
    .line 1556
    .line 1557
    move-result-object v36

    .line 1558
    invoke-direct/range {v31 .. v36}, LYb/c;-><init>(LUb/d;Ljava/lang/String;Lpe/d;Lpc/b;Lpc/X;)V

    .line 1559
    .line 1560
    .line 1561
    move-object/from16 v1, v31

    .line 1562
    .line 1563
    new-instance v2, Ldc/r;

    .line 1564
    .line 1565
    const/4 v5, 0x0

    .line 1566
    new-array v9, v5, [Lpc/b;

    .line 1567
    .line 1568
    invoke-virtual/range {v28 .. v28}, Lpc/V;->a()Ljava/util/Map;

    .line 1569
    .line 1570
    .line 1571
    move-result-object v5

    .line 1572
    invoke-static/range {v30 .. v30}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 1573
    .line 1574
    .line 1575
    move-result-object v10

    .line 1576
    invoke-interface {v5, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1577
    .line 1578
    .line 1579
    move-result-object v5

    .line 1580
    check-cast v5, Lpc/U;

    .line 1581
    .line 1582
    if-nez v5, :cond_30

    .line 1583
    .line 1584
    new-instance v5, Lpc/U;

    .line 1585
    .line 1586
    invoke-static/range {v30 .. v30}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 1587
    .line 1588
    .line 1589
    move-result-object v10

    .line 1590
    invoke-direct {v5, v10}, Lpc/U;-><init>(Lpe/d;)V

    .line 1591
    .line 1592
    .line 1593
    invoke-virtual/range {v28 .. v28}, Lpc/V;->a()Ljava/util/Map;

    .line 1594
    .line 1595
    .line 1596
    move-result-object v10

    .line 1597
    invoke-static/range {v30 .. v30}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 1598
    .line 1599
    .line 1600
    move-result-object v14

    .line 1601
    invoke-interface {v10, v14, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1602
    .line 1603
    .line 1604
    :cond_30
    new-instance v10, Lxb/b$x;

    .line 1605
    .line 1606
    invoke-direct {v10}, Lxb/b$x;-><init>()V

    .line 1607
    .line 1608
    .line 1609
    invoke-direct {v2, v0, v9, v5, v10}, Ldc/r;-><init>(Ljava/lang/String;[Lpc/b;Lpc/U;Lkotlin/jvm/functions/Function1;)V

    .line 1610
    .line 1611
    .line 1612
    invoke-virtual {v1, v2}, LYb/c;->B(Ldc/r;)V

    .line 1613
    .line 1614
    .line 1615
    const-string v0, "fromParts"

    .line 1616
    .line 1617
    new-instance v2, Ldc/r;

    .line 1618
    .line 1619
    invoke-virtual {v1}, Lhc/f;->m()Lpc/X;

    .line 1620
    .line 1621
    .line 1622
    move-result-object v5

    .line 1623
    new-instance v9, Lkotlin/Pair;

    .line 1624
    .line 1625
    invoke-static/range {v22 .. v22}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 1626
    .line 1627
    .line 1628
    move-result-object v10

    .line 1629
    invoke-direct {v9, v10, v7}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1630
    .line 1631
    .line 1632
    invoke-virtual/range {v16 .. v16}, Lpc/d;->a()Ljava/util/Map;

    .line 1633
    .line 1634
    .line 1635
    move-result-object v10

    .line 1636
    invoke-interface {v10, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1637
    .line 1638
    .line 1639
    move-result-object v9

    .line 1640
    check-cast v9, Lpc/b;

    .line 1641
    .line 1642
    if-nez v9, :cond_31

    .line 1643
    .line 1644
    sget-object v9, Lxb/b$B;->a:Lxb/b$B;

    .line 1645
    .line 1646
    new-instance v10, Lpc/b;

    .line 1647
    .line 1648
    new-instance v14, Lpc/M;

    .line 1649
    .line 1650
    invoke-static/range {v22 .. v22}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 1651
    .line 1652
    .line 1653
    move-result-object v12

    .line 1654
    move-object/from16 v31, v1

    .line 1655
    .line 1656
    const/4 v1, 0x0

    .line 1657
    invoke-direct {v14, v12, v1, v9}, Lpc/M;-><init>(Lpe/d;ZLie/a;)V

    .line 1658
    .line 1659
    .line 1660
    invoke-direct {v10, v14, v5}, Lpc/b;-><init>(Lpe/q;Lpc/X;)V

    .line 1661
    .line 1662
    .line 1663
    move-object v9, v10

    .line 1664
    goto :goto_14

    .line 1665
    :cond_31
    move-object/from16 v31, v1

    .line 1666
    .line 1667
    :goto_14
    new-instance v1, Lkotlin/Pair;

    .line 1668
    .line 1669
    invoke-static/range {v22 .. v22}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 1670
    .line 1671
    .line 1672
    move-result-object v10

    .line 1673
    invoke-direct {v1, v10, v7}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1674
    .line 1675
    .line 1676
    invoke-virtual/range {v16 .. v16}, Lpc/d;->a()Ljava/util/Map;

    .line 1677
    .line 1678
    .line 1679
    move-result-object v10

    .line 1680
    invoke-interface {v10, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1681
    .line 1682
    .line 1683
    move-result-object v1

    .line 1684
    check-cast v1, Lpc/b;

    .line 1685
    .line 1686
    if-nez v1, :cond_32

    .line 1687
    .line 1688
    sget-object v1, Lxb/b$C;->a:Lxb/b$C;

    .line 1689
    .line 1690
    new-instance v10, Lpc/b;

    .line 1691
    .line 1692
    new-instance v12, Lpc/M;

    .line 1693
    .line 1694
    invoke-static/range {v22 .. v22}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 1695
    .line 1696
    .line 1697
    move-result-object v14

    .line 1698
    move-object/from16 v24, v3

    .line 1699
    .line 1700
    const/4 v3, 0x0

    .line 1701
    invoke-direct {v12, v14, v3, v1}, Lpc/M;-><init>(Lpe/d;ZLie/a;)V

    .line 1702
    .line 1703
    .line 1704
    invoke-direct {v10, v12, v5}, Lpc/b;-><init>(Lpe/q;Lpc/X;)V

    .line 1705
    .line 1706
    .line 1707
    move-object v1, v10

    .line 1708
    goto :goto_15

    .line 1709
    :cond_32
    move-object/from16 v24, v3

    .line 1710
    .line 1711
    :goto_15
    new-instance v3, Lkotlin/Pair;

    .line 1712
    .line 1713
    invoke-static/range {v22 .. v22}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 1714
    .line 1715
    .line 1716
    move-result-object v10

    .line 1717
    move-object/from16 v12, v18

    .line 1718
    .line 1719
    invoke-direct {v3, v10, v12}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1720
    .line 1721
    .line 1722
    invoke-virtual/range {v16 .. v16}, Lpc/d;->a()Ljava/util/Map;

    .line 1723
    .line 1724
    .line 1725
    move-result-object v10

    .line 1726
    invoke-interface {v10, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1727
    .line 1728
    .line 1729
    move-result-object v3

    .line 1730
    check-cast v3, Lpc/b;

    .line 1731
    .line 1732
    if-nez v3, :cond_33

    .line 1733
    .line 1734
    sget-object v3, Lxb/b$D;->a:Lxb/b$D;

    .line 1735
    .line 1736
    new-instance v10, Lpc/b;

    .line 1737
    .line 1738
    new-instance v14, Lpc/M;

    .line 1739
    .line 1740
    move-object/from16 v18, v15

    .line 1741
    .line 1742
    invoke-static/range {v22 .. v22}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 1743
    .line 1744
    .line 1745
    move-result-object v15

    .line 1746
    move-object/from16 v22, v6

    .line 1747
    .line 1748
    const/4 v6, 0x1

    .line 1749
    invoke-direct {v14, v15, v6, v3}, Lpc/M;-><init>(Lpe/d;ZLie/a;)V

    .line 1750
    .line 1751
    .line 1752
    invoke-direct {v10, v14, v5}, Lpc/b;-><init>(Lpe/q;Lpc/X;)V

    .line 1753
    .line 1754
    .line 1755
    move-object v3, v10

    .line 1756
    goto :goto_16

    .line 1757
    :cond_33
    move-object/from16 v22, v6

    .line 1758
    .line 1759
    move-object/from16 v18, v15

    .line 1760
    .line 1761
    :goto_16
    filled-new-array {v9, v1, v3}, [Lpc/b;

    .line 1762
    .line 1763
    .line 1764
    move-result-object v1

    .line 1765
    invoke-virtual/range {v28 .. v28}, Lpc/V;->a()Ljava/util/Map;

    .line 1766
    .line 1767
    .line 1768
    move-result-object v3

    .line 1769
    invoke-static/range {v25 .. v25}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 1770
    .line 1771
    .line 1772
    move-result-object v5

    .line 1773
    invoke-interface {v3, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1774
    .line 1775
    .line 1776
    move-result-object v3

    .line 1777
    check-cast v3, Lpc/U;

    .line 1778
    .line 1779
    if-nez v3, :cond_34

    .line 1780
    .line 1781
    new-instance v3, Lpc/U;

    .line 1782
    .line 1783
    invoke-static/range {v25 .. v25}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 1784
    .line 1785
    .line 1786
    move-result-object v5

    .line 1787
    invoke-direct {v3, v5}, Lpc/U;-><init>(Lpe/d;)V

    .line 1788
    .line 1789
    .line 1790
    invoke-virtual/range {v28 .. v28}, Lpc/V;->a()Ljava/util/Map;

    .line 1791
    .line 1792
    .line 1793
    move-result-object v5

    .line 1794
    invoke-static/range {v25 .. v25}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 1795
    .line 1796
    .line 1797
    move-result-object v6

    .line 1798
    invoke-interface {v5, v6, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1799
    .line 1800
    .line 1801
    :cond_34
    new-instance v5, Lxb/b$E;

    .line 1802
    .line 1803
    move-object/from16 v6, p0

    .line 1804
    .line 1805
    invoke-direct {v5, v6}, Lxb/b$E;-><init>(Lxb/b;)V

    .line 1806
    .line 1807
    .line 1808
    invoke-direct {v2, v0, v1, v3, v5}, Ldc/r;-><init>(Ljava/lang/String;[Lpc/b;Lpc/U;Lkotlin/jvm/functions/Function1;)V

    .line 1809
    .line 1810
    .line 1811
    invoke-virtual/range {v31 .. v31}, LYb/c;->A()Ljava/util/Map;

    .line 1812
    .line 1813
    .line 1814
    move-result-object v1

    .line 1815
    invoke-interface {v1, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1816
    .line 1817
    .line 1818
    const-string v0, "fromCombined"

    .line 1819
    .line 1820
    new-instance v1, Ldc/r;

    .line 1821
    .line 1822
    invoke-virtual/range {v31 .. v31}, Lhc/f;->m()Lpc/X;

    .line 1823
    .line 1824
    .line 1825
    move-result-object v2

    .line 1826
    new-instance v3, Lkotlin/Pair;

    .line 1827
    .line 1828
    invoke-static/range {v24 .. v24}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 1829
    .line 1830
    .line 1831
    move-result-object v5

    .line 1832
    invoke-direct {v3, v5, v7}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1833
    .line 1834
    .line 1835
    invoke-virtual/range {v16 .. v16}, Lpc/d;->a()Ljava/util/Map;

    .line 1836
    .line 1837
    .line 1838
    move-result-object v5

    .line 1839
    invoke-interface {v5, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1840
    .line 1841
    .line 1842
    move-result-object v3

    .line 1843
    check-cast v3, Lpc/b;

    .line 1844
    .line 1845
    if-nez v3, :cond_35

    .line 1846
    .line 1847
    sget-object v3, Lxb/b$F;->a:Lxb/b$F;

    .line 1848
    .line 1849
    new-instance v5, Lpc/b;

    .line 1850
    .line 1851
    new-instance v9, Lpc/M;

    .line 1852
    .line 1853
    invoke-static/range {v24 .. v24}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 1854
    .line 1855
    .line 1856
    move-result-object v10

    .line 1857
    const/4 v15, 0x0

    .line 1858
    invoke-direct {v9, v10, v15, v3}, Lpc/M;-><init>(Lpe/d;ZLie/a;)V

    .line 1859
    .line 1860
    .line 1861
    invoke-direct {v5, v9, v2}, Lpc/b;-><init>(Lpe/q;Lpc/X;)V

    .line 1862
    .line 1863
    .line 1864
    move-object v3, v5

    .line 1865
    :cond_35
    new-instance v5, Lkotlin/Pair;

    .line 1866
    .line 1867
    const-class v9, Lexpo/modules/crypto/aes/records/SealedDataConfig;

    .line 1868
    .line 1869
    invoke-static {v9}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 1870
    .line 1871
    .line 1872
    move-result-object v9

    .line 1873
    invoke-direct {v5, v9, v12}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1874
    .line 1875
    .line 1876
    invoke-virtual/range {v16 .. v16}, Lpc/d;->a()Ljava/util/Map;

    .line 1877
    .line 1878
    .line 1879
    move-result-object v9

    .line 1880
    invoke-interface {v9, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1881
    .line 1882
    .line 1883
    move-result-object v5

    .line 1884
    check-cast v5, Lpc/b;

    .line 1885
    .line 1886
    if-nez v5, :cond_36

    .line 1887
    .line 1888
    sget-object v5, Lxb/b$G;->a:Lxb/b$G;

    .line 1889
    .line 1890
    new-instance v9, Lpc/b;

    .line 1891
    .line 1892
    new-instance v10, Lpc/M;

    .line 1893
    .line 1894
    const-class v14, Lexpo/modules/crypto/aes/records/SealedDataConfig;

    .line 1895
    .line 1896
    invoke-static {v14}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 1897
    .line 1898
    .line 1899
    move-result-object v14

    .line 1900
    const/4 v15, 0x1

    .line 1901
    invoke-direct {v10, v14, v15, v5}, Lpc/M;-><init>(Lpe/d;ZLie/a;)V

    .line 1902
    .line 1903
    .line 1904
    invoke-direct {v9, v10, v2}, Lpc/b;-><init>(Lpe/q;Lpc/X;)V

    .line 1905
    .line 1906
    .line 1907
    move-object v5, v9

    .line 1908
    :cond_36
    filled-new-array {v3, v5}, [Lpc/b;

    .line 1909
    .line 1910
    .line 1911
    move-result-object v2

    .line 1912
    invoke-virtual/range {v28 .. v28}, Lpc/V;->a()Ljava/util/Map;

    .line 1913
    .line 1914
    .line 1915
    move-result-object v3

    .line 1916
    invoke-static/range {v25 .. v25}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 1917
    .line 1918
    .line 1919
    move-result-object v5

    .line 1920
    invoke-interface {v3, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1921
    .line 1922
    .line 1923
    move-result-object v3

    .line 1924
    check-cast v3, Lpc/U;

    .line 1925
    .line 1926
    if-nez v3, :cond_37

    .line 1927
    .line 1928
    new-instance v3, Lpc/U;

    .line 1929
    .line 1930
    invoke-static/range {v25 .. v25}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 1931
    .line 1932
    .line 1933
    move-result-object v5

    .line 1934
    invoke-direct {v3, v5}, Lpc/U;-><init>(Lpe/d;)V

    .line 1935
    .line 1936
    .line 1937
    invoke-virtual/range {v28 .. v28}, Lpc/V;->a()Ljava/util/Map;

    .line 1938
    .line 1939
    .line 1940
    move-result-object v5

    .line 1941
    invoke-static/range {v25 .. v25}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 1942
    .line 1943
    .line 1944
    move-result-object v9

    .line 1945
    invoke-interface {v5, v9, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1946
    .line 1947
    .line 1948
    :cond_37
    new-instance v5, Lxb/b$H;

    .line 1949
    .line 1950
    invoke-direct {v5}, Lxb/b$H;-><init>()V

    .line 1951
    .line 1952
    .line 1953
    invoke-direct {v1, v0, v2, v3, v5}, Ldc/r;-><init>(Ljava/lang/String;[Lpc/b;Lpc/U;Lkotlin/jvm/functions/Function1;)V

    .line 1954
    .line 1955
    .line 1956
    invoke-virtual/range {v31 .. v31}, LYb/c;->A()Ljava/util/Map;

    .line 1957
    .line 1958
    .line 1959
    move-result-object v2

    .line 1960
    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1961
    .line 1962
    .line 1963
    const-string v0, "iv"

    .line 1964
    .line 1965
    invoke-virtual/range {v31 .. v31}, Lhc/f;->m()Lpc/X;

    .line 1966
    .line 1967
    .line 1968
    move-result-object v1

    .line 1969
    new-instance v2, Lkotlin/Pair;

    .line 1970
    .line 1971
    invoke-static/range {v25 .. v25}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 1972
    .line 1973
    .line 1974
    move-result-object v3

    .line 1975
    invoke-direct {v2, v3, v7}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1976
    .line 1977
    .line 1978
    invoke-virtual/range {v16 .. v16}, Lpc/d;->a()Ljava/util/Map;

    .line 1979
    .line 1980
    .line 1981
    move-result-object v3

    .line 1982
    invoke-interface {v3, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1983
    .line 1984
    .line 1985
    move-result-object v2

    .line 1986
    check-cast v2, Lpc/b;

    .line 1987
    .line 1988
    if-nez v2, :cond_38

    .line 1989
    .line 1990
    sget-object v2, Lxb/b$o;->a:Lxb/b$o;

    .line 1991
    .line 1992
    new-instance v3, Lpc/b;

    .line 1993
    .line 1994
    new-instance v5, Lpc/M;

    .line 1995
    .line 1996
    invoke-static/range {v25 .. v25}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 1997
    .line 1998
    .line 1999
    move-result-object v9

    .line 2000
    const/4 v15, 0x0

    .line 2001
    invoke-direct {v5, v9, v15, v2}, Lpc/M;-><init>(Lpe/d;ZLie/a;)V

    .line 2002
    .line 2003
    .line 2004
    invoke-direct {v3, v5, v1}, Lpc/b;-><init>(Lpe/q;Lpc/X;)V

    .line 2005
    .line 2006
    .line 2007
    move-object v2, v3

    .line 2008
    :cond_38
    new-instance v3, Lkotlin/Pair;

    .line 2009
    .line 2010
    invoke-static/range {v20 .. v20}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 2011
    .line 2012
    .line 2013
    move-result-object v5

    .line 2014
    invoke-direct {v3, v5, v12}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 2015
    .line 2016
    .line 2017
    invoke-virtual/range {v16 .. v16}, Lpc/d;->a()Ljava/util/Map;

    .line 2018
    .line 2019
    .line 2020
    move-result-object v5

    .line 2021
    invoke-interface {v5, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2022
    .line 2023
    .line 2024
    move-result-object v3

    .line 2025
    check-cast v3, Lpc/b;

    .line 2026
    .line 2027
    if-nez v3, :cond_39

    .line 2028
    .line 2029
    sget-object v3, Lxb/b$p;->a:Lxb/b$p;

    .line 2030
    .line 2031
    new-instance v5, Lpc/b;

    .line 2032
    .line 2033
    new-instance v9, Lpc/M;

    .line 2034
    .line 2035
    invoke-static/range {v20 .. v20}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 2036
    .line 2037
    .line 2038
    move-result-object v10

    .line 2039
    const/4 v15, 0x1

    .line 2040
    invoke-direct {v9, v10, v15, v3}, Lpc/M;-><init>(Lpe/d;ZLie/a;)V

    .line 2041
    .line 2042
    .line 2043
    invoke-direct {v5, v9, v1}, Lpc/b;-><init>(Lpe/q;Lpc/X;)V

    .line 2044
    .line 2045
    .line 2046
    move-object v3, v5

    .line 2047
    :cond_39
    filled-new-array {v2, v3}, [Lpc/b;

    .line 2048
    .line 2049
    .line 2050
    move-result-object v1

    .line 2051
    new-instance v2, Lxb/b$q;

    .line 2052
    .line 2053
    invoke-direct {v2}, Lxb/b$q;-><init>()V

    .line 2054
    .line 2055
    .line 2056
    move-object/from16 v3, v30

    .line 2057
    .line 2058
    invoke-static {v3, v4}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2059
    .line 2060
    .line 2061
    move-result v5

    .line 2062
    if-eqz v5, :cond_3a

    .line 2063
    .line 2064
    new-instance v5, Ldc/l;

    .line 2065
    .line 2066
    invoke-direct {v5, v0, v1, v2}, Ldc/l;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    .line 2067
    .line 2068
    .line 2069
    :goto_17
    move-object v9, v5

    .line 2070
    move-object/from16 v5, v22

    .line 2071
    .line 2072
    goto :goto_18

    .line 2073
    :cond_3a
    invoke-static {v3, v13}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2074
    .line 2075
    .line 2076
    move-result v5

    .line 2077
    if-eqz v5, :cond_3b

    .line 2078
    .line 2079
    new-instance v5, Ldc/h;

    .line 2080
    .line 2081
    invoke-direct {v5, v0, v1, v2}, Ldc/h;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    .line 2082
    .line 2083
    .line 2084
    goto :goto_17

    .line 2085
    :cond_3b
    invoke-static {v3, v11}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2086
    .line 2087
    .line 2088
    move-result v5

    .line 2089
    if-eqz v5, :cond_3c

    .line 2090
    .line 2091
    new-instance v5, Ldc/i;

    .line 2092
    .line 2093
    invoke-direct {v5, v0, v1, v2}, Ldc/i;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    .line 2094
    .line 2095
    .line 2096
    goto :goto_17

    .line 2097
    :cond_3c
    invoke-static {v3, v8}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2098
    .line 2099
    .line 2100
    move-result v5

    .line 2101
    if-eqz v5, :cond_3d

    .line 2102
    .line 2103
    new-instance v5, Ldc/j;

    .line 2104
    .line 2105
    invoke-direct {v5, v0, v1, v2}, Ldc/j;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    .line 2106
    .line 2107
    .line 2108
    goto :goto_17

    .line 2109
    :cond_3d
    move-object/from16 v5, v22

    .line 2110
    .line 2111
    invoke-static {v3, v5}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2112
    .line 2113
    .line 2114
    move-result v9

    .line 2115
    if-eqz v9, :cond_3e

    .line 2116
    .line 2117
    new-instance v9, Ldc/n;

    .line 2118
    .line 2119
    invoke-direct {v9, v0, v1, v2}, Ldc/n;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    .line 2120
    .line 2121
    .line 2122
    goto :goto_18

    .line 2123
    :cond_3e
    new-instance v9, Ldc/s;

    .line 2124
    .line 2125
    invoke-direct {v9, v0, v1, v2}, Ldc/s;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    .line 2126
    .line 2127
    .line 2128
    :goto_18
    invoke-virtual/range {v31 .. v31}, Lhc/f;->k()Ljava/util/Map;

    .line 2129
    .line 2130
    .line 2131
    move-result-object v1

    .line 2132
    invoke-interface {v1, v0, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2133
    .line 2134
    .line 2135
    const-string v0, "tag"

    .line 2136
    .line 2137
    invoke-virtual/range {v31 .. v31}, Lhc/f;->m()Lpc/X;

    .line 2138
    .line 2139
    .line 2140
    move-result-object v1

    .line 2141
    new-instance v2, Lkotlin/Pair;

    .line 2142
    .line 2143
    invoke-static/range {v25 .. v25}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 2144
    .line 2145
    .line 2146
    move-result-object v9

    .line 2147
    invoke-direct {v2, v9, v7}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 2148
    .line 2149
    .line 2150
    invoke-virtual/range {v16 .. v16}, Lpc/d;->a()Ljava/util/Map;

    .line 2151
    .line 2152
    .line 2153
    move-result-object v9

    .line 2154
    invoke-interface {v9, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2155
    .line 2156
    .line 2157
    move-result-object v2

    .line 2158
    check-cast v2, Lpc/b;

    .line 2159
    .line 2160
    if-nez v2, :cond_3f

    .line 2161
    .line 2162
    sget-object v2, Lxb/b$r;->a:Lxb/b$r;

    .line 2163
    .line 2164
    new-instance v9, Lpc/b;

    .line 2165
    .line 2166
    new-instance v10, Lpc/M;

    .line 2167
    .line 2168
    invoke-static/range {v25 .. v25}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 2169
    .line 2170
    .line 2171
    move-result-object v14

    .line 2172
    const/4 v15, 0x0

    .line 2173
    invoke-direct {v10, v14, v15, v2}, Lpc/M;-><init>(Lpe/d;ZLie/a;)V

    .line 2174
    .line 2175
    .line 2176
    invoke-direct {v9, v10, v1}, Lpc/b;-><init>(Lpe/q;Lpc/X;)V

    .line 2177
    .line 2178
    .line 2179
    move-object v2, v9

    .line 2180
    :cond_3f
    new-instance v9, Lkotlin/Pair;

    .line 2181
    .line 2182
    invoke-static/range {v20 .. v20}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 2183
    .line 2184
    .line 2185
    move-result-object v10

    .line 2186
    invoke-direct {v9, v10, v12}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 2187
    .line 2188
    .line 2189
    invoke-virtual/range {v16 .. v16}, Lpc/d;->a()Ljava/util/Map;

    .line 2190
    .line 2191
    .line 2192
    move-result-object v10

    .line 2193
    invoke-interface {v10, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2194
    .line 2195
    .line 2196
    move-result-object v9

    .line 2197
    check-cast v9, Lpc/b;

    .line 2198
    .line 2199
    if-nez v9, :cond_40

    .line 2200
    .line 2201
    sget-object v9, Lxb/b$s;->a:Lxb/b$s;

    .line 2202
    .line 2203
    new-instance v10, Lpc/b;

    .line 2204
    .line 2205
    new-instance v14, Lpc/M;

    .line 2206
    .line 2207
    invoke-static/range {v20 .. v20}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 2208
    .line 2209
    .line 2210
    move-result-object v15

    .line 2211
    const/4 v6, 0x1

    .line 2212
    invoke-direct {v14, v15, v6, v9}, Lpc/M;-><init>(Lpe/d;ZLie/a;)V

    .line 2213
    .line 2214
    .line 2215
    invoke-direct {v10, v14, v1}, Lpc/b;-><init>(Lpe/q;Lpc/X;)V

    .line 2216
    .line 2217
    .line 2218
    move-object v9, v10

    .line 2219
    :cond_40
    filled-new-array {v2, v9}, [Lpc/b;

    .line 2220
    .line 2221
    .line 2222
    move-result-object v1

    .line 2223
    new-instance v2, Lxb/b$t;

    .line 2224
    .line 2225
    invoke-direct {v2}, Lxb/b$t;-><init>()V

    .line 2226
    .line 2227
    .line 2228
    invoke-static {v3, v4}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2229
    .line 2230
    .line 2231
    move-result v6

    .line 2232
    if-eqz v6, :cond_41

    .line 2233
    .line 2234
    new-instance v6, Ldc/l;

    .line 2235
    .line 2236
    invoke-direct {v6, v0, v1, v2}, Ldc/l;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    .line 2237
    .line 2238
    .line 2239
    goto :goto_19

    .line 2240
    :cond_41
    invoke-static {v3, v13}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2241
    .line 2242
    .line 2243
    move-result v6

    .line 2244
    if-eqz v6, :cond_42

    .line 2245
    .line 2246
    new-instance v6, Ldc/h;

    .line 2247
    .line 2248
    invoke-direct {v6, v0, v1, v2}, Ldc/h;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    .line 2249
    .line 2250
    .line 2251
    goto :goto_19

    .line 2252
    :cond_42
    invoke-static {v3, v11}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2253
    .line 2254
    .line 2255
    move-result v6

    .line 2256
    if-eqz v6, :cond_43

    .line 2257
    .line 2258
    new-instance v6, Ldc/i;

    .line 2259
    .line 2260
    invoke-direct {v6, v0, v1, v2}, Ldc/i;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    .line 2261
    .line 2262
    .line 2263
    goto :goto_19

    .line 2264
    :cond_43
    invoke-static {v3, v8}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2265
    .line 2266
    .line 2267
    move-result v6

    .line 2268
    if-eqz v6, :cond_44

    .line 2269
    .line 2270
    new-instance v6, Ldc/j;

    .line 2271
    .line 2272
    invoke-direct {v6, v0, v1, v2}, Ldc/j;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    .line 2273
    .line 2274
    .line 2275
    goto :goto_19

    .line 2276
    :cond_44
    invoke-static {v3, v5}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2277
    .line 2278
    .line 2279
    move-result v6

    .line 2280
    if-eqz v6, :cond_45

    .line 2281
    .line 2282
    new-instance v6, Ldc/n;

    .line 2283
    .line 2284
    invoke-direct {v6, v0, v1, v2}, Ldc/n;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    .line 2285
    .line 2286
    .line 2287
    goto :goto_19

    .line 2288
    :cond_45
    new-instance v6, Ldc/s;

    .line 2289
    .line 2290
    invoke-direct {v6, v0, v1, v2}, Ldc/s;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    .line 2291
    .line 2292
    .line 2293
    :goto_19
    invoke-virtual/range {v31 .. v31}, Lhc/f;->k()Ljava/util/Map;

    .line 2294
    .line 2295
    .line 2296
    move-result-object v1

    .line 2297
    invoke-interface {v1, v0, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2298
    .line 2299
    .line 2300
    const-string v0, "combined"

    .line 2301
    .line 2302
    invoke-virtual/range {v31 .. v31}, Lhc/f;->m()Lpc/X;

    .line 2303
    .line 2304
    .line 2305
    move-result-object v1

    .line 2306
    new-instance v2, Lkotlin/Pair;

    .line 2307
    .line 2308
    invoke-static/range {v25 .. v25}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 2309
    .line 2310
    .line 2311
    move-result-object v6

    .line 2312
    invoke-direct {v2, v6, v7}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 2313
    .line 2314
    .line 2315
    invoke-virtual/range {v16 .. v16}, Lpc/d;->a()Ljava/util/Map;

    .line 2316
    .line 2317
    .line 2318
    move-result-object v6

    .line 2319
    invoke-interface {v6, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2320
    .line 2321
    .line 2322
    move-result-object v2

    .line 2323
    check-cast v2, Lpc/b;

    .line 2324
    .line 2325
    if-nez v2, :cond_46

    .line 2326
    .line 2327
    sget-object v2, Lxb/b$u;->a:Lxb/b$u;

    .line 2328
    .line 2329
    new-instance v6, Lpc/b;

    .line 2330
    .line 2331
    new-instance v9, Lpc/M;

    .line 2332
    .line 2333
    invoke-static/range {v25 .. v25}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 2334
    .line 2335
    .line 2336
    move-result-object v10

    .line 2337
    const/4 v15, 0x0

    .line 2338
    invoke-direct {v9, v10, v15, v2}, Lpc/M;-><init>(Lpe/d;ZLie/a;)V

    .line 2339
    .line 2340
    .line 2341
    invoke-direct {v6, v9, v1}, Lpc/b;-><init>(Lpe/q;Lpc/X;)V

    .line 2342
    .line 2343
    .line 2344
    move-object v2, v6

    .line 2345
    :cond_46
    new-instance v6, Lkotlin/Pair;

    .line 2346
    .line 2347
    invoke-static/range {v20 .. v20}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 2348
    .line 2349
    .line 2350
    move-result-object v9

    .line 2351
    invoke-direct {v6, v9, v12}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 2352
    .line 2353
    .line 2354
    invoke-virtual/range {v16 .. v16}, Lpc/d;->a()Ljava/util/Map;

    .line 2355
    .line 2356
    .line 2357
    move-result-object v9

    .line 2358
    invoke-interface {v9, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2359
    .line 2360
    .line 2361
    move-result-object v6

    .line 2362
    check-cast v6, Lpc/b;

    .line 2363
    .line 2364
    if-nez v6, :cond_47

    .line 2365
    .line 2366
    sget-object v6, Lxb/b$v;->a:Lxb/b$v;

    .line 2367
    .line 2368
    new-instance v9, Lpc/b;

    .line 2369
    .line 2370
    new-instance v10, Lpc/M;

    .line 2371
    .line 2372
    invoke-static/range {v20 .. v20}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 2373
    .line 2374
    .line 2375
    move-result-object v14

    .line 2376
    const/4 v15, 0x1

    .line 2377
    invoke-direct {v10, v14, v15, v6}, Lpc/M;-><init>(Lpe/d;ZLie/a;)V

    .line 2378
    .line 2379
    .line 2380
    invoke-direct {v9, v10, v1}, Lpc/b;-><init>(Lpe/q;Lpc/X;)V

    .line 2381
    .line 2382
    .line 2383
    move-object v6, v9

    .line 2384
    :cond_47
    filled-new-array {v2, v6}, [Lpc/b;

    .line 2385
    .line 2386
    .line 2387
    move-result-object v1

    .line 2388
    new-instance v2, Lxb/b$w;

    .line 2389
    .line 2390
    invoke-direct {v2}, Lxb/b$w;-><init>()V

    .line 2391
    .line 2392
    .line 2393
    invoke-static {v3, v4}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2394
    .line 2395
    .line 2396
    move-result v6

    .line 2397
    if-eqz v6, :cond_48

    .line 2398
    .line 2399
    new-instance v6, Ldc/l;

    .line 2400
    .line 2401
    invoke-direct {v6, v0, v1, v2}, Ldc/l;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    .line 2402
    .line 2403
    .line 2404
    goto :goto_1a

    .line 2405
    :cond_48
    invoke-static {v3, v13}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2406
    .line 2407
    .line 2408
    move-result v6

    .line 2409
    if-eqz v6, :cond_49

    .line 2410
    .line 2411
    new-instance v6, Ldc/h;

    .line 2412
    .line 2413
    invoke-direct {v6, v0, v1, v2}, Ldc/h;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    .line 2414
    .line 2415
    .line 2416
    goto :goto_1a

    .line 2417
    :cond_49
    invoke-static {v3, v11}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2418
    .line 2419
    .line 2420
    move-result v6

    .line 2421
    if-eqz v6, :cond_4a

    .line 2422
    .line 2423
    new-instance v6, Ldc/i;

    .line 2424
    .line 2425
    invoke-direct {v6, v0, v1, v2}, Ldc/i;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    .line 2426
    .line 2427
    .line 2428
    goto :goto_1a

    .line 2429
    :cond_4a
    invoke-static {v3, v8}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2430
    .line 2431
    .line 2432
    move-result v6

    .line 2433
    if-eqz v6, :cond_4b

    .line 2434
    .line 2435
    new-instance v6, Ldc/j;

    .line 2436
    .line 2437
    invoke-direct {v6, v0, v1, v2}, Ldc/j;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    .line 2438
    .line 2439
    .line 2440
    goto :goto_1a

    .line 2441
    :cond_4b
    invoke-static {v3, v5}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2442
    .line 2443
    .line 2444
    move-result v6

    .line 2445
    if-eqz v6, :cond_4c

    .line 2446
    .line 2447
    new-instance v6, Ldc/n;

    .line 2448
    .line 2449
    invoke-direct {v6, v0, v1, v2}, Ldc/n;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    .line 2450
    .line 2451
    .line 2452
    goto :goto_1a

    .line 2453
    :cond_4c
    new-instance v6, Ldc/s;

    .line 2454
    .line 2455
    invoke-direct {v6, v0, v1, v2}, Ldc/s;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    .line 2456
    .line 2457
    .line 2458
    :goto_1a
    invoke-virtual/range {v31 .. v31}, Lhc/f;->k()Ljava/util/Map;

    .line 2459
    .line 2460
    .line 2461
    move-result-object v1

    .line 2462
    invoke-interface {v1, v0, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2463
    .line 2464
    .line 2465
    const-string v0, "ciphertext"

    .line 2466
    .line 2467
    invoke-virtual/range {v31 .. v31}, Lhc/f;->m()Lpc/X;

    .line 2468
    .line 2469
    .line 2470
    move-result-object v1

    .line 2471
    new-instance v2, Lkotlin/Pair;

    .line 2472
    .line 2473
    invoke-static/range {v25 .. v25}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 2474
    .line 2475
    .line 2476
    move-result-object v6

    .line 2477
    invoke-direct {v2, v6, v7}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 2478
    .line 2479
    .line 2480
    invoke-virtual/range {v16 .. v16}, Lpc/d;->a()Ljava/util/Map;

    .line 2481
    .line 2482
    .line 2483
    move-result-object v6

    .line 2484
    invoke-interface {v6, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2485
    .line 2486
    .line 2487
    move-result-object v2

    .line 2488
    check-cast v2, Lpc/b;

    .line 2489
    .line 2490
    if-nez v2, :cond_4d

    .line 2491
    .line 2492
    sget-object v2, Lxb/b$l;->a:Lxb/b$l;

    .line 2493
    .line 2494
    new-instance v6, Lpc/b;

    .line 2495
    .line 2496
    new-instance v7, Lpc/M;

    .line 2497
    .line 2498
    invoke-static/range {v25 .. v25}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 2499
    .line 2500
    .line 2501
    move-result-object v9

    .line 2502
    const/4 v15, 0x0

    .line 2503
    invoke-direct {v7, v9, v15, v2}, Lpc/M;-><init>(Lpe/d;ZLie/a;)V

    .line 2504
    .line 2505
    .line 2506
    invoke-direct {v6, v7, v1}, Lpc/b;-><init>(Lpe/q;Lpc/X;)V

    .line 2507
    .line 2508
    .line 2509
    move-object v2, v6

    .line 2510
    :cond_4d
    new-instance v6, Lkotlin/Pair;

    .line 2511
    .line 2512
    const-class v7, Lexpo/modules/crypto/aes/records/CiphertextOptions;

    .line 2513
    .line 2514
    invoke-static {v7}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 2515
    .line 2516
    .line 2517
    move-result-object v7

    .line 2518
    invoke-direct {v6, v7, v12}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 2519
    .line 2520
    .line 2521
    invoke-virtual/range {v16 .. v16}, Lpc/d;->a()Ljava/util/Map;

    .line 2522
    .line 2523
    .line 2524
    move-result-object v7

    .line 2525
    invoke-interface {v7, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2526
    .line 2527
    .line 2528
    move-result-object v6

    .line 2529
    check-cast v6, Lpc/b;

    .line 2530
    .line 2531
    if-nez v6, :cond_4e

    .line 2532
    .line 2533
    sget-object v6, Lxb/b$m;->a:Lxb/b$m;

    .line 2534
    .line 2535
    new-instance v7, Lpc/b;

    .line 2536
    .line 2537
    new-instance v9, Lpc/M;

    .line 2538
    .line 2539
    const-class v10, Lexpo/modules/crypto/aes/records/CiphertextOptions;

    .line 2540
    .line 2541
    invoke-static {v10}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 2542
    .line 2543
    .line 2544
    move-result-object v10

    .line 2545
    const/4 v15, 0x1

    .line 2546
    invoke-direct {v9, v10, v15, v6}, Lpc/M;-><init>(Lpe/d;ZLie/a;)V

    .line 2547
    .line 2548
    .line 2549
    invoke-direct {v7, v9, v1}, Lpc/b;-><init>(Lpe/q;Lpc/X;)V

    .line 2550
    .line 2551
    .line 2552
    move-object v6, v7

    .line 2553
    :cond_4e
    filled-new-array {v2, v6}, [Lpc/b;

    .line 2554
    .line 2555
    .line 2556
    move-result-object v1

    .line 2557
    new-instance v2, Lxb/b$n;

    .line 2558
    .line 2559
    invoke-direct {v2}, Lxb/b$n;-><init>()V

    .line 2560
    .line 2561
    .line 2562
    invoke-static {v3, v4}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2563
    .line 2564
    .line 2565
    move-result v4

    .line 2566
    if-eqz v4, :cond_4f

    .line 2567
    .line 2568
    new-instance v3, Ldc/l;

    .line 2569
    .line 2570
    invoke-direct {v3, v0, v1, v2}, Ldc/l;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    .line 2571
    .line 2572
    .line 2573
    goto :goto_1b

    .line 2574
    :cond_4f
    invoke-static {v3, v13}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2575
    .line 2576
    .line 2577
    move-result v4

    .line 2578
    if-eqz v4, :cond_50

    .line 2579
    .line 2580
    new-instance v3, Ldc/h;

    .line 2581
    .line 2582
    invoke-direct {v3, v0, v1, v2}, Ldc/h;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    .line 2583
    .line 2584
    .line 2585
    goto :goto_1b

    .line 2586
    :cond_50
    invoke-static {v3, v11}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2587
    .line 2588
    .line 2589
    move-result v4

    .line 2590
    if-eqz v4, :cond_51

    .line 2591
    .line 2592
    new-instance v3, Ldc/i;

    .line 2593
    .line 2594
    invoke-direct {v3, v0, v1, v2}, Ldc/i;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    .line 2595
    .line 2596
    .line 2597
    goto :goto_1b

    .line 2598
    :cond_51
    invoke-static {v3, v8}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2599
    .line 2600
    .line 2601
    move-result v4

    .line 2602
    if-eqz v4, :cond_52

    .line 2603
    .line 2604
    new-instance v3, Ldc/j;

    .line 2605
    .line 2606
    invoke-direct {v3, v0, v1, v2}, Ldc/j;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    .line 2607
    .line 2608
    .line 2609
    goto :goto_1b

    .line 2610
    :cond_52
    invoke-static {v3, v5}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2611
    .line 2612
    .line 2613
    move-result v3

    .line 2614
    if-eqz v3, :cond_53

    .line 2615
    .line 2616
    new-instance v3, Ldc/n;

    .line 2617
    .line 2618
    invoke-direct {v3, v0, v1, v2}, Ldc/n;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    .line 2619
    .line 2620
    .line 2621
    goto :goto_1b

    .line 2622
    :cond_53
    new-instance v3, Ldc/s;

    .line 2623
    .line 2624
    invoke-direct {v3, v0, v1, v2}, Ldc/s;-><init>(Ljava/lang/String;[Lpc/b;Lkotlin/jvm/functions/Function1;)V

    .line 2625
    .line 2626
    .line 2627
    :goto_1b
    invoke-virtual/range {v31 .. v31}, Lhc/f;->k()Ljava/util/Map;

    .line 2628
    .line 2629
    .line 2630
    move-result-object v1

    .line 2631
    invoke-interface {v1, v0, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2632
    .line 2633
    .line 2634
    const-string v0, "combinedSize"

    .line 2635
    .line 2636
    new-instance v1, Lhc/m;

    .line 2637
    .line 2638
    invoke-virtual/range {v31 .. v31}, LYb/c;->y()Lpc/b;

    .line 2639
    .line 2640
    .line 2641
    move-result-object v2

    .line 2642
    invoke-virtual {v2}, Lpc/b;->g()Lpe/q;

    .line 2643
    .line 2644
    .line 2645
    move-result-object v2

    .line 2646
    invoke-direct {v1, v2, v0}, Lhc/m;-><init>(Lpe/q;Ljava/lang/String;)V

    .line 2647
    .line 2648
    .line 2649
    new-instance v2, Ldc/r;

    .line 2650
    .line 2651
    new-instance v3, Lpc/b;

    .line 2652
    .line 2653
    invoke-virtual {v1}, Lhc/m;->d()Lpe/q;

    .line 2654
    .line 2655
    .line 2656
    move-result-object v4

    .line 2657
    const/4 v5, 0x2

    .line 2658
    const/4 v14, 0x0

    .line 2659
    invoke-direct {v3, v4, v14, v5, v14}, Lpc/b;-><init>(Lpe/q;Lpc/X;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 2660
    .line 2661
    .line 2662
    filled-new-array {v3}, [Lpc/b;

    .line 2663
    .line 2664
    .line 2665
    move-result-object v3

    .line 2666
    invoke-virtual/range {v28 .. v28}, Lpc/V;->a()Ljava/util/Map;

    .line 2667
    .line 2668
    .line 2669
    move-result-object v4

    .line 2670
    invoke-static/range {v21 .. v21}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 2671
    .line 2672
    .line 2673
    move-result-object v5

    .line 2674
    invoke-interface {v4, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2675
    .line 2676
    .line 2677
    move-result-object v4

    .line 2678
    check-cast v4, Lpc/U;

    .line 2679
    .line 2680
    if-nez v4, :cond_54

    .line 2681
    .line 2682
    new-instance v4, Lpc/U;

    .line 2683
    .line 2684
    invoke-static/range {v21 .. v21}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 2685
    .line 2686
    .line 2687
    move-result-object v5

    .line 2688
    invoke-direct {v4, v5}, Lpc/U;-><init>(Lpe/d;)V

    .line 2689
    .line 2690
    .line 2691
    invoke-virtual/range {v28 .. v28}, Lpc/V;->a()Ljava/util/Map;

    .line 2692
    .line 2693
    .line 2694
    move-result-object v5

    .line 2695
    invoke-static/range {v21 .. v21}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 2696
    .line 2697
    .line 2698
    move-result-object v6

    .line 2699
    invoke-interface {v5, v6, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2700
    .line 2701
    .line 2702
    :cond_54
    new-instance v5, Lxb/b$y;

    .line 2703
    .line 2704
    invoke-direct {v5}, Lxb/b$y;-><init>()V

    .line 2705
    .line 2706
    .line 2707
    move-object/from16 v15, v18

    .line 2708
    .line 2709
    invoke-direct {v2, v15, v3, v4, v5}, Ldc/r;-><init>(Ljava/lang/String;[Lpc/b;Lpc/U;Lkotlin/jvm/functions/Function1;)V

    .line 2710
    .line 2711
    .line 2712
    invoke-virtual {v1}, Lhc/m;->d()Lpe/q;

    .line 2713
    .line 2714
    .line 2715
    move-result-object v3

    .line 2716
    invoke-virtual {v2, v3}, Ldc/a;->l(Lpe/q;)V

    .line 2717
    .line 2718
    .line 2719
    const/4 v6, 0x1

    .line 2720
    invoke-virtual {v2, v6}, Ldc/a;->k(Z)V

    .line 2721
    .line 2722
    .line 2723
    invoke-virtual {v1, v2}, Lhc/l;->b(Ldc/r;)V

    .line 2724
    .line 2725
    .line 2726
    invoke-virtual/range {v31 .. v31}, Lhc/f;->o()Ljava/util/Map;

    .line 2727
    .line 2728
    .line 2729
    move-result-object v2

    .line 2730
    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2731
    .line 2732
    .line 2733
    const-string v0, "ivSize"

    .line 2734
    .line 2735
    new-instance v1, Lhc/m;

    .line 2736
    .line 2737
    invoke-virtual/range {v31 .. v31}, LYb/c;->y()Lpc/b;

    .line 2738
    .line 2739
    .line 2740
    move-result-object v2

    .line 2741
    invoke-virtual {v2}, Lpc/b;->g()Lpe/q;

    .line 2742
    .line 2743
    .line 2744
    move-result-object v2

    .line 2745
    invoke-direct {v1, v2, v0}, Lhc/m;-><init>(Lpe/q;Ljava/lang/String;)V

    .line 2746
    .line 2747
    .line 2748
    new-instance v2, Ldc/r;

    .line 2749
    .line 2750
    new-instance v3, Lpc/b;

    .line 2751
    .line 2752
    invoke-virtual {v1}, Lhc/m;->d()Lpe/q;

    .line 2753
    .line 2754
    .line 2755
    move-result-object v4

    .line 2756
    const/4 v5, 0x2

    .line 2757
    const/4 v14, 0x0

    .line 2758
    invoke-direct {v3, v4, v14, v5, v14}, Lpc/b;-><init>(Lpe/q;Lpc/X;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 2759
    .line 2760
    .line 2761
    filled-new-array {v3}, [Lpc/b;

    .line 2762
    .line 2763
    .line 2764
    move-result-object v3

    .line 2765
    invoke-virtual/range {v28 .. v28}, Lpc/V;->a()Ljava/util/Map;

    .line 2766
    .line 2767
    .line 2768
    move-result-object v4

    .line 2769
    invoke-static/range {v21 .. v21}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 2770
    .line 2771
    .line 2772
    move-result-object v5

    .line 2773
    invoke-interface {v4, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2774
    .line 2775
    .line 2776
    move-result-object v4

    .line 2777
    check-cast v4, Lpc/U;

    .line 2778
    .line 2779
    if-nez v4, :cond_55

    .line 2780
    .line 2781
    new-instance v4, Lpc/U;

    .line 2782
    .line 2783
    invoke-static/range {v21 .. v21}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 2784
    .line 2785
    .line 2786
    move-result-object v5

    .line 2787
    invoke-direct {v4, v5}, Lpc/U;-><init>(Lpe/d;)V

    .line 2788
    .line 2789
    .line 2790
    invoke-virtual/range {v28 .. v28}, Lpc/V;->a()Ljava/util/Map;

    .line 2791
    .line 2792
    .line 2793
    move-result-object v5

    .line 2794
    invoke-static/range {v21 .. v21}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 2795
    .line 2796
    .line 2797
    move-result-object v6

    .line 2798
    invoke-interface {v5, v6, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2799
    .line 2800
    .line 2801
    :cond_55
    new-instance v5, Lxb/b$z;

    .line 2802
    .line 2803
    invoke-direct {v5}, Lxb/b$z;-><init>()V

    .line 2804
    .line 2805
    .line 2806
    invoke-direct {v2, v15, v3, v4, v5}, Ldc/r;-><init>(Ljava/lang/String;[Lpc/b;Lpc/U;Lkotlin/jvm/functions/Function1;)V

    .line 2807
    .line 2808
    .line 2809
    invoke-virtual {v1}, Lhc/m;->d()Lpe/q;

    .line 2810
    .line 2811
    .line 2812
    move-result-object v3

    .line 2813
    invoke-virtual {v2, v3}, Ldc/a;->l(Lpe/q;)V

    .line 2814
    .line 2815
    .line 2816
    const/4 v6, 0x1

    .line 2817
    invoke-virtual {v2, v6}, Ldc/a;->k(Z)V

    .line 2818
    .line 2819
    .line 2820
    invoke-virtual {v1, v2}, Lhc/l;->b(Ldc/r;)V

    .line 2821
    .line 2822
    .line 2823
    invoke-virtual/range {v31 .. v31}, Lhc/f;->o()Ljava/util/Map;

    .line 2824
    .line 2825
    .line 2826
    move-result-object v2

    .line 2827
    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2828
    .line 2829
    .line 2830
    const-string v0, "tagSize"

    .line 2831
    .line 2832
    new-instance v1, Lhc/m;

    .line 2833
    .line 2834
    invoke-virtual/range {v31 .. v31}, LYb/c;->y()Lpc/b;

    .line 2835
    .line 2836
    .line 2837
    move-result-object v2

    .line 2838
    invoke-virtual {v2}, Lpc/b;->g()Lpe/q;

    .line 2839
    .line 2840
    .line 2841
    move-result-object v2

    .line 2842
    invoke-direct {v1, v2, v0}, Lhc/m;-><init>(Lpe/q;Ljava/lang/String;)V

    .line 2843
    .line 2844
    .line 2845
    new-instance v2, Ldc/r;

    .line 2846
    .line 2847
    new-instance v3, Lpc/b;

    .line 2848
    .line 2849
    invoke-virtual {v1}, Lhc/m;->d()Lpe/q;

    .line 2850
    .line 2851
    .line 2852
    move-result-object v4

    .line 2853
    const/4 v5, 0x2

    .line 2854
    const/4 v14, 0x0

    .line 2855
    invoke-direct {v3, v4, v14, v5, v14}, Lpc/b;-><init>(Lpe/q;Lpc/X;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 2856
    .line 2857
    .line 2858
    filled-new-array {v3}, [Lpc/b;

    .line 2859
    .line 2860
    .line 2861
    move-result-object v3

    .line 2862
    invoke-virtual/range {v28 .. v28}, Lpc/V;->a()Ljava/util/Map;

    .line 2863
    .line 2864
    .line 2865
    move-result-object v4

    .line 2866
    invoke-static/range {v21 .. v21}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 2867
    .line 2868
    .line 2869
    move-result-object v5

    .line 2870
    invoke-interface {v4, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2871
    .line 2872
    .line 2873
    move-result-object v4

    .line 2874
    check-cast v4, Lpc/U;

    .line 2875
    .line 2876
    if-nez v4, :cond_56

    .line 2877
    .line 2878
    new-instance v4, Lpc/U;

    .line 2879
    .line 2880
    invoke-static/range {v21 .. v21}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 2881
    .line 2882
    .line 2883
    move-result-object v5

    .line 2884
    invoke-direct {v4, v5}, Lpc/U;-><init>(Lpe/d;)V

    .line 2885
    .line 2886
    .line 2887
    invoke-virtual/range {v28 .. v28}, Lpc/V;->a()Ljava/util/Map;

    .line 2888
    .line 2889
    .line 2890
    move-result-object v5

    .line 2891
    invoke-static/range {v21 .. v21}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 2892
    .line 2893
    .line 2894
    move-result-object v6

    .line 2895
    invoke-interface {v5, v6, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2896
    .line 2897
    .line 2898
    :cond_56
    new-instance v5, Lxb/b$A;

    .line 2899
    .line 2900
    invoke-direct {v5}, Lxb/b$A;-><init>()V

    .line 2901
    .line 2902
    .line 2903
    invoke-direct {v2, v15, v3, v4, v5}, Ldc/r;-><init>(Ljava/lang/String;[Lpc/b;Lpc/U;Lkotlin/jvm/functions/Function1;)V

    .line 2904
    .line 2905
    .line 2906
    invoke-virtual {v1}, Lhc/m;->d()Lpe/q;

    .line 2907
    .line 2908
    .line 2909
    move-result-object v3

    .line 2910
    invoke-virtual {v2, v3}, Ldc/a;->l(Lpe/q;)V

    .line 2911
    .line 2912
    .line 2913
    const/4 v15, 0x1

    .line 2914
    invoke-virtual {v2, v15}, Ldc/a;->k(Z)V

    .line 2915
    .line 2916
    .line 2917
    invoke-virtual {v1, v2}, Lhc/l;->b(Ldc/r;)V

    .line 2918
    .line 2919
    .line 2920
    invoke-virtual/range {v31 .. v31}, Lhc/f;->o()Ljava/util/Map;

    .line 2921
    .line 2922
    .line 2923
    move-result-object v2

    .line 2924
    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2925
    .line 2926
    .line 2927
    invoke-virtual/range {v23 .. v23}, Lgc/a;->v()Ljava/util/List;

    .line 2928
    .line 2929
    .line 2930
    move-result-object v0

    .line 2931
    invoke-virtual/range {v31 .. v31}, LYb/c;->v()LYb/d;

    .line 2932
    .line 2933
    .line 2934
    move-result-object v1

    .line 2935
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 2936
    .line 2937
    .line 2938
    invoke-virtual/range {v23 .. v23}, Lgc/a;->u()Lgc/e;

    .line 2939
    .line 2940
    .line 2941
    move-result-object v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 2942
    invoke-static {}, LX3/a;->f()V

    .line 2943
    .line 2944
    .line 2945
    return-object v0

    .line 2946
    :cond_57
    :try_start_4
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 2947
    .line 2948
    move-object/from16 v1, v17

    .line 2949
    .line 2950
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 2951
    .line 2952
    .line 2953
    throw v0

    .line 2954
    :cond_58
    move-object v1, v3

    .line 2955
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 2956
    .line 2957
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 2958
    .line 2959
    .line 2960
    throw v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 2961
    :goto_1c
    invoke-static {}, LX3/a;->f()V

    .line 2962
    .line 2963
    .line 2964
    throw v0
.end method

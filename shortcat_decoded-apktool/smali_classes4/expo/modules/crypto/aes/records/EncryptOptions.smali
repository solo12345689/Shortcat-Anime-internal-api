.class public final Lexpo/modules/crypto/aes/records/EncryptOptions;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Ljc/b;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0012\n\u0002\u0010\u0008\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0019\u0010\t\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0000\u00a2\u0006\u0004\u0008\u0007\u0010\u0008R4\u0010\u000e\u001a\u0016\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000c\u0012\u0004\u0012\u00020\r\u0018\u00010\n8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u000e\u0010\u000f\u0012\u0004\u0008\u0012\u0010\u0003\u001a\u0004\u0008\u0010\u0010\u0011R\"\u0010\u0013\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0013\u0010\u0014\u0012\u0004\u0008\u0017\u0010\u0003\u001a\u0004\u0008\u0015\u0010\u0016R4\u0010\u001a\u001a\u0016\u0012\u0004\u0012\u00020\u000c\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0018j\u0004\u0018\u0001`\u00198\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u001a\u0010\u001b\u0012\u0004\u0008\u001e\u0010\u0003\u001a\u0004\u0008\u001c\u0010\u001d\u00a8\u0006\u001f"
    }
    d2 = {
        "Lexpo/modules/crypto/aes/records/EncryptOptions;",
        "Ljc/b;",
        "<init>",
        "()V",
        "Ljava/security/SecureRandom;",
        "random",
        "Ljavax/crypto/spec/GCMParameterSpec;",
        "gcmParameterSpec$expo_crypto_release",
        "(Ljava/security/SecureRandom;)Ljavax/crypto/spec/GCMParameterSpec;",
        "gcmParameterSpec",
        "Lexpo/modules/kotlin/types/EitherOfThree;",
        "",
        "",
        "",
        "nonce",
        "Lexpo/modules/kotlin/types/EitherOfThree;",
        "getNonce",
        "()Lexpo/modules/kotlin/types/EitherOfThree;",
        "getNonce$annotations",
        "tagLength",
        "Ljava/lang/Integer;",
        "getTagLength",
        "()Ljava/lang/Integer;",
        "getTagLength$annotations",
        "Lexpo/modules/kotlin/types/Either;",
        "Lexpo/modules/crypto/aes/BinaryInput;",
        "additionalData",
        "Lexpo/modules/kotlin/types/Either;",
        "getAdditionalData",
        "()Lexpo/modules/kotlin/types/Either;",
        "getAdditionalData$annotations",
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
.field private final additionalData:Lexpo/modules/kotlin/types/Either;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lexpo/modules/kotlin/types/Either<",
            "[B",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final nonce:Lexpo/modules/kotlin/types/EitherOfThree;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lexpo/modules/kotlin/types/EitherOfThree<",
            "Ljava/lang/String;",
            "[B",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private final tagLength:Ljava/lang/Integer;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic getAdditionalData$annotations()V
    .locals 0
    .annotation runtime Ljc/a;
    .end annotation

    .line 1
    return-void
.end method

.method public static synthetic getNonce$annotations()V
    .locals 0
    .annotation runtime Ljc/a;
    .end annotation

    .line 1
    return-void
.end method

.method public static synthetic getTagLength$annotations()V
    .locals 0
    .annotation runtime Ljc/a;
    .end annotation

    .line 1
    return-void
.end method


# virtual methods
.method public final gcmParameterSpec$expo_crypto_release(Ljava/security/SecureRandom;)Ljavax/crypto/spec/GCMParameterSpec;
    .locals 3

    .line 1
    const-string v0, "random"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lexpo/modules/crypto/aes/records/EncryptOptions;->nonce:Lexpo/modules/kotlin/types/EitherOfThree;

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    iget-object v1, p0, Lexpo/modules/crypto/aes/records/EncryptOptions;->tagLength:Ljava/lang/Integer;

    .line 11
    .line 12
    if-nez v1, :cond_0

    .line 13
    .line 14
    const/4 p1, 0x0

    .line 15
    return-object p1

    .line 16
    :cond_0
    if-nez v0, :cond_1

    .line 17
    .line 18
    const/16 v0, 0xc

    .line 19
    .line 20
    new-array v0, v0, [B

    .line 21
    .line 22
    invoke-virtual {p1, v0}, Ljava/security/SecureRandom;->nextBytes([B)V

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_1
    sget-object v1, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 27
    .line 28
    invoke-static {v1}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    invoke-virtual {v0, v2}, Lexpo/modules/kotlin/types/EitherOfThree;->h(Lpe/d;)Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-eqz v0, :cond_2

    .line 37
    .line 38
    iget-object v0, p0, Lexpo/modules/crypto/aes/records/EncryptOptions;->nonce:Lexpo/modules/kotlin/types/EitherOfThree;

    .line 39
    .line 40
    invoke-static {v1}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    invoke-virtual {v0, v1}, Lexpo/modules/kotlin/types/EitherOfThree;->g(Lpe/d;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    check-cast v0, Ljava/lang/Number;

    .line 49
    .line 50
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    new-array v0, v0, [B

    .line 55
    .line 56
    invoke-virtual {p1, v0}, Ljava/security/SecureRandom;->nextBytes([B)V

    .line 57
    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_2
    iget-object p1, p0, Lexpo/modules/crypto/aes/records/EncryptOptions;->nonce:Lexpo/modules/kotlin/types/EitherOfThree;

    .line 61
    .line 62
    const-class v0, Ljava/lang/String;

    .line 63
    .line 64
    invoke-static {v0}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    invoke-virtual {p1, v1}, Lexpo/modules/kotlin/types/Either;->e(Lpe/d;)Z

    .line 69
    .line 70
    .line 71
    move-result p1

    .line 72
    if-eqz p1, :cond_3

    .line 73
    .line 74
    iget-object p1, p0, Lexpo/modules/crypto/aes/records/EncryptOptions;->nonce:Lexpo/modules/kotlin/types/EitherOfThree;

    .line 75
    .line 76
    invoke-static {v0}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    invoke-virtual {p1, v0}, Lexpo/modules/kotlin/types/Either;->b(Lpe/d;)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    check-cast p1, Ljava/lang/String;

    .line 85
    .line 86
    const/4 v0, 0x2

    .line 87
    invoke-static {p1, v0}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    goto :goto_0

    .line 92
    :cond_3
    iget-object p1, p0, Lexpo/modules/crypto/aes/records/EncryptOptions;->nonce:Lexpo/modules/kotlin/types/EitherOfThree;

    .line 93
    .line 94
    const-class v0, [B

    .line 95
    .line 96
    invoke-static {v0}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lpe/d;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    invoke-virtual {p1, v0}, Lexpo/modules/kotlin/types/Either;->c(Lpe/d;)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    move-object v0, p1

    .line 105
    check-cast v0, [B

    .line 106
    .line 107
    :goto_0
    iget-object p1, p0, Lexpo/modules/crypto/aes/records/EncryptOptions;->tagLength:Ljava/lang/Integer;

    .line 108
    .line 109
    if-eqz p1, :cond_4

    .line 110
    .line 111
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 112
    .line 113
    .line 114
    move-result p1

    .line 115
    goto :goto_1

    .line 116
    :cond_4
    const/16 p1, 0x10

    .line 117
    .line 118
    :goto_1
    new-instance v1, Ljavax/crypto/spec/GCMParameterSpec;

    .line 119
    .line 120
    mul-int/lit8 p1, p1, 0x8

    .line 121
    .line 122
    invoke-direct {v1, p1, v0}, Ljavax/crypto/spec/GCMParameterSpec;-><init>(I[B)V

    .line 123
    .line 124
    .line 125
    return-object v1
.end method

.method public final getAdditionalData()Lexpo/modules/kotlin/types/Either;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lexpo/modules/kotlin/types/Either<",
            "[B",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lexpo/modules/crypto/aes/records/EncryptOptions;->additionalData:Lexpo/modules/kotlin/types/Either;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getNonce()Lexpo/modules/kotlin/types/EitherOfThree;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lexpo/modules/kotlin/types/EitherOfThree<",
            "Ljava/lang/String;",
            "[B",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lexpo/modules/crypto/aes/records/EncryptOptions;->nonce:Lexpo/modules/kotlin/types/EitherOfThree;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getTagLength()Ljava/lang/Integer;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/crypto/aes/records/EncryptOptions;->tagLength:Ljava/lang/Integer;

    .line 2
    .line 3
    return-object v0
.end method

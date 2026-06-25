.class public final Lexpo/modules/crypto/aes/objects/SealedData;
.super Lexpo/modules/kotlin/sharedobjects/SharedObject;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u001b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007B!\u0008\u0016\u0012\u0006\u0010\u0008\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u00a2\u0006\u0004\u0008\u0006\u0010\u000cB!\u0008\u0016\u0012\u0006\u0010\u0008\u001a\u00020\u0004\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\t\u00a2\u0006\u0004\u0008\u0006\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000f\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\tH\u0016\u00a2\u0006\u0004\u0008\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u00198BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u001a\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\u00198BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u001d\u0010\u001bR\u0014\u0010 \u001a\u00020\u00198BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u001f\u0010\u001bR\u0014\u0010\"\u001a\u00020\u00198BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008!\u0010\u001bR\u0014\u0010$\u001a\u00020\u00198@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\u0008#\u0010\u001bR\u0011\u0010&\u001a\u00020\t8F\u00a2\u0006\u0006\u001a\u0004\u0008%\u0010\u0014R\u0011\u0010(\u001a\u00020\t8F\u00a2\u0006\u0006\u001a\u0004\u0008\'\u0010\u0014R\u0011\u0010*\u001a\u00020\t8F\u00a2\u0006\u0006\u001a\u0004\u0008)\u0010\u0014R\u0011\u0010,\u001a\u00020\t8F\u00a2\u0006\u0006\u001a\u0004\u0008+\u0010\u0014R\u0011\u0010/\u001a\u00020\u00048F\u00a2\u0006\u0006\u001a\u0004\u0008-\u0010.R\u0011\u00101\u001a\u00020\u00048F\u00a2\u0006\u0006\u001a\u0004\u00080\u0010.R\u0011\u00103\u001a\u00020\u00048F\u00a2\u0006\u0006\u001a\u0004\u00082\u0010.\u00a8\u00064"
    }
    d2 = {
        "Lexpo/modules/crypto/aes/objects/SealedData;",
        "Lexpo/modules/kotlin/sharedobjects/SharedObject;",
        "Lexpo/modules/crypto/aes/records/SealedDataConfig;",
        "config",
        "",
        "content",
        "<init>",
        "(Lexpo/modules/crypto/aes/records/SealedDataConfig;[B)V",
        "iv",
        "",
        "ciphertextLength",
        "tagLength",
        "([BII)V",
        "ciphertextWithTag",
        "([B[BI)V",
        "",
        "withTag",
        "J",
        "(Z)[B",
        "k",
        "()I",
        "c",
        "Lexpo/modules/crypto/aes/records/SealedDataConfig;",
        "d",
        "[B",
        "Ljava/nio/ByteBuffer;",
        "p0",
        "()Ljava/nio/ByteBuffer;",
        "ivBuffer",
        "G0",
        "tagBuffer",
        "h0",
        "combinedBuffer",
        "O",
        "ciphertextBuffer",
        "q1",
        "taggedCiphertextBuffer",
        "k0",
        "combinedSize",
        "F0",
        "ivSize",
        "a1",
        "tagSize",
        "S",
        "ciphertextSize",
        "B0",
        "()[B",
        "ivBytes",
        "M0",
        "tagBytes",
        "Y",
        "combinedArray",
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
.field private final c:Lexpo/modules/crypto/aes/records/SealedDataConfig;

.field private final d:[B


# direct methods
.method public constructor <init>(Lexpo/modules/crypto/aes/records/SealedDataConfig;[B)V
    .locals 2

    const-string v0, "config"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "content"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    const/4 v1, 0x1

    .line 1
    invoke-direct {p0, v0, v1, v0}, Lexpo/modules/kotlin/sharedobjects/SharedObject;-><init>(Llc/b;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 2
    iput-object p1, p0, Lexpo/modules/crypto/aes/objects/SealedData;->c:Lexpo/modules/crypto/aes/records/SealedDataConfig;

    .line 3
    iput-object p2, p0, Lexpo/modules/crypto/aes/objects/SealedData;->d:[B

    .line 4
    array-length p1, p2

    invoke-virtual {p0}, Lexpo/modules/crypto/aes/objects/SealedData;->F0()I

    move-result p2

    invoke-virtual {p0}, Lexpo/modules/crypto/aes/objects/SealedData;->a1()I

    move-result v0

    add-int/2addr p2, v0

    if-lt p1, p2, :cond_0

    return-void

    .line 5
    :cond_0
    new-instance p1, Lxb/f;

    invoke-direct {p1}, Lxb/f;-><init>()V

    throw p1
.end method

.method public constructor <init>([BII)V
    .locals 2

    const-string v0, "iv"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    new-instance v0, Lexpo/modules/crypto/aes/records/SealedDataConfig;

    array-length v1, p1

    invoke-direct {v0, v1, p3}, Lexpo/modules/crypto/aes/records/SealedDataConfig;-><init>(II)V

    .line 7
    array-length v1, p1

    add-int/2addr v1, p2

    add-int/2addr v1, p3

    new-array p2, v1, [B

    .line 8
    invoke-static {p2}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object p3

    invoke-static {p3}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 9
    invoke-virtual {p3, p1}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    .line 10
    sget-object p1, LTd/L;->a:LTd/L;

    .line 11
    invoke-direct {p0, v0, p2}, Lexpo/modules/crypto/aes/objects/SealedData;-><init>(Lexpo/modules/crypto/aes/records/SealedDataConfig;[B)V

    return-void
.end method

.method public constructor <init>([B[BI)V
    .locals 2

    const-string v0, "iv"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "ciphertextWithTag"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    new-instance v0, Lexpo/modules/crypto/aes/records/SealedDataConfig;

    array-length v1, p1

    invoke-direct {v0, v1, p3}, Lexpo/modules/crypto/aes/records/SealedDataConfig;-><init>(II)V

    .line 13
    invoke-static {p1, p2}, LUd/n;->A([B[B)[B

    move-result-object p1

    .line 14
    invoke-direct {p0, v0, p1}, Lexpo/modules/crypto/aes/objects/SealedData;-><init>(Lexpo/modules/crypto/aes/records/SealedDataConfig;[B)V

    return-void
.end method

.method private final G0()Ljava/nio/ByteBuffer;
    .locals 3

    .line 1
    iget-object v0, p0, Lexpo/modules/crypto/aes/objects/SealedData;->d:[B

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    invoke-virtual {p0}, Lexpo/modules/crypto/aes/objects/SealedData;->a1()I

    .line 5
    .line 6
    .line 7
    move-result v2

    .line 8
    sub-int/2addr v1, v2

    .line 9
    invoke-virtual {p0}, Lexpo/modules/crypto/aes/objects/SealedData;->a1()I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    invoke-static {v0, v1, v2}, Ljava/nio/ByteBuffer;->wrap([BII)Ljava/nio/ByteBuffer;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    const-string v1, "wrap(...)"

    .line 18
    .line 19
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    return-object v0
.end method

.method private final O()Ljava/nio/ByteBuffer;
    .locals 3

    .line 1
    iget-object v0, p0, Lexpo/modules/crypto/aes/objects/SealedData;->d:[B

    .line 2
    .line 3
    invoke-virtual {p0}, Lexpo/modules/crypto/aes/objects/SealedData;->F0()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-virtual {p0}, Lexpo/modules/crypto/aes/objects/SealedData;->S()I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    invoke-static {v0, v1, v2}, Ljava/nio/ByteBuffer;->wrap([BII)Ljava/nio/ByteBuffer;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const-string v1, "wrap(...)"

    .line 16
    .line 17
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    return-object v0
.end method

.method private final h0()Ljava/nio/ByteBuffer;
    .locals 2

    .line 1
    iget-object v0, p0, Lexpo/modules/crypto/aes/objects/SealedData;->d:[B

    .line 2
    .line 3
    invoke-static {v0}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "wrap(...)"

    .line 8
    .line 9
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method

.method private final p0()Ljava/nio/ByteBuffer;
    .locals 3

    .line 1
    iget-object v0, p0, Lexpo/modules/crypto/aes/objects/SealedData;->d:[B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {p0}, Lexpo/modules/crypto/aes/objects/SealedData;->F0()I

    .line 5
    .line 6
    .line 7
    move-result v2

    .line 8
    invoke-static {v0, v1, v2}, Ljava/nio/ByteBuffer;->wrap([BII)Ljava/nio/ByteBuffer;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    const-string v1, "wrap(...)"

    .line 13
    .line 14
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    return-object v0
.end method


# virtual methods
.method public final B0()[B
    .locals 1

    .line 1
    invoke-direct {p0}, Lexpo/modules/crypto/aes/objects/SealedData;->p0()Ljava/nio/ByteBuffer;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Lyb/b;->c(Ljava/nio/ByteBuffer;)[B

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public final F0()I
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/crypto/aes/objects/SealedData;->c:Lexpo/modules/crypto/aes/records/SealedDataConfig;

    .line 2
    .line 3
    invoke-virtual {v0}, Lexpo/modules/crypto/aes/records/SealedDataConfig;->getIvLength()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final J(Z)[B
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0}, Lexpo/modules/crypto/aes/objects/SealedData;->q1()Ljava/nio/ByteBuffer;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    invoke-direct {p0}, Lexpo/modules/crypto/aes/objects/SealedData;->O()Ljava/nio/ByteBuffer;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    :goto_0
    invoke-static {p1}, Lyb/b;->c(Ljava/nio/ByteBuffer;)[B

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    return-object p1
.end method

.method public final M0()[B
    .locals 1

    .line 1
    invoke-direct {p0}, Lexpo/modules/crypto/aes/objects/SealedData;->G0()Ljava/nio/ByteBuffer;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Lyb/b;->c(Ljava/nio/ByteBuffer;)[B

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public final S()I
    .locals 2

    .line 1
    invoke-virtual {p0}, Lexpo/modules/crypto/aes/objects/SealedData;->k0()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p0}, Lexpo/modules/crypto/aes/objects/SealedData;->F0()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    sub-int/2addr v0, v1

    .line 10
    invoke-virtual {p0}, Lexpo/modules/crypto/aes/objects/SealedData;->a1()I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    sub-int/2addr v0, v1

    .line 15
    return v0
.end method

.method public final Y()[B
    .locals 2

    .line 1
    invoke-direct {p0}, Lexpo/modules/crypto/aes/objects/SealedData;->h0()Ljava/nio/ByteBuffer;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->array()[B

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const-string v1, "array(...)"

    .line 10
    .line 11
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    return-object v0
.end method

.method public final a1()I
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/crypto/aes/objects/SealedData;->c:Lexpo/modules/crypto/aes/records/SealedDataConfig;

    .line 2
    .line 3
    invoke-virtual {v0}, Lexpo/modules/crypto/aes/records/SealedDataConfig;->getTagLength()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public k()I
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/crypto/aes/objects/SealedData;->d:[B

    .line 2
    .line 3
    array-length v0, v0

    .line 4
    return v0
.end method

.method public final k0()I
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/crypto/aes/objects/SealedData;->d:[B

    .line 2
    .line 3
    array-length v0, v0

    .line 4
    return v0
.end method

.method public final q1()Ljava/nio/ByteBuffer;
    .locals 4

    .line 1
    iget-object v0, p0, Lexpo/modules/crypto/aes/objects/SealedData;->d:[B

    .line 2
    .line 3
    invoke-virtual {p0}, Lexpo/modules/crypto/aes/objects/SealedData;->F0()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-virtual {p0}, Lexpo/modules/crypto/aes/objects/SealedData;->S()I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    invoke-virtual {p0}, Lexpo/modules/crypto/aes/objects/SealedData;->a1()I

    .line 12
    .line 13
    .line 14
    move-result v3

    .line 15
    add-int/2addr v2, v3

    .line 16
    invoke-static {v0, v1, v2}, Ljava/nio/ByteBuffer;->wrap([BII)Ljava/nio/ByteBuffer;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    const-string v1, "wrap(...)"

    .line 21
    .line 22
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    return-object v0
.end method

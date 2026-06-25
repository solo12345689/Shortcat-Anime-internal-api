.class public final Lexpo/modules/crypto/aes/objects/EncryptionKey;
.super Lexpo/modules/kotlin/sharedobjects/SharedObject;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0012\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0018\u00002\u00020\u0001B\u0011\u0008\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005B\u0011\u0008\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0004\u0010\u0008J\u000f\u0010\n\u001a\u00020\tH\u0016\u00a2\u0006\u0004\u0008\n\u0010\u000bR\u0017\u0010\u0010\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010\r\u001a\u0004\u0008\u000e\u0010\u000fR\u0017\u0010\u0016\u001a\u00020\u00118\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010\u0013\u001a\u0004\u0008\u0014\u0010\u0015R\u0011\u0010\u0007\u001a\u00020\u00068F\u00a2\u0006\u0006\u001a\u0004\u0008\u0017\u0010\u0018\u00a8\u0006\u0019"
    }
    d2 = {
        "Lexpo/modules/crypto/aes/objects/EncryptionKey;",
        "Lexpo/modules/kotlin/sharedobjects/SharedObject;",
        "Lexpo/modules/crypto/aes/enums/KeySize;",
        "size",
        "<init>",
        "(Lexpo/modules/crypto/aes/enums/KeySize;)V",
        "",
        "bytes",
        "([B)V",
        "",
        "k",
        "()I",
        "c",
        "Lexpo/modules/crypto/aes/enums/KeySize;",
        "S",
        "()Lexpo/modules/crypto/aes/enums/KeySize;",
        "keySize",
        "Ljavax/crypto/SecretKey;",
        "d",
        "Ljavax/crypto/SecretKey;",
        "O",
        "()Ljavax/crypto/SecretKey;",
        "cryptoKey",
        "J",
        "()[B",
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
.field private final c:Lexpo/modules/crypto/aes/enums/KeySize;

.field private final d:Ljavax/crypto/SecretKey;


# direct methods
.method public constructor <init>(Lexpo/modules/crypto/aes/enums/KeySize;)V
    .locals 2

    const-string v0, "size"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    const/4 v1, 0x1

    .line 1
    invoke-direct {p0, v0, v1, v0}, Lexpo/modules/kotlin/sharedobjects/SharedObject;-><init>(Llc/b;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 2
    const-string v0, "AES"

    invoke-static {v0}, Ljavax/crypto/KeyGenerator;->getInstance(Ljava/lang/String;)Ljavax/crypto/KeyGenerator;

    move-result-object v0

    .line 3
    invoke-virtual {p1}, Lexpo/modules/crypto/aes/enums/KeySize;->getBitSize()I

    move-result v1

    invoke-virtual {v0, v1}, Ljavax/crypto/KeyGenerator;->init(I)V

    .line 4
    iput-object p1, p0, Lexpo/modules/crypto/aes/objects/EncryptionKey;->c:Lexpo/modules/crypto/aes/enums/KeySize;

    .line 5
    invoke-virtual {v0}, Ljavax/crypto/KeyGenerator;->generateKey()Ljavax/crypto/SecretKey;

    move-result-object p1

    const-string v0, "generateKey(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lexpo/modules/crypto/aes/objects/EncryptionKey;->d:Ljavax/crypto/SecretKey;

    return-void
.end method

.method public constructor <init>([B)V
    .locals 2

    const-string v0, "bytes"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    const/4 v1, 0x1

    .line 6
    invoke-direct {p0, v0, v1, v0}, Lexpo/modules/kotlin/sharedobjects/SharedObject;-><init>(Llc/b;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 7
    sget-object v0, Lexpo/modules/crypto/aes/enums/KeySize;->Companion:Lexpo/modules/crypto/aes/enums/KeySize$a;

    array-length v1, p1

    invoke-virtual {v0, v1}, Lexpo/modules/crypto/aes/enums/KeySize$a;->a(I)Lexpo/modules/crypto/aes/enums/KeySize;

    move-result-object v0

    iput-object v0, p0, Lexpo/modules/crypto/aes/objects/EncryptionKey;->c:Lexpo/modules/crypto/aes/enums/KeySize;

    .line 8
    new-instance v0, Ljavax/crypto/spec/SecretKeySpec;

    const-string v1, "AES"

    invoke-direct {v0, p1, v1}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V

    iput-object v0, p0, Lexpo/modules/crypto/aes/objects/EncryptionKey;->d:Ljavax/crypto/SecretKey;

    return-void
.end method


# virtual methods
.method public final J()[B
    .locals 2

    .line 1
    iget-object v0, p0, Lexpo/modules/crypto/aes/objects/EncryptionKey;->d:Ljavax/crypto/SecretKey;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/security/Key;->getEncoded()[B

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "getEncoded(...)"

    .line 8
    .line 9
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method

.method public final O()Ljavax/crypto/SecretKey;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/crypto/aes/objects/EncryptionKey;->d:Ljavax/crypto/SecretKey;

    .line 2
    .line 3
    return-object v0
.end method

.method public final S()Lexpo/modules/crypto/aes/enums/KeySize;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/crypto/aes/objects/EncryptionKey;->c:Lexpo/modules/crypto/aes/enums/KeySize;

    .line 2
    .line 3
    return-object v0
.end method

.method public k()I
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/crypto/aes/objects/EncryptionKey;->c:Lexpo/modules/crypto/aes/enums/KeySize;

    .line 2
    .line 3
    invoke-virtual {v0}, Lexpo/modules/crypto/aes/enums/KeySize;->getByteSize()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

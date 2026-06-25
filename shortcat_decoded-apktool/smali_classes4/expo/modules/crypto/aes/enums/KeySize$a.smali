.class public final Lexpo/modules/crypto/aes/enums/KeySize$a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lexpo/modules/crypto/aes/enums/KeySize;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lexpo/modules/crypto/aes/enums/KeySize$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(I)Lexpo/modules/crypto/aes/enums/KeySize;
    .locals 3

    .line 1
    invoke-static {}, Lexpo/modules/crypto/aes/enums/KeySize;->getEntries()Lkotlin/enums/EnumEntries;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_1

    .line 14
    .line 15
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    move-object v2, v1

    .line 20
    check-cast v2, Lexpo/modules/crypto/aes/enums/KeySize;

    .line 21
    .line 22
    invoke-virtual {v2}, Lexpo/modules/crypto/aes/enums/KeySize;->getByteSize()I

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    if-ne v2, p1, :cond_0

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_1
    const/4 v1, 0x0

    .line 30
    :goto_0
    check-cast v1, Lexpo/modules/crypto/aes/enums/KeySize;

    .line 31
    .line 32
    if-eqz v1, :cond_2

    .line 33
    .line 34
    return-object v1

    .line 35
    :cond_2
    new-instance v0, Lxb/e;

    .line 36
    .line 37
    invoke-direct {v0, p1}, Lxb/e;-><init>(I)V

    .line 38
    .line 39
    .line 40
    throw v0
.end method

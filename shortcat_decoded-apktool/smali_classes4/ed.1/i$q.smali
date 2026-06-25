.class public final Led/i$q;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Led/i;->n()Lgc/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Led/i;


# direct methods
.method public constructor <init>(Led/i;)V
    .locals 0

    .line 1
    iput-object p1, p0, Led/i$q;->a:Led/i;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    const-string v0, "<destruct>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    aget-object v0, p1, v0

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    aget-object v2, p1, v1

    .line 11
    .line 12
    const/4 v3, 0x2

    .line 13
    aget-object p1, p1, v3

    .line 14
    .line 15
    move-object v7, p1

    .line 16
    check-cast v7, Lexpo/modules/securestore/SecureStoreOptions;

    .line 17
    .line 18
    move-object v5, v2

    .line 19
    check-cast v5, Ljava/lang/String;

    .line 20
    .line 21
    move-object v6, v0

    .line 22
    check-cast v6, Ljava/lang/String;

    .line 23
    .line 24
    if-eqz v5, :cond_0

    .line 25
    .line 26
    new-instance v3, Led/i$b;

    .line 27
    .line 28
    iget-object v4, p0, Led/i$q;->a:Led/i;

    .line 29
    .line 30
    const/4 v8, 0x0

    .line 31
    invoke-direct/range {v3 .. v8}, Led/i$b;-><init>(Led/i;Ljava/lang/String;Ljava/lang/String;Lexpo/modules/securestore/SecureStoreOptions;LZd/e;)V

    .line 32
    .line 33
    .line 34
    const/4 p1, 0x0

    .line 35
    invoke-static {p1, v3, v1, p1}, LGf/i;->f(LZd/i;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    sget-object p1, LTd/L;->a:LTd/L;

    .line 39
    .line 40
    return-object p1

    .line 41
    :cond_0
    new-instance p1, Led/h;

    .line 42
    .line 43
    invoke-direct {p1}, Led/h;-><init>()V

    .line 44
    .line 45
    .line 46
    throw p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, [Ljava/lang/Object;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Led/i$q;->a([Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

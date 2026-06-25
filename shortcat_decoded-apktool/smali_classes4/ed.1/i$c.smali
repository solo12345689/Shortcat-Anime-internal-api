.class final Led/i$c;
.super Lkotlin/coroutines/jvm/internal/l;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Led/i;->n()Lgc/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field final synthetic b:Led/i;

.field final synthetic c:Ljava/lang/String;

.field final synthetic d:Lexpo/modules/securestore/SecureStoreOptions;


# direct methods
.method constructor <init>(Led/i;Ljava/lang/String;Lexpo/modules/securestore/SecureStoreOptions;LZd/e;)V
    .locals 0

    .line 1
    iput-object p1, p0, Led/i$c;->b:Led/i;

    .line 2
    .line 3
    iput-object p2, p0, Led/i$c;->c:Ljava/lang/String;

    .line 4
    .line 5
    iput-object p3, p0, Led/i$c;->d:Lexpo/modules/securestore/SecureStoreOptions;

    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILZd/e;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;LZd/e;)LZd/e;
    .locals 3

    .line 1
    new-instance p1, Led/i$c;

    .line 2
    .line 3
    iget-object v0, p0, Led/i$c;->b:Led/i;

    .line 4
    .line 5
    iget-object v1, p0, Led/i$c;->c:Ljava/lang/String;

    .line 6
    .line 7
    iget-object v2, p0, Led/i$c;->d:Lexpo/modules/securestore/SecureStoreOptions;

    .line 8
    .line 9
    invoke-direct {p1, v0, v1, v2, p2}, Led/i$c;-><init>(Led/i;Ljava/lang/String;Lexpo/modules/securestore/SecureStoreOptions;LZd/e;)V

    .line 10
    .line 11
    .line 12
    return-object p1
.end method

.method public final invoke(LGf/O;LZd/e;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Led/i$c;->create(Ljava/lang/Object;LZd/e;)LZd/e;

    move-result-object p1

    check-cast p1, Led/i$c;

    sget-object p2, LTd/L;->a:LTd/L;

    invoke-virtual {p1, p2}, Led/i$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, LGf/O;

    check-cast p2, LZd/e;

    invoke-virtual {p0, p1, p2}, Led/i$c;->invoke(LGf/O;LZd/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    invoke-static {}, Lae/b;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Led/i$c;->a:I

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    if-eqz v1, :cond_1

    .line 9
    .line 10
    if-ne v1, v2, :cond_0

    .line 11
    .line 12
    invoke-static {p1}, LTd/v;->b(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    return-object p1

    .line 16
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 17
    .line 18
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 19
    .line 20
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    throw p1

    .line 24
    :cond_1
    invoke-static {p1}, LTd/v;->b(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    iget-object p1, p0, Led/i$c;->b:Led/i;

    .line 28
    .line 29
    iget-object v1, p0, Led/i$c;->c:Ljava/lang/String;

    .line 30
    .line 31
    iget-object v3, p0, Led/i$c;->d:Lexpo/modules/securestore/SecureStoreOptions;

    .line 32
    .line 33
    iput v2, p0, Led/i$c;->a:I

    .line 34
    .line 35
    invoke-static {p1, v1, v3, p0}, Led/i;->z(Led/i;Ljava/lang/String;Lexpo/modules/securestore/SecureStoreOptions;LZd/e;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    if-ne p1, v0, :cond_2

    .line 40
    .line 41
    return-object v0

    .line 42
    :cond_2
    return-object p1
.end method

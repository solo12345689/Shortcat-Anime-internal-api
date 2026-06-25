.class final Led/i$b;
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

.field final synthetic d:Ljava/lang/String;

.field final synthetic e:Lexpo/modules/securestore/SecureStoreOptions;


# direct methods
.method constructor <init>(Led/i;Ljava/lang/String;Ljava/lang/String;Lexpo/modules/securestore/SecureStoreOptions;LZd/e;)V
    .locals 0

    .line 1
    iput-object p1, p0, Led/i$b;->b:Led/i;

    .line 2
    .line 3
    iput-object p2, p0, Led/i$b;->c:Ljava/lang/String;

    .line 4
    .line 5
    iput-object p3, p0, Led/i$b;->d:Ljava/lang/String;

    .line 6
    .line 7
    iput-object p4, p0, Led/i$b;->e:Lexpo/modules/securestore/SecureStoreOptions;

    .line 8
    .line 9
    const/4 p1, 0x2

    .line 10
    invoke-direct {p0, p1, p5}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILZd/e;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;LZd/e;)LZd/e;
    .locals 6

    .line 1
    new-instance v0, Led/i$b;

    .line 2
    .line 3
    iget-object v1, p0, Led/i$b;->b:Led/i;

    .line 4
    .line 5
    iget-object v2, p0, Led/i$b;->c:Ljava/lang/String;

    .line 6
    .line 7
    iget-object v3, p0, Led/i$b;->d:Ljava/lang/String;

    .line 8
    .line 9
    iget-object v4, p0, Led/i$b;->e:Lexpo/modules/securestore/SecureStoreOptions;

    .line 10
    .line 11
    move-object v5, p2

    .line 12
    invoke-direct/range {v0 .. v5}, Led/i$b;-><init>(Led/i;Ljava/lang/String;Ljava/lang/String;Lexpo/modules/securestore/SecureStoreOptions;LZd/e;)V

    .line 13
    .line 14
    .line 15
    return-object v0
.end method

.method public final invoke(LGf/O;LZd/e;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Led/i$b;->create(Ljava/lang/Object;LZd/e;)LZd/e;

    move-result-object p1

    check-cast p1, Led/i$b;

    sget-object p2, LTd/L;->a:LTd/L;

    invoke-virtual {p1, p2}, Led/i$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, LGf/O;

    check-cast p2, LZd/e;

    invoke-virtual {p0, p1, p2}, Led/i$b;->invoke(LGf/O;LZd/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    invoke-static {}, Lae/b;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Led/i$b;->a:I

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
    goto :goto_0

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
    iget-object v1, p0, Led/i$b;->b:Led/i;

    .line 28
    .line 29
    move p1, v2

    .line 30
    iget-object v2, p0, Led/i$b;->c:Ljava/lang/String;

    .line 31
    .line 32
    iget-object v3, p0, Led/i$b;->d:Ljava/lang/String;

    .line 33
    .line 34
    iget-object v4, p0, Led/i$b;->e:Lexpo/modules/securestore/SecureStoreOptions;

    .line 35
    .line 36
    iput p1, p0, Led/i$b;->a:I

    .line 37
    .line 38
    const/4 v5, 0x0

    .line 39
    move-object v6, p0

    .line 40
    invoke-static/range {v1 .. v6}, Led/i;->E(Led/i;Ljava/lang/String;Ljava/lang/String;Lexpo/modules/securestore/SecureStoreOptions;ZLZd/e;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    if-ne p1, v0, :cond_2

    .line 45
    .line 46
    return-object v0

    .line 47
    :cond_2
    :goto_0
    sget-object p1, LTd/L;->a:LTd/L;

    .line 48
    .line 49
    return-object p1
.end method

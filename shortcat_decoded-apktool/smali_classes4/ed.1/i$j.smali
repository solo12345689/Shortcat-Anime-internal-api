.class public final Led/i$j;
.super Lkotlin/coroutines/jvm/internal/l;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lie/o;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Led/i;->n()Lgc/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field a:I

.field synthetic b:Ljava/lang/Object;

.field final synthetic c:Led/i;


# direct methods
.method public constructor <init>(LZd/e;Led/i;)V
    .locals 0

    .line 1
    iput-object p2, p0, Led/i$j;->c:Led/i;

    .line 2
    .line 3
    const/4 p2, 0x3

    .line 4
    invoke-direct {p0, p2, p1}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILZd/e;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final a(LGf/O;[Ljava/lang/Object;LZd/e;)Ljava/lang/Object;
    .locals 1

    .line 1
    new-instance p1, Led/i$j;

    .line 2
    .line 3
    iget-object v0, p0, Led/i$j;->c:Led/i;

    .line 4
    .line 5
    invoke-direct {p1, p3, v0}, Led/i$j;-><init>(LZd/e;Led/i;)V

    .line 6
    .line 7
    .line 8
    iput-object p2, p1, Led/i$j;->b:Ljava/lang/Object;

    .line 9
    .line 10
    sget-object p2, LTd/L;->a:LTd/L;

    .line 11
    .line 12
    invoke-virtual {p1, p2}, Led/i$j;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, LGf/O;

    .line 2
    .line 3
    check-cast p2, [Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p3, LZd/e;

    .line 6
    .line 7
    invoke-virtual {p0, p1, p2, p3}, Led/i$j;->a(LGf/O;[Ljava/lang/Object;LZd/e;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    invoke-static {}, Lae/b;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Led/i$j;->a:I

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
    iget-object p1, p0, Led/i$j;->b:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast p1, [Ljava/lang/Object;

    .line 30
    .line 31
    const/4 v1, 0x0

    .line 32
    aget-object v1, p1, v1

    .line 33
    .line 34
    aget-object v3, p1, v2

    .line 35
    .line 36
    const/4 v4, 0x2

    .line 37
    aget-object p1, p1, v4

    .line 38
    .line 39
    move-object v7, p1

    .line 40
    check-cast v7, Lexpo/modules/securestore/SecureStoreOptions;

    .line 41
    .line 42
    move-object v5, v3

    .line 43
    check-cast v5, Ljava/lang/String;

    .line 44
    .line 45
    move-object v6, v1

    .line 46
    check-cast v6, Ljava/lang/String;

    .line 47
    .line 48
    if-eqz v5, :cond_3

    .line 49
    .line 50
    iget-object v4, p0, Led/i$j;->c:Led/i;

    .line 51
    .line 52
    iput v2, p0, Led/i$j;->a:I

    .line 53
    .line 54
    const/4 v8, 0x0

    .line 55
    move-object v9, p0

    .line 56
    invoke-static/range {v4 .. v9}, Led/i;->E(Led/i;Ljava/lang/String;Ljava/lang/String;Lexpo/modules/securestore/SecureStoreOptions;ZLZd/e;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    if-ne p1, v0, :cond_2

    .line 61
    .line 62
    return-object v0

    .line 63
    :cond_2
    :goto_0
    sget-object p1, LTd/L;->a:LTd/L;

    .line 64
    .line 65
    return-object p1

    .line 66
    :cond_3
    new-instance p1, Led/h;

    .line 67
    .line 68
    invoke-direct {p1}, Led/h;-><init>()V

    .line 69
    .line 70
    .line 71
    throw p1
.end method

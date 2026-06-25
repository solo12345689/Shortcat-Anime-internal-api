.class final Lc4/i$a;
.super Lkotlin/coroutines/jvm/internal/l;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lc4/i;->a(Landroid/content/Context;)LJf/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field private synthetic b:Ljava/lang/Object;

.field final synthetic c:Lc4/i;

.field final synthetic d:Landroid/content/Context;


# direct methods
.method constructor <init>(Lc4/i;Landroid/content/Context;LZd/e;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lc4/i$a;->c:Lc4/i;

    .line 2
    .line 3
    iput-object p2, p0, Lc4/i$a;->d:Landroid/content/Context;

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILZd/e;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public static synthetic a(LIf/u;Lc4/j;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lc4/i$a;->k(LIf/u;Lc4/j;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static final k(LIf/u;Lc4/j;)V
    .locals 0

    .line 1
    invoke-interface {p0, p1}, LIf/w;->d(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;LZd/e;)LZd/e;
    .locals 3

    .line 1
    new-instance v0, Lc4/i$a;

    .line 2
    .line 3
    iget-object v1, p0, Lc4/i$a;->c:Lc4/i;

    .line 4
    .line 5
    iget-object v2, p0, Lc4/i$a;->d:Landroid/content/Context;

    .line 6
    .line 7
    invoke-direct {v0, v1, v2, p2}, Lc4/i$a;-><init>(Lc4/i;Landroid/content/Context;LZd/e;)V

    .line 8
    .line 9
    .line 10
    iput-object p1, v0, Lc4/i$a;->b:Ljava/lang/Object;

    .line 11
    .line 12
    return-object v0
.end method

.method public final i(LIf/u;LZd/e;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lc4/i$a;->create(Ljava/lang/Object;LZd/e;)LZd/e;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lc4/i$a;

    .line 6
    .line 7
    sget-object p2, LTd/L;->a:LTd/L;

    .line 8
    .line 9
    invoke-virtual {p1, p2}, Lc4/i$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, LIf/u;

    .line 2
    .line 3
    check-cast p2, LZd/e;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lc4/i$a;->i(LIf/u;LZd/e;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    invoke-static {}, Lae/b;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lc4/i$a;->a:I

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
    iget-object p1, p0, Lc4/i$a;->b:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast p1, LIf/u;

    .line 30
    .line 31
    new-instance v1, Lc4/h;

    .line 32
    .line 33
    invoke-direct {v1, p1}, Lc4/h;-><init>(LIf/u;)V

    .line 34
    .line 35
    .line 36
    iget-object v3, p0, Lc4/i$a;->c:Lc4/i;

    .line 37
    .line 38
    invoke-static {v3}, Lc4/i;->b(Lc4/i;)Ld4/a;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    iget-object v4, p0, Lc4/i$a;->d:Landroid/content/Context;

    .line 43
    .line 44
    new-instance v5, Landroidx/privacysandbox/ads/adservices/measurement/k;

    .line 45
    .line 46
    invoke-direct {v5}, Landroidx/privacysandbox/ads/adservices/measurement/k;-><init>()V

    .line 47
    .line 48
    .line 49
    invoke-interface {v3, v4, v5, v1}, Ld4/a;->b(Landroid/content/Context;Ljava/util/concurrent/Executor;LK1/a;)V

    .line 50
    .line 51
    .line 52
    new-instance v3, Lc4/i$a$a;

    .line 53
    .line 54
    iget-object v4, p0, Lc4/i$a;->c:Lc4/i;

    .line 55
    .line 56
    invoke-direct {v3, v4, v1}, Lc4/i$a$a;-><init>(Lc4/i;LK1/a;)V

    .line 57
    .line 58
    .line 59
    iput v2, p0, Lc4/i$a;->a:I

    .line 60
    .line 61
    invoke-static {p1, v3, p0}, LIf/s;->a(LIf/u;Lie/a;LZd/e;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    if-ne p1, v0, :cond_2

    .line 66
    .line 67
    return-object v0

    .line 68
    :cond_2
    :goto_0
    sget-object p1, LTd/L;->a:LTd/L;

    .line 69
    .line 70
    return-object p1
.end method

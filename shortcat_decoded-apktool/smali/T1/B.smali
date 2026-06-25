.class public final LT1/B;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field private final a:LGf/O;

.field private final b:Lkotlin/jvm/functions/Function2;

.field private final c:LIf/g;

.field private final d:LT1/b;


# direct methods
.method public constructor <init>(LGf/O;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;)V
    .locals 2

    .line 1
    const-string v0, "scope"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "onComplete"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "onUndeliveredElement"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "consumeMessage"

    .line 17
    .line 18
    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    .line 23
    .line 24
    iput-object p1, p0, LT1/B;->a:LGf/O;

    .line 25
    .line 26
    iput-object p4, p0, LT1/B;->b:Lkotlin/jvm/functions/Function2;

    .line 27
    .line 28
    const/4 p4, 0x0

    .line 29
    const/4 v0, 0x6

    .line 30
    const v1, 0x7fffffff

    .line 31
    .line 32
    .line 33
    invoke-static {v1, p4, p4, v0, p4}, LIf/j;->b(ILIf/a;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)LIf/g;

    .line 34
    .line 35
    .line 36
    move-result-object p4

    .line 37
    iput-object p4, p0, LT1/B;->c:LIf/g;

    .line 38
    .line 39
    new-instance p4, LT1/b;

    .line 40
    .line 41
    const/4 v0, 0x0

    .line 42
    invoke-direct {p4, v0}, LT1/b;-><init>(I)V

    .line 43
    .line 44
    .line 45
    iput-object p4, p0, LT1/B;->d:LT1/b;

    .line 46
    .line 47
    invoke-interface {p1}, LGf/O;->getCoroutineContext()LZd/i;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    sget-object p4, LGf/C0;->K:LGf/C0$b;

    .line 52
    .line 53
    invoke-interface {p1, p4}, LZd/i;->l(LZd/i$c;)LZd/i$b;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    check-cast p1, LGf/C0;

    .line 58
    .line 59
    if-eqz p1, :cond_0

    .line 60
    .line 61
    new-instance p4, LT1/B$a;

    .line 62
    .line 63
    invoke-direct {p4, p2, p0, p3}, LT1/B$a;-><init>(Lkotlin/jvm/functions/Function1;LT1/B;Lkotlin/jvm/functions/Function2;)V

    .line 64
    .line 65
    .line 66
    invoke-interface {p1, p4}, LGf/C0;->H(Lkotlin/jvm/functions/Function1;)LGf/h0;

    .line 67
    .line 68
    .line 69
    :cond_0
    return-void
.end method

.method public static final synthetic a(LT1/B;)Lkotlin/jvm/functions/Function2;
    .locals 0

    .line 1
    iget-object p0, p0, LT1/B;->b:Lkotlin/jvm/functions/Function2;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic b(LT1/B;)LIf/g;
    .locals 0

    .line 1
    iget-object p0, p0, LT1/B;->c:LIf/g;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic c(LT1/B;)LT1/b;
    .locals 0

    .line 1
    iget-object p0, p0, LT1/B;->d:LT1/b;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic d(LT1/B;)LGf/O;
    .locals 0

    .line 1
    iget-object p0, p0, LT1/B;->a:LGf/O;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public final e(Ljava/lang/Object;)V
    .locals 6

    .line 1
    iget-object v0, p0, LT1/B;->c:LIf/g;

    .line 2
    .line 3
    invoke-interface {v0, p1}, LIf/w;->d(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    instance-of v0, p1, LIf/k$a;

    .line 8
    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    invoke-static {p1}, LIf/k;->e(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    if-nez p1, :cond_0

    .line 16
    .line 17
    new-instance p1, LIf/q;

    .line 18
    .line 19
    const-string v0, "Channel was closed normally"

    .line 20
    .line 21
    invoke-direct {p1, v0}, LIf/q;-><init>(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    :cond_0
    throw p1

    .line 25
    :cond_1
    invoke-static {p1}, LIf/k;->i(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    if-eqz p1, :cond_3

    .line 30
    .line 31
    iget-object p1, p0, LT1/B;->d:LT1/b;

    .line 32
    .line 33
    invoke-virtual {p1}, LT1/b;->c()I

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    if-nez p1, :cond_2

    .line 38
    .line 39
    iget-object v0, p0, LT1/B;->a:LGf/O;

    .line 40
    .line 41
    new-instance v3, LT1/B$b;

    .line 42
    .line 43
    const/4 p1, 0x0

    .line 44
    invoke-direct {v3, p0, p1}, LT1/B$b;-><init>(LT1/B;LZd/e;)V

    .line 45
    .line 46
    .line 47
    const/4 v4, 0x3

    .line 48
    const/4 v5, 0x0

    .line 49
    const/4 v1, 0x0

    .line 50
    const/4 v2, 0x0

    .line 51
    invoke-static/range {v0 .. v5}, LGf/i;->d(LGf/O;LZd/i;LGf/Q;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)LGf/C0;

    .line 52
    .line 53
    .line 54
    :cond_2
    return-void

    .line 55
    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 56
    .line 57
    const-string v0, "Check failed."

    .line 58
    .line 59
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    throw p1
.end method

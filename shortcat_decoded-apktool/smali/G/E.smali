.class final LG/E;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lz/n;


# instance fields
.field private final a:Lz/B;

.field private final b:LG/C;


# direct methods
.method public constructor <init>(Lz/B;LG/C;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LG/E;->a:Lz/B;

    .line 5
    .line 6
    iput-object p2, p0, LG/E;->b:LG/C;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public a(Lz/u;FLZd/e;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p3, LG/E$a;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, LG/E$a;

    .line 7
    .line 8
    iget v1, v0, LG/E$a;->c:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, LG/E$a;->c:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, LG/E$a;

    .line 21
    .line 22
    invoke-direct {v0, p0, p3}, LG/E$a;-><init>(LG/E;LZd/e;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, LG/E$a;->a:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Lae/b;->f()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, LG/E$a;->c:I

    .line 32
    .line 33
    const/4 v3, 0x1

    .line 34
    if-eqz v2, :cond_2

    .line 35
    .line 36
    if-ne v2, v3, :cond_1

    .line 37
    .line 38
    invoke-static {p3}, LTd/v;->b(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 43
    .line 44
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 45
    .line 46
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    throw p1

    .line 50
    :cond_2
    invoke-static {p3}, LTd/v;->b(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    iget-object p3, p0, LG/E;->a:Lz/B;

    .line 54
    .line 55
    new-instance v2, LG/E$b;

    .line 56
    .line 57
    invoke-direct {v2, p0, p1}, LG/E$b;-><init>(LG/E;Lz/u;)V

    .line 58
    .line 59
    .line 60
    iput v3, v0, LG/E$a;->c:I

    .line 61
    .line 62
    invoke-interface {p3, p1, p2, v2, v0}, Lz/B;->b(Lz/u;FLkotlin/jvm/functions/Function1;LZd/e;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object p3

    .line 66
    if-ne p3, v1, :cond_3

    .line 67
    .line 68
    return-object v1

    .line 69
    :cond_3
    :goto_1
    check-cast p3, Ljava/lang/Number;

    .line 70
    .line 71
    invoke-virtual {p3}, Ljava/lang/Number;->floatValue()F

    .line 72
    .line 73
    .line 74
    move-result p1

    .line 75
    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/b;->c(F)Ljava/lang/Float;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    return-object p1
.end method

.method public final d()LG/C;
    .locals 1

    .line 1
    iget-object v0, p0, LG/E;->b:LG/C;

    .line 2
    .line 3
    return-object v0
.end method

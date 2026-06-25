.class final Landroidx/compose/foundation/gestures/b$b;
.super Lkotlin/coroutines/jvm/internal/l;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/gestures/b;->W1()LE0/X;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field private synthetic b:Ljava/lang/Object;

.field final synthetic c:Landroidx/compose/foundation/gestures/b;


# direct methods
.method constructor <init>(Landroidx/compose/foundation/gestures/b;LZd/e;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/compose/foundation/gestures/b$b;->c:Landroidx/compose/foundation/gestures/b;

    .line 2
    .line 3
    const/4 p1, 0x2

    .line 4
    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILZd/e;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;LZd/e;)LZd/e;
    .locals 2

    .line 1
    new-instance v0, Landroidx/compose/foundation/gestures/b$b;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/compose/foundation/gestures/b$b;->c:Landroidx/compose/foundation/gestures/b;

    .line 4
    .line 5
    invoke-direct {v0, v1, p2}, Landroidx/compose/foundation/gestures/b$b;-><init>(Landroidx/compose/foundation/gestures/b;LZd/e;)V

    .line 6
    .line 7
    .line 8
    iput-object p1, v0, Landroidx/compose/foundation/gestures/b$b;->b:Ljava/lang/Object;

    .line 9
    .line 10
    return-object v0
.end method

.method public final invoke(LE0/L;LZd/e;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Landroidx/compose/foundation/gestures/b$b;->create(Ljava/lang/Object;LZd/e;)LZd/e;

    move-result-object p1

    check-cast p1, Landroidx/compose/foundation/gestures/b$b;

    sget-object p2, LTd/L;->a:LTd/L;

    invoke-virtual {p1, p2}, Landroidx/compose/foundation/gestures/b$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, LE0/L;

    check-cast p2, LZd/e;

    invoke-virtual {p0, p1, p2}, Landroidx/compose/foundation/gestures/b$b;->invoke(LE0/L;LZd/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    invoke-static {}, Lae/b;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Landroidx/compose/foundation/gestures/b$b;->a:I

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
    iget-object p1, p0, Landroidx/compose/foundation/gestures/b$b;->b:Ljava/lang/Object;

    .line 28
    .line 29
    move-object v5, p1

    .line 30
    check-cast v5, LE0/L;

    .line 31
    .line 32
    new-instance p1, LF0/d;

    .line 33
    .line 34
    invoke-direct {p1}, LF0/d;-><init>()V

    .line 35
    .line 36
    .line 37
    new-instance v6, Landroidx/compose/foundation/gestures/b$b$e;

    .line 38
    .line 39
    iget-object v1, p0, Landroidx/compose/foundation/gestures/b$b;->c:Landroidx/compose/foundation/gestures/b;

    .line 40
    .line 41
    invoke-direct {v6, v1, p1}, Landroidx/compose/foundation/gestures/b$b$e;-><init>(Landroidx/compose/foundation/gestures/b;LF0/d;)V

    .line 42
    .line 43
    .line 44
    new-instance v7, Landroidx/compose/foundation/gestures/b$b$d;

    .line 45
    .line 46
    iget-object v1, p0, Landroidx/compose/foundation/gestures/b$b;->c:Landroidx/compose/foundation/gestures/b;

    .line 47
    .line 48
    invoke-direct {v7, p1, v1}, Landroidx/compose/foundation/gestures/b$b$d;-><init>(LF0/d;Landroidx/compose/foundation/gestures/b;)V

    .line 49
    .line 50
    .line 51
    new-instance v8, Landroidx/compose/foundation/gestures/b$b$c;

    .line 52
    .line 53
    iget-object v1, p0, Landroidx/compose/foundation/gestures/b$b;->c:Landroidx/compose/foundation/gestures/b;

    .line 54
    .line 55
    invoke-direct {v8, v1}, Landroidx/compose/foundation/gestures/b$b$c;-><init>(Landroidx/compose/foundation/gestures/b;)V

    .line 56
    .line 57
    .line 58
    new-instance v9, Landroidx/compose/foundation/gestures/b$b$f;

    .line 59
    .line 60
    iget-object v1, p0, Landroidx/compose/foundation/gestures/b$b;->c:Landroidx/compose/foundation/gestures/b;

    .line 61
    .line 62
    invoke-direct {v9, v1}, Landroidx/compose/foundation/gestures/b$b$f;-><init>(Landroidx/compose/foundation/gestures/b;)V

    .line 63
    .line 64
    .line 65
    new-instance v10, Landroidx/compose/foundation/gestures/b$b$b;

    .line 66
    .line 67
    iget-object v1, p0, Landroidx/compose/foundation/gestures/b$b;->c:Landroidx/compose/foundation/gestures/b;

    .line 68
    .line 69
    invoke-direct {v10, p1, v1}, Landroidx/compose/foundation/gestures/b$b$b;-><init>(LF0/d;Landroidx/compose/foundation/gestures/b;)V

    .line 70
    .line 71
    .line 72
    new-instance v3, Landroidx/compose/foundation/gestures/b$b$a;

    .line 73
    .line 74
    iget-object v4, p0, Landroidx/compose/foundation/gestures/b$b;->c:Landroidx/compose/foundation/gestures/b;

    .line 75
    .line 76
    const/4 v11, 0x0

    .line 77
    invoke-direct/range {v3 .. v11}, Landroidx/compose/foundation/gestures/b$b$a;-><init>(Landroidx/compose/foundation/gestures/b;LE0/L;Lie/o;Lkotlin/jvm/functions/Function1;Lie/a;Lie/a;Lkotlin/jvm/functions/Function2;LZd/e;)V

    .line 78
    .line 79
    .line 80
    iput v2, p0, Landroidx/compose/foundation/gestures/b$b;->a:I

    .line 81
    .line 82
    invoke-static {v3, p0}, LGf/P;->e(Lkotlin/jvm/functions/Function2;LZd/e;)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    if-ne p1, v0, :cond_2

    .line 87
    .line 88
    return-object v0

    .line 89
    :cond_2
    :goto_0
    sget-object p1, LTd/L;->a:LTd/L;

    .line 90
    .line 91
    return-object p1
.end method

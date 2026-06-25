.class final Landroidx/compose/foundation/gestures/d$f;
.super Lkotlin/coroutines/jvm/internal/l;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/gestures/d;->j(Lz/z;JLZd/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field private synthetic b:Ljava/lang/Object;

.field final synthetic c:Lz/z;

.field final synthetic d:J

.field final synthetic e:Lkotlin/jvm/internal/K;


# direct methods
.method constructor <init>(Lz/z;JLkotlin/jvm/internal/K;LZd/e;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/compose/foundation/gestures/d$f;->c:Lz/z;

    .line 2
    .line 3
    iput-wide p2, p0, Landroidx/compose/foundation/gestures/d$f;->d:J

    .line 4
    .line 5
    iput-object p4, p0, Landroidx/compose/foundation/gestures/d$f;->e:Lkotlin/jvm/internal/K;

    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    invoke-direct {p0, p1, p5}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILZd/e;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final a(Lz/p;LZd/e;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Landroidx/compose/foundation/gestures/d$f;->create(Ljava/lang/Object;LZd/e;)LZd/e;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Landroidx/compose/foundation/gestures/d$f;

    .line 6
    .line 7
    sget-object p2, LTd/L;->a:LTd/L;

    .line 8
    .line 9
    invoke-virtual {p1, p2}, Landroidx/compose/foundation/gestures/d$f;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1
.end method

.method public final create(Ljava/lang/Object;LZd/e;)LZd/e;
    .locals 6

    .line 1
    new-instance v0, Landroidx/compose/foundation/gestures/d$f;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/compose/foundation/gestures/d$f;->c:Lz/z;

    .line 4
    .line 5
    iget-wide v2, p0, Landroidx/compose/foundation/gestures/d$f;->d:J

    .line 6
    .line 7
    iget-object v4, p0, Landroidx/compose/foundation/gestures/d$f;->e:Lkotlin/jvm/internal/K;

    .line 8
    .line 9
    move-object v5, p2

    .line 10
    invoke-direct/range {v0 .. v5}, Landroidx/compose/foundation/gestures/d$f;-><init>(Lz/z;JLkotlin/jvm/internal/K;LZd/e;)V

    .line 11
    .line 12
    .line 13
    iput-object p1, v0, Landroidx/compose/foundation/gestures/d$f;->b:Ljava/lang/Object;

    .line 14
    .line 15
    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lz/p;

    .line 2
    .line 3
    check-cast p2, LZd/e;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Landroidx/compose/foundation/gestures/d$f;->a(Lz/p;LZd/e;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    invoke-static {}, Lae/b;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Landroidx/compose/foundation/gestures/d$f;->a:I

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
    iget-object p1, p0, Landroidx/compose/foundation/gestures/d$f;->b:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast p1, Lz/p;

    .line 30
    .line 31
    iget-object v1, p0, Landroidx/compose/foundation/gestures/d$f;->c:Lz/z;

    .line 32
    .line 33
    iget-wide v3, p0, Landroidx/compose/foundation/gestures/d$f;->d:J

    .line 34
    .line 35
    invoke-virtual {v1, v3, v4}, Lz/z;->A(J)F

    .line 36
    .line 37
    .line 38
    move-result v6

    .line 39
    new-instance v9, Landroidx/compose/foundation/gestures/d$f$a;

    .line 40
    .line 41
    iget-object v1, p0, Landroidx/compose/foundation/gestures/d$f;->e:Lkotlin/jvm/internal/K;

    .line 42
    .line 43
    iget-object v3, p0, Landroidx/compose/foundation/gestures/d$f;->c:Lz/z;

    .line 44
    .line 45
    invoke-direct {v9, v1, v3, p1}, Landroidx/compose/foundation/gestures/d$f$a;-><init>(Lkotlin/jvm/internal/K;Lz/z;Lz/p;)V

    .line 46
    .line 47
    .line 48
    iput v2, p0, Landroidx/compose/foundation/gestures/d$f;->a:I

    .line 49
    .line 50
    const/4 v5, 0x0

    .line 51
    const/4 v7, 0x0

    .line 52
    const/4 v8, 0x0

    .line 53
    const/16 v11, 0xc

    .line 54
    .line 55
    const/4 v12, 0x0

    .line 56
    move-object v10, p0

    .line 57
    invoke-static/range {v5 .. v12}, Lw/m0;->e(FFFLw/i;Lkotlin/jvm/functions/Function2;LZd/e;ILjava/lang/Object;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    if-ne p1, v0, :cond_2

    .line 62
    .line 63
    return-object v0

    .line 64
    :cond_2
    :goto_0
    sget-object p1, LTd/L;->a:LTd/L;

    .line 65
    .line 66
    return-object p1
.end method

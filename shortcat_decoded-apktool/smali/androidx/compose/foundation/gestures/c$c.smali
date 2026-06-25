.class final Landroidx/compose/foundation/gestures/c$c;
.super Lkotlin/coroutines/jvm/internal/l;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/gestures/c;->Y1(J)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field private synthetic b:Ljava/lang/Object;

.field final synthetic c:Landroidx/compose/foundation/gestures/c;

.field final synthetic d:J


# direct methods
.method constructor <init>(Landroidx/compose/foundation/gestures/c;JLZd/e;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/compose/foundation/gestures/c$c;->c:Landroidx/compose/foundation/gestures/c;

    .line 2
    .line 3
    iput-wide p2, p0, Landroidx/compose/foundation/gestures/c$c;->d:J

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILZd/e;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;LZd/e;)LZd/e;
    .locals 4

    .line 1
    new-instance v0, Landroidx/compose/foundation/gestures/c$c;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/compose/foundation/gestures/c$c;->c:Landroidx/compose/foundation/gestures/c;

    .line 4
    .line 5
    iget-wide v2, p0, Landroidx/compose/foundation/gestures/c$c;->d:J

    .line 6
    .line 7
    invoke-direct {v0, v1, v2, v3, p2}, Landroidx/compose/foundation/gestures/c$c;-><init>(Landroidx/compose/foundation/gestures/c;JLZd/e;)V

    .line 8
    .line 9
    .line 10
    iput-object p1, v0, Landroidx/compose/foundation/gestures/c$c;->b:Ljava/lang/Object;

    .line 11
    .line 12
    return-object v0
.end method

.method public final invoke(LGf/O;LZd/e;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Landroidx/compose/foundation/gestures/c$c;->create(Ljava/lang/Object;LZd/e;)LZd/e;

    move-result-object p1

    check-cast p1, Landroidx/compose/foundation/gestures/c$c;

    sget-object p2, LTd/L;->a:LTd/L;

    invoke-virtual {p1, p2}, Landroidx/compose/foundation/gestures/c$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, LGf/O;

    check-cast p2, LZd/e;

    invoke-virtual {p0, p1, p2}, Landroidx/compose/foundation/gestures/c$c;->invoke(LGf/O;LZd/e;)Ljava/lang/Object;

    move-result-object p1

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
    iget v1, p0, Landroidx/compose/foundation/gestures/c$c;->a:I

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
    iget-object p1, p0, Landroidx/compose/foundation/gestures/c$c;->b:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast p1, LGf/O;

    .line 30
    .line 31
    iget-object v1, p0, Landroidx/compose/foundation/gestures/c$c;->c:Landroidx/compose/foundation/gestures/c;

    .line 32
    .line 33
    invoke-static {v1}, Landroidx/compose/foundation/gestures/c;->g2(Landroidx/compose/foundation/gestures/c;)Lie/o;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    iget-object v3, p0, Landroidx/compose/foundation/gestures/c$c;->c:Landroidx/compose/foundation/gestures/c;

    .line 38
    .line 39
    iget-wide v4, p0, Landroidx/compose/foundation/gestures/c$c;->d:J

    .line 40
    .line 41
    invoke-static {v3, v4, v5}, Landroidx/compose/foundation/gestures/c;->i2(Landroidx/compose/foundation/gestures/c;J)J

    .line 42
    .line 43
    .line 44
    move-result-wide v3

    .line 45
    iget-object v5, p0, Landroidx/compose/foundation/gestures/c$c;->c:Landroidx/compose/foundation/gestures/c;

    .line 46
    .line 47
    invoke-static {v5}, Landroidx/compose/foundation/gestures/c;->h2(Landroidx/compose/foundation/gestures/c;)Lz/q;

    .line 48
    .line 49
    .line 50
    move-result-object v5

    .line 51
    invoke-static {v3, v4, v5}, Lz/l;->e(JLz/q;)F

    .line 52
    .line 53
    .line 54
    move-result v3

    .line 55
    invoke-static {v3}, Lkotlin/coroutines/jvm/internal/b;->c(F)Ljava/lang/Float;

    .line 56
    .line 57
    .line 58
    move-result-object v3

    .line 59
    iput v2, p0, Landroidx/compose/foundation/gestures/c$c;->a:I

    .line 60
    .line 61
    invoke-interface {v1, p1, v3, p0}, Lie/o;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

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

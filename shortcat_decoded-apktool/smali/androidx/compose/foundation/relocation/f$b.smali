.class final Landroidx/compose/foundation/relocation/f$b;
.super Lkotlin/coroutines/jvm/internal/l;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/relocation/f;->o1(LI0/p;Lie/a;LZd/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field private synthetic b:Ljava/lang/Object;

.field final synthetic c:Landroidx/compose/foundation/relocation/f;

.field final synthetic d:LI0/p;

.field final synthetic e:Lie/a;

.field final synthetic f:Lie/a;


# direct methods
.method constructor <init>(Landroidx/compose/foundation/relocation/f;LI0/p;Lie/a;Lie/a;LZd/e;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/compose/foundation/relocation/f$b;->c:Landroidx/compose/foundation/relocation/f;

    .line 2
    .line 3
    iput-object p2, p0, Landroidx/compose/foundation/relocation/f$b;->d:LI0/p;

    .line 4
    .line 5
    iput-object p3, p0, Landroidx/compose/foundation/relocation/f$b;->e:Lie/a;

    .line 6
    .line 7
    iput-object p4, p0, Landroidx/compose/foundation/relocation/f$b;->f:Lie/a;

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
    new-instance v0, Landroidx/compose/foundation/relocation/f$b;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/compose/foundation/relocation/f$b;->c:Landroidx/compose/foundation/relocation/f;

    .line 4
    .line 5
    iget-object v2, p0, Landroidx/compose/foundation/relocation/f$b;->d:LI0/p;

    .line 6
    .line 7
    iget-object v3, p0, Landroidx/compose/foundation/relocation/f$b;->e:Lie/a;

    .line 8
    .line 9
    iget-object v4, p0, Landroidx/compose/foundation/relocation/f$b;->f:Lie/a;

    .line 10
    .line 11
    move-object v5, p2

    .line 12
    invoke-direct/range {v0 .. v5}, Landroidx/compose/foundation/relocation/f$b;-><init>(Landroidx/compose/foundation/relocation/f;LI0/p;Lie/a;Lie/a;LZd/e;)V

    .line 13
    .line 14
    .line 15
    iput-object p1, v0, Landroidx/compose/foundation/relocation/f$b;->b:Ljava/lang/Object;

    .line 16
    .line 17
    return-object v0
.end method

.method public final invoke(LGf/O;LZd/e;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Landroidx/compose/foundation/relocation/f$b;->create(Ljava/lang/Object;LZd/e;)LZd/e;

    move-result-object p1

    check-cast p1, Landroidx/compose/foundation/relocation/f$b;

    sget-object p2, LTd/L;->a:LTd/L;

    invoke-virtual {p1, p2}, Landroidx/compose/foundation/relocation/f$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, LGf/O;

    check-cast p2, LZd/e;

    invoke-virtual {p0, p1, p2}, Landroidx/compose/foundation/relocation/f$b;->invoke(LGf/O;LZd/e;)Ljava/lang/Object;

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
    iget v0, p0, Landroidx/compose/foundation/relocation/f$b;->a:I

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    invoke-static {p1}, LTd/v;->b(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Landroidx/compose/foundation/relocation/f$b;->b:Ljava/lang/Object;

    .line 12
    .line 13
    move-object v0, p1

    .line 14
    check-cast v0, LGf/O;

    .line 15
    .line 16
    new-instance v3, Landroidx/compose/foundation/relocation/f$b$a;

    .line 17
    .line 18
    iget-object p1, p0, Landroidx/compose/foundation/relocation/f$b;->c:Landroidx/compose/foundation/relocation/f;

    .line 19
    .line 20
    iget-object v1, p0, Landroidx/compose/foundation/relocation/f$b;->d:LI0/p;

    .line 21
    .line 22
    iget-object v2, p0, Landroidx/compose/foundation/relocation/f$b;->e:Lie/a;

    .line 23
    .line 24
    const/4 v6, 0x0

    .line 25
    invoke-direct {v3, p1, v1, v2, v6}, Landroidx/compose/foundation/relocation/f$b$a;-><init>(Landroidx/compose/foundation/relocation/f;LI0/p;Lie/a;LZd/e;)V

    .line 26
    .line 27
    .line 28
    const/4 v4, 0x3

    .line 29
    const/4 v5, 0x0

    .line 30
    const/4 v1, 0x0

    .line 31
    const/4 v2, 0x0

    .line 32
    invoke-static/range {v0 .. v5}, LGf/i;->d(LGf/O;LZd/i;LGf/Q;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)LGf/C0;

    .line 33
    .line 34
    .line 35
    new-instance v3, Landroidx/compose/foundation/relocation/f$b$b;

    .line 36
    .line 37
    iget-object p1, p0, Landroidx/compose/foundation/relocation/f$b;->c:Landroidx/compose/foundation/relocation/f;

    .line 38
    .line 39
    iget-object v1, p0, Landroidx/compose/foundation/relocation/f$b;->f:Lie/a;

    .line 40
    .line 41
    invoke-direct {v3, p1, v1, v6}, Landroidx/compose/foundation/relocation/f$b$b;-><init>(Landroidx/compose/foundation/relocation/f;Lie/a;LZd/e;)V

    .line 42
    .line 43
    .line 44
    const/4 v1, 0x0

    .line 45
    invoke-static/range {v0 .. v5}, LGf/i;->d(LGf/O;LZd/i;LGf/Q;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)LGf/C0;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    return-object p1

    .line 50
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 51
    .line 52
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 53
    .line 54
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    throw p1
.end method

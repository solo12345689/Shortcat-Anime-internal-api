.class final LK/T$a$b;
.super Lkotlin/coroutines/jvm/internal/l;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LK/T$a;->a(Landroidx/compose/ui/e;LY/m;I)Landroidx/compose/ui/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field private synthetic b:Ljava/lang/Object;

.field final synthetic c:LGf/O;

.field final synthetic d:LY/C0;

.field final synthetic e:LB/m;

.field final synthetic f:LY/h2;


# direct methods
.method constructor <init>(LGf/O;LY/C0;LB/m;LY/h2;LZd/e;)V
    .locals 0

    .line 1
    iput-object p1, p0, LK/T$a$b;->c:LGf/O;

    .line 2
    .line 3
    iput-object p2, p0, LK/T$a$b;->d:LY/C0;

    .line 4
    .line 5
    iput-object p3, p0, LK/T$a$b;->e:LB/m;

    .line 6
    .line 7
    iput-object p4, p0, LK/T$a$b;->f:LY/h2;

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
    new-instance v0, LK/T$a$b;

    .line 2
    .line 3
    iget-object v1, p0, LK/T$a$b;->c:LGf/O;

    .line 4
    .line 5
    iget-object v2, p0, LK/T$a$b;->d:LY/C0;

    .line 6
    .line 7
    iget-object v3, p0, LK/T$a$b;->e:LB/m;

    .line 8
    .line 9
    iget-object v4, p0, LK/T$a$b;->f:LY/h2;

    .line 10
    .line 11
    move-object v5, p2

    .line 12
    invoke-direct/range {v0 .. v5}, LK/T$a$b;-><init>(LGf/O;LY/C0;LB/m;LY/h2;LZd/e;)V

    .line 13
    .line 14
    .line 15
    iput-object p1, v0, LK/T$a$b;->b:Ljava/lang/Object;

    .line 16
    .line 17
    return-object v0
.end method

.method public final invoke(LE0/L;LZd/e;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, LK/T$a$b;->create(Ljava/lang/Object;LZd/e;)LZd/e;

    move-result-object p1

    check-cast p1, LK/T$a$b;

    sget-object p2, LTd/L;->a:LTd/L;

    invoke-virtual {p1, p2}, LK/T$a$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, LE0/L;

    check-cast p2, LZd/e;

    invoke-virtual {p0, p1, p2}, LK/T$a$b;->invoke(LE0/L;LZd/e;)Ljava/lang/Object;

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
    iget v1, p0, LK/T$a$b;->a:I

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
    iget-object p1, p0, LK/T$a$b;->b:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast p1, LE0/L;

    .line 30
    .line 31
    new-instance v1, LK/T$a$b$a;

    .line 32
    .line 33
    iget-object v3, p0, LK/T$a$b;->c:LGf/O;

    .line 34
    .line 35
    iget-object v4, p0, LK/T$a$b;->d:LY/C0;

    .line 36
    .line 37
    iget-object v5, p0, LK/T$a$b;->e:LB/m;

    .line 38
    .line 39
    const/4 v6, 0x0

    .line 40
    invoke-direct {v1, v3, v4, v5, v6}, LK/T$a$b$a;-><init>(LGf/O;LY/C0;LB/m;LZd/e;)V

    .line 41
    .line 42
    .line 43
    new-instance v3, LK/T$a$b$b;

    .line 44
    .line 45
    iget-object v4, p0, LK/T$a$b;->f:LY/h2;

    .line 46
    .line 47
    invoke-direct {v3, v4}, LK/T$a$b$b;-><init>(LY/h2;)V

    .line 48
    .line 49
    .line 50
    iput v2, p0, LK/T$a$b;->a:I

    .line 51
    .line 52
    invoke-static {p1, v1, v3, p0}, Lz/A;->h(LE0/L;Lie/o;Lkotlin/jvm/functions/Function1;LZd/e;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    if-ne p1, v0, :cond_2

    .line 57
    .line 58
    return-object v0

    .line 59
    :cond_2
    :goto_0
    sget-object p1, LTd/L;->a:LTd/L;

    .line 60
    .line 61
    return-object p1
.end method

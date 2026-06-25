.class final LK/T$a$b$a;
.super Lkotlin/coroutines/jvm/internal/l;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lie/o;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LK/T$a$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field private synthetic b:Ljava/lang/Object;

.field synthetic c:J

.field final synthetic d:LGf/O;

.field final synthetic e:LY/C0;

.field final synthetic f:LB/m;


# direct methods
.method constructor <init>(LGf/O;LY/C0;LB/m;LZd/e;)V
    .locals 0

    .line 1
    iput-object p1, p0, LK/T$a$b$a;->d:LGf/O;

    .line 2
    .line 3
    iput-object p2, p0, LK/T$a$b$a;->e:LY/C0;

    .line 4
    .line 5
    iput-object p3, p0, LK/T$a$b$a;->f:LB/m;

    .line 6
    .line 7
    const/4 p1, 0x3

    .line 8
    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILZd/e;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final a(Lz/r;JLZd/e;)Ljava/lang/Object;
    .locals 4

    .line 1
    new-instance v0, LK/T$a$b$a;

    .line 2
    .line 3
    iget-object v1, p0, LK/T$a$b$a;->d:LGf/O;

    .line 4
    .line 5
    iget-object v2, p0, LK/T$a$b$a;->e:LY/C0;

    .line 6
    .line 7
    iget-object v3, p0, LK/T$a$b$a;->f:LB/m;

    .line 8
    .line 9
    invoke-direct {v0, v1, v2, v3, p4}, LK/T$a$b$a;-><init>(LGf/O;LY/C0;LB/m;LZd/e;)V

    .line 10
    .line 11
    .line 12
    iput-object p1, v0, LK/T$a$b$a;->b:Ljava/lang/Object;

    .line 13
    .line 14
    iput-wide p2, v0, LK/T$a$b$a;->c:J

    .line 15
    .line 16
    sget-object p1, LTd/L;->a:LTd/L;

    .line 17
    .line 18
    invoke-virtual {v0, p1}, LK/T$a$b$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    check-cast p1, Lz/r;

    .line 2
    .line 3
    check-cast p2, Lr0/f;

    .line 4
    .line 5
    invoke-virtual {p2}, Lr0/f;->u()J

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    check-cast p3, LZd/e;

    .line 10
    .line 11
    invoke-virtual {p0, p1, v0, v1, p3}, LK/T$a$b$a;->a(Lz/r;JLZd/e;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
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
    iget v1, p0, LK/T$a$b$a;->a:I

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
    iget-object p1, p0, LK/T$a$b$a;->b:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast p1, Lz/r;

    .line 30
    .line 31
    iget-wide v5, p0, LK/T$a$b$a;->c:J

    .line 32
    .line 33
    iget-object v1, p0, LK/T$a$b$a;->d:LGf/O;

    .line 34
    .line 35
    new-instance v3, LK/T$a$b$a$a;

    .line 36
    .line 37
    iget-object v4, p0, LK/T$a$b$a;->e:LY/C0;

    .line 38
    .line 39
    iget-object v7, p0, LK/T$a$b$a;->f:LB/m;

    .line 40
    .line 41
    const/4 v8, 0x0

    .line 42
    invoke-direct/range {v3 .. v8}, LK/T$a$b$a$a;-><init>(LY/C0;JLB/m;LZd/e;)V

    .line 43
    .line 44
    .line 45
    const/4 v11, 0x3

    .line 46
    const/4 v12, 0x0

    .line 47
    const/4 v9, 0x0

    .line 48
    move-object v7, v1

    .line 49
    move-object v10, v3

    .line 50
    invoke-static/range {v7 .. v12}, LGf/i;->d(LGf/O;LZd/i;LGf/Q;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)LGf/C0;

    .line 51
    .line 52
    .line 53
    iput v2, p0, LK/T$a$b$a;->a:I

    .line 54
    .line 55
    invoke-interface {p1, p0}, Lz/r;->h1(LZd/e;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    if-ne p1, v0, :cond_2

    .line 60
    .line 61
    return-object v0

    .line 62
    :cond_2
    :goto_0
    check-cast p1, Ljava/lang/Boolean;

    .line 63
    .line 64
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 65
    .line 66
    .line 67
    move-result p1

    .line 68
    iget-object v0, p0, LK/T$a$b$a;->d:LGf/O;

    .line 69
    .line 70
    new-instance v3, LK/T$a$b$a$b;

    .line 71
    .line 72
    iget-object v1, p0, LK/T$a$b$a;->e:LY/C0;

    .line 73
    .line 74
    iget-object v2, p0, LK/T$a$b$a;->f:LB/m;

    .line 75
    .line 76
    const/4 v4, 0x0

    .line 77
    invoke-direct {v3, v1, p1, v2, v4}, LK/T$a$b$a$b;-><init>(LY/C0;ZLB/m;LZd/e;)V

    .line 78
    .line 79
    .line 80
    const/4 v4, 0x3

    .line 81
    const/4 v5, 0x0

    .line 82
    const/4 v1, 0x0

    .line 83
    const/4 v2, 0x0

    .line 84
    invoke-static/range {v0 .. v5}, LGf/i;->d(LGf/O;LZd/i;LGf/Q;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)LGf/C0;

    .line 85
    .line 86
    .line 87
    sget-object p1, LTd/L;->a:LTd/L;

    .line 88
    .line 89
    return-object p1
.end method

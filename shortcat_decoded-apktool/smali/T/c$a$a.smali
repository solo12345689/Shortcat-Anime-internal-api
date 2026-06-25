.class final LT/c$a$a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LJf/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LT/c$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/compose/material/ripple/d;

.field final synthetic b:LGf/O;


# direct methods
.method constructor <init>(Landroidx/compose/material/ripple/d;LGf/O;)V
    .locals 0

    .line 1
    iput-object p1, p0, LT/c$a$a;->a:Landroidx/compose/material/ripple/d;

    .line 2
    .line 3
    iput-object p2, p0, LT/c$a$a;->b:LGf/O;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a(LB/j;LZd/e;)Ljava/lang/Object;
    .locals 1

    .line 1
    instance-of p2, p1, LB/o$b;

    .line 2
    .line 3
    if-eqz p2, :cond_0

    .line 4
    .line 5
    iget-object p2, p0, LT/c$a$a;->a:Landroidx/compose/material/ripple/d;

    .line 6
    .line 7
    check-cast p1, LB/o$b;

    .line 8
    .line 9
    iget-object v0, p0, LT/c$a$a;->b:LGf/O;

    .line 10
    .line 11
    invoke-virtual {p2, p1, v0}, Landroidx/compose/material/ripple/d;->b(LB/o$b;LGf/O;)V

    .line 12
    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    instance-of p2, p1, LB/o$c;

    .line 16
    .line 17
    if-eqz p2, :cond_1

    .line 18
    .line 19
    iget-object p2, p0, LT/c$a$a;->a:Landroidx/compose/material/ripple/d;

    .line 20
    .line 21
    check-cast p1, LB/o$c;

    .line 22
    .line 23
    invoke-virtual {p1}, LB/o$c;->a()LB/o$b;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-virtual {p2, p1}, Landroidx/compose/material/ripple/d;->g(LB/o$b;)V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_1
    instance-of p2, p1, LB/o$a;

    .line 32
    .line 33
    if-eqz p2, :cond_2

    .line 34
    .line 35
    iget-object p2, p0, LT/c$a$a;->a:Landroidx/compose/material/ripple/d;

    .line 36
    .line 37
    check-cast p1, LB/o$a;

    .line 38
    .line 39
    invoke-virtual {p1}, LB/o$a;->a()LB/o$b;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    invoke-virtual {p2, p1}, Landroidx/compose/material/ripple/d;->g(LB/o$b;)V

    .line 44
    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_2
    iget-object p2, p0, LT/c$a$a;->a:Landroidx/compose/material/ripple/d;

    .line 48
    .line 49
    iget-object v0, p0, LT/c$a$a;->b:LGf/O;

    .line 50
    .line 51
    invoke-virtual {p2, p1, v0}, Landroidx/compose/material/ripple/d;->h(LB/j;LGf/O;)V

    .line 52
    .line 53
    .line 54
    :goto_0
    sget-object p1, LTd/L;->a:LTd/L;

    .line 55
    .line 56
    return-object p1
.end method

.method public bridge synthetic emit(Ljava/lang/Object;LZd/e;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, LB/j;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, LT/c$a$a;->a(LB/j;LZd/e;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

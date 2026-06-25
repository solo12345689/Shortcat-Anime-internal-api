.class public final Lw4/a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LH4/i;
.implements LI0/v;


# instance fields
.field private final b:LJf/u;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {}, Lcoil/compose/c;->c()J

    .line 5
    .line 6
    .line 7
    move-result-wide v0

    .line 8
    invoke-static {v0, v1}, Li1/b;->a(J)Li1/b;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-static {v0}, LJf/K;->a(Ljava/lang/Object;)LJf/u;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    iput-object v0, p0, Lw4/a;->b:LJf/u;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public c(LZd/e;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lw4/a;->b:LJf/u;

    .line 2
    .line 3
    new-instance v1, Lw4/a$b;

    .line 4
    .line 5
    invoke-direct {v1, v0}, Lw4/a$b;-><init>(LJf/e;)V

    .line 6
    .line 7
    .line 8
    invoke-static {v1, p1}, LJf/g;->n(LJf/e;LZd/e;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    return-object p1
.end method

.method public measure-3p2s80s(Landroidx/compose/ui/layout/l;LI0/A;J)LI0/C;
    .locals 7

    .line 1
    iget-object v0, p0, Lw4/a;->b:LJf/u;

    .line 2
    .line 3
    invoke-static {p3, p4}, Li1/b;->a(J)Li1/b;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-interface {v0, v1}, LJf/u;->setValue(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    invoke-interface {p2, p3, p4}, LI0/A;->v0(J)Landroidx/compose/ui/layout/s;

    .line 11
    .line 12
    .line 13
    move-result-object p2

    .line 14
    invoke-virtual {p2}, Landroidx/compose/ui/layout/s;->W0()I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    invoke-virtual {p2}, Landroidx/compose/ui/layout/s;->P0()I

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    new-instance v4, Lw4/a$a;

    .line 23
    .line 24
    invoke-direct {v4, p2}, Lw4/a$a;-><init>(Landroidx/compose/ui/layout/s;)V

    .line 25
    .line 26
    .line 27
    const/4 v5, 0x4

    .line 28
    const/4 v6, 0x0

    .line 29
    const/4 v3, 0x0

    .line 30
    move-object v0, p1

    .line 31
    invoke-static/range {v0 .. v6}, Landroidx/compose/ui/layout/l;->u0(Landroidx/compose/ui/layout/l;IILjava/util/Map;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)LI0/C;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    return-object p1
.end method

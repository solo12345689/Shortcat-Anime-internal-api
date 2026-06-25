.class final Landroidx/compose/ui/layout/A;
.super Landroidx/compose/ui/e$c;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LK0/E;
.implements LK0/I0;


# instance fields
.field private a:I

.field private b:Landroidx/compose/ui/layout/f;

.field private final c:Lkotlin/jvm/functions/Function1;


# direct methods
.method public constructor <init>(Landroidx/compose/ui/layout/f;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/compose/ui/e$c;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, -0x1

    .line 5
    iput v0, p0, Landroidx/compose/ui/layout/A;->a:I

    .line 6
    .line 7
    iput-object p1, p0, Landroidx/compose/ui/layout/A;->b:Landroidx/compose/ui/layout/f;

    .line 8
    .line 9
    new-instance v0, Landroidx/compose/ui/layout/A$b;

    .line 10
    .line 11
    invoke-direct {v0, p0, p1}, Landroidx/compose/ui/layout/A$b;-><init>(Landroidx/compose/ui/layout/A;Landroidx/compose/ui/layout/f;)V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, Landroidx/compose/ui/layout/A;->c:Lkotlin/jvm/functions/Function1;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public B()Ljava/lang/Object;
    .locals 1

    .line 1
    const-string v0, "androidx.compose.ui.layout.WindowInsetsRulers"

    .line 2
    .line 3
    return-object v0
.end method

.method public final E1()Lt/L;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/layout/A;->b:Landroidx/compose/ui/layout/f;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/compose/ui/layout/f;->c()Lt/L;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public final F1()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/layout/A;->b:Landroidx/compose/ui/layout/f;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/compose/ui/layout/f;->b()Li0/E;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public final G1()LY/A0;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/layout/A;->b:Landroidx/compose/ui/layout/f;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/compose/ui/layout/f;->e()LY/A0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public final H1()I
    .locals 1

    .line 1
    iget v0, p0, Landroidx/compose/ui/layout/A;->a:I

    .line 2
    .line 3
    return v0
.end method

.method public final I1(Landroidx/compose/ui/layout/f;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/layout/A;->b:Landroidx/compose/ui/layout/f;

    .line 2
    .line 3
    if-eq v0, p1, :cond_0

    .line 4
    .line 5
    iput-object p1, p0, Landroidx/compose/ui/layout/A;->b:Landroidx/compose/ui/layout/f;

    .line 6
    .line 7
    invoke-static {p0}, LK0/H;->c(LK0/E;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method public final J1(I)V
    .locals 0

    .line 1
    iput p1, p0, Landroidx/compose/ui/layout/A;->a:I

    .line 2
    .line 3
    return-void
.end method

.method public measure-3p2s80s(Landroidx/compose/ui/layout/l;LI0/A;J)LI0/C;
    .locals 8

    .line 1
    invoke-interface {p2, p3, p4}, LI0/A;->v0(J)Landroidx/compose/ui/layout/s;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    invoke-virtual {p2}, Landroidx/compose/ui/layout/s;->W0()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-virtual {p2}, Landroidx/compose/ui/layout/s;->P0()I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    iget-object v4, p0, Landroidx/compose/ui/layout/A;->c:Lkotlin/jvm/functions/Function1;

    .line 14
    .line 15
    new-instance v5, Landroidx/compose/ui/layout/A$a;

    .line 16
    .line 17
    invoke-direct {v5, p2}, Landroidx/compose/ui/layout/A$a;-><init>(Landroidx/compose/ui/layout/s;)V

    .line 18
    .line 19
    .line 20
    const/4 v6, 0x4

    .line 21
    const/4 v7, 0x0

    .line 22
    const/4 v3, 0x0

    .line 23
    move-object v0, p1

    .line 24
    invoke-static/range {v0 .. v7}, Landroidx/compose/ui/layout/l;->J(Landroidx/compose/ui/layout/l;IILjava/util/Map;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)LI0/C;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    return-object p1
.end method

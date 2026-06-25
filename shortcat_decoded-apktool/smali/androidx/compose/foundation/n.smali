.class final Landroidx/compose/foundation/n;
.super Landroidx/compose/ui/e$c;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LK0/A0;


# instance fields
.field private a:Landroidx/compose/foundation/o;

.field private b:Z

.field private c:Lz/n;

.field private d:Z

.field private e:Z


# direct methods
.method public constructor <init>(Landroidx/compose/foundation/o;ZLz/n;ZZ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroidx/compose/ui/e$c;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/compose/foundation/n;->a:Landroidx/compose/foundation/o;

    .line 5
    .line 6
    iput-boolean p2, p0, Landroidx/compose/foundation/n;->b:Z

    .line 7
    .line 8
    iput-object p3, p0, Landroidx/compose/foundation/n;->c:Lz/n;

    .line 9
    .line 10
    iput-boolean p4, p0, Landroidx/compose/foundation/n;->d:Z

    .line 11
    .line 12
    iput-boolean p5, p0, Landroidx/compose/foundation/n;->e:Z

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final E1()Landroidx/compose/foundation/o;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/n;->a:Landroidx/compose/foundation/o;

    .line 2
    .line 3
    return-object v0
.end method

.method public final F1(Lz/n;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/compose/foundation/n;->c:Lz/n;

    .line 2
    .line 3
    return-void
.end method

.method public final G1(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Landroidx/compose/foundation/n;->b:Z

    .line 2
    .line 3
    return-void
.end method

.method public final H1(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Landroidx/compose/foundation/n;->d:Z

    .line 2
    .line 3
    return-void
.end method

.method public final I1(Landroidx/compose/foundation/o;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/compose/foundation/n;->a:Landroidx/compose/foundation/o;

    .line 2
    .line 3
    return-void
.end method

.method public final J1(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Landroidx/compose/foundation/n;->e:Z

    .line 2
    .line 3
    return-void
.end method

.method public Y(LR0/C;)V
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-static {p1, v0}, LR0/A;->q0(LR0/C;Z)V

    .line 3
    .line 4
    .line 5
    new-instance v0, LR0/j;

    .line 6
    .line 7
    new-instance v1, Landroidx/compose/foundation/n$a;

    .line 8
    .line 9
    invoke-direct {v1, p0}, Landroidx/compose/foundation/n$a;-><init>(Landroidx/compose/foundation/n;)V

    .line 10
    .line 11
    .line 12
    new-instance v2, Landroidx/compose/foundation/n$b;

    .line 13
    .line 14
    invoke-direct {v2, p0}, Landroidx/compose/foundation/n$b;-><init>(Landroidx/compose/foundation/n;)V

    .line 15
    .line 16
    .line 17
    iget-boolean v3, p0, Landroidx/compose/foundation/n;->b:Z

    .line 18
    .line 19
    invoke-direct {v0, v1, v2, v3}, LR0/j;-><init>(Lie/a;Lie/a;Z)V

    .line 20
    .line 21
    .line 22
    iget-boolean v1, p0, Landroidx/compose/foundation/n;->e:Z

    .line 23
    .line 24
    if-eqz v1, :cond_0

    .line 25
    .line 26
    invoke-static {p1, v0}, LR0/A;->r0(LR0/C;LR0/j;)V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :cond_0
    invoke-static {p1, v0}, LR0/A;->Y(LR0/C;LR0/j;)V

    .line 31
    .line 32
    .line 33
    return-void
.end method

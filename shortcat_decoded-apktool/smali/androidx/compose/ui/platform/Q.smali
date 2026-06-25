.class public final Landroidx/compose/ui/platform/Q;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Landroidx/compose/ui/platform/s1;


# instance fields
.field private final a:Landroid/view/View;

.field private b:Landroid/view/ActionMode;

.field private final c:LM0/c;

.field private d:Landroidx/compose/ui/platform/u1;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method public constructor <init>(Landroid/view/View;)V
    .locals 10

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/compose/ui/platform/Q;->a:Landroid/view/View;

    .line 5
    .line 6
    new-instance v0, LM0/c;

    .line 7
    .line 8
    new-instance v1, Landroidx/compose/ui/platform/Q$a;

    .line 9
    .line 10
    invoke-direct {v1, p0}, Landroidx/compose/ui/platform/Q$a;-><init>(Landroidx/compose/ui/platform/Q;)V

    .line 11
    .line 12
    .line 13
    const/16 v8, 0x7e

    .line 14
    .line 15
    const/4 v9, 0x0

    .line 16
    const/4 v2, 0x0

    .line 17
    const/4 v3, 0x0

    .line 18
    const/4 v4, 0x0

    .line 19
    const/4 v5, 0x0

    .line 20
    const/4 v6, 0x0

    .line 21
    const/4 v7, 0x0

    .line 22
    invoke-direct/range {v0 .. v9}, LM0/c;-><init>(Lie/a;Lr0/h;Lie/a;Lie/a;Lie/a;Lie/a;Lie/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 23
    .line 24
    .line 25
    iput-object v0, p0, Landroidx/compose/ui/platform/Q;->c:LM0/c;

    .line 26
    .line 27
    sget-object p1, Landroidx/compose/ui/platform/u1;->b:Landroidx/compose/ui/platform/u1;

    .line 28
    .line 29
    iput-object p1, p0, Landroidx/compose/ui/platform/Q;->d:Landroidx/compose/ui/platform/u1;

    .line 30
    .line 31
    return-void
.end method

.method public static final synthetic d(Landroidx/compose/ui/platform/Q;Landroid/view/ActionMode;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/compose/ui/platform/Q;->b:Landroid/view/ActionMode;

    .line 2
    .line 3
    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    .line 1
    sget-object v0, Landroidx/compose/ui/platform/u1;->b:Landroidx/compose/ui/platform/u1;

    .line 2
    .line 3
    iput-object v0, p0, Landroidx/compose/ui/platform/Q;->d:Landroidx/compose/ui/platform/u1;

    .line 4
    .line 5
    iget-object v0, p0, Landroidx/compose/ui/platform/Q;->b:Landroid/view/ActionMode;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0}, Landroid/view/ActionMode;->finish()V

    .line 10
    .line 11
    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    iput-object v0, p0, Landroidx/compose/ui/platform/Q;->b:Landroid/view/ActionMode;

    .line 14
    .line 15
    return-void
.end method

.method public b()Landroidx/compose/ui/platform/u1;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/platform/Q;->d:Landroidx/compose/ui/platform/u1;

    .line 2
    .line 3
    return-object v0
.end method

.method public c(Lr0/h;Lie/a;Lie/a;Lie/a;Lie/a;)V
    .locals 7

    .line 1
    const/4 v6, 0x0

    .line 2
    move-object v0, p0

    .line 3
    move-object v1, p1

    .line 4
    move-object v2, p2

    .line 5
    move-object v3, p3

    .line 6
    move-object v4, p4

    .line 7
    move-object v5, p5

    .line 8
    invoke-virtual/range {v0 .. v6}, Landroidx/compose/ui/platform/Q;->e(Lr0/h;Lie/a;Lie/a;Lie/a;Lie/a;Lie/a;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public e(Lr0/h;Lie/a;Lie/a;Lie/a;Lie/a;Lie/a;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/platform/Q;->c:LM0/c;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, LM0/c;->m(Lr0/h;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Landroidx/compose/ui/platform/Q;->c:LM0/c;

    .line 7
    .line 8
    invoke-virtual {p1, p2}, LM0/c;->i(Lie/a;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Landroidx/compose/ui/platform/Q;->c:LM0/c;

    .line 12
    .line 13
    invoke-virtual {p1, p4}, LM0/c;->j(Lie/a;)V

    .line 14
    .line 15
    .line 16
    iget-object p1, p0, Landroidx/compose/ui/platform/Q;->c:LM0/c;

    .line 17
    .line 18
    invoke-virtual {p1, p3}, LM0/c;->k(Lie/a;)V

    .line 19
    .line 20
    .line 21
    iget-object p1, p0, Landroidx/compose/ui/platform/Q;->c:LM0/c;

    .line 22
    .line 23
    invoke-virtual {p1, p5}, LM0/c;->l(Lie/a;)V

    .line 24
    .line 25
    .line 26
    iget-object p1, p0, Landroidx/compose/ui/platform/Q;->c:LM0/c;

    .line 27
    .line 28
    invoke-virtual {p1, p6}, LM0/c;->h(Lie/a;)V

    .line 29
    .line 30
    .line 31
    iget-object p1, p0, Landroidx/compose/ui/platform/Q;->b:Landroid/view/ActionMode;

    .line 32
    .line 33
    if-nez p1, :cond_0

    .line 34
    .line 35
    sget-object p1, Landroidx/compose/ui/platform/u1;->a:Landroidx/compose/ui/platform/u1;

    .line 36
    .line 37
    iput-object p1, p0, Landroidx/compose/ui/platform/Q;->d:Landroidx/compose/ui/platform/u1;

    .line 38
    .line 39
    sget-object p1, Landroidx/compose/ui/platform/t1;->a:Landroidx/compose/ui/platform/t1;

    .line 40
    .line 41
    iget-object p2, p0, Landroidx/compose/ui/platform/Q;->a:Landroid/view/View;

    .line 42
    .line 43
    new-instance p3, LM0/a;

    .line 44
    .line 45
    iget-object p4, p0, Landroidx/compose/ui/platform/Q;->c:LM0/c;

    .line 46
    .line 47
    invoke-direct {p3, p4}, LM0/a;-><init>(LM0/c;)V

    .line 48
    .line 49
    .line 50
    const/4 p4, 0x1

    .line 51
    invoke-virtual {p1, p2, p3, p4}, Landroidx/compose/ui/platform/t1;->a(Landroid/view/View;Landroid/view/ActionMode$Callback;I)Landroid/view/ActionMode;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    iput-object p1, p0, Landroidx/compose/ui/platform/Q;->b:Landroid/view/ActionMode;

    .line 56
    .line 57
    return-void

    .line 58
    :cond_0
    if-eqz p1, :cond_1

    .line 59
    .line 60
    invoke-virtual {p1}, Landroid/view/ActionMode;->invalidate()V

    .line 61
    .line 62
    .line 63
    :cond_1
    return-void
.end method

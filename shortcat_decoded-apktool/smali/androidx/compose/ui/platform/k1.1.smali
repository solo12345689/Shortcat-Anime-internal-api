.class public final Landroidx/compose/ui/platform/k1;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LK0/q0;


# instance fields
.field private final a:I

.field private final b:Ljava/util/List;

.field private c:Ljava/lang/Float;

.field private d:Ljava/lang/Float;

.field private e:LR0/j;

.field private f:LR0/j;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method public constructor <init>(ILjava/util/List;Ljava/lang/Float;Ljava/lang/Float;LR0/j;LR0/j;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Landroidx/compose/ui/platform/k1;->a:I

    .line 5
    .line 6
    iput-object p2, p0, Landroidx/compose/ui/platform/k1;->b:Ljava/util/List;

    .line 7
    .line 8
    iput-object p3, p0, Landroidx/compose/ui/platform/k1;->c:Ljava/lang/Float;

    .line 9
    .line 10
    iput-object p4, p0, Landroidx/compose/ui/platform/k1;->d:Ljava/lang/Float;

    .line 11
    .line 12
    iput-object p5, p0, Landroidx/compose/ui/platform/k1;->e:LR0/j;

    .line 13
    .line 14
    iput-object p6, p0, Landroidx/compose/ui/platform/k1;->f:LR0/j;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public J0()Z
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/platform/k1;->b:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0, p0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final a()LR0/j;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/platform/k1;->e:LR0/j;

    .line 2
    .line 3
    return-object v0
.end method

.method public final b()Ljava/lang/Float;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/platform/k1;->c:Ljava/lang/Float;

    .line 2
    .line 3
    return-object v0
.end method

.method public final c()Ljava/lang/Float;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/platform/k1;->d:Ljava/lang/Float;

    .line 2
    .line 3
    return-object v0
.end method

.method public final d()I
    .locals 1

    .line 1
    iget v0, p0, Landroidx/compose/ui/platform/k1;->a:I

    .line 2
    .line 3
    return v0
.end method

.method public final e()LR0/j;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/platform/k1;->f:LR0/j;

    .line 2
    .line 3
    return-object v0
.end method

.method public final f(LR0/j;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/compose/ui/platform/k1;->e:LR0/j;

    .line 2
    .line 3
    return-void
.end method

.method public final g(Ljava/lang/Float;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/compose/ui/platform/k1;->c:Ljava/lang/Float;

    .line 2
    .line 3
    return-void
.end method

.method public final h(Ljava/lang/Float;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/compose/ui/platform/k1;->d:Ljava/lang/Float;

    .line 2
    .line 3
    return-void
.end method

.method public final i(LR0/j;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/compose/ui/platform/k1;->f:LR0/j;

    .line 2
    .line 3
    return-void
.end method

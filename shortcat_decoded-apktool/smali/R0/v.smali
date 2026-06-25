.class public final LR0/v;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field private final a:LK0/J;

.field private final b:LR0/d;

.field private final c:Lt/o;

.field private final d:Lt/L;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method public constructor <init>(LK0/J;LR0/d;Lt/o;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LR0/v;->a:LK0/J;

    .line 5
    .line 6
    iput-object p2, p0, LR0/v;->b:LR0/d;

    .line 7
    .line 8
    iput-object p3, p0, LR0/v;->c:Lt/o;

    .line 9
    .line 10
    new-instance p1, Lt/L;

    .line 11
    .line 12
    const/4 p2, 0x2

    .line 13
    invoke-direct {p1, p2}, Lt/L;-><init>(I)V

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, LR0/v;->d:Lt/L;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final a(I)LR0/n;
    .locals 1

    .line 1
    iget-object v0, p0, LR0/v;->c:Lt/o;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lt/o;->c(I)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, LR0/n;

    .line 8
    .line 9
    return-object p1
.end method

.method public final b()Lt/L;
    .locals 1

    .line 1
    iget-object v0, p0, LR0/v;->d:Lt/L;

    .line 2
    .line 3
    return-object v0
.end method

.method public final c()LR0/n;
    .locals 1

    .line 1
    iget-object v0, p0, LR0/v;->a:LK0/J;

    .line 2
    .line 3
    return-object v0
.end method

.method public final d()LR0/s;
    .locals 5

    .line 1
    iget-object v0, p0, LR0/v;->b:LR0/d;

    .line 2
    .line 3
    iget-object v1, p0, LR0/v;->a:LK0/J;

    .line 4
    .line 5
    new-instance v2, Landroidx/compose/ui/semantics/SemanticsConfiguration;

    .line 6
    .line 7
    invoke-direct {v2}, Landroidx/compose/ui/semantics/SemanticsConfiguration;-><init>()V

    .line 8
    .line 9
    .line 10
    new-instance v3, LR0/s;

    .line 11
    .line 12
    const/4 v4, 0x0

    .line 13
    invoke-direct {v3, v0, v4, v1, v2}, LR0/s;-><init>(Landroidx/compose/ui/e$c;ZLK0/J;Landroidx/compose/ui/semantics/SemanticsConfiguration;)V

    .line 14
    .line 15
    .line 16
    return-object v3
.end method

.method public final e(LR0/n;Landroidx/compose/ui/semantics/SemanticsConfiguration;)V
    .locals 4

    .line 1
    iget-object v0, p0, LR0/v;->d:Lt/L;

    .line 2
    .line 3
    iget-object v1, v0, Lt/V;->a:[Ljava/lang/Object;

    .line 4
    .line 5
    iget v0, v0, Lt/V;->b:I

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    :goto_0
    if-ge v2, v0, :cond_0

    .line 9
    .line 10
    aget-object v3, v1, v2

    .line 11
    .line 12
    check-cast v3, LR0/p;

    .line 13
    .line 14
    invoke-interface {v3, p1, p2}, LR0/p;->a(LR0/n;Landroidx/compose/ui/semantics/SemanticsConfiguration;)V

    .line 15
    .line 16
    .line 17
    add-int/lit8 v2, v2, 0x1

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    return-void
.end method

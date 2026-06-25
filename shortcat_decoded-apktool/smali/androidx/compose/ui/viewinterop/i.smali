.class public final Landroidx/compose/ui/viewinterop/i;
.super Landroidx/compose/ui/viewinterop/b;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Landroidx/compose/ui/platform/C1;


# instance fields
.field private final D:Landroid/view/View;

.field private final E:LD0/b;

.field private final F:Lh0/p;

.field private final G:I

.field private final H:Ljava/lang/String;

.field private I:Lh0/p$a;

.field private l0:Lkotlin/jvm/functions/Function1;

.field private m0:Lkotlin/jvm/functions/Function1;

.field private n0:Lkotlin/jvm/functions/Function1;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method private constructor <init>(Landroid/content/Context;LY/y;Landroid/view/View;LD0/b;Lh0/p;ILK0/p0;)V
    .locals 7

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v5, p3

    move-object v4, p4

    move v3, p6

    move-object v6, p7

    .line 3
    invoke-direct/range {v0 .. v6}, Landroidx/compose/ui/viewinterop/b;-><init>(Landroid/content/Context;LY/y;ILD0/b;Landroid/view/View;LK0/p0;)V

    .line 4
    iput-object v5, v0, Landroidx/compose/ui/viewinterop/i;->D:Landroid/view/View;

    .line 5
    iput-object v4, v0, Landroidx/compose/ui/viewinterop/i;->E:LD0/b;

    .line 6
    iput-object p5, v0, Landroidx/compose/ui/viewinterop/i;->F:Lh0/p;

    .line 7
    iput v3, v0, Landroidx/compose/ui/viewinterop/i;->G:I

    const/4 p1, 0x0

    .line 8
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->setClipChildren(Z)V

    .line 9
    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p1

    iput-object p1, v0, Landroidx/compose/ui/viewinterop/i;->H:Ljava/lang/String;

    const/4 p2, 0x0

    if-eqz p5, :cond_0

    .line 10
    invoke-interface {p5, p1}, Lh0/p;->e(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    goto :goto_0

    :cond_0
    move-object p1, p2

    :goto_0
    instance-of p3, p1, Landroid/util/SparseArray;

    if-eqz p3, :cond_1

    move-object p2, p1

    check-cast p2, Landroid/util/SparseArray;

    :cond_1
    if-eqz p2, :cond_2

    .line 11
    invoke-virtual {v5, p2}, Landroid/view/View;->restoreHierarchyState(Landroid/util/SparseArray;)V

    .line 12
    :cond_2
    invoke-direct {p0}, Landroidx/compose/ui/viewinterop/i;->I()V

    .line 13
    invoke-static {}, Landroidx/compose/ui/viewinterop/e;->d()Lkotlin/jvm/functions/Function1;

    move-result-object p1

    iput-object p1, v0, Landroidx/compose/ui/viewinterop/i;->l0:Lkotlin/jvm/functions/Function1;

    .line 14
    invoke-static {}, Landroidx/compose/ui/viewinterop/e;->d()Lkotlin/jvm/functions/Function1;

    move-result-object p1

    iput-object p1, v0, Landroidx/compose/ui/viewinterop/i;->m0:Lkotlin/jvm/functions/Function1;

    .line 15
    invoke-static {}, Landroidx/compose/ui/viewinterop/e;->d()Lkotlin/jvm/functions/Function1;

    move-result-object p1

    iput-object p1, v0, Landroidx/compose/ui/viewinterop/i;->n0:Lkotlin/jvm/functions/Function1;

    return-void
.end method

.method synthetic constructor <init>(Landroid/content/Context;LY/y;Landroid/view/View;LD0/b;Lh0/p;ILK0/p0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 8

    and-int/lit8 v0, p8, 0x2

    if-eqz v0, :cond_0

    const/4 p2, 0x0

    :cond_0
    move-object v2, p2

    and-int/lit8 p2, p8, 0x8

    if-eqz p2, :cond_1

    .line 1
    new-instance p4, LD0/b;

    invoke-direct {p4}, LD0/b;-><init>()V

    :cond_1
    move-object v0, p0

    move-object v1, p1

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    move v6, p6

    move-object v7, p7

    .line 2
    invoke-direct/range {v0 .. v7}, Landroidx/compose/ui/viewinterop/i;-><init>(Landroid/content/Context;LY/y;Landroid/view/View;LD0/b;Lh0/p;ILK0/p0;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lkotlin/jvm/functions/Function1;LY/y;Lh0/p;ILK0/p0;)V
    .locals 10

    .line 16
    invoke-interface {p2, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    move-object v3, p2

    check-cast v3, Landroid/view/View;

    const/16 v8, 0x8

    const/4 v9, 0x0

    const/4 v4, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p3

    move-object v5, p4

    move v6, p5

    move-object/from16 v7, p6

    .line 17
    invoke-direct/range {v0 .. v9}, Landroidx/compose/ui/viewinterop/i;-><init>(Landroid/content/Context;LY/y;Landroid/view/View;LD0/b;Lh0/p;ILK0/p0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public static final synthetic G(Landroidx/compose/ui/viewinterop/i;)Landroid/view/View;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/compose/ui/viewinterop/i;->D:Landroid/view/View;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic H(Landroidx/compose/ui/viewinterop/i;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroidx/compose/ui/viewinterop/i;->J()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final I()V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/viewinterop/i;->F:Lh0/p;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v1, p0, Landroidx/compose/ui/viewinterop/i;->H:Ljava/lang/String;

    .line 6
    .line 7
    new-instance v2, Landroidx/compose/ui/viewinterop/i$a;

    .line 8
    .line 9
    invoke-direct {v2, p0}, Landroidx/compose/ui/viewinterop/i$a;-><init>(Landroidx/compose/ui/viewinterop/i;)V

    .line 10
    .line 11
    .line 12
    invoke-interface {v0, v1, v2}, Lh0/p;->f(Ljava/lang/String;Lie/a;)Lh0/p$a;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-direct {p0, v0}, Landroidx/compose/ui/viewinterop/i;->setSavableRegistryEntry(Lh0/p$a;)V

    .line 17
    .line 18
    .line 19
    :cond_0
    return-void
.end method

.method private final J()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, v0}, Landroidx/compose/ui/viewinterop/i;->setSavableRegistryEntry(Lh0/p$a;)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method private final setSavableRegistryEntry(Lh0/p$a;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/viewinterop/i;->I:Lh0/p$a;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Lh0/p$a;->a()V

    .line 6
    .line 7
    .line 8
    :cond_0
    iput-object p1, p0, Landroidx/compose/ui/viewinterop/i;->I:Lh0/p$a;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final getDispatcher()LD0/b;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/viewinterop/i;->E:LD0/b;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getReleaseBlock()Lkotlin/jvm/functions/Function1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/viewinterop/i;->n0:Lkotlin/jvm/functions/Function1;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getResetBlock()Lkotlin/jvm/functions/Function1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/viewinterop/i;->m0:Lkotlin/jvm/functions/Function1;

    .line 2
    .line 3
    return-object v0
.end method

.method public bridge synthetic getSubCompositionView()Landroidx/compose/ui/platform/a;
    .locals 1

    .line 1
    invoke-super {p0}, Landroidx/compose/ui/platform/C1;->getSubCompositionView()Landroidx/compose/ui/platform/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public final getUpdateBlock()Lkotlin/jvm/functions/Function1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/viewinterop/i;->l0:Lkotlin/jvm/functions/Function1;

    .line 2
    .line 3
    return-object v0
.end method

.method public getViewRoot()Landroid/view/View;
    .locals 0

    .line 1
    return-object p0
.end method

.method public final setReleaseBlock(Lkotlin/jvm/functions/Function1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Landroidx/compose/ui/viewinterop/i;->n0:Lkotlin/jvm/functions/Function1;

    .line 2
    .line 3
    new-instance p1, Landroidx/compose/ui/viewinterop/i$b;

    .line 4
    .line 5
    invoke-direct {p1, p0}, Landroidx/compose/ui/viewinterop/i$b;-><init>(Landroidx/compose/ui/viewinterop/i;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, p1}, Landroidx/compose/ui/viewinterop/b;->setRelease(Lie/a;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final setResetBlock(Lkotlin/jvm/functions/Function1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Landroidx/compose/ui/viewinterop/i;->m0:Lkotlin/jvm/functions/Function1;

    .line 2
    .line 3
    new-instance p1, Landroidx/compose/ui/viewinterop/i$c;

    .line 4
    .line 5
    invoke-direct {p1, p0}, Landroidx/compose/ui/viewinterop/i$c;-><init>(Landroidx/compose/ui/viewinterop/i;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, p1}, Landroidx/compose/ui/viewinterop/b;->setReset(Lie/a;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final setUpdateBlock(Lkotlin/jvm/functions/Function1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Landroidx/compose/ui/viewinterop/i;->l0:Lkotlin/jvm/functions/Function1;

    .line 2
    .line 3
    new-instance p1, Landroidx/compose/ui/viewinterop/i$d;

    .line 4
    .line 5
    invoke-direct {p1, p0}, Landroidx/compose/ui/viewinterop/i$d;-><init>(Landroidx/compose/ui/viewinterop/i;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, p1}, Landroidx/compose/ui/viewinterop/b;->setUpdate(Lie/a;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method
